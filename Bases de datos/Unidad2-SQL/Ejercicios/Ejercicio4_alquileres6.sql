START TRANSACTION;

DELETE FROM contratos WHERE numcontrato=40;

DELETE FROM contratos WHERE numcontrato>24;

DELETE FROM contratos WHERE matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="BMW");

DELETE FROM contratos WHERE dni_clientes IN (SELECT dni FROM clientes WHERE apellidos="Fuentes Rojas");

DELETE FROM clientes WHERE apellidos="FUentes Rojas";

DELETE FROM contratos 
    WHERE dni_clientes IN (SELECT dni FROM clientes WHERE nombre="Ismael" AND apellidos="Poza Rincón") AND 
        matricula_automoviles IN (SELECT matricula FROM automoviles WHERE marca_marcas="Audi" AND modelo="A4");

-- DELETE FROM automoviles WHERE precio IN (marca_marcas="Mercedes" AND modelo="500 E");