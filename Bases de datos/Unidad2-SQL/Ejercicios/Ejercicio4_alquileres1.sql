--2. Ejecuta MySQL como administrador
mysql –u root –p

--3. Crea una base de datos llamada alquileres
CREATE DATABASE ejercicio4_alquileres;

--4. Activa como base de datos de trabajo la base de datos alquileres
USE ejercicio4_alquileres;

--5. Comprueba las tablas que hay en alquileres
SHOW TABLES;

--6. Crea la tabla marcas con las columnas numero de tipo tinyint, marca, siendo la columna numero clave principal
CREATE TABLE marcas(
    marca VARCHAR(15) PRIMARY KEY UNIQUE,
    numero CHAR(2)
);

/*7. Crea la tabla automoviles con las columnas matricula, marca, modelo, color, precio, kilometros, extras, 
alquilado, siendo la columna matricula clave principal, la columna marca relacionada con la columna marca de la 
tabla marcas, no admitiendo valores nulos en marca, modelo y precio, y tomando la columna alquilado como valor 
por defecto el valor False */
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

--8. Muestra las tablas que hay en la base de datos
SHOW TABLES;

--9. Muestra la estructura de cada una de las tablas
DESC automoviles;
DESC marcas;

/*10. Crea la tabla clientes con las columnas dni, nombre, apellidos, direccion, localidad, carnet, fechaexp. 
La clave principal es dni. No se admiten nulos en las columnas nombre, apellidos, carnet y fechaexp */
CREATE TABLE clientes(
    dni CHAR(9) PRIMARY KEY,
    apellidos VARCHAR(25) NOT NULL,
    nombre VARCHAR(15) NOT NULL,
    direccion VARCHAR(40),
    localidad VARCHAR(15),
    carnet CHAR(2) NOT NULL,
    fechaexp DATE NOT NULL
);

/*11. Crea la tabla contratos con las columnas dni, matricula, finicial, ffinal, kinicial, kfinal. La columna 
numcontrato es clave principal, numérica de 5 cifras y autoincrementable. Las columnas dni y matricula están 
relacionadas con las columnas correspondientes de las tablas automoviles y clientes */
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

--12. Crea una tabla contratos2 con la misma estructura que la anterior
CREATE TABLE contratos2 LIKE contratos;

--13. Comprueba todas las tablas que hay en la base de datos y su estructura
SHOW TABLES;
DESC automoviles;
DESC clientes;
DESC contratos;
DESC contratos2;
DESC marcas;

--14. Carga archivos de texto en cada una de las tablas
LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Ejercicio4_txts\\marcas.txt'
    INTO TABLE marcas
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Ejercicio4_txts\\automoviles.txt'
    INTO TABLE automoviles
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Ejercicio4_txts\\clientes.txt'
    INTO TABLE clientes
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Ejercicio4_txts\\contratos.txt'
    INTO TABLE contratos
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Ejercicio4_txts\\contratos2.txt'
    INTO TABLE contratos2
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;

CREATE TABLE contratos3 LIKE contratos;

LOAD DATA LOCAL INFILE 'C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Evaluacion2\\SQL\\Ejercicio4_txts\\contratos3.txt'
    INTO TABLE contratos3
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n' IGNORE 1 LINES;

--15. Inserta contratos en la tabla contratos
INSERT INTO contratos(matricula_automoviles,dni_clientes,finicial,kinicial)
    VALUES("1234BMY", "37409800", "2009-07-10", 22561),
    ("2058CGF", "00371569", "2009-07-11", 9736),
    ("3273BGH", "24589635", "2009-08-11", 17368),
    ("5573BFS", "00445760", "2009-08-15", 28500),
    ("7839CDR", "28759595", "2009-10-15", 15873),
    ("8795BTK", "12348630", "2009-11-16", 46980),
    ("2123BTB", "43809540", "2009-11-16", 34323);

--16. Comprueba que se ha insertado la fila y el número de contrato
SELECT * FROM contratos;

--17. Pasa a usar la base de datos test. ¿Qué tablas contiene?
USE test;
SHOW TABLES;

--18. Pasa de nuevo a trabajar con la base alquileres
USE ejercicio4_alquileres;
SHOW CREATE TABLE marcas;
SHOW CREATE TABLE automoviles;
SHOW CREATE TABLE clientes;
SHOW CREATE TABLE contratos;

--19. Cierra la sesión
exit