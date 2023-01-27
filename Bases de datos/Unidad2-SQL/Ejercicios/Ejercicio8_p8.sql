CREATE DATABASE ejercicio8_p8;
USE ejercicio8_p8;

CREATE TABLE usuarios(
    id SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(30) NOT NULL,
    curso SMALLINT(5) UNSIGNED DEFAULT NULL,
    PRIMARY KEY(id)
);

INSERT INTO usuarios(id,nombre,curso)
    VALUES(1,"Paula",1),
        (2,"Silvia",1),
        (3,"Carlos",2),
        (4,"Ruth",5),
        (5,"José Antonio",NULL);

CREATE TABLE cursos(
    id SMALLINT(5) UNSIGNED NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(50) NOT NULL,
	PRIMARY KEY (id)
);

INSERT INTO cursos(id,nombre)
    VALUES(1,"HTML5"),
        (2,"CSS"),
        (3,"JavaScript"),
        (4,"PHP"),
        (5,"MySQL");

ALTER TABLE usuarios ADD FOREIGN KEY(curso) REFERENCES cursos(id) ON UPDATE CASCADE;

SELECT usuarios.nombre,cursos.nombre FROM usuarios INNER JOIN cursos on usuarios.curso=cursos.id;

SELECT usuarios.nombre,cursos.nombre FROM usuarios LEFT JOIN cursos on usuarios.curso=cursos.id;

SELECT usuarios.nombre,cursos.nombre FROM usuarios RIGHT JOIN cursos on usuarios.curso=cursos.id;

SELECT usuarios.nombre,cursos.nombre FROM cursos LEFT JOIN usuarios on usuarios.curso=cursos.id;

SELECT usuarios.nombre,cursos.nombre FROM usuarios LEFT JOIN cursos on usuarios.curso=cursos.id 
    UNION SELECT usuarios.nombre,cursos.nombre FROM usuarios RIGHT JOIN cursos on usuarios.curso=cursos.id;

mysqldump -u root -p ejercicio8_p8 > "C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio8_p8_backup.sql"

DROP DATABASE ejercicio8_p8;

CREATE DATABASE ejercicio8_p8;

USE ejercicio8_p8;

SOURCE C:/Users/Usuario/DAM.git/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio8_p8_backup.sql