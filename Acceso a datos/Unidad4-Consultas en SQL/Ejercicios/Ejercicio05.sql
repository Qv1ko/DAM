USE ciclistas; -- Π σ Ģ * IX

-- 1. Listar el nombre y edad de los ciclistas que han ganado etapas

-- Πnombre,edad (ciclista * etapa)
SELECT DISTINCT nombre, edad FROM ciclista INNER JOIN etapa USING(dorsal);

-- 2. Listar el nombre y edad de los ciclistas que han ganado puertos

-- Πnombre,edad (ciclista * puerto)
SELECT DISTINCT nombre, edad FROM ciclista INNER JOIN puerto USING(dorsal);

-- 3. Listar el nombre y edad de los ciclistas que han ganado etapas y puertos

-- Πnombre,edad (ciclista * etapa * puerto)
SELECT DISTINCT nombre, edad FROM ciclista INNER JOIN etapa USING(dorsal) INNER JOIN puerto USING(dorsal);

-- 4. Listar el director de los equipos que tengan ciclistas que hayan ganado alguna etapa

-- Πdirector (equipo * ciclista * etapa)
SELECT DISTINCT director FROM equipo INNER JOIN ciclista USING(nomequipo) INNER JOIN etapa USING(dorsal);

-- 5. Listar el dorsal y nombre de los ciclistas que hayan llevado algún maillot

-- Πdorsal,nombre (ciclista * lleva)
SELECT DISTINCT dorsal, nombre FROM ciclista INNER JOIN lleva USING(dorsal);

-- 6. Listar el dorsal y nombre de los ciclistas que hayan llevado el maillot amarillo

-- Πdorsal,nombre (σcolor='Amarillo' (ciclista * lleva * maillot))
SELECT DISTINCT dorsal, nombre FROM ciclista INNER JOIN lleva USING(dorsal) INNER JOIN maillot USING(código)
  WHERE color='Amarillo';

-- 7. Listar el dorsal de los ciclistas que hayan llevado algún maillot y que hayan ganado etapas

-- Πdorsal (lleva * etapa) 2
SELECT DISTINCT l.dorsal FROM lleva l INNER JOIN etapa USING(numetapa);


-- 8. Indicar el numetapa de las etapas que tengan puertos

-- Πnumetapa (puerto)
SELECT DISTINCT numetapa FROM puerto;

-- 9. Listar el número de ciclistas que hayan ganado alguna etapa con puerto

-- Ģcount(*) (ciclista * etapa * puerto) 2
SELECT COUNT(*) FROM etapa INNER JOIN puerto USING(numetapa);

-- 10. Indicar el nombre de los puertos que hayan sido ganados por ciclistas de Banesto

-- 2

-- 11. Listar el número de las etapas que tengan puerto que hayan sido ganadas por ciclistas de Banesto con más de 200km

-- 3
