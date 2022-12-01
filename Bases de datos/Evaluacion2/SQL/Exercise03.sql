USE alquileres;

SELECT marca_marcas,modelo,precio FROM automoviles WHERE matricula="3273BGH";

SELECT a1.matricula FROM automoviles a1, automoviles a2 WHERE a2.matricula="3765BSD" AND a1.precio>=a2.precio;

SELECT a1.matricula,a1.precio FROM automoviles a1, automoviles a2 WHERE a2.matricula="3765BSD" AND a1.precio>=a2.precio AND a1.matricula<>a2.matricula;

--Mostrar todas las convinaciones posibles
SELECT * FROM automoviles AS a1 CROSS JOIN automoviles a2;

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio=(SELECT precio FROM automoviles WHERE matricula="2058CGF");

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE precio=(SELECT precio FROM automoviles WHERE matricula="2058CGF") AND matricula<>"2058CGF";

