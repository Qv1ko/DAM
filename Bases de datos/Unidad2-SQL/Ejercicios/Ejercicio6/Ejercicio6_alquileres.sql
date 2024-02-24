--1. Obtener el número total de contratos
SELECT COUNT(*) FROM contratos;

--2. Obtener el número de clientes de cada ciudad
SELECT localidad,COUNT(dni) AS clientes FROM clientes GROUP BY localidad;

--3. Obtener el número de clientes de cada ciudad que tengan permiso de tipo B
SELECT localidad,COUNT(dni) AS clientes FROM clientes WHERE carnet="B" GROUP BY localidad;

--4. Obtener el número de clientes de cada ciudad excepto de Madrid
SELECT localidad,COUNT(dni) AS clientes FROM clientes WHERE localidad<>"Madrid"  GROUP BY localidad;

/*5. Obtener las matrículas, marcas, modelos y precios de alquiler de los automóviles que 
tienen un precio de alquiler superior al automóvil de matrícula 3765BSD */
SELECT matricula,marca_marcas,modelo,precio FROM automoviles WHERE precio>(SELECT precio from automoviles WHERE matricula="3765BSD");

/*6. Obtener el número de clientes de cada ciudad que tengan permiso tipo B siempre que ese 
número sea superior o igual a 1 */
SELECT localidad,COUNT(dni) AS clientes FROM clientes WHERE carnet="B" GROUP BY localidad HAVING COUNT(dni)>=1;

--7. Mostrar las matrículas y fecha inicial de los tres últimos contratos realizados
SELECT matricula_automoviles,finicial FROM contratos ORDER BY finicial DESC LIMIT 3;

--8. Obtener el precio de alquiler máximo de cada marca
SELECT marca_marcas AS Marca,MAX(precio) AS Precio FROM automoviles GROUP BY marca_marcas;

/*9. Obtener el precio de alquiler máximo de cada marca excepto de aquellas cuyo precio medio 
sea superior a 100 Euros */
SELECT marca_marcas AS Marca,MAX(precio) AS Precio FROM automoviles GROUP BY marca_marcas HAVING AVG(precio)<=100;

--10. Obtener la frecuencia de cada tipo de carnet de conducir entre los clientes de cada ciudad
SELECT localidad,COUNT(carnet) AS frecuencia,carnet FROM clientes GROUP BY localidad,carnet;

--11. Obtener el/los DNI/s de cliente/s que hayan hecho mayor número de contratos
SELECT dni_clientes,COUNT(*)
    FROM contratos
    GROUP BY dni_clientes HAVING COUNT(*)=(SELECT COUNT(*) FROM contratos GROUP BY dni_clientes ORDER BY COUNT(*) DESC LIMIT 1);

/*12. Obtener la mayor antigüedad de permiso de conducir de los clientes de cada uno de los 
grupos formados por igual ciudad */
SELECT localidad,MIN(fechaexp) FROM clientes GROUP BY localidad;

--13. Consulta para obtener cuantos vehículos hay de cada marca en la tabla automóviles
SELECT marca_marcas AS Marca,COUNT(matricula) AS Vehiculos FROM automoviles GROUP BY marca_marcas;

/*14. Obtener la mayor antigüedad de permiso de conducir de los clientes de cada uno de los 
grupos formados por igual ciudad e igual tipo de permiso */
SELECT localidad AS Localidad,MIN(fechaexp),carnet AS Carnet FROM clientes GROUP BY localidad,carnet;

--15. Obtener el precio medio de alquiler de todos los vehículos de la tabla automóviles
SELECT AVG(precio) AS "Precio medio" FROM automoviles;

--16. Obtener la media de precios de alquiler de cada marca
SELECT marca_marcas AS Marca,AVG(precio) AS "Media de precios" FROM automoviles GROUP BY marca_marcas;

--17. Obtener el total de ingresos por alquileres de cada día
SELECT finicial AS Fecha,SUM(precio) AS Ingreso FROM automoviles INNER JOIN contratos GROUP BY finicial;

/*18. Mostrar la matrícula y días de contrato de los vehículos que han finalizado contrato y 
que han sido contratados durante más de 5 días */
SELECT matricula_automoviles AS Matricula,DATEDIFF(ffinal,finicial) AS "Dias de contrato"
    FROM contratos
    WHERE ffinal<>0 AND DATEDIFF(ffinal,finicial)>5;

/*19. Obtener un listado de los clientes y el número de años que hace que tienen permiso de 
conducir */
SELECT dni,nombre,apellidos,TRUNCATE(DATEDIFF(CURDATE(),fechaexp)/365,0) AS "Nº de años" FROM clientes;

--20. Obtener la mayor antigüedad del permiso de conducir entre todos los clientes
SELECT fechaexp,dni AS DNI FROM clientes GROUP BY fechaexp ASC LIMIT 1;

--21. Obtener el nombre del Cliente que tiene carnet desde hace más tiempo
SELECT nombre AS Nombre FROM clientes GROUP BY fechaexp ASC LIMIT 1;

--22. Obtener el número de contrato que ha generado el mayor importe
SELECT numcontrato,DATEDIFF(ffinal,finicial)*precio AS imp FROM contratos INNER JOIN automoviles WHERE ffinal IS NOT NULL GROUP BY imp DESC LIMIT 1;

--23. Obtener el nombre y apellidos del cliente que ha generado el mayor importe
SELECT nombre AS Nombre,apellidos AS apellidos
    FROM clientes
    WHERE dni=(SELECT dni_clientes FROM contratos INNER JOIN automoviles WHERE ffinal IS NOT NULL
        GROUP BY DATEDIFF(ffinal,finicial)*precio DESC LIMIT 1);

--24. El total del kilometraje de todos los automóviles no alquilados
SELECT SUM(kilometros) AS "Kilometraje total" FROM automoviles WHERE alquilado=0;

--25. El total de kilometraje de los automóviles de cada marca
SELECT marca_marcas AS Marca,SUM(kilometros) AS Kilometraje FROM automoviles GROUP BY marca_marcas;