-- 2. Muestra la descripción y contenidos de las tablas departamentos y empleados
DESC departamentos;
DESC empleados;

-- 3. Crea un procedimiento llamado 'ins' sin parámetros que introduzca el número de Departamento 66  en la tabla con nombre AUDITORIA  y localidad TORRELAVEGA en Departamentos.
DELIMITER //
CREATE PROCEDURE ins()
BEGIN
    INSERT INTO departamentos VALUES(66,"Auditoria","Torrelavega");
END//
DELIMITER ;

-- 4. Crea el procedimiento ins_dep con dos parámetros de entrada pnum y pnom que permita hacer el ejercicio anterior indicando el número y el nombre del departamento a introducir.
DELIMITER //
CREATE PROCEDURE ins_dep(pnum INT(2), pnom VARCHAR(14))
BEGIN
    INSERT INTO departamentos VALUES(pnum, pnom, null);
END//
DELIMITER ;

DELIMITER //
CREATE PROCEDURE ins_dep(pnum INT(2), pnom VARCHAR(14))
BEGIN
    DECLARE n INT;
    SELECT dep_no INTO n FROM departamentos WHERE dep_no = pnum;
    IF n IS NOT NULL THEN
        DELETE FROM departamentos WHERE dep_no = pnum;
    END IF;
    INSERT INTO departamentos VALUES(pnum, pnom, null);
END//
DELIMITER ;

-- 6. Borra el procedimiento ins.
DROP PROCEDURE ins;

-- 7. Ejecuta y explica que hace este procedimiento.
DELIMITER //
CREATE PROCEDURE Crea_Logistica()
BEGIN
    DECLARE num INT DEFAULT 0;
    SELECT emp_no INTO num FROM empleados ORDER BY emp_no DESC LIMIT 1;
    SET num=num+1;
    INSERT INTO departamentos VALUES (80,'LOGISTICA','RENEDO');
    INSERT INTO empleados(emp_no,apellido,dep_no) VALUES (num,'ROMERALES',80);
    SET num=num+1;
    INSERT INTO empleados(emp_no,apellido,dep_no) VALUES (num,'LOBATO',80);
    UPDATE empleados SET salario = 999 WHERE dep_no=80 AND salario IS NULL;
END//
DELIMITER ;

-- 8. Explica que hace este procedimiento, corrige los errores y ejecútalo.
DELIMITER //
CREATE PROCEDURE s_altos()
BEGIN
    SELECT apellido, salario FROM empleados WHERE salario > 2000;
    SELECT count(*) 'Total' FROM empleados WHERE salario > 2000;
END//
DELIMITER ;

-- 9. Modifica el procedimiento anterior para que el valor con que se compara el sueldo se pase como parámetro de entrada y el número de empleados lo devuelva en un parámetro de salida.
DELIMITER //
CREATE PROCEDURE s_altos2(sueldo FLOAT(6,2),OUT c_emp INT)
BEGIN
    SELECT apellido, salario FROM empleados WHERE salario > sueldo;
    SELECT count(*) INTO c_emp FROM empleados WHERE salario > sueldo;
END//
DELIMITER ;

-- 10. Hacer una función utilizando CASE que reciba como parámetro de entrada la edad de un vendedor y devuelva el texto.
DELIMITER //
CREATE FUNCTION case_edad(edad INT) RETURNS VARCHAR(10)
BEGIN
    DECLARE text VARCHAR(10);
    SET text =
        CASE
            WHEN edad > 59 THEN "Veterano"
            WHEN edad > 29 AND edad < 60 THEN "Adulto"
            ELSE "Joven"
        END CASE;
    RETURN text;
END//
DELIMITER ;

-- 11. Explica que hace este procedimiento y prueba los distintos casos que pueden darse, valores correctos y errores.
DELIMITER //
CREATE PROCEDURE ins_empleado(nro INT, ape VARCHAR(10), f_alt DATE, dep INT)
BEGIN
    DECLARE nume INT;
    DECLARE numd INT;
    DECLARE err INT DEFAULT 1;
    IF f_alt > CURDATE() THEN SET err = 2;
    ELSE
        SELECT emp_no INTO nume FROM empleados WHERE emp_no=nro LIMIT 1;
        IF nume IS NOT NULL THEN SET err=3;
        ELSE
            SELECT departamentos.dep_no INTO numd FROM departamentos WHERE dep_no=dep LIMIT 1;
            IF numd IS NULL THEN SET err=4;	
            END IF;
        END IF;
    END IF;
    IF err=1 THEN INSERT INTO empleados(emp_no,apellido,fecha_alta,dep_no) VALUES (nro,ape,f_alt,dep);	
    END IF;
    SELECT ELT(err,"Empleado insertado","Fecha incorrecta","Ese nro de empleado ya existe","Departamento inexistente") AS 'Resultado';
END//
DELIMITER ;
