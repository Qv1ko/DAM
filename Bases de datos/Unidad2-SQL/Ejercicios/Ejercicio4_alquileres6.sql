START TRANSACTION;

DELETE FROM contratos WHERE numcontrato=40;

DELETE FROM contratos WHERE numcontrato>24;

DELETE FROM contratos WHERE matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="BMW");

DELETE FROM contratos WHERE dni_clientes IN (SELECT dni FROM clientes WHERE apellidos="Fuentes Rojas");

DELETE FROM clientes WHERE apellidos="Fuentes Rojas";

DELETE FROM contratos WHERE dni_clientes IN (SELECT dni FROM clientes WHERE nombre="Ismael" AND apellidos="Poza Rincón") AND 
    matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="Audi" AND modelo="A4");
DELETE contratos FROM contratos INNER JOIN clientes ON contratos.dni_clientes=clientes.dni 
    INNER JOIN automoviles ON contratos.matricula_automoviles=automoviles.matricula
        WHERE apellidos="Poza Rincón" AND nombre="Ismael" AND modelo="A4" AND marca_marcas="Audi";

DELETE a1 FROM automoviles AS a1,automoviles AS a2 WHERE a1.precio>a2.precio AND a2.marca_marcas="Mercedes" AND a2.modelo="500 E";

DELETE FROM contratos2;

SHOW CREATE TABLE contratos;
ALTER TABLE contratos DROP FOREIGN KEY contratos_ibfk_1;
ALTER TABLE contratos ADD FOREIGN KEY(dni_clientes) REFERENCES clientes(dni) ON UPDATE CASCADE ON DELETE CASCADE;
DELETE FROM clientes WHERE dni="09856064";

DELETE FROM clientes WHERE nombre="Mariano" AND apellidos="Dorado";

DELETE FROM contratos WHERE ffinal IS NOT NULL AND matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="SEAT");

DELETE FROM contratos WHERE ffinal IS NULL AND matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="SEAT");

DELETE FROM automoviles WHERE marca_marcas="SEAT";

DELETE FROM clientes WHERE localidad<>"Cuenca" AND localidad!="Toledo";

DELETE FROM contratos;






SELECT * FROM automoviles a1 WHERE a1.precio>(SELECT AVG(precio) FROM automoviles a2 WHERE a1.marca_marcas=a2.marca_marcas);