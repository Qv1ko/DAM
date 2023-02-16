--Archivo examen SQL tipo B de Victor Garcia Murillo

--1
source examen.sql;

--2
ALTER TABLE cliente MODIFY COLUMN ciudad VARCHAR(33) DEFAULT "Santander";

--3
INSERT INTO comercial(nombre,apellido1,apellido2,comisión) VALUES("Víctor","García","Murillo",0.15);

--4
INSERT INTO pedido(total,fecha,id_cliente,id_comercial) 
    VALUES(888,CURDATE(),2,(SELECT id FROM comercial WHERE nombre="Víctor" AND apellido1="García" AND apellido2="Murillo")),
    (888,CURDATE(),7,(SELECT id FROM comercial WHERE nombre="Víctor" AND apellido1="García" AND apellido2="Murillo"));

--5
SELECT DISTINCT comercial.nombre,comercial.apellido1,comercial.apellido2 FROM comercial INNER JOIN pedido ON comercial.id=pedido.id_comercial WHERE pedido.id_comercial IN (SELECT pedido.id_comercial FROM pedido INNER JOIN cliente ON pedido.id_cliente=cliente.id WHERE cliente.ciudad="Sevilla");

--6
SELECT cliente.nombre,MAX(pedido.total) AS "Valor máximo",pedido.fecha FROM pedido INNER JOIN cliente ON pedido.id_cliente=cliente.id GROUP BY cliente.id,pedido.fecha;

--7
SELECT cliente.*,COUNT(id_cliente) AS "Pedidos solicitados" FROM cliente INNER JOIN pedido ON cliente.id=pedido.id_cliente GROUP BY pedido.id_cliente HAVING SUM(pedido.total)>5000;

--8
SELECT DISTINCT cliente.nombre,cliente.apellido1,cliente.apellido2 FROM cliente INNER JOIN pedido ON cliente.id=pedido.id_cliente WHERE pedido.id_comercial=5;

--9
SELECT comercial.*,COUNT(id_comercial) AS "Pedidos gestionados" FROM comercial LEFT JOIN pedido ON comercial.id=pedido.id_comercial GROUP BY pedido.id_comercial;

--10
SELECT DISTINCT comercial.* FROM comercial INNER JOIN pedido ON comercial.id=pedido.id_comercial WHERE comercial.comisión>(SELECT comercial.comisión FROM pedido INNER JOIN comercial ON pedido.id_comercial=comercial.id WHERE comercial.nombre="Diego" AND comercial.apellido1="Flores" LIMIT 1);