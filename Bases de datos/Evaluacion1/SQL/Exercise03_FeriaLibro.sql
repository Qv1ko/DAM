CREATE DATABASE Exercise03_FeriaLibro;

USE Exercise03_FeriaLibro;

CREATE TABLE escritor(
    nombre VARCHAR(30) PRIMARY KEY,
    seudonimo VARCHAR(25),
    lugar_nacimiento VARCHAR(35) NOT NULL,
    fecha_nacimiento DATE NOT NULL
);

CREATE TABLE caseta(
    numero INT AUTO_INCREMENT PRIMARY KEY,
    representante VARCHAR(15) CHECK("Editorial" OR "Libreria"),
    metros_cuadrados FLOAT(4,2) NOT NULL
);

CREATE TABLE libro(
    isbn INT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    ano_publicacion DATE NOT NULL,
    escritor_nombre VARCHAR(30),
    CONSTRAINT fk_libro_escritor FOREIGN KEY(escritor_nombre) REFERENCES escritor(nombre)
);

CREATE TABLE contratar(
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    caseta_numero INT,
    escritor_nombre VARCHAR(30),
    CONSTRAINT fk_contratar_caseta FOREIGN KEY(caseta_numero) REFERENCES caseta(numero),
    CONSTRAINT fk_contratar_escritor FOREIGN KEY(escritor_nombre) REFERENCES escritor(nombre)
);

CREATE TABLE exponer(
    ejemplares INT NOT NULL,
    precio FLOAT(5,2) NOT NULL,
    caseta_numero INT,
    libro_isbn INT,
    CONSTRAINT fk_exponer_caseta FOREIGN KEY(caseta_numero) REFERENCES caseta(numero),
    CONSTRAINT fk_exponer_libro FOREIGN KEY(libro_isbn) REFERENCES libro(isbn)
);