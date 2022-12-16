SELECT COUNT(*) FROM contratos;

SELECT localidad,COUNT(dni) AS clientes FROM clientes GROUP BY localidad;

SELECT localidad,COUNT(dni) AS clientes FROM clientes WHERE carnet="B" GROUP BY localidad;

SELECT localidad,COUNT(dni) AS clientes FROM clientes WHERE localidad<>"Madrid"  GROUP BY localidad;

SELECT matricula,marca_marcas,modelo,precio FROM automoviles WHERE precio>(SELECT precio from automoviles WHERE matricula="3765BSD");

SELECT localidad,COUNT(dni) AS clientes FROM clientes WHERE carnet="B" GROUP BY localidad HAVING COUNT(dni)>=1;

SELECT matricula_automoviles,finicial FROM contratos ORDER BY finicial DESC LIMIT 3;

SELECT marca_marcas AS Marca,MAX(precio) AS Precio FROM automoviles GROUP BY marca_marcas HAVING AVG(precio)<=100;

SELECT localidad,COUNT(carnet) AS frecuencia,carnet FROM clientes GROUP BY localidad,carnet;

SELECT dni_clientes,COUNT(*)
    FROM contratos
    GROUP BY dni_clientes HAVING COUNT(*)=(SELECT COUNT(*) FROM contratos GROUP BY dni_clientes ORDER BY COUNT(*) DESC LIMIT 1);

