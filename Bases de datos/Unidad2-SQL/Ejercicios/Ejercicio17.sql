-- 1. Crea la base de datos P17 y en ella tablas
CREATE DATABASE P17;
USE P17;
CREATE TABLE ninos(edad int, nombre varchar(50));
CREATE TABLE adultos(edad int, nombre varchar(50));

-- 2. Creamos el procedimiento almacenado
DELIMITER //
CREATE procedure introPersona(ed int, nom varchar(50))
begin
    IF ed < 18 then
        INSERT INTO ninos VALUES(ed,nom);
    else
        INSERT INTO adultos VALUES(ed,nom);
    end IF;
end//
DELIMITER ;

/* 4. Haz un procedimiento llamado INTROADULTO con dos parámetros de entrada que permita introducir registros en la tabla adultos y muestre un mensaje de error
si la edad es menor de 18 años y no introduzca dicho registro en ninguna tabla. */
DELIMITER //
CREATE PROCEDURE INTROADULTO(edad INT, nombre VARCHAR(50))
BEGIN
    IF edad<18 THEN
        SELECT "ERROR - Edad inferior a 18 años";
    ELSE
        INSERT INTO adultos VALUES(edad,nombre);
    END IF;
END//
DELIMITER ;


-- 6. Crea la función.
DELIMITER //
CREATE FUNCTION divide(dividendo int,divisor int) returns int
begin
    declare aux int;
    declare contador int;
    declare resto int;
    SET contador = 0;
    SET aux = 0;
    while (aux + divisor) < dividendo do
        SET aux = aux + divisor ;
        SET contador = contador + 1;
    end while;
    SET resto = dividendo - aux ;
RETURN contador;
end//
DELIMITER ;

