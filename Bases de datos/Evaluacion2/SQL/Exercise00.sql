CREATE DATABASE alquileres;

USE alquileres;

SHOW TABLES;

CREATE TABLE marcas(
    marca VARCHAR(15) UNIQUE,
    numero CHAR(2) PRIMARY KEY
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

LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\Desktop\\alquileres_textos\\Marcas.txt'
    INTO TABLE marcas
    LINES TERMINATED BY '\r\n';

