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
    VALUES("98765432","3765BSD",CURDATE());


INSERT INTO "nombre_tabla"
    SELECT ...