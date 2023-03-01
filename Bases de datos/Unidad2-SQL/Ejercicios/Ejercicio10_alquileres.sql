SELECT precio,precio*1.045,CEIL(precio*1.045),ROUND(precio*1.045) FROM automoviles WHERE marca_marcas="Seat";

SELECT TRUNCATE(DATEDIFF(contratos.ffinal,contratos.finicial)*automoviles.precio,4) AS "Trucate de 4",
    TRUNCATE(DATEDIFF(contratos.ffinal,contratos.finicial)*automoviles.precio,2) AS "Trucate de 2",
    ROUND(DATEDIFF(contratos.ffinal,contratos.finicial)*automoviles.precio,2) AS "Redondeo de 2",numcontrato FROM contratos 
    INNER JOIN automoviles ON contratos.matricula_automoviles=automoviles.matricula WHERE contratos.ffinal IS NOT NULL;

SELECT LEFT(apellidos,10),LEFT(nombre,6) FROM clientes;