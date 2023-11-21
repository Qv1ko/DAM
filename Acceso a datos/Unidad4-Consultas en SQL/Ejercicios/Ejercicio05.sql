USE ciclistas;

-- 1. Listar el nombre y edad de los ciclistas que han ganado etapas

-- Πnombre,edad (ciclista ⦻dorsal etapa)
SELECT DISTINCT c.nombre, c.edad FROM ciclista c INNER JOIN etapa e USING(dorsal);

-- 2. Listar el nombre y edad de los ciclistas que han ganado puertos

-- Πnombre,edad (ciclista ⦻dorsal puerto)
SELECT DISTINCT c.nombre, c.edad FROM ciclista c INNER JOIN puerto p USING(dorsal);

-- 3. Listar el nombre y edad de los ciclistas que han ganado etapas y puertos

-- Πnombre,edad (ciclista ⦻dorsal etapa ⦻dorsal puerto)
SELECT DISTINCT c.nombre, c.edad FROM ciclista c INNER JOIN etapa e USING(dorsal) INNER JOIN puerto p USING(dorsal);

-- 4. Listar el director de los equipos que tengan ciclistas que hayan ganado alguna etapa

-- Πdirector (equipo ⦻nomequipo ciclista ⦻dorsal etapa)
SELECT DISTINCT e.director FROM equipo e1 INNER JOIN ciclista c USING(nomequipo) INNER JOIN etapa e2 USING(dorsal);

-- 5. Listar el dorsal y nombre de los ciclistas que hayan llevado algún maillot

-- Πdorsal,nombre (ciclista ⦻dorsal lleva)
SELECT DISTINCT c.dorsal, c.nombre FROM ciclista c INNER JOIN lleva l USING(dorsal);

-- 6. Listar el dorsal y nombre de los ciclistas que hayan llevado el maillot amarillo

-- Πdorsal,nombre (σcolor='Amarillo' (ciclista ⦻dorsal lleva ⦻código maillot))
SELECT DISTINCT c.dorsal, c.nombre FROM ciclista c INNER JOIN lleva l USING(dorsal) INNER JOIN maillot m USING(código)
  WHERE m.color='Amarillo';

-- 7. Listar el dorsal de los ciclistas que hayan llevado algún maillot y que hayan ganado etapas

-- Πdorsal (lleva ⦻numetapa etapa)
SELECT DISTINCT l.dorsal FROM lleva l INNER JOIN etapa e USING(numetapa);


-- 8. Indicar el numetapa de las etapas que tengan puertos

-- Πnumetapa (puerto)
SELECT DISTINCT numetapa FROM puerto;

-- 9. Listar el número de ciclistas que hayan ganado alguna etapa con puerto

-- Πdorsal,numetapa (etapa) -> c1
SELECT DISTINCT dorsal, numetapa FROM etapa;
-- Ģcount(*) (c1 ⦻numetapa puerto)
SELECT COUNT(*) FROM (
    SELECT DISTINCT dorsal, numetapa FROM etapa
  )c1 INNER JOIN puerto USING(numetapa);

-- 10. Indicar el nombre de los puertos que hayan sido ganados por ciclistas de Banesto

-- Πnompuerto (σnomequipo='Banesto' (puerto ⦻dorsal ciclista))
SELECT DISTINCT p.nompuerto FROM puerto p INNER JOIN ciclista c USING(dorsal)
  WHERE c.nomequipo='Banesto';

-- 11. Listar el número de las etapas que tengan puerto que hayan sido ganadas por ciclistas de Banesto con más de 200km

-- Ģcount(*) (σnomequipo='Banesto' ^ kms>200 (etapa ⦻numetapa puerto ⦻dorsal ciclista))
SELECT COUNT(*) FROM etapa e INNER JOIN puerto p USING(numetapa) INNER JOIN ciclista c ON p.dorsal = c.dorsal
  WHERE c.nomequipo='Banesto' AND e.kms>200;
