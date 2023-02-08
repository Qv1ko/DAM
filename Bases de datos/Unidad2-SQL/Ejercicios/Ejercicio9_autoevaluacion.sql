USE test;
CREATE TABLE mascotas(
    id INT(6) PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20),
    fnacimiento DATE
);

INSERT mascotas(nombre,fnacimiento)
    VALUES("Perro","2022-04-23"),
    ("Gato","2021-08-28"),
    ("Periquito","2022-11-15"),
    ("Conejo","2021-05-04"),
    ("Tortuga","2020-09-13");

ALTER TABLE mascotas ADD especie VARCHAR(20) default "caiman";
UPDATE mascotas SET especie="Perro" WHERE id IN (1,2);

mysqldump -u root -p test > "C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio9_autoevaluacion_backup.sql"

DROP DATABASE test;

CREATE DATABASE test;
USE test;
source C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio9_autoevaluacion_backup.sql

START TRANSACTION;

TRUNCATE mascotas;

ROLLBACK;

DROP DATABASE test;
CREATE DATABASE test;
USE test;
source C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio9_autoevaluacion_backup.sql

START TRANSACTION;
DELETE FROM mascotas;

ROLLBACK;
SELECT * FROM mascotas;

SELECT @@AUTOCOMMIT;

SET AUTOCOMMIT=0;

DELETE FROM mascotas;

ROLLBACK;

DELETE FROM mascotas ORDER BY id LIMIT 3;

COMMIT;

DELETE FROM mascotas ORDER BY id DESC LIMIT 1;

ROLLBACK;

SET AUTOCOMMIT=1;

DELETE FROM mascotas ORDER BY id LIMIT 1;

ROLLBACK;

SELECT automoviles.* FROM automoviles LEFT JOIN contratos ON automoviles.matricula=contratos.matricula_automoviles WHERE automoviles.matricula NOT IN (SELECT matricula_automoviles FROM contratos);
SELECT * from automoviles WHERE matricula NOT IN (SELECT contratos.matricula_automoviles FROM contratos JOIN automoviles ON contratos.matricula_automoviles=automoviles.matricula);

SELECT COUNT(matricula) AS "Numero de coches",marca_marcas AS Marca FROM automoviles INNER JOIN contratos ON automoviles.matricula=contratos.matricula_automoviles WHERE alquilado=1 GROUP BY marca_marcas;
SELECT COUNT(matricula) AS "Numero de coches",marca_marcas AS Marca FROM automoviles INNER JOIN contratos ON automoviles.matricula=contratos.matricula_automoviles WHERE alquilado=1 GROUP BY marca_marcas HAVING COUNT(automoviles.matricula)>3;

SELECT numcontrato,DATE_FORMAT(finicial,"%D,%M,%Y") FROM contratos ORDER BY numcontrato DESC LIMIT 5;