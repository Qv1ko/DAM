-- 1. Crea la base de datos Mayo
CREATE DATABASE mayo;
use mayo;

-- 2. Crea la tabla comercial(id, nombre, comision DEC(6,2))
CREATE TABLE comercial(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20),
    comision DEC(6,2)
);

-- 3. Crea la tabla clientes(id, apellido, debe DEC(7,1))
CREATE TABLE clientes(
    id INT PRIMARY KEY AUTO_INCREMENT,
    apellido VARCHAR(30),
    debe DEC(7,1)
);

-- 4. Crea la tabla pedidos(id, importe DEC(5,1), fecha, id_comercial, id_cliente)
CREATE TABLE pedidos(
    id INT PRIMARY KEY AUTO_INCREMENT,
    importe DEC(5,1),
    fecha DATE,
    id_comercial INT,
    id_cliente INT,
    FOREIGN KEY(id_comercial) REFERENCES comercial(id) ON UPDATE CASCADE ON DELETE CASCADE,
    FOREIGN KEY(id_cliente) REFERENCES clientes(id) ON UPDATE CASCADE ON DELETE CASCADE
);
