--1. Obtener la marca, el modelo y el precio de alquiler del automóvil de matrícula 3273BGH
SELECT marca_marcas,modelo,precio FROM automoviles WHERE matricula="3273BGH";

/*2. Obtener, mediante producto cartesiano automóviles x automóviles, las matrículas de los 
coches que tienen un precio de alquiler no inferior al de matrícula 3765BSD */
SELECT a1.matricula FROM automoviles a1, automoviles a2 WHERE a2.matricula="3765BSD" AND a1.precio>=a2.precio;

/*3. Obtener, de la forma anterior, las matrículas de los coches que tienen un precio de 
alquiler no inferior al de matrícula 3765BSD (sin que aparezca éste) */
SELECT a1.matricula,a1.precio FROM automoviles a1, automoviles a2
    WHERE a2.matricula="3765BSD" AND a1.precio>=a2.precio AND a1.matricula<>a2.matricula;

--Mostrar todas las convinaciones posibles
SELECT * FROM automoviles AS a1 CROSS JOIN automoviles a2;

/*4. Obtener, mediante subconsulta, las matrículas, marcas y modelos de los coches que tienen 
un precio de alquiler igual al precio de alquiler del coche de matrícula 2058CGF */
SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio=(SELECT precio FROM automoviles WHERE matricula="2058CGF");

/*5. Obtener, mediante subconsulta, las matrículas, marcas y modelos de los coches que tienen 
un precio de alquiler igual al precio de alquiler del coche de matrícula 2058CGF, exceptuando 
a él mismo */
SELECT matricula,marca_marcas,modelo FROM automoviles
    WHERE precio=(SELECT precio FROM automoviles WHERE matricula="2058CGF") AND matricula<>"2058CGF";

/*6. Obtener las matrículas, marcas y modelos de los coches que tienen un precio de alquiler 
superior al Mercedes 500 E */
SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio>(SELECT precio FROM automoviles WHERE marca_marcas="Mercedes" AND modelo="500 E");

/*7. Obtener, mediante subconsulta, las matrículas, marcas y modelos de los coches que tienen 
un precio de alquiler inferior al precio de alquiler del Ford Focus */
SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio<(SELECT precio FROM automoviles WHERE marca_marcas="Ford" AND modelo="Focus");

/*8. Obtener el nombre y apellidos de todos los clientes que tienen el mismo tipo de permiso 
de conducir que Soraya Bats */
SELECT nombre,apellidos FROM clientes WHERE carnet=(SELECT carnet FROM clientes WHERE nombre="Soraya" AND apellidos LIKE "Bats%");

/*9. Obtener las marcas, modelos y precios de alquiler de los coches que tienen el mismo 
precio de alquiler que los de la marca SEAT */
SELECT marca_marcas,modelo,precio FROM automoviles WHERE precio IN (SELECT precio FROM automoviles WHERE marca_marcas="Seat");

--10. Obtener los datos de los contratos realizados por Beatriz Garcia Martin
SELECT * FROM contratos WHERE dni_clientes=(SELECT dni FROM clientes WHERE nombre="Beatriz" AND apellidos="Garcia Martin");

/*11. Obtener el nombre y apellidos de todos los clientes y los datos de los contratos que 
hayan realizado */
SELECT clientes.nombre,clientes.apellidos,contratos.* FROM clientes,contratos WHERE clientes.dni = contratos.dni_clientes;

/*12. Obtener el nombre y apellidos del cliente de DNI=07385709 y los datos de los contratos 
realizados por ese cliente */
SELECT clientes.nombre,clientes.apellidos,contratos.* FROM clientes,contratos WHERE clientes.dni="07385709" AND contratos.dni_clientes="07385709";

/*13. Obtener las marcas y modelos de los coches contratados por Carlos Javier López
Carvajal */
SELECT marca_marcas,modelo FROM automoviles
    WHERE matricula=(SELECT matricula_automoviles FROM contratos WHERE dni_clientes=(SELECT dni FROM clientes WHERE nombre="Carlos Javier" AND apellidos="López Carvajal"));

/*14. Obtener el nombre y apellidos de los clientes que han contratado un coche durante los 
mismos o más días que el contrato realizado por el cliente con DNI 09856064 */
SELECT DISTINCT clientes.nombre,clientes.apellidos FROM clientes INNER JOIN contratos ON clientes.dni=contratos.dni_clientes
    WHERE DATEDIFF(ffinal,finicial)>=(SELECT DATEDIFF(ffinal,finicial) AS Dias FROM contratos WHERE dni_clientes="09856064");

/*15. Visualizar la matrícula, marca y modelo de aquellos coches con KILÓMETROS entre 10.000 
y 30.000 que además sean de color rojo */
SELECT matricula,marca_marcas,modelo FROM automoviles WHERE kilometros>10000 AND kilometros<30000 AND color="rojo";
SELECT matricula,marca_marcas,modelo FROM automoviles WHERE kilometros BETWEEN 10000 AND 30000 AND color="rojo";

--16. Crear una consulta para ver qué coches tienen color Verde, Azul o Blanco
SELECT * FROM automoviles WHERE color="verde" OR color="azul" OR color="blanco";
SELECT * FROM automoviles WHERE color IN ("verde","azul","blanco");

/*17. Consulta para ver si hay algún coche de color Verde, con ABS y aire acondicionado, con 
menos de 30.000 kms */
SELECT * FROM automoviles WHERE color="verde" AND extras LIKE "%ABS%" AND extras LIKE "%AA%" AND kilometros<30000;

/*18. Mirar qué coches con precio de alquiler diario entre 90 y 100 euros hay disponibles 
(No alquilados) */
SELECT * FROM automoviles WHERE precio>=90 AND precio<=100 AND alquilado=0;
SELECT * FROM automoviles WHERE precio>=90 AND precio<=100 AND alquilado=false;

/*19. Crear una consulta para atender a un cliente que quiere alquilar un coche por menos de 
100 euros/día, que tuviese lector de CD, con menos de 30.000 kms. Y le gustaría que fuese 
blanco o azul */
SELECT * FROM automoviles WHERE precio<100 AND extras LIKE "%CD%" AND kilometros<30000 AND (color="blanco" OR color="azul");

--Precio maximo
SELECT precio FROM automoviles ORDER BY precio DESC LIMIT 1;
--Precio minimo
SELECT precio FROM automoviles ORDER BY precio ASC LIMIT 1;
--Media de precio
SELECT AVG(precio) FROM automoviles;

/*20. Crear una consulta que nos permitan calcular el precio más caro de alquiler, el precio 
más barato y el precio medio */
SELECT MAX(precio),MIN(precio),AVG(precio) FROM automoviles;

--21. Crear una consulta que nos permita determinar el contrato más largo
SELECT * FROM contratos ORDER BY DATEDIFF(ffinal,finicial) DESC LIMIT 1;
SELECT numcontrato, DATEDIFF(ffinal,finicial) AS Dias FROM contratos ORDER BY dias DESC LIMIT 1;

/*22. Crear una consulta que nos permita calcular el total de los importes de los contratos 
ya finalizados */
SELECT SUM(DATEDIFF(ffinal,finicial)*precio) AS Total FROM contratos NATURAL JOIN automoviles WHERE ffinal IS NOT NULL;

/*23. Crear una consulta que nos permita calcular el número de clientes con permiso de 
circulación de tipo B */
SELECT COUNT(dni) AS "Clientes con permiso B" FROM clientes WHERE carnet="B";