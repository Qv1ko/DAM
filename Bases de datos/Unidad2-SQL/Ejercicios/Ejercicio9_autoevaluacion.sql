--1. Crea en la BD test la tabla mascotas
USE test;
CREATE TABLE mascotas(
    id INT(6) PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20),
    fnacimiento DATE
);

--2. Introduce 5 registros en la tabla
INSERT mascotas(nombre,fnacimiento)
    VALUES("Perro","2022-04-23"),
    ("Gato","2021-08-28"),
    ("Periquito","2022-11-15"),
    ("Conejo","2021-05-04"),
    ("Tortuga","2020-09-13");


ALTER TABLE mascotas ADD especie VARCHAR(20) default "caiman";
UPDATE mascotas SET especie="Perro" WHERE id IN (1,2);

--3. Haz una copia de seguridad de la base de datos TEST
mysqldump -u root -p test > "C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio9_autoevaluacion_backup.sql"

--4. Borra la base de datos TEST
DROP DATABASE test;

--5. Restaura la copia de seguridad efectuada
CREATE DATABASE test;
USE test;
source C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio9_autoevaluacion_backup.sql

--6. Inicia una transacción
START TRANSACTION;

--7. Borra la tabla permanentemente con truncate
TRUNCATE mascotas;

--8. Deshaz la transacción con Rollback
ROLLBACK;

--9. Restaura otra vez la base de datos TEST
DROP DATABASE test;
CREATE DATABASE test;
USE test;
source C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio9_autoevaluacion_backup.sql

--10. Inicia una transacción y Borra la tabla con Delete
START TRANSACTION;
DELETE FROM mascotas;

--11. Deshaz la transacción con Rollback
ROLLBACK;
SELECT * FROM mascotas;

--12. Obten el valor de autocommit
SELECT @@AUTOCOMMIT;

--13. Pon la variable autocommit a 0
SET AUTOCOMMIT=0;

--14. Borra la tabla Mascotas con delete
DELETE FROM mascotas;

--15. Deshaz la operación
ROLLBACK;

--16. Borra las tres primeras mascotas
DELETE FROM mascotas ORDER BY id LIMIT 3;

--17. Confirma la operación
COMMIT;

--18. Borra la última mascota
DELETE FROM mascotas ORDER BY id DESC LIMIT 1;

--19. Deshaz la operación
ROLLBACK;

--20. Pon la variable autocommit a 1
SET AUTOCOMMIT=1;

--21. Borra la primera mascota
DELETE FROM mascotas ORDER BY id LIMIT 1;

--22. Deshaz la transacción con Rollback
ROLLBACK;

--23. Lista los automóviles sobre los que no se ha efectuado ningún contrato
SELECT automoviles.* FROM automoviles LEFT JOIN contratos ON automoviles.matricula=contratos.matricula_automoviles WHERE automoviles.matricula NOT IN (SELECT matricula_automoviles FROM contratos);
SELECT * from automoviles WHERE matricula NOT IN (SELECT contratos.matricula_automoviles FROM contratos JOIN automoviles ON contratos.matricula_automoviles=automoviles.matricula);

--24. Lista el número de coches contratados de cada marca
SELECT COUNT(matricula) AS "Numero de coches",marca_marcas AS Marca FROM automoviles INNER JOIN contratos ON automoviles.matricula=contratos.matricula_automoviles WHERE alquilado=1 GROUP BY marca_marcas;
SELECT COUNT(matricula) AS "Numero de coches",marca_marcas AS Marca FROM automoviles INNER JOIN contratos ON automoviles.matricula=contratos.matricula_automoviles WHERE alquilado=1 GROUP BY marca_marcas HAVING COUNT(automoviles.matricula)>3;

--25. Lista los números de los 5 últimos contratos y la fecha inicial en que se hicieron (dd/mm/aaaa)
SELECT numcontrato,DATE_FORMAT(finicial,"%D,%M,%Y") FROM contratos ORDER BY numcontrato DESC LIMIT 5;

--26. Crear tabla Clientes en la base de datos TEST
CREATE TABLE clientes(
    id SMALLINT PRIMARY KEY,
    nombre VARCHAR(20),
    finsc date
);

--27. Añadir 5 clientes
INSERT INTO clientes(id,nombre,finsc)
    VALUES(1,"Paco",CURDATE()),
    (2,"Andres","2021-02-03"),
    (3,"Victor",CURDATE()),
    (4,"Javier","2022-11-17"),
    (5,"Oriol","2022-07-28");

--Añade la columna en la tabla de mascotas para a continuacion hacer la foreign key
ALTER TABLE mascotas ADD amo_id SMALLINT;

--28. Añade la foreign key en la clave mascotas
ALTER TABLE mascotas ADD FOREIGN KEY(amo_id) REFERENCES clientes(id);

--29. Añade amos a las mascotas
UPDATE mascotas SET amo_id=2 WHERE id IN (5,10);
UPDATE mascotas SET amo_id=3 WHERE id=6;
UPDATE mascotas SET amo_id=4 WHERE id=7;
UPDATE mascotas SET amo_id=1 WHERE id=8;
UPDATE mascotas SET amo_id=5 WHERE id=9;

--30. Cuantas mascotas tiene cada cliente sin los que no tienen
SELECT c.nombre,count(*) AS Total FROM clientes c LEFT JOIN mascotas m ON c.id=amo_id GROUP BY c.id;

--31. Cuantas mascotas tiene cada cliente
SELECT c.nombre,count(m.id) AS Numero FROM clientes c LEFT JOIN mascotas m ON c.id=amo_id GROUP BY c.id;

--32. Añade el campo edad a las mascotas
ALTER TABLE mascotas ADD edad SMALLINT;

--33. Añadimos los valores de edad
UPDATE mascotas SET edad=5 WHERE id IN (5,10);
UPDATE mascotas SET edad=2 WHERE id=6;
UPDATE mascotas SET edad=1 WHERE id=7;
UPDATE mascotas SET edad=3 WHERE id=8;
UPDATE mascotas SET edad=6 WHERE id=9;

--34. Obtén la mascota mas vieja de cada especie
SELECT especie,MAX(edad) AS "Mayor edad" FROM mascotas GROUP BY especie;

--35. Total de edad de las mascotas por especie
SELECT especie AS Especie,SUM(edad) FROM mascotas GROUP BY especie;

--36. Media de edad de las mascotas de cada cliente
SELECT c.nombre,AVG(m.edad) AS "Media de edad" FROM clientes c JOIN mascotas m ON c.id=m.amo_id GROUP BY c.id;

/*37. Suma de las edades de las mascotas de cada especie menos las del cliente 3. Que pasen 
de 10 años de total */
SELECT especie,SUM(edad) AS "Suma edad" FROM clientes c JOIN mascotas m ON c.id=m.amo_id WHERE c.id<>3 GROUP BY especie HAVING SUM(edad)>10;

--38. Ordenar los datos por el total
SELECT especie,SUM(edad) AS Total FROM clientes c JOIN mascotas m ON c.id=m.amo_id WHERE c.id<>3 GROUP BY especie HAVING SUM(edad)>10 ORDER BY Total DESC;