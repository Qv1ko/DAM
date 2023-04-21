-- 2. Crea un procedimiento llamado Fact con un parámetro n de entrada entero y otro de salida f también entero en donde se almacene el factorial del número n.
DELIMITER //
CREATE PROCEDURE Fact(n INT,OUT f INT)
BEGIN
    DECLARE r INT DEFAULT 1;
    WHILE n>0 DO 
        SET r=r*n;
        SET n=n-1;
    END WHILE;
    SET f=r;
END//
DELIMITER ;

-- 4. Crea una función llamada Facto con un parámetro n de entrada entero y que devuelva un valor de tipo BIGINT con el factorial del número n.
DELIMITER //
CREATE FUNCTION Facto(n INT) RETURNS BIGINT
BEGIN
    DECLARE r INT DEFAULT 1;
    WHILE n>0 DO 
        SET r=r*n;
        SET n=n-1;
    END WHILE;
    RETURN r;
END//
DELIMITER ;

-- 5. Crea un procedimiento en la base de datos ALQUILERES que reciba el DNI de un cliente y escriba en un parámetro de salida c el número de contratos de ese cliente.
DELIMITER //
CREATE PROCEDURE numContratos(dni CHAR(9),OUT c INT)
BEGIN
    SELECT count(*) INTO c FROM contratos WHERE dni_clientes=dni;
END//
DELIMITER ;

-- 7. Utiliza el procedimiento anterior para ver en cuantos contratos realizó Natalia Montoya.
CALL numContratos((SELECT dni FROM clientes WHERE nombre="Natalia" AND apellidos="Montoya"),@c);