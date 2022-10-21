CREATE DATABASE exercise01_sanos;

USE exercise01_sanos;

CREATE TABLE medico(
    dni CHAR(9) PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    telefono CHAR(9) DEFAULT "942880088",
    direccion VARCHAR(25),
    especialidad VARCHAR(15)
);

CREATE TABLE paciente(
    dni CHAR(9) PRIMARY KEY,
    nombre VARCHAR(40),
    telefono CHAR(9) INDEX,
    sociedadMedica VARCHAR(20)
);

CREATE TABLE sucursal(
    codigo INT PRIMARY KEY,
    direccion VARCHAR(30),
    telefono VARCHAR(9),
    puebloUbicacion VARCHAR(20)
);

CREATE TABLE pasar(
    dia DATE, 
    horaComienzo TIME,
    horaFin TIME,
    codigoSucursal INT,
    dniMedico CHAR(9),
    PRIMARY KEY(codigoSucursal,dniMedico),
    FOREIGN KEY(codigoSucursal) REFERENCES sucursal(codigo),
    FOREIGN KEY(dniMedico) REFERENCES medico(dni)
);

CREATE TABLE consultar(
    id INT AUTO_INCREMENT PRIMARY KEY,
    hora TIME,
    fecha DATE,
    codigoSucursal INT,
    dniPaciente CHAR(9),
    CONSTRAINT fk1 FOREIGN KEY(codigoSucursal) REFERENCES sucursal(codigo),
    CONSTRAINT fk2 FOREIGN KEY(dniPaciente) REFERENCES paciente(dni) ON DELETE CASCADE ON UPDATE CASCADE
);