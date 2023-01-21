INSERT INTO automoviles(marca_marcas,modelo,color,matricula,kilometros,precio,alquilado,extras)
    VALUES("BMW","520 TDI","Azul","7600CFG",1200,140,0,"AA, EE, DA, CC, CD, ABS");

INSERT INTO automoviles(marca_marcas,modelo,color,matricula,kilometros,precio)
    VALUES("Citroen","C2","Gris","2300CFG",1120,85);

INSERT INTO automoviles(marca_marcas,modelo,color,kilometros,precio,matricula)
    VALUES("Audi","A6","Negro",1000,120,"2301CFG");

INSERT INTO automoviles(marca_marcas,modelo,color,matricula,precio)
    VALUES("SEAT","Toledo","Gris","123BMR",120);

INSERT INTO contratos(matricula_automoviles,dni_clientes,finicial,kinicial)
    VALUES("4387BDD","02748375","2007-10-12",23057);

INSERT INTO contratos(numcontrato,dni_clientes,matricula_automoviles,finicial)
    VALUES(50,"00445760","5678BRZ",CURDATE());

INSERT INTO contratos(dni_clientes,matricula_automoviles,finicial)
    VALUES("11223344","3765BSD",CURDATE());

INSERT INTO contratos(dni_clientes,matricula_automoviles,finicial)
    VALUES("58347695","2300CFG",CURDATE());

INSERT INTO contratos(numcontrato,matricula_automoviles,dni_clientes,kinicial)
    VALUES(24,"1732CBS","58347695",2500);

INSERT INTO contratos
    SELECT * from contratos2;

INSERT INTO contratos(numcontrato,matricula_automoviles,dni_clientes,finicial,kinicial)
    VALUES(28,(SELECT matricula FROM automoviles 
        WHERE marca_marcas="Mercedes" AND modelo="500 E"),"12348630",CURDATE(),(SELECT kilometros FROM automoviles 
            WHERE marca_marcas="Mercedes" AND modelo="500 E"));

INSERT INTO contratos(numcontrato,matricula_automoviles,dni_clientes,finicial)
    VALUES(29,"4387BDD",(SELECT dni FROM clientes WHERE nombre="Natalia" AND apellidos="Montoya"),CURDATE());

INSERT INTO contratos(matricula_automoviles,dni_clientes,finicial,kinicial)
    SELECT matricula,dni,CURDATE(),0 FROM automoviles INNER JOIN clientes 
        WHERE (color="Rojo" OR color="Azul") AND (nombre="Natalia" AND apellidos="Montoya");

DELETE FROM contratos WHERE numcontrato BETWEEN 28 AND 29 OR numcontrato BETWEEN 54 AND 62;

SELECT * FROM clientes 
    INTO OUTFILE "C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio4_txts\\Ejercicio4_alquileres5_clientes.txt";

SELECT nombre AS Nombre,apellidos AS Apellidos,ABS(DATEDIFF(ffinal,finicial)*precio) AS "Importe relativo"
    FROM clientes INNER JOIN contratos ON clientes.dni=contratos.dni_clientes INNER JOIN automoviles ON contratos.matricula_automoviles=automoviles.matricula 
        WHERE ffinal IS NOT NULL 
            INTO OUTFILE "C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio4_txts\\Ejercicio4_alquileres5_contratos_finalizados.txt";

UPDATE contratos
    SET ffinal="2009-04-19",kfinal=24756 WHERE numcontrato=16;

UPDATE contratos
    SET kfinal=12267 WHERE numcontrato=17;

UPDATE automoviles
    SET color="Rojo" WHERE marca_marcas="Ford" AND modelo="Focus";

UPDATE contratos
    SET finicial=ADDDATE(finicial,7),kfinal=(kinicial+2200) WHERE numcontrato=18 OR numcontrato=19;

UPDATE automoviles
    SET alquilado=0 WHERE alquilado=1;

UPDATE automoviles NATURAL JOIN contratos
    SET alquilado=true WHERE ffinal IS NULL;

INSERT INTO contratos(dni_clientes,matricula_automoviles,finicial,kinicial)
    VALUES ("09856064","4738CBJ",CURDATE(),(SELECT kilometros FROM automoviles WHERE matricula="4738CBJ"));

UPDATE contratos
    SET numcontrato=numcontrato+20 WHERE numcontrato BETWEEN 20 and 23;

UPDATE contratos
    SET numcontrato=66 WHERE numcontrato=16;

UPDATE contratos
    SET matricula_automoviles="5031BHL" WHERE numcontrato=15;

SHOW CREATE TABLE contratos;
ALTER TABLE contratos DROP FOREIGN KEY contratos_ibfk_2;
ALTER TABLE contratos ADD FOREIGN KEY(matricula_automoviles) REFERENCES automoviles(matricula) ON UPDATE CASCADE ON DELETE CASCADE;
UPDATE automoviles
    SET matricula="4783CBJ" WHERE marca_marcas="Audi" AND modelo="A3";

-- UPDATE automoviles NATURAL JOIN contratos
--     SET kilometros=kfinal WHERE numcontrato=15;
UPDATE automoviles SET kilometros=22561 WHERE matricula="1234BMY";
UPDATE automoviles SET kilometros=NULL WHERE matricula="123BMR";
UPDATE automoviles SET kilometros=9500 WHERE matricula="1678CCN";
UPDATE automoviles SET kilometros=2500 WHERE matricula="1732CBS";
UPDATE automoviles SET kilometros=45876 WHERE matricula="1978BNT";
UPDATE automoviles SET kilometros=9736 WHERE matricula="2058CGF";
UPDATE automoviles SET kilometros=34323 WHERE matricula="2123BTB";
UPDATE automoviles SET kilometros=1120 WHERE matricula="2300CFG";
UPDATE automoviles SET kilometros=1000 WHERE matricula="2301CFG";
UPDATE automoviles SET kilometros=17368 WHERE matricula="3273BGH";
UPDATE automoviles SET kilometros=7683 WHERE matricula="3765BSD";
UPDATE automoviles SET kilometros=23057 WHERE matricula="4387BDD";
UPDATE automoviles SET kilometros=8008 WHERE matricula="4783CBJ";
UPDATE automoviles SET kilometros=24796 WHERE matricula="5031BHL";
UPDATE automoviles SET kilometros=28500 WHERE matricula="5573BFS";
UPDATE automoviles SET kilometros=7659 WHERE matricula="5678BFS";
UPDATE automoviles SET kilometros=25672 WHERE matricula="6761CYM";
UPDATE automoviles SET kilometros=1200 WHERE matricula="7600CFG";
UPDATE automoviles SET kilometros=15873 WHERE matricula="7839CDR";
UPDATE automoviles SET kilometros=35978 WHERE matricula="7856BLD";
UPDATE automoviles SET kilometros=46980 WHERE matricula="8795BTK";

UPDATE automoviles
    SET precio=precio*1.02;

-- UPDATE automoviles NATURAL JOIN
--     SET kilometros=kfinal WHERE ffinal BETWEEN "2017-02-04" AND "2017-04-15";