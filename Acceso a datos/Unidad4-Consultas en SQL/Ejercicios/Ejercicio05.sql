USE ciclistas; -- Π σ Ģ * IX

-- 1. Listar el nombre y edad de los ciclistas que han ganado etapas

-- Πnombre,edad (ciclista *dorsal etapa)
SELECT DISTINCT nombre, edad FROM ciclista INNER JOIN etapa USING(dorsal);

-- 2. Listar el nombre y edad de los ciclistas que han ganado puertos

-- Πnombre,edad (ciclista *dorsal puerto)
SELECT DISTINCT nombre, edad FROM ciclista INNER JOIN puerto USING(dorsal);

-- 3. Listar el nombre y edad de los ciclistas que han ganado etapas y puertos

-- Πnombre,edad (ciclista *dorsal etapa *dorsal puerto)
SELECT DISTINCT nombre, edad FROM ciclista INNER JOIN etapa USING(dorsal) INNER JOIN puerto USING(dorsal);

-- 4. Listar el director de los equipos que tengan ciclistas que hayan ganado alguna etapa

-- Πdirector (equipo *nomequipo ciclista *dorsal etapa)
SELECT DISTINCT director FROM equipo INNER JOIN ciclista USING(nomequipo) INNER JOIN etapa USING(dorsal);

-- 5. Listar el dorsal y nombre de los ciclistas que hayan llevado algún maillot

-- Πdorsal,nombre (ciclista *dorsal lleva)
SELECT DISTINCT dorsal, nombre FROM ciclista INNER JOIN lleva USING(dorsal);

-- 6. Listar el dorsal y nombre de los ciclistas que hayan llevado el maillot amarillo

-- Πdorsal,nombre (σcolor='Amarillo' (ciclista *dorsal lleva *código maillot))
SELECT DISTINCT dorsal, nombre FROM ciclista INNER JOIN lleva USING(dorsal) INNER JOIN maillot USING(código)
  WHERE color='Amarillo';

-- 7. Listar el dorsal de los ciclistas que hayan llevado algún maillot y que hayan ganado etapas

-- Πdorsal (lleva *numetapa etapa)
SELECT DISTINCT l.dorsal FROM lleva l INNER JOIN etapa USING(numetapa);


-- 8. Indicar el numetapa de las etapas que tengan puertos

-- Πnumetapa (puerto)
SELECT DISTINCT numetapa FROM puerto;

-- 9. Listar el número de ciclistas que hayan ganado alguna etapa con puerto

-- Πdorsal,numetapa (etapa) -> c1
SELECT DISTINCT dorsal, numetapa FROM etapa;
-- Ģcount(*) (c1 *numetapa puerto)
SELECT COUNT(*) FROM (
    SELECT DISTINCT dorsal, numetapa FROM etapa
  )c1 INNER JOIN puerto USING(numetapa);

-- 10. Indicar el nombre de los puertos que hayan sido ganados por ciclistas de Banesto

-- Πnompuerto (σnomequipo='Banesto' (puerto *dorsal ciclista))
SELECT DISTINCT p.nompuerto FROM puerto p INNER JOIN ciclista c USING(dorsal)
  WHERE nomequipo='Banesto';

-- 11. Listar el número de las etapas que tengan puerto que hayan sido ganadas por ciclistas de Banesto con más de 200km

-- Ģcount(*) (σnomequipo='Banesto' ^ kms>200 (etapa * puerto * ciclista))
SELECT COUNT(*) FROM etapa e INNER JOIN puerto p USING(numetapa) INNER JOIN ciclista c USING(dorsal)
  WHERE c.nomequipo='Banesto' AND e.kms>200;
