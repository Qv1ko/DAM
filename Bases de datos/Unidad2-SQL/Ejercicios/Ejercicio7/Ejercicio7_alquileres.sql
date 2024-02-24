/*1. Insertar un BMW 520 TDI color azul, matrícula 7600CFG, 1200 kilómetros, 140 euros de 
precio de alquiler, no alquilado y extras AA, EE, DA, CC, CD, ABS */
INSERT INTO automoviles(marca_marcas,modelo,color,matricula,kilometros,precio,alquilado,extras)
    VALUES("BMW","520 TDI","Azul","7600CFG",1200,140,0,"AA, EE, DA, CC, CD, ABS");

/*2. Insertar un Citroen C2 color gris, matrícula 2300CFG, 1120 kilómetros, 85 euros de precio
de alquiler */
INSERT INTO automoviles(marca_marcas,modelo,color,matricula,kilometros,precio)
    VALUES("Citroen","C2","Gris","2300CFG",1120,85);

--3. Insertar un Audi A6 negro, 1000 kilómetros, precio 120 euros y matricula 2301CFG
INSERT INTO automoviles(marca_marcas,modelo,color,kilometros,precio,matricula)
    VALUES("Audi","A6","Negro",1000,120,"2301CFG");

--4. Insertar un SEAT Toledo gris matrícula 1234BMY, precio 120 euros
INSERT INTO automoviles(marca_marcas,modelo,color,matricula,precio)
    VALUES("SEAT","Toledo","Gris","123BMR",120);

/*5. Insertar un contrato del automóvil matrícula 4387BDD, para el cliente de DNI 02748375, 
con fecha inicial 12 de octubre de 2007 y kilómetros iniciales 23057 */
INSERT INTO contratos(matricula_automoviles,dni_clientes,finicial,kinicial)
    VALUES("4387BDD","02748375","2007-10-12",23057);

/*6. Insertar un contrato de número 50 para el cliente 00445760 sobre el coche matrícula 
5678BRZ con fecha inicial el día actual */
INSERT INTO contratos(numcontrato,dni_clientes,matricula_automoviles,finicial)
    VALUES(50,"00445760","5678BRZ",CURDATE());

/*7. Insertar un contrato para el cliente de DNI 11223344 sobre el coche matrícula 3765BSD 
con la fecha actual. */
INSERT INTO contratos(dni_clientes,matricula_automoviles,finicial)
    VALUES("11223344","3765BSD",CURDATE());

/*8. Insertar un contrato para el cliente de DNI 58347695 sobre el coche matrícula 2300CFG 
con la fecha actual */
INSERT INTO contratos(dni_clientes,matricula_automoviles,finicial)
    VALUES("58347695","2300CFG",CURDATE());

/*9. Insertar un contrato de numero 16 sobre el coche de matrícula 1732CBS con 2500 
kilómetros iniciales */
INSERT INTO contratos(numcontrato,matricula_automoviles,dni_clientes,kinicial)
    VALUES(24,"1732CBS","58347695",2500);

--10. Insertar todas las filas de la tabla contratos2 en la tabla contratos
INSERT INTO contratos
    SELECT * from contratos2;

/*11. Añadir un contrato correspondiente a que el cliente de DNI 12348630 ha contratado el 
Mercedes 500 E en la fecha de hoy con los kilómetros iniciales que este coche tiene en la 
tabla AUTOMOVILES */
INSERT INTO contratos(numcontrato,matricula_automoviles,dni_clientes,finicial,kinicial)
    VALUES(28,(SELECT matricula FROM automoviles 
        WHERE marca_marcas="Mercedes" AND modelo="500 E"),"12348630",CURDATE(),(SELECT kilometros FROM automoviles 
            WHERE marca_marcas="Mercedes" AND modelo="500 E"));

/*12. Añadir un contrato correspondiente a que Natalia Montoya ha contratado el coche de 
matrícula 4387BDD en la fecha de hoy */
INSERT INTO contratos(numcontrato,matricula_automoviles,dni_clientes,finicial)
    VALUES(29,"4387BDD",(SELECT dni FROM clientes WHERE nombre="Natalia" AND apellidos="Montoya"),CURDATE());

/*13. Añadir lo necesario para registrar que Natalia Montoya ha contratado en la fecha de hoy 
todos los automóviles de azules y rojos poniendo los kilómetros iniciales a 0 */
INSERT INTO contratos(matricula_automoviles,dni_clientes,finicial,kinicial)
    SELECT matricula,dni,CURDATE(),0 FROM automoviles INNER JOIN clientes 
        WHERE (color="Rojo" OR color="Azul") AND (nombre="Natalia" AND apellidos="Montoya");

--14. Eliminar los contratos añadidos en los ejercicios 11, 12 y 13
DELETE FROM contratos WHERE numcontrato BETWEEN 28 AND 29 OR numcontrato BETWEEN 54 AND 62;

--15. Crear un fichero de texto con los datos de todos los clientes
SELECT * FROM clientes 
    INTO OUTFILE "C:\\Users\\Usuario\\DAM\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio7\\Ejercicio7_txts\\Alquileres_clientes.txt";
    

/*16. Crear un fichero de texto con el nombre, apellidos e importe relativo a todos los 
contratos finalizados */
SELECT nombre AS Nombre,apellidos AS Apellidos,ABS(DATEDIFF(ffinal,finicial)*precio) AS "Importe relativo"
    FROM clientes INNER JOIN contratos ON clientes.dni=contratos.dni_clientes INNER JOIN automoviles ON contratos.matricula_automoviles=automoviles.matricula 
    WHERE ffinal IS NOT NULL 
        INTO OUTFILE "C:\\Users\\Usuario\\DAM\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio7\\Ejercicio7_txts\\Alquileres_contratos_finalizados.txt";

--17. Poner el contrato 16 con fecha final 19 de abril de 2009, y kilómetros finales 24756
UPDATE contratos
    SET ffinal="2009-04-19",kfinal=24756 WHERE numcontrato=16;

--18. Poner los kilómetros finales del contrato 17 a 12267
UPDATE contratos
    SET kfinal=12267 WHERE numcontrato=17;

--19. Cambiar el color del Ford Focus a color rojo
UPDATE automoviles
    SET color="Rojo" WHERE marca_marcas="Ford" AND modelo="Focus";

/*20. Poner la fecha final de los contratos 18 y 19 a 7 días más que su fecha inicial y los 
kilómetros finales a 2200 kilómetros más que los iniciales */
UPDATE contratos
    SET finicial=ADDDATE(finicial,7),kfinal=(kinicial+2200) WHERE numcontrato=18 OR numcontrato=19;

--21. Poner en la tabla automóviles todos los coches como disponibles
UPDATE automoviles
    SET alquilado=0 WHERE alquilado=1;

/*22. Poner en la tabla automóviles como no disponibles todos los coches que se hayan 
alquilado y no hayan finalizado su contrato */
UPDATE automoviles NATURAL JOIN contratos
    SET alquilado=true WHERE ffinal IS NULL;

/*23. Insertar un nuevo contrato para el cliente con dni 09856064 sobre el coche matrícula 
4738CBJ, fecha inicial la actual y kilómetros iniciales el contenido de la columna kilómetros */
INSERT INTO contratos(dni_clientes,matricula_automoviles,finicial,kinicial)
    VALUES ("09856064","4738CBJ",CURDATE(),(SELECT kilometros FROM automoviles WHERE matricula="4738CBJ"));

--24. Modificar los contratos números 20,21,22,23 para que tengan los números 40,41,42,43
UPDATE contratos
    SET numcontrato=numcontrato+20 WHERE numcontrato BETWEEN 20 and 23;

--25. Modificar el número de contrato 16 para que tenga el número 6
UPDATE contratos
    SET numcontrato=66 WHERE numcontrato=16;

/*26. Modificar el contrato número 15 para que quede realizado sobre el automóvil de 
matrícula 5031BHL */
UPDATE contratos
    SET matricula_automoviles="5031BHL" WHERE numcontrato=15;

--Modificacion de la foreign key a cascade para poder realizar el ejercicio siguiente
SHOW CREATE TABLE contratos;
ALTER TABLE contratos DROP FOREIGN KEY contratos_ibfk_2;
ALTER TABLE contratos ADD FOREIGN KEY(matricula_automoviles) REFERENCES automoviles(matricula) ON UPDATE CASCADE ON DELETE CASCADE;

--27. Modificar la matrícula del Audi A3 para que pase a ser 4783CBJ
UPDATE automoviles
    SET matricula="4783CBJ" WHERE marca_marcas="Audi" AND modelo="A3";

/*28. Poner en kilómetros del automóvil correspondiente al contrato número 15 los kilómetros 
finales que figuran en dicho contrato */
UPDATE automoviles INNER JOIN contratos ON matricula=matricula_automoviles
    SET kilometros=kfinal WHERE numcontrato=15;

/*29. Actualizar todos los precios de alquiler de los automóviles para incrementar su precio 
en un 2% */
UPDATE automoviles
    SET precio=precio*1.02;

/*30. Modificar los kilómetros de todos los automóviles que finalizaron su contrato entre el 
4 de marzo y el 15 de abril de 2007 con los kilómetros finales de dichos contratos */
UPDATE automoviles INNER JOIN contratos ON matricula=matricula_automoviles
    SET kilometros=kfinal WHERE ffinal BETWEEN "2017-03-04" AND "2017-04-15";