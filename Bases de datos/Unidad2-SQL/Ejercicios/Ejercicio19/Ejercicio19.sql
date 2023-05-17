-- 1. Cread la tabla NOTAS en la base de Datos P19 y añadir los datos
CREATE DATABASE P19;

USE P19;
CREATE TABLE Notas(nombre varchar(20), nota dec(3,1));

INSERT INTO Notas VALUES("Arturo",4.2),("Olivia",8.8),("Braulio",10),("Elena",1);

-- Cread el trigger
DELIMITER //
CREATE TRIGGER NOTAS_BI BEFORE INSERT ON Notas FOR EACH ROW
BEGIN
    IF NEW.nota < 0 THEN
        SET NEW.nota = 0;
    ELSEIF NEW.nota > 10 THEN
        SET NEW.nota = 10;
    END IF;
END//
DELIMITER ;

-- Inserta los valores en la tabla Notas
INSERT INTO Notas VALUES(“Amelia”,7),(“Bernardo”,18.6),(“Carlota”,-5),(“Dario”,2.5);

-- 2. Cread la tabla Bajas
CREATE TABLE Bajas(nombre VARCHAR(20), fecha DATE);

DELIMITER //
CREATE TRIGGER NOTAS_AD AFTER DELETE ON Notas FOR EACH ROW
BEGIN
    INSERT INTO Bajas VALUES(OLD.nombre,CURDATE());
END//
DELIMITER ;

-- Borra los siguientes registros
DELETE FROM Notas WHERE nombre="Elena" OR nombre="Amelia" OR nombre="Bruno" OR nombre="Dario";

-- 3. Crea el trigger
DELIMITER //
CREATE TRIGGER Notas_BU BEFORE UPDATE ON Notas FOR EACH ROW
BEGIN
    IF NEW.nota < OLD.nota THEN
        SET NEW.nota = OLD.nota;
    ELSE
        SET NEW.nota = OLD.nota+2;
    END IF;		
END//
DELIMITER ;

-- Modifica las siguientes notas
UPDATE Notas SET nota=9 WHERE nombre="Arturo" AND nota=4.2;
UPDATE Notas SET nota=3 WHERE nombre="Olivia" AND nota=8.8;
UPDATE Notas SET nota=4 WHERE nombre="Braulio" AND nota=10;
