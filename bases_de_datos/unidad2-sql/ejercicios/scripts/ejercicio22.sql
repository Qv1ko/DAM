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

-- 5. Añade datos a las tablas
INSERT INTO comercial VALUES(1,"Juan",0), (2,"Maria",0), (3,"Luis",0);
INSERT INTO clientes VALUES(1,"Gomez",0), (2,"Martinez",0), (3,"Prados",0), (4,"Sainz",0);

-- 6. Crea un trigger
DELIMITER //
CREATE TRIGGER pedidos_ai AFTER INSERT ON pedidos FOR EACH ROW
BEGIN
    UPDATE comercial SET comision=comision+(new.importe*0.1) WHERE comercial.id=new.id_comercial;
    UPDATE clientes SET debe=debe+new.importe WHERE clientes.id=new.id_cliente;
END //
DELIMITER ;

-- 7. Inserta pedidos
INSERT INTO pedidos(id,id_cliente,id_comercial,importe,fecha) VALUES(1,2,3,400,CURDATE()), (2,2,2,500,CURDATE());

-- 8. Crea otro trigger, esta tiene que borrar datos
DELIMITER //
CREATE TRIGGER pedidos_ad AFTER DELETE ON pedidos FOR EACH ROW
BEGIN
    UPDATE comercial SET comision=comision-(old.importe*0.1) WHERE comercial.id=old.id_comercial;
    UPDATE clientes SET debe=debe-old.importe WHERE clientes.id=old.id_cliente;
END //
DELIMITER ;

-- 9. Borra un pedido
DELETE FROM pedidos WHERE id=1;

-- 10. Crea otro trigger que actualice los datos del pedido
DELIMITER //
CREATE TRIGGER pedidos_bu BEFORE UPDATE ON pedidos FOR EACH ROW
BEGIN
    UPDATE comercial SET comision=comision-(old.importe*0.1) WHERE comercial.id=old.id_comercial;
    UPDATE clientes SET debe=debe-old.importe WHERE clientes.id=old.id_cliente;
    UPDATE comercial SET comision=comision+(new.importe*0.1) WHERE comercial.id=new.id_comercial;
    UPDATE clientes SET debe=debe+new.importe WHERE clientes.id=new.id_cliente;
END //
DELIMITER ;

-- 11. Actualiza un pedido
UPDATE pedidos SET id_comercial=1 WHERE id=1;

-- 12. Crea una funcion que devuelva el total de dinero que se a gastado en el año introducido
DELIMITER //
CREATE FUNCTION total_year(cli INT,y INT) RETURNS DEC(7,1)
BEGIN
    DECLARE t DEC(7,1);
    DECLARE x INT;
    SELECT id INTO x FROM clientes WHERE id=cli;
    IF x IS NOT NULL THEN
        SELECT SUM(importe) INTO t FROM pedidos WHERE id_cliente=cli AND YEAR(fecha)=y;
    ELSE SET t=-1;
    END IF;
    RETURN t;
END //
DELIMITER ;

-- 13. Crea una funcion que muestre lo que se gasto cada cliente el año pasado
SELECT apellido,total_year(id,YEAR(CURDATE())-1) AS total FROM clientes;

-- 14. Añade pedidos
INSERT INTO pedidos(id,id_cliente,id_comercial,importe,fecha) VALUES(5,1,3,500,"2022-04-13"), (6,3,3,150,"2022-11-30");