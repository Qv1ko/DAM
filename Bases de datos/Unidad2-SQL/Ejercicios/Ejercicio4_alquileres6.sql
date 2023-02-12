--1. Inicia una transacción
START TRANSACTION;

--2. Eliminar de la tabla CONTRATOS el contrato número 40
DELETE FROM contratos WHERE numcontrato=40;

--3. Eliminar en la tabla CONTRATOS los contratos de número superior a 24
DELETE FROM contratos WHERE numcontrato>24;

--4. Eliminar en la tabla CONTRATOS los contratos realizados sobre algún BMW
DELETE FROM contratos WHERE matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="BMW");

/*5. Eliminar de la tabla CONTRATOS los contratos realizados por los clientes de apellidos 
Fuentes Rojas */
DELETE FROM contratos WHERE dni_clientes IN (SELECT dni FROM clientes WHERE apellidos="Fuentes Rojas");

--6. Eliminar en la tabla CLIENTES los clientes de apellidos Fuentes Rojas
DELETE FROM clientes WHERE apellidos="Fuentes Rojas";

/*7. Eliminar de la tabla CONTRATOS los contratos realizados por Ismael Poza Rincón sobre el 
automóvil Audi A4 */
DELETE FROM contratos WHERE dni_clientes IN (SELECT dni FROM clientes WHERE nombre="Ismael" AND apellidos="Poza Rincón") AND 
    matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="Audi" AND modelo="A4");
DELETE contratos FROM contratos INNER JOIN clientes ON contratos.dni_clientes=clientes.dni 
    INNER JOIN automoviles ON contratos.matricula_automoviles=automoviles.matricula
        WHERE apellidos="Poza Rincón" AND nombre="Ismael" AND modelo="A4" AND marca_marcas="Audi";

/*8. Eliminar de la tabla AUTOMÓVILES los registros que tengan un precio de alquiler superior 
al Mercedes 500 E */
DELETE a1 FROM automoviles AS a1,automoviles AS a2 WHERE a1.precio>a2.precio AND a2.marca_marcas="Mercedes" AND a2.modelo="500 E";

--9. Eliminar todos los registros de la tabla contratos sucursal 2
DELETE FROM contratos2;

--Modificamos la foreign key a cascade para continuar
SHOW CREATE TABLE contratos;
ALTER TABLE contratos DROP FOREIGN KEY contratos_ibfk_1;
ALTER TABLE contratos ADD FOREIGN KEY(dni_clientes) REFERENCES clientes(dni) ON UPDATE CASCADE ON DELETE CASCADE;

--10. Eliminar de la tabla CLIENTES el cliente de dni 09856064
DELETE FROM clientes WHERE dni="09856064";

--11. Eliminar de la tabla CLIENTES el cliente de nombre Mariano Dorado
DELETE FROM clientes WHERE nombre="Mariano" AND apellidos="Dorado";
DELETE FROM clientes WHERE apellidos LIKE "Dorado%" AND nombre="Mariano";

/*12. Eliminar en la tabla CONTRATOS todos los contratos finalizados por automóviles de la 
marca SEAT */
DELETE FROM contratos WHERE ffinal IS NOT NULL AND matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="SEAT");
DELETE c FROM contratos c INNER JOIN automoviles a ON c.matricula_automoviles=a.matricula WHERE ffinal IS NOT NULL AND marca_marcas="SEAT";

/*13. Eliminar en la tabla CONTRATOS todos los contratos no finalizados por automóviles de la 
marca SEAT */
DELETE FROM contratos WHERE ffinal IS NULL AND matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="SEAT");

--14. Eliminar en la tabla Automóviles todos los automóviles de la marca SEAT
DELETE FROM automoviles WHERE marca_marcas="SEAT";

--15. Eliminar todos los clientes que no viven ni en Cuenca ni en Toledo
DELETE FROM clientes WHERE localidad<>"Cuenca" AND localidad!="Toledo";

--16. Eliminar todos los contratos
DELETE FROM contratos;

--17. Eliminar todos los clientes
DELETE FROM clientes;

--18. Ejecuta la orden necesaria para que todas las operaciones anteriores queden anuladas
ROLLBACK;

--19. Establece lo necesario para que el servidor MYSQL trabaje en modo transaccional
SET AUTOCOMMIT=0;

--20. Inserta un nuevo automóvil en la tabla automóviles
INSERT INTO automoviles
    VALUES("4578ZXB","Ford","Mondeo","Gris",50,1000,"AA,ABS",0);

--21. Inserta un nuevo contrato sobre el automóvil anterior por el cliente que decidas
INSERT INTO contratos(matricula_automoviles,dni_clientes,finicial,kinicial)
    VALUES("4578ZXB","09856064",CURDATE(),1000);

--22. Deshaz las inserciones anteriores y comprueba que se han deshecho tales operaciones
ROLLBACK;
SELECT * FROM automoviles;
SELECT * FROM contratos;

--23. Vuelve a realizar las inserciones del apartado 20 y 21 con COMMIT
INSERT INTO automoviles
    VALUES("4578ZXB","Ford","Mondeo","Gris",50,1000,"AA,ABS",0);
INSERT INTO contratos(matricula_automoviles,dni_clientes,finicial,kinicial)
    VALUES("4578ZXB","09856064",CURDATE(),1000);
COMMIT;

--24. Vuelve a establecer que se validen las instrucciones o sentencias de forma automática
SET AUTOCOMMIT=1;

--25. Mostrar automóviles con un precio superior a la media de su marca
SELECT * FROM automoviles a1 WHERE a1.precio>(SELECT AVG(precio) FROM automoviles a2 WHERE a1.marca_marcas=a2.marca_marcas);

--26. Mostrar el valor de la variable AUTOCOMMIT
SELECT @@AUTOCOMMIT;

--27. Mostrar el valor de todas las variables que empiezan por A
SHOW VARIABLES LIKE "a%";

--28. Mostrar los automóviles que no han sido contratados nunca
SELECT automoviles.* FROM automoviles LEFT JOIN contratos ON automoviles.matricula=contratos.matricula_automoviles WHERE automoviles.matricula NOT IN (SELECT matricula_automoviles FROM contratos);