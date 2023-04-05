-- 2. Ingresa un registro.
INSERT INTO aspirantes(dni,nombre,idioma) VALUES('88555444X','Ana Ruiz','ingles');

-- 3. iIngresar un valor que contenga más de un elemento del conjunto.
INSERT INTO aspirantes(dni,nombre,idioma) VALUES('33555444K','Susana Poo','ingles,aleman');

-- 10. Recuperar todos los valores que contengan la cadena "ingles".
SELECT * FROM aspirantes WHERE FIND_IN_SET("ingles",idioma);

-- 11. Recupera todos los valores que incluyan "ingles,italiano".
SELECT * FROM aspirantes WHERE FIND_IN_SET("ingles",idioma) AND FIND_IN_SET("italiano",idioma);

-- 12. Busca aspirantes que solo hablen alemán.
SELECT * FROM aspirantes WHERE idioma=4;

-- 13. Busca aspirantes que solo hablen Portugués y alemán.
SELECT * FROM aspirantes WHERE idioma=2 OR idioma=4;

-- 14. Muestra los aspirantes que no hablan Alemán.
SELECT * FROM aspirantes WHERE FIND_IN_SET("aleman",idioma)=0;

-- 17. Haz un listado de los que no hablen ningún idioma.
SELECT * FROM aspirantes WHERE idioma=0 OR idioma IS NULL;