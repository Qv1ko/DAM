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

