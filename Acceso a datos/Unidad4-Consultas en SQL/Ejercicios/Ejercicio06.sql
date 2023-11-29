USE ciclistas; -- Π σ Ģ * IX ∉

-- 1. Nombre y edad de los ciclistas que NO han ganado etapas

-- Πnombre,edad (σetapa.dorsal IS NULL (ciclista IXdorsal etapa))
SELECT DISTINCT c.nombre, c.edad FROM ciclista c LEFT JOIN etapa e USING(dorsal)
  WHERE e.dorsal IS NULL;

-- 2. Nombre y edad de los ciclistas que NO han ganado puertos

-- Πnombre,edad (σpuerto.dorsal IS NULL (ciclista IXdorsal puerto))
SELECT c.nombre, c.edad FROM ciclista c LEFT JOIN puerto p USING(dorsal)
  WHERE p.dorsal IS NULL;

-- Πdorsal (puerto) -> c1
-- Πnombre,edad (σdorsal∉c1 (ciclista))
SELECT DISTINCT nombre, edad FROM ciclista
  WHERE dorsal NOT IN (
    SELECT DISTINCT dorsal FROM puerto);

-- 3. Listar el director de los equipos que tengan ciclistas que NO hayan ganado ninguna etapa

-- σetapa.dorsal IS NULL (equipo *nomequipo ciclista IXdorsal etapa)
SELECT DISTINCT e.director FROM equipo e INNER JOIN ciclista c USING(nomequipo) LEFT JOIN etapa e1 USING(dorsal)
  WHERE e1.dorsal IS NULL;

-- Πdirector (σetapa.dorsal IS NULL (ciclista IXdorsal etapa))
-- Πdirector (equipo *nomequipo c1)
SELECT DISTINCT director FROM equipo INNER JOIN (
  SELECT * FROM ciclista LEFT JOIN etapa USING(dorsal)
    WHERE etapa.dorsal IS null
  )c1 USING(nomequipo);

-- 4. Dorsal y nombre de los ciclistas que NO hayan llevado ningún maillot

-- Πdorsal,nombre (σlleva.dorsal IS NULL (lleva XIdorsal ciclista))
SELECT DISTINCT c.dorsal, c.nombre FROM lleva l RIGHT JOIN ciclista c USING(dorsal)
  WHERE l.dorsal IS NULL;

-- 5. Dorsal y nombre de los ciclistas que NO hayan llevado el maillot amarillo NUNCA

-- Πdorsal,nombre (σcolor='Amarillo' IS NULL (ciclista IXdorsal lleva IXcódigo maillot))
-- SELECT DISTINCT c.dorsal, c.nombre FROM ciclista c LEFT JOIN lleva l USING(dorsal) LEFT JOIN maillot m USING(código)
--   WHERE m.color='Amarillo' IS NULL;

-- Πdorsal (σcolor='Amarillo' (lleva *código maillot)) -> c1
-- Πdorsal,nombre (σc1.dorsal is null (ciclista IXdorsal c1))
SELECT DISTINCT dorsal, nombre FROM ciclista LEFT JOIN (
  SELECT DISTINCT dorsal FROM lleva INNER JOIN maillot USING(código)
    WHERE color="Amarillo")c1 USING(dorsal)
  WHERE c1.dorsal IS NULL;

-- 6. Indicar el numetapa de las etapas que NO tengan puertos

-- Πnumetapa (σnumetapa IS NULL (etapa IXnumetapa puerto))
SELECT DISTINCT e.numetapa FROM etapa e LEFT JOIN puerto p USING(numetapa)
  WHERE p.numetapa IS NULL;

-- 7. Indicar la distancia media de las etapas que NO tengan puertos

-- Ģavg(kms) (σnumetapa IS NULL (etapa IXnumetapa puerto))
SELECT AVG(e.kms) FROM etapa e LEFT JOIN puerto p USING(numetapa)
  WHERE p.numetapa IS NULL;

-- Πnumetapa (puerto) -> c1
-- σnumetapa∉c1 (etapa) -> c2
-- Ģavg(kms) (c2)
SELECT AVG(kms) FROM (
    SELECT * FROM etapa
      WHERE numetapa NOT IN (
        SELECT DISTINCT numetapa FROM puerto
      )
  )c2;


-- 8. Listar el número de ciclistas que NO hayan ganado alguna etapa

-- Ģcount(*) (σdorsal IS NULL (ciclista IXdorsal etapa))
SELECT COUNT(*) FROM ciclista c LEFT JOIN etapa e USING(dorsal)
  WHERE e.dorsal IS NULL;

-- 9. Listar el dorsal de los ciclistas que hayan ganado alguna etapa que no tenga puerto

-- Πetapa.dorsal (σpuerto.numetapa IS NULL (puerto XInumetapa etapa))
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
