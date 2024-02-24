--1. Crea la base de datos PRUEBAS1 en MySQL
CREATE DATABASE ejercicio7_pruebas1;
USE ejercicio7_pruebas1;

--2. Crea la tabla alumnos_frances
CREATE TABLE alumnos_frances(
    numal INT(6) DEFAULT 0,
    nomal VARCHAR(20),
    localidad VARCHAR(20),
    PRIMARY KEY(numal)
);

--3. Crea la tabla alumnos_ingles
CREATE TABLE alumnos_ingles(
    numal INT(6) DEFAULT 0,
    nombreal VARCHAR(20),
    ciudad VARCHAR(20),
    PRIMARY KEY(numal)
);

--4. Crea la tabla empleados
CREATE TABLE empleados(
    numemp INT(6) PRIMARY KEY DEFAULT 0,
    nombreemp VARCHAR(20),
    categoria VARCHAR(15)
);

--5. Crea la tabla notas
CREATE TABLE notas(
    numero INT(6) PRIMARY KEY DEFAULT 0,
    nota1 INT(6),
    nota2 INT(6)
);

--6. Crea la tabla notas
SHOW TABLES;

/*7. Carga la tablas usando los datos contenidos en los archivos de texto alumnos_frances.txt, 
alumnos_ingles.txt, empleados.txt y notas.txt */
LOAD DATA LOCAL INFILE 'C:/Users/Usuario/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio8/Ejercicio8_txts/Alumnos_frances.txt'
    INTO TABLE alumnos_frances IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:/Users/Usuario/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio8/Ejercicio8_txts/Alumnos_ingles.txt'
    INTO TABLE alumnos_ingles IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:/Users/Usuario/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio8/Ejercicio8_txts/Empleados.txt'
    INTO TABLE empleados IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:/Users/Usuario/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio8/Ejercicio8_txts/Notas.txt'
    INTO TABLE notas IGNORE 1 LINES;

--8. Visualiza los datos que se han cargado en cada tabla
SELECT * FROM alumnos_ingles;
SELECT * FROM alumnos_frances;
SELECT * FROM empleados;
SELECT * FROM notas;

--9. El resultado de la unión de la tabla alumnos_ingles y la tabla alumnos_frances
SELECT * FROM alumnos_frances UNION SELECT * FROM alumnos_ingles;

/*10. El resultado de la unión de la tabla alumnos_ingles y la tabla alumnos_frances 
permitiendo que se repitan las filas */
SELECT * FROM alumnos_frances UNION ALL SELECT * FROM alumnos_ingles;

--11. Las columnas número y nombre de la unión entre las tablas alumnos_frances y alumnos_ingles
SELECT numal,nombreal FROM alumnos_ingles UNION SELECT numal,nomal FROM alumnos_frances;

--12. El número y nombre de los alumnos de francés y de inglés que son de Santander
SELECT numal,nombreal FROM alumnos_ingles WHERE ciudad="Santander" UNION SELECT numal,nomal FROM alumnos_frances WHERE localidad="Santander";

--13. El producto cartesiano entre alumnos_ingles y notas
SELECT * FROM alumnos_ingles,notas;

/*14. Las columnas número de alumno, nota1 y nota2 del producto cartesiano entre alumnos_ingles 
y notas */
SELECT numal,nota1,nota2 FROM alumnos_ingles CROSS JOIN notas;

--15. Las filas con igual número de alumno del producto cartesiano entre alumnos_ingles y notas
SELECT * FROM alumnos_ingles,notas WHERE numal=numero;

/*16. Las columnas número de alumno, nota1 y nota2 de las filas con igual número de alumno 
del producto cartesiano entre alumnos_ingles y notas */
SELECT numal,nota1,nota2 FROM alumnos_ingles,notas WHERE numal=numero;

/*17. Las columnas número de alumno, nota1 y nota2 de las filas con igual número de alumno y 
de alumnos de Santander del producto cartesiano entre alumnos_ingles y notas */
SELECT numal,nota1,nota2 FROM alumnos_ingles,notas WHERE numal=numero AND ciudad="Torrelavega";

/*18. Las columnas número de alumno, nota1 y nota2 de las filas con igual número de alumno 
para el alumno de número 3 del producto cartesiano entre alumnos_ingles y notas */
SELECT numal,nota1,nota2 FROM alumnos_ingles,notas WHERE numal=3 && numero=3;