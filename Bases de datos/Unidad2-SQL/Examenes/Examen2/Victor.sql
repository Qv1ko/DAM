CREATE DATABASE Champions;
USE Champions;

-- 1.
CREATE TABLE Equipos(
    Nombre VARCHAR(20) PRIMARY KEY,
    Pjugados INT(2),
    Pganados INT(2),
    Pperdidos INT(2),
    Pempatados INT(2)
);
CREATE TABLE Resultados(
    Local VARCHAR(20),
    Visitante VARCHAR(20),
    Glocal INT(2),
    Gvisitante INT(2),
    id INT PRIMARY KEY AUTO_INCREMENT
);

-- 2.
ALTER TABLE `resultados` ADD INDEX(`Local`, `Visitante`);
ALTER TABLE `resultados` ADD FOREIGN KEY (`Local`) REFERENCES `equipos`(`Nombre`) ON DELETE CASCADE ON UPDATE CASCADE; ALTER TABLE `resultados` ADD FOREIGN KEY (`Visitante`) REFERENCES `equipos`(`Nombre`) ON DELETE CASCADE ON UPDATE CASCADE;

--3.
INSERT INTO equipos VALUES("Racing",2,2,0,0),("Real Madrid",2,1,0,1),("Valencia",2,1,1,0);
ALTER TABLE equipos DROP COLUMN Pganados;

--4.
DELIMITER //
CREATE PROCEDURE Puntos(equipo VARCHAR(20))
BEGIN
    DECLARE equ VARCHAR(20);
    DECLARE puntos INT(2);
    DECLARE jugados INT(2);
    DECLARE perdidos INT(2);
    DECLARE empatados INT(2);
    SELECT Nombre INTO equ FROM equipos WHERE Nombre=equipo;
    SELECT Pjugados INTO jugados FROM equipos WHERE Nombre=equipo;
    SELECT Pperdidos INTO perdidos FROM equipos WHERE Nombre=equipo;
    SELECT Pempatados INTO empatados FROM equipos WHERE Nombre=equipo;
    IF equ IS NOT NULL THEN
        SET puntos = ((jugados-(perdidos+empatados)) * 3) + empatados;
        SELECT puntos AS Puntos;
    ELSE
        SELECT "El equipo no existe" AS Error;
    END IF;
END//
DELIMITER ;

CALL Puntos("Real Madrid");

--5.
DELIMITER //
CREATE FUNCTION p_ganados(equipo VARCHAR(20)) RETURNS INT(2)
BEGIN
    DECLARE partidosg INT(2);
    DECLARE partidos INT(2);
    DECLARE perdidos INT(2);
    DECLARE empate INT(2);
    SELECT Pjugados INTO partidos FROM equipos WHERE nombre=equipo;
    SELECT Pperdidos INTO perdidos FROM equipos WHERE nombre=equipo;
    SELECT Pempatados INTO empate FROM equipos WHERE nombre=equipo;
    SET partidosg = partidos - (perdidos + empate);
    RETURN partidosg;
END//
DELIMITER ;

--6.
SELECT Nombre,p_ganados(Nombre) AS "Partidos ganados" FROM equipos;

--7.
DELIMITER //
CREATE TRIGGER actjugados_ad AFTER DELETE ON resultados FOR EACH ROW
BEGIN
    UPDATE equipos SET Pjugados = Pjugados - 1 WHERE equipos.nombre=old.local;
    UPDATE equipos SET Pjugados = Pjugados - 1 WHERE equipos.nombre=old.visitante;
END//
DELIMITER ;

--8.
DROP TRIGGER actjugados_ad;
DELIMITER //
CREATE TRIGGER actjugados_ad AFTER DELETE ON resultados FOR EACH ROW
BEGIN
    UPDATE equipos SET Pjugados = Pjugados - 1 WHERE equipos.nombre=old.local;
    UPDATE equipos SET Pjugados = Pjugados - 1 WHERE equipos.nombre=old.visitante;
    IF old.Glocal>old.Gvisitante THEN
        UPDATE equipos SET Pperdidos = Pperdidos - 1 WHERE equipos.nombre=old.visitante;
    ELSEIF old.Gvisitante>old.Glocal THEN
        UPDATE equipos SET Pperdidos = Pperdidos - 1 WHERE equipos.nombre=old.local;
    END IF;
END//
DELIMITER ;

--9.
INSERT INTO resultados(Local,Visitante,Glocal,Gvisitante) VALUES("Racing","Valencia",3,2);
-- El numero de id tiene que ser el id del resultado ha borrar
DELETE FROM resultados WHERE id=1;
