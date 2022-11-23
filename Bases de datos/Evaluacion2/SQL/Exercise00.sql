CREATE DATABASE alquileres;

USE alquileres;

SHOW TABLES;

CREATE TABLE marcas(
    marca VARCHAR(15) PRIMARY KEY UNIQUE,
    numero CHAR(2)
);

CREATE TABLE automoviles(
    matricula CHAR(7) PRIMARY KEY,
    marca_marcas VARCHAR(15) NOT NULL,
    modelo VARCHAR(20) NOT NULL,
    color VARCHAR(15),
    precio DEC(7,2) NOT NULL,
    kilometros INT(6),
    extras VARCHAR(20),
    alquilado BOOLEAN DEFAULT false,
    FOREIGN KEY(marca_marcas) REFERENCES marcas(marca)
);

SHOW TABLES;

DESC automoviles;

DESC marcas;

CREATE TABLE clientes(
    dni CHAR(9) PRIMARY KEY,
    apellidos VARCHAR(25) NOT NULL,
    nombre VARCHAR(15) NOT NULL,
    direccion VARCHAR(40),
    localidad VARCHAR(15),
    carnet CHAR(2) NOT NULL,
    fechaexp DATE NOT NULL
);

CREATE TABLE contratos(
    numcontrato INT(5) PRIMARY KEY AUTO_INCREMENT,
    matricula_automoviles CHAR(7) NOT NULL,
    dni_clientes CHAR(9) NOT NULL,
    finicial DATE NOT NULL,
    ffinal DATE,
    kinicial INT(6) NOT NULL,
    kfinal INT(6),
    FOREIGN KEY(dni_clientes) REFERENCES clientes(dni),
    FOREIGN KEY(matricula_automoviles) REFERENCES automoviles(matricula)
);

CREATE TABLE contratos2 LIKE contratos;

SHOW TABLES;

DESC automoviles;

DESC clientes;

DESC contratos;

DESC contratos2;

DESC marcas;

LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Exercise00_texts\\Marcas.txt'
    INTO TABLE marcas
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;

LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Exercise00_texts\\Automoviles.txt'
    INTO TABLE automoviles
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;

LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Exercise00_texts\\Clientes.txt'
    INTO TABLE clientes
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;

LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Exercise00_texts\\contratos.txt'
    INTO TABLE contratos
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;

LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Exercise00_texts\\contratos2.txt'
    INTO TABLE contratos2
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;

CREATE TABLE contratos3 LIKE contratos;

LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Exercise00_texts\\contratos3.txt'
    INTO TABLE contratos3
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;

INSERT INTO contratos(matricula_automoviles,dni_clientes,finicial,kinicial)
    VALUES("1234BMY", "37409800", "2009-07-10", 22561),
    ("2058CGF", "00371569", "2009-07-11", 9736),
    ("3273BGH", "24589635", "2009-08-11", 17368),
    ("5573BFS", "00445760", "2009-08-15", 28500),
    ("7839CDR", "28759595", "2009-10-15", 15873),
    ("8795BTK", "12348630", "2009-11-16", 46980),
    ("2123BTB", "43809540", "2009-11-16", 34323);

SELECT * FROM contratos;

USE test;

SHOW TABLES;

SHOW CREATE TABLE marcas;

SHOW CREATE TABLE automoviles;

SHOW CREATE TABLE clientes;

SHOW CREATE TABLE contratos;

exit