CREATE DATABASE Exercise02_AlojamientosRurales;

USE Exercise02_AlojamientosRurales;

CREATE TABLE actividad(
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    telefono CHAR(9),
    nombre VARCHAR(25)
);

CREATE TABLE espacioNatural(
    nombre CHAR(50) PRIMARY KEY,
    extension INT NULL,
    epoca 
);