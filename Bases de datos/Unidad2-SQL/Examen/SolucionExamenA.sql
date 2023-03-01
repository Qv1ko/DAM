--Archivo solucion del examen SQL tipo A

--2
ALTER TABLE comercial MODIFY comision DEC(3,2);

--3
INSERT INTO cliente(nombre,apellido1,apellido2,ciudad,categoria) VALUES("Juan","Ruiz","Sanz","Lugo",300);

--4
INSERT INTO pedidos(total,fecha,id_cliente,id_comercial) VALUES(555,CURDATE(),11,1),(555,CURDATE(),11,2);

--5
SELECT * FROM pedidos WHERE total BETWEEN 500 AND 1500 ORDER BY fecha DESC LIMIT 10;

--6
SELECT * FROM cliente WHERE (apellido1 LIKE "C%" OR apellido2 LIKE "R%") AND apellido2 IS NOT NULL ORDER BY apellido1,apellido2,nombre;

--7
SELECT * FROM comercial INNER JOIN pedidos ON comercial.id=pedidos.id_comercial GROUP BY pedidos.id_comercial;

--8
SELECT DISTINCT comercial.nombre,comercial.apellido1 FROM comercial 
    INNER JOIN pedidos ON comercial.id=pedidos.id_comercial INNER JOIN cliente ON cliente.id=pedidos.id_cliente
    WHERE cliente.nombre="Maria" AND cliente.apellido1="Santana";

--9
SELECT nombre,apellido1,pedido.* FROM cliente LEFT JOIN pedido ON cliente.id=pedido.id_cliente;

--10
SELECT MAX(cantidad),YEAR(fecha) FROM pedido GROUP BY YEAR(fecha);