CREATE DATABASE exercise03_feria_libro;

USE exercise03_feria_libro;

CREATE TABLE escritor(
    nombre VARCHAR(30) PRIMARY KEY,
    seudonimo VARCHAR(25),
    lugar_nacimiento VARCHAR(35) DEFAULT "España",
    fecha_nacimiento DATE NOT NULL
);

CREATE TABLE caseta(
    numero INT AUTO_INCREMENT PRIMARY KEY,
    representante VARCHAR(15) NOT NULL,
    metros_cuadrados FLOAT(4,2) NOT NULL
);

CREATE TABLE libro(
    isbn CHAR(13) PRIMARY KEY,
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
    PRIMARY KEY(caseta_numero,escritor_nombre),x
    CONSTRAINT fk_contratar_caseta FOREIGN KEY(caseta_numero) REFERENCES caseta(numero),
    CONSTRAINT fk_contratar_escritor FOREIGN KEY(escritor_nombre) REFERENCES escritor(nombre)
);

CREATE TABLE exponer(
    ejemplares INT NOT NULL,
    precio DEC(5,2) DEFAULT 5.99,
    caseta_numero INT,
    libro_isbn CHAR(13),
    PRIMARY KEY(caseta_numero,libro_isbn),
    CONSTRAINT fk_exponer_caseta FOREIGN KEY(caseta_numero) REFERENCES caseta(numero),
    CONSTRAINT fk_exponer_libro FOREIGN KEY(libro_isbn) REFERENCES libro(isbn)
);