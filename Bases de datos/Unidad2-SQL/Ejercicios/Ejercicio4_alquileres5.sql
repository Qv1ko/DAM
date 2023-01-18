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

-- SELECT nombre,apellidos,DATEDIFF(ffinal,finicial)*precio FROM contratos INNER JOIN automoviles ON clientes.dni=contratos.dni_clientes WHERE ffinal IS NOT NULL INTO OUTFILE "C:\\Users\\Usuario\\DAM.git\\DAM\\Bases de datos\\Unidad2-SQL\\Ejercicios\\Ejercicio4_txts\\Ejercicio4_alquileres5_contratos_finalizados.txt";