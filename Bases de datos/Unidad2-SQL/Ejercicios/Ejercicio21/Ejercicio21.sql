-- 1. Corrige los errores y explica.
DELIMITER //
CREATE PROCEDURE s_max()
BEGIN	
    DECLARE sal_pre DEC(8,2);
    SELECT max(salario) INTO @s FROM empleados;
    SELECT salario INTO sal_pre FROM empleados WHERE oficio="PRESIDENTE";
    SELECT @s AS 'Maximo', sal_pre AS 'PRESIDENTE';
    IF (@s=sal_pre) THEN
        SELECT "Gana mas el presidente";
    ELSE
        SELECT "No gana mas el presidente";
    END IF;
END//
DELIMITER ;

-- 2. Haz un procedimiento que escriba el salario medio y nos diga si este salario medio de los empleados está por encima o por debajo de 1000€.
DELIMITER //
CREATE PROCEDURE s_medio()
BEGIN
    DECLARE media DEC(8,2);
    SELECT AVG(salario) INTO media FROM empleados;
    SELECT media AS "Euros de media de sueldo";
    IF media<1000 THEN
        SELECT "Media por debajo de 1000 euros" AS "Media de sueldo";
    ELSE
        SELECT "Media por encima de 1000 euros" AS "Media de sueldo";
    END IF;
END//
DELIMITER ;

-- 3. Haz una función que le pasemos la comisión y nos devuelva el tipo de vendedor.
DELIMITER //
CREATE FUNCTION tip_ven(comi FLOAT(6,2)) RETURNS VARCHAR(15)
BEGIN
    DECLARE text VARCHAR(15);
    SET text =
        CASE
            WHEN comi < 999.99 THEN "Buen vendedor"
            WHEN comi < 500 THEN "Mal vendedor"
            ELSE "Vendedor medio"
        END;
    RETURN text;
END//
DELIMITER ;

-- 4. Escribe el nombre de los vendedores de la tabla empleados y el tipo usando la función anterior.
SELECT apellido,tip_ven(comision) FROM empleados;

/* 5. Crea una tabla temporal que contenga solo un número. Con un procedimiento que se le pase como parámetros el valor inicial (valor que lo decrementamos de 5 
    en 5, no se almacenaran números negativos). */
DELIMITER //
CREATE PROCEDURE num_tab(num INT)
BEGIN
    CREATE TEMPORARY TABLE tempNum(
        num INT NOT NULL,
        PRIMARY KEY (num)
    );
    WHILE num > 0 DO
        INSERT INTO tempNum VALUES(num);
        SET num = num - 5;
    END WHILE;
END//
DELIMITER ;

-- 6. Crea una tabla temporal que contenga un número decreciente con un procedimiento que se le pasen como parámetros el valor inicial y el salto.
DELIMITER //
CREATE PROCEDURE numtab2(num INT, sal INT)
BEGIN
    CREATE TEMPORARY TABLE tnum(
        num INT NOT NULL,
        PRIMARY KEY (num)
    );
    REPEAT
        INSERT INTO tnum VALUES(num);
        SET num = num - sal;
    UNTIL num < 0
    END REPEAT;
END//
DELIMITER ;

-- 7. Crea una tabla temporal llamada DNIS con un campo nro de tipo INT clave principal.
CREATE TEMPORARY TABLE dnis(
    nro INT NOT NULL PRIMARY KEY
);
DELIMITER //
CREATE PROCEDURE INSERTA_DNIS()
BEGIN
    DECLARE n INT;
    DECLARE c SMALLINT;
    TRUNCATE DNIS;
    REPEAT
        SET n = FLOOR(RAND()*8000000)+15000001; 
        -- Multiplicamos por 8 millones y sumamos 15 millones 
        SELECT COUNT(*) INTO c FROM DNIS;
        INSERT INTO DNIS VALUES(n);
    UNTIL c = 20
    END REPEAT;
    SELECT * FROM DNIS;
END //
DELIMITER ;

-- 8. Crea la función letra_nif que reciba un DNI y calcule la letra del NIF correspondiente.
DELIMITER //
CREATE FUNCTION letra_nif(nif INT) RETURNS CHAR(1)
BEGIN
    DECLARE res INT;
    SET res = nif % 23;
    RETURN ELT(res+1,"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E");
END//
DELIMITER ;

DELIMITER //
CREATE FUNCTION letra_nif(nif INT) RETURNS CHAR(1)
BEGIN
    RETURN MID("TRWAGMYFPDXBNJZSQVHLCKE",nif % 23+1,1);
END//
DELIMITER ;

-- 9. Usa la función anterior mostrar los números de la tabla DNIS con su letra correspondiente.
SELECT CONCAT(nro,letra_nif(nro)) AS DNI FROM dnis;
