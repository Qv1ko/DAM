SELECT marca_marcas,modelo,precio FROM automoviles WHERE matricula="3273BGH";

SELECT a1.matricula FROM automoviles a1, automoviles a2 WHERE a2.matricula="3765BSD" AND a1.precio>=a2.precio;

SELECT a1.matricula,a1.precio FROM automoviles a1, automoviles a2 WHERE a2.matricula="3765BSD" AND a1.precio>=a2.precio AND a1.matricula<>a2.matricula;

--Mostrar todas las convinaciones posibles
SELECT * FROM automoviles AS a1 CROSS JOIN automoviles a2;

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio=(SELECT precio FROM automoviles WHERE matricula="2058CGF");

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio=(SELECT precio FROM automoviles WHERE matricula="2058CGF") AND matricula<>"2058CGF";

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio>(SELECT precio FROM automoviles WHERE marca_marcas="Mercedes" AND modelo="500 E");

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio<(SELECT precio FROM automoviles WHERE marca_marcas="Ford" AND modelo="Focus");

SELECT nombre,apellidos FROM clientes WHERE carnet=(SELECT carnet FROM clientes WHERE nombre="Soraya" AND apellidos LIKE "Bats%");

SELECT marca_marcas,modelo,precio FROM automoviles WHERE precio IN (SELECT precio FROM automoviles WHERE marca_marcas="Seat");

SELECT * FROM contratos WHERE dni_clientes=(SELECT dni FROM clientes WHERE nombre="Beatriz" AND apellidos="Garcia Martin");

SELECT clientes.nombre,clientes.apellidos,contratos.* FROM clientes,contratos WHERE clientes.dni = contratos.dni_clientes;

SELECT clientes.nombre,clientes.apellidos,contratos.* FROM clientes,contratos WHERE clientes.dni="07385709" AND contratos.dni_clientes="07385709";

SELECT marca_marcas,modelo FROM automoviles WHERE matricula=(SELECT matricula_automoviles FROM contratos WHERE dni_clientes=(SELECT dni FROM clientes WHERE nombre="Carlos Javier" AND apellidos="López Carvajal"));

--SELECT clientes.nombre,clientes.apellidos FROM clientes,contratos WHERE contratos.finicial >IN (SELECT finicial FROM contratos WHERE dni_clientes="09856064");

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE kilometros>10000 AND kilometros<30000 AND color="rojo";

SELECT * FROM automoviles WHERE color="verde" OR color="azul" OR color="blanco";

SELECT * FROM automoviles WHERE color="verde" AND extras LIKE "%ABS%" AND extras LIKE "%AA%" AND kilometros<30000;

SELECT * FROM automoviles WHERE precio>=90 AND precio<=100 AND alquilado=0;

SELECT * FROM automoviles WHERE precio<100