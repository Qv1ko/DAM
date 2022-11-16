CREATE DATABASE mocmoc;

USE DATABASE mocmoc;

CREATE TABLE camionero(
    dni CHAR(9) PRIMARY KEY,
    nombre VARCHAR(30),
    salario DEC(7,2),
    direccion VARCHAR(50),
    poblacion VARCHAR(20)
);

CREATE TABLE camion(
    matricula CHAR(7) PRIMARY KEY,
    modelo VARCHAR(20),
    tipo VARCHAR(15),
    potencia SMALLINT
);

CREATE TABLE distribuir(
    dni_camionero CHAR(9),
    matricula_camion CHAR(7),
    fecha DATE,
    PRIMARY KEY(dni_camionero,matricula_camion),
    FOREIGN KEY(dni_camionero) REFERENCES camionero(dni),
    FOREIGN KEY(matricula_camion) REFERENCES camion(matricula)
);