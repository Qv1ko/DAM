CREATE DATABASE ejercicio6;

USE ejercicio6;

CREATE TABLE cursos(
    curso INT PRIMARY KEY,
    nombre CHAR(3)
);

CREATE TABLE alumnos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre CHAR(10),
    curso_cursos INT,
    FOREIGN KEY(curso_cursos) REFERENCES cursos(curso)
);

INSERT INTO cursos
    VALUES(1,"AYF"),
    (2,"DSA"),
    (3,"DAM");

INSERT INTO alumnos(nombre,curso_cursos)
    VALUES("Eva",1),
    ("Luis",3),
    ("Juana",1),
    ("Ramon",3);

SELECT alumnos.nombre,cursos.nombre FROM alumnos INNER JOIN cursos ON alumnos.curso_cursos=cursos.curso;

ALTER TABLE cursos CHANGE nombre nom char(3);

DESC cursos;

SELECT * FROM alumnos NATURAL JOIN cursos;

SELECT nombre,nom FROM alumnos NATURAL JOIN cursos;

SELECT nombre,cursos.* FROM alumnos NATURAL JOIN cursos;