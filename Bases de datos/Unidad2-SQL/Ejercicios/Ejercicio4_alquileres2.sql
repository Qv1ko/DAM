--1. Obtener todos los datos de los coches la tabla automóviles
SELECT * FROM automoviles;

--2. Obtener todos los datos de los clientes
SELECT * FROM clientes;

--3. Obtener todos los datos de los contratos realizados
SELECT * FROM contratos;

--4. Listar los apellidos y nombres de todos los clientes
SELECT apellidos,nombre FROM clientes;
/*5. Realizar un listado, ordenado ascendentemente por apellidos y después por nombre, con 
los apellidos y nombres de todos los clientes */
SELECT apellidos,nombre FROM clientes ORDER BY apellidos ASC;

/*6. Listar las matrículas de los coches contratados y fechas iniciales de contrato ordenado 
por fecha inicial */
SELECT matricula_automoviles,finicial FROM contratos ORDER BY finicial ASC;

--7. Obtener una lista sin repeticiones con las matrículas de los coches contratados
SELECT DISTINCT matricula_automoviles FROM contratos;

--8. Obtener una lista con los nombres y apellidos de los clientes que son de Toledo
SELECT nombre,apellidos FROM clientes WHERE localidad="Toledo";

/*9. Obtener una lista con los nombres y apellidos de todos los clientes de Madrid con carnet 
tipo C1 */
SELECT nombre,apellidos FROM clientes WHERE localidad="Madrid" AND carnet="C1";

--10. Obtener los datos del cliente con número de DNI 00740365
SELECT * FROM clientes WHERE dni="00740365";

/*11. Obtener la matrícula y fecha inicial de contrato de todos los coches contratados antes 
del 25/mar/08 */
SELECT matricula_automoviles,finicial FROM contratos WHERE finicial<"2008-03-25";

--12. Obtener todos los datos de los contratos realizados el día 24/mar/09
SELECT * FROM contratos WHERE finicial="2009-11-24";

/*13. Obtener la matrícula, fecha inicial, y fecha final de contrato de los coches 
contratados en marzo de 2008 */
SELECT matricula_automoviles,finicial,ffinal FROM contratos WHERE finicial>="2008-03-01" AND finicial<="2008-03-31";
SELECT matricula_automoviles,finicial,ffinal FROM contratos WHERE finicial BETWEEN "2008-03-01" AND "2008-03-31";

/*14. Obtener la matrícula, fecha inicial, y fecha final de contrato de los coches 
contratados en marzo de 2008 usando las funciones MONTH y YEAR */
SELECT matricula_automoviles,finicial,ffinal FROM contratos WHERE MONTH(finicial)=3 AND YEAR(finicial)=2008;

--15. Obtener la matrícula, marca y modelo de todos los coches disponibles
SELECT matricula,marca_marcas,modelo FROM automoviles WHERE alquilado=false;

/*16. Obtener la matrícula, marca y modelo de todos los coches disponibles con menos de 
20000 kilómetros */
SELECT matricula,marca_marcas,modelo FROM automoviles WHERE alquilado=false AND kilometros<20000;

/*17. Listar los nombres y apellidos de todos los clientes cuyo primer apellido comienza 
por ‘B’ */
SELECT nombre,apellidos FROM clientes WHERE apellidos LIKE "B%";

--18. Obtener todos los datos del contrato número 19
SELECT * FROM contratos WHERE numcontrato=19;

/*19. Obtener todos los datos de los contratos con número comprendido entre 7 y 12, y el 
contrato número 19 */
SELECT * FROM contratos WHERE numcontrato>=7 AND numcontrato<=12 OR numcontrato=19;
SELECT * FROM contratos WHERE numcontrato IN (7,8,9,10,11,12,19);

/*20. Obtener los números de contrato finalizados, las fechas de inicio y fin y los 
kilómetros iniciales y finales */
SELECT numcontrato,finicial,ffinal,kinicial,kfinal FROM contratos WHERE ffinal IS NOT NULL;

/*21. Modificar los encabezados del anterior listado para que en vez de finicial aparezca 
fecha inicial de contrato y en lugar de ffinal, kinicial y kfinal lo correspondiente */
SELECT numcontrato,finicial AS "Fecha inicial",ffinal AS "Fecha final",kinicial AS "Kms iniciales",kfinal AS "Kms finales"
    FROM contratos
    WHERE ffinal IS NOT NULL;

/*22. Obtener DNI, nombre y apellidos de todos los clientes que tienen expedido el carnet de 
conducir hace más de 10 años */
SELECT dni,nombre,apellidos FROM clientes WHERE YEAR(CURDATE())-YEAR(fechaexp);

/*23. Obtener un listado con la marca y modelo en una misma columna de todos los coches 
disponibles ordenado por marca y por modelo ascendentemente */
SELECT CONCAT(marca_marcas," ",modelo) AS coche FROM automoviles ORDER BY marca_marcas,modelo ASC;
--SELECT CONCAT(marca_marcas," ",modelo) AS coche FROM automoviles ORDER BY marca_marcas DESC, modelo DESC;

/*24. Obtener un listado con el encabezado ‘Contratos realizados’ que contenga una línea por
cada contrato realizado con el contendido El cliente con DNI ... contrató el coche con 
matricula ... */
SELECT CONCAT("El cliente con DNI ",dni_clientes," contrató el coche con matricula ",matricula_automoviles) AS "Contratos realizados" FROM contratos;