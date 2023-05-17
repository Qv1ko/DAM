--1. Crea la base de datos P8 y en ella la tabla Usuarios
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

--2. Crea la tabla Cursos
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

--3. Añadimos una clave ajena para relacionar los usuarios con los cursos que realizan
ALTER TABLE usuarios ADD FOREIGN KEY(curso) REFERENCES cursos(id) ON UPDATE CASCADE;


--4. Usa INNER JOIN para ver los usuarios y cursos que coincidan
SELECT usuarios.nombre,cursos.nombre FROM usuarios INNER JOIN cursos ON usuarios.curso=cursos.id;

--5. Usa LEFT JOIN para ver los usuarios y cursos que coincidan con la tabla de la izquierda
SELECT usuarios.nombre,cursos.nombre FROM usuarios LEFT JOIN cursos ON usuarios.curso=cursos.id;

--6. Usa RIGHT JOIN para ver los usuarios y cursos que coincidan con la tabla de la derecha
SELECT usuarios.nombre,cursos.nombre FROM usuarios RIGHT JOIN cursos ON usuarios.curso=cursos.id;
--Si cambiamos el orden de las columnas y usamos LEFT JOIN el resultado es el mismo
SELECT usuarios.nombre,cursos.nombre FROM cursos LEFT JOIN usuarios ON usuarios.curso=cursos.id;

--7. Usa OUTER JOIN para devolver todos los registros de ambas tablas
SELECT usuarios.nombre,cursos.nombre FROM usuarios OUTER JOIN cursos ON usuarios.curso=cursos.id;
--El resultado seria el mismo al juntar una consulta con LEFT JOIN y otra de RIGTH JOIN con UNION
SELECT usuarios.nombre,cursos.nombre FROM usuarios LEFT JOIN cursos ON usuarios.curso=cursos.id 
    UNION SELECT usuarios.nombre,cursos.nombre FROM usuarios RIGHT JOIN cursos ON usuarios.curso=cursos.id;

--8. Haz una copia de seguridad de la base de datos P8
mysqldump -u root -p ejercicio8_p8 > "C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio8_p8_backup.sql"

--9. Luego Borra la base de datos
DROP DATABASE ejercicio8_p8;

--10. Restaura la copia efectuada
CREATE DATABASE ejercicio8_p8;
USE ejercicio8_p8;
SOURCE C:/Users/Usuario/DAM.git/DAM/Bases de datos/Unidad2-SQL/Ejercicios/Ejercicio8_p8_backup.sql