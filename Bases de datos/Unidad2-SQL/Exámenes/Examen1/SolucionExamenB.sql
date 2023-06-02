--Archivo solucion del examen SQL tipo B

--2
ALTER TABLE cliente MODIFY ciudad VARCHAR(33) DEFAULT="Santander";

--5
SELECT * FROM comercial INNER JOIN pedido ON comercial.id=pedido.id_comercial INNER JOIN cliente ON cliente.id=pedido.id_cliente WHERE cliente.ciudad="Sevilla";

--6
SELECT MAX(cantidad),id_cliente,fecha FROM pedido GROUP BY id_cliente,fecha;

--7
SELECT nombre,apellido1,SUM(cantidad) FROM cliente INNER JOIN pedido ON cliente.id=pedido.id_cliente GROUP BY cliente HAVING SUM(cantidad)>5000;

--8
SELECT nombre,apellido1 FROM cliente INNER JOIN pedido ON cliente.id=pedido.id_cliente WHERE id_comercial=5;

--9
SELECT nombre,apellido1,COUNT(pedido.id) FROM comercial LEFT JOIN pedido ON comercial.id=pedido.id_comercial GROUP BY id_comercial;

--10
SELECT comercial.* FROM comercial WHERE comisión > (SELECT comisión FROM comercial WHERE nombre="Diego" AND apellido1="Flores");