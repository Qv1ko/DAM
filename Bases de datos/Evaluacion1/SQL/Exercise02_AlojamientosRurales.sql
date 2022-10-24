CREATE DATABASE Exercise02_AlojamientosRurales;

USE Exercise02_AlojamientosRurales;

CREATE TABLE organizacion(
    telefono CHAR(9),
    nombre VARCHAR(20),
    web VARCHAR(100) NOT NULL,
    PRIMARY KEY(nombre)
);

CREATE TABLE espacio_natural(
    extension FLOAT(5,3),
    nombre VARCHAR(35),
    epoca CHAR(9) CHECK(epoca="otono"OR"invierno"OR"verano"OR"primavera"),
    PRIMARY KEY(nombre)
);

CREATE TABLE alojamiento(
    nombre VARCHAR(20) PRIMARY KEY,
    direccion VARCHAR(30) UNIQUE,
    telefono CHAR(9),
    comunidad_autonoma VARCHAR(25),
    tipo_alquiler VARCHAR(20) CHECK(tipo_alquiler="completo"OR"por habitaciones"),
    organizacion_nombre VARCHAR(20),
    espacio_natural_nombre VARCHAR(35),
    CONSTRAINT fk_es FOREIGN KEY(espacio_natural_nombre) REFERENCES espacio_natural(nombre),
    CONSTRAINT fk_org FOREIGN KEY(organizacion_nombre) REFERENCES organizacion(nombre)
);

CREATE TABLE actividad(
    codigo VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    telefono CHAR(9) NOT NULL
);

CREATE TABLE ofertar(
    precio FLOAT(5,2) NOT NULL,
    dificultad VARCHAR(15) CHECK(dificultad="facil"OR"medio"OR"dificil"OR"experto"),
    espacio_natural_nombre VARCHAR(35),
    actividad_codigo VARCHAR(20),
    CONSTRAINT fk_es2 FOREIGN KEY(espacio_natural_nombre) REFERENCES espacio_natural(nombre),
    CONSTRAINT fk_act FOREIGN KEY(actividad_codigo) REFERENCES actividad(codigo)
);