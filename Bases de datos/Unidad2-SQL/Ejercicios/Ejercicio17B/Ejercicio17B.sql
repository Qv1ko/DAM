-- 1. Corrige los errores y ejecuta
DELIMITER //
CREATE PROCEDURE bucle(p1 INT)
BEGIN
    DECLARE x INT DEFAULT 1;
    lazo: LOOP  
        SET p1 = p1 + 1;
        SET x = x+1;
        IF p1 < 10 THEN ITERATE lazo;
        END IF;
    LEAVE lazo;
    END LOOP lazo;
    SELECT x;
END//
DELIMITER ;

-- 4. Crea en la base de datos Test la tabla primitiva con un único campo Num entero y clave principal.
USE test; CREATE TABLE primitiva (
    num INT(2) PRIMARY KEY
);
DELIMITER //
CREATE PROCEDURE primi()
BEGIN
    -- Declaracion de variables
    DECLARE n INT(2);
    DECLARE c INT(1);
    -- Borra los datos de la tabla primitiva
    TRUNCATE primitiva;
    -- Muestra por pantalla valores aleatorios del 1 al 50 y se para si es 6
    REPEAT
        SET n = Floor(rand()*49)+1;
        CALL numero(n);
        SELECT COUNT(*) INTO c FROM primitiva;
        SELECT c;
        UNTIL c=6
    END REPEAT;
    SELECT * FROM primitiva;
END //
DELIMITER ;
DELIMITER //
CREATE PROCEDURE numero(a INT(2))
BEGIN
    -- Declara un entero x
    DECLARE x INT(2);
    -- Guarda el valor de a en x
    SELECT num INTO x FROM primitiva WHERE num = a;
    -- Si el valor de x no existe en la tabla lo inserta
    IF x IS NULL THEN
        INSERT INTO primitiva VALUES(a);
    END IF;
END //
DELIMITER ;

-- 6. Haz un Procedimiento que haga lo mismo EXACTAMENTE que el del ejercicio 1 pero usando un bucle WHILE.
DELIMITER //
CREATE PROCEDURE buclewhile(p1 INT)
BEGIN
    DECLARE x INT DEFAULT 1;
    WHILE p1 < 10 DO  
        SET p1 = p1+1;
        SET x = x+1;
    END WHILE;
    SELECT x;
END//
DELIMITER ;
