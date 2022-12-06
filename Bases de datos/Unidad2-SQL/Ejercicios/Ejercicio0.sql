CREATE DATABASE ejercicio0;

USE ejercicio0;

CREATE TABLE socios(
    numSocio INT AUTO_INCREMENT,
    apellidos VARCHAR(30),
    tel CHAR(9) UNIQUE NOT NULL,
    fechaAlta DATE,
    direccion VARCHAR(20), /*DEFAULT "C/ Vargas 65";*/
    codPostal INT CHECK(codPostal BETWEEN 30000 AND 39999), --codigo postal entre 30000 y 39999
    PRIMARY KEY(numSocio)
);

DESC socios;
SHOW CREATE TABLE socios;

CREATE TABLE prestamos(
    numPrestamo SMALLINT PRIMARY KEY,
    socioNum INT NOT NULL,
    CONSTRAINT fkPrestamos FOREIGN KEY(socioNum) REFERENCES socios(numSocio) --referencia de clave foranea
);

DESC prestamos;
SHOW CREATE TABLE prestamos;

INSERT INTO socios(apellidos,tel,fechaAlta,direccion,codPostal)
    VALUES ("Raventos","666","2022-09-20",NULL,39470),
    ("Lastra","777","2022-10-30","Sol 45",39011);

SELECT * FROM socios;

INSERT INTO prestamos VALUES (1,2),(2,1),(3,1),(4,2),(5,2);

SELECT * FROM prestamos;

