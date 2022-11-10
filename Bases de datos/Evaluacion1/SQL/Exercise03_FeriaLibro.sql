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
    PRIMARY KEY(caseta_numero,escritor_nombre),
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

INSERT INTO caseta(numero,representante,metros_cuadrados)
    VALUES(1,"Gil",20.5),
    (NULL,"Estudio",40),
    (NULL,"Planeta",31.75);

INSERT INTO escritor(nombre,seudonimo,fecha_nacimiento,lugar_nacimiento)
    VALUES("Garcia Marquez",NULL,"1930-02-02","Colombia"),
    ("Juan Ruiz","Azorin","1905-05-15",DEFAULT),
    ("Leopoldo Alas","Clarin","1899-12-08",DEFAULT),
    ("Jorge Diaz","Carmen Mola","2018-01-01",DEFAULT);

INSERT INTO libro
    VALUES("333X","La regenta","1920-01-01","Leopoldo Alas"),
    ("888K","Cien años de soledad","1945-01-01","Garcia Marquez"),
    ("555G","Cronica de una muerte anunciada","1962-01-01","Garcia Marquez");

INSERT INTO exponer
    VALUES(40,37.5,2,"333X"),
    (30,40,3,"888K"),
    (100,35.95,2,"555G");

INSERT INTO contratar
    VALUES("2022-12-01","10:00:00",1,"Jorge Diaz"),
    ("2022-12-02","10:30:00",2,"Jorge Diaz"),
    ("2022-12-02","12:30:00",3,"Jorge Diaz");