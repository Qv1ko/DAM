SELECT * FROM automoviles;

SELECT * FROM clientes;

SELECT * FROM contratos;

SELECT apellidos,nombre FROM clientes;

SELECT apellidos,nombre FROM clientes ORDER BY apellidos ASC;

SELECT matricula_automoviles,finicial FROM contratos ORDER BY finicial ASC;

SELECT DISTINCT matricula_automoviles FROM contratos;

SELECT nombre,apellidos FROM clientes WHERE localidad="Toledo";

SELECT nombre,apellidos FROM clientes WHERE localidad="Madrid" AND carnet="C1";

SELECT * FROM clientes WHERE dni="00740365";

SELECT matricula_automoviles,finicial FROM contratos WHERE finicial<"2008-03-25";

SELECT * FROM contratos WHERE finicial="2009-11-24";

SELECT matricula_automoviles,finicial,ffinal FROM contratos WHERE finicial>="2008-03-01" AND finicial<="2008-03-31";
SELECT matricula_automoviles,finicial,ffinal FROM contratos WHERE finicial BETWEEN "2008-03-01" AND "2008-03-31";

SELECT matricula_automoviles,finicial,ffinal FROM contratos WHERE MONTH(finicial)=3 AND YEAR(finicial)=2008;

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE alquilado=false;

SELECT matricula,marca_marcas,modelo FROM automoviles WHERE alquilado=false AND kilometros<20000;

SELECT nombre,apellidos FROM clientes WHERE apellidos LIKE "B%";

SELECT * FROM contratos WHERE numcontrato=19;

SELECT * FROM contratos WHERE numcontrato>=7 AND numcontrato<=12 OR numcontrato=19;
SELECT * FROM contratos WHERE numcontrato IN (7,8,9,10,11,12,19);

SELECT numcontrato,finicial,ffinal,kinicial,kfinal FROM contratos WHERE ffinal IS NOT NULL;

SELECT numcontrato,finicial AS "Fecha inicial",ffinal AS "Fecha final",kinicial AS "Kms iniciales",kfinal AS "Kms finales"
    FROM contratos
    WHERE ffinal IS NOT NULL;

SELECT dni,nombre,apellidos FROM clientes WHERE YEAR(CURDATE())-YEAR(fechaexp);

SELECT marca,modelo