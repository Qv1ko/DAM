CREATE DATABASE ejercicio5;

USE ejercicio5;

CREATE TABLE comidas(
    nombre CHAR(15) PRIMARY KEY,
    precio int
);

CREATE TABLE postres LIKE comidas;

INSERT INTO comidas
    VALUES("Ensalada", 8),
    ("Lentejas", 10),
    ("Paella", 10);

INSERT INTO postres
    VALUES('Fruta', 5),
    ("Yogurt", 4),
    ("Tarta", 10);

SELECT * FROM comidas;

SELECT * FROM postres;

--Producto cartesiano
SELECT * FROM comidas,postres;
SELECT * FROM comidas CROSS JOIN postres;

SELECT comidas.nombre,postres.nombre FROM comidas,postres;

--Seleccion con alias
SELECT c.nombre,p.nombre,c.precio+p.precio AS total FROM  comidas AS c, postres p;

SELECT * FROM comidas c1, comidas c2 WHERE c1.nombre<>c2.nombre;

SELECT c.nombre FROM comidas c, postres p WHERE c.precio=p.precio AND p.nombre = "Tarta";


SELECT nombre,precio FROM comidas WHERE precio=(SELECT precio FROM postres WHERE nombre="Tarta");

--Devuelve el nombre y precio de las comidas con el mismo precio que los postres que empiezan con P
SELECT nombre,precio FROM postres WHERE precio IN (SELECT precio FROM comidas WHERE nombre LIKE "p%");
--Devuelve el nombre y precio de las comidas con menor precio que todos los postres que empiezan con P
SELECT nombre,precio FROM postres WHERE precio <ALL (SELECT precio FROM comidas WHERE nombre LIKE "p%");
--Devuelve el nombre y precio de las comidas con menor precio que algunos postres que empiezan con P
SELECT nombre,precio FROM postres WHERE precio <ANY (SELECT precio FROM comidas WHERE nombre LIKE "p%");