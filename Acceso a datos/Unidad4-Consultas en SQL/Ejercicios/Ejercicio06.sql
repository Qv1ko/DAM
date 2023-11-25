USE ciclistas; -- Π σ Ģ * IX ∉

-- 1. Nombre y edad de los ciclistas que NO han ganado etapas

-- Πnombre,edad (σdorsal IS NULL (ciclista IXdorsal etapa))
SELECT DISTINCT c.nombre, c.edad FROM ciclista c LEFT JOIN etapa e USING(dorsal)
  WHERE e.dorsal IS NULL;

-- 2. Nombre y edad de los ciclistas que NO han ganado puertos

-- Πnombre,edad (σdorsal IS NULL (ciclista IXdorsal puerto))
SELECT c.nombre, c.edad FROM ciclista c LEFT JOIN puerto p USING(dorsal)
  WHERE p.dorsal IS NULL;

-- 3. Listar el director de los equipos que tengan ciclistas que NO hayan ganado ninguna etapa

-- Πdirector (σdorsal IS NULL (equipo *nomequipo ciclista IXdorsal etapa))
SELECT DISTINCT e.director FROM equipo e INNER JOIN ciclista c USING(nomequipo) LEFT JOIN etapa e1 USING(dorsal)
  WHERE e1.dorsal IS NULL;

-- 4. Dorsal y nombre de los ciclistas que NO hayan llevado ningún maillot

-- Πdorsal,nombre (σdorsal IS NULL (lleva XIdorsal ciclista))
SELECT DISTINCT c.dorsal, c.nombre FROM lleva l RIGHT JOIN ciclista c USING(dorsal)
  WHERE l.dorsal IS NULL;

-- 5. Dorsal y nombre de los ciclistas que NO hayan llevado el maillot amarillo NUNCA

-- Πdorsal,nombre (σcolor='Amarillo' IS NULL (ciclista IXdorsal lleva IXcódigo maillot))
SELECT DISTINCT c.dorsal, c.nombre FROM ciclista c LEFT JOIN lleva l USING(dorsal) LEFT JOIN maillot m USING(código)
  WHERE m.color='Amarillo' IS NULL;

-- 6. Indicar el numetapa de las etapas que NO tengan puertos

-- Πnumetapa (σnumetapa IS NULL (etapa IXnumetapa puerto))
SELECT DISTINCT e.numetapa FROM etapa e LEFT JOIN puerto p USING(numetapa)
  WHERE p.numetapa IS NULL;

-- 7. Indicar la distancia media de las etapas que NO tengan puertos

-- Ģavg(kms) (σnumetapa IS NULL (etapa IXnumetapa puerto))
SELECT AVG(e.kms) FROM etapa e LEFT JOIN puerto p USING(numetapa)
  WHERE p.numetapa IS NULL;

-- 8. Listar el número de ciclistas que NO hayan ganado alguna etapa

-- Ģcount(*) (σdorsal IS NULL (ciclista IXdorsal etapa))
SELECT COUNT(*) FROM ciclista c LEFT JOIN etapa e USING(dorsal)
  WHERE e.dorsal IS NULL;

-- 9. Listar el dorsal de los ciclistas que hayan ganado alguna etapa que no tenga puerto

-- Πdorsal (σnumetapa IS NULL (etapa IXnumetapa puerto))
SELECT distinct e.dorsal FROM puerto p RIGHT JOIN etapa e ON p.numetapa = e.numetapa
  WHERE p.numetapa IS NULL;

-- 10. Listar el dorsal de los ciclistas que hayan ganado únicamente etapas que no tengan puertos

-- Πnumetapa,dorsal (puerto) -> c1
SELECT DISTINCT numetapa, dorsal FROM puerto;
-- Πnumetapa (σnumetapa∉c1 (etapa)) -> c2
SELECT distinct numetapa FROM etapa
  WHERE numetapa NOT IN (
    SELECT DISTINCT numetapa, dorsal FROM puerto
  );
-- Πdorsal (σdorsal∉c1 (c2))
SELECT DISTINCT dorsal FROM (
  SELECT distinct numetapa FROM etapa
  WHERE numetapa NOT IN (
    SELECT DISTINCT numetapa, dorsal FROM puerto
  )
  )c2
  WHERE dorsal NOT IN (
    SELECT DISTINCT numetapa, dorsal FROM puerto
  );