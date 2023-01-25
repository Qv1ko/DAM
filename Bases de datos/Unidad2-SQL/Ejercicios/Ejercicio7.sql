CREATE DATABASE ejercicio7_pruebas1;
USE ejercicio7_pruebas1;

CREATE TABLE alumnos_frances(
    numal INT(6) DEFAULT 0,
    nomal VARCHAR(20),
    localidad VARCHAR(20),
    PRIMARY KEY(numal)
);

CREATE TABLE alumnos_ingles(
    numal INT(6) DEFAULT 0,
    nombreal VARCHAR(20),
    ciudad VARCHAR(20),
    PRIMARY KEY(numal)
);

CREATE TABLE empleados(
    numemp INT(6) PRIMARY KEY DEFAULT 0,
    nombreemp VARCHAR(20),
    categoria VARCHAR(15)
);

CREATE TABLE notas(
    numero INT(6) PRIMARY KEY DEFAULT 0,
    nota1 INT(6),
    nota2 INT(6)
);

LOAD DATA LOCAL INFILE 'C:/Users/Usuario/DAM.git/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio7_txts/alumnos_frances.txt'
    INTO TABLE alumnos_frances IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:/Users/Usuario/DAM.git/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio7_txts/alumnos_ingles.txt'
    INTO TABLE alumnos_ingles IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:/Users/Usuario/DAM.git/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio7_txts/empleados.txt'
    INTO TABLE empleados IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:/Users/Usuario/DAM.git/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio7_txts/notas.txt'
    INTO TABLE notas IGNORE 1 LINES;

SELECT * FROM alumnos_ingles;
SELECT * FROM alumnos_frances;
SELECT * FROM empleados;
SELECT * FROM notas;

SELECT * FROM alumnos_frances UNION SELECT * FROM alumnos_ingles;

SELECT * FROM alumnos_frances UNION ALL SELECT * FROM alumnos_ingles;

SELECT numal,nombreal FROM alumnos_ingles UNION SELECT numal,nomal FROM alumnos_frances;

SELECT numal,nombreal FROM alumnos_ingles WHERE ciudad="Santander" UNION SELECT numal,nomal FROM alumnos_frances WHERE localidad="Santander";

SELECT * FROM alumnos_ingles,notas;

SELECT numal,nota1,nota2 FROM alumnos_ingles CROSS JOIN notas;

SELECT * FROM alumnos_ingles,notas WHERE numal=numero;

SELECT numal,nota1,nota2 FROM alumnos_ingles,notas WHERE numal=numero;

SELECT numal,nota1,nota2 FROM alumnos_ingles,notas WHERE numal=numero AND ciudad="Torrelavega";

SELECT numal,nota1,nota2 FROM alumnos_ingles,notas WHERE numal=3 && numero=3;