USE ciclistas;

-- 1. Listar las edades de todos los ciclistas de Banesto

-- edad σnomequipo='Banesto' (ciclista)
SELECT edad FROM ciclista
  WHERE nomequipo='Banesto';

-- 2. Listar las edades de los ciclistas que son de Banesto o de Navigare

-- edad σnomequipo='Banesto' v nomequipo='Navigare' (ciclista)
SELECT edad FROM ciclista
  WHERE nomequipo='Banesto' OR nomequipo='Navigare';

-- 3. Listar el dorsal de los ciclistas que son de Banesto y cuya edad está entre 25 y 32

-- Πdorsal (σnomequipo='Banesto' ^ edad between 25 and 32 (ciclista))
SELECT DISTINCT dorsal FROM ciclista
  WHERE nomequipo='Banesto' AND edad BETWEEN 25 AND 32;

-- 4. Listar el dorsal de los ciclistas que son de Banesto o cuya edad está entre 25 y 32

-- Πdorsal (σnomequipo='Banesto' v edad between 25 and 32 (ciclista))
SELECT DISTINCT dorsal FROM ciclista
  WHERE nomequipo='Banesto' OR edad BETWEEN 25 AND 32;

-- 5. Listar la inicial del equipo de los ciclistas cuyo nombre comience por R

-- left(nomequipo,1) σnomequipo like 'R%' (ciclista)
SELECT LEFT(nomequipo, 1) FROM ciclista
  WHERE nomequipo LIKE 'R%';

-- 6. Listar el código de las etapas que su salida y llegada sea en la misma población

-- Πnumetapa (σsalida=llegada (etapa))
SELECT DISTINCT numetapa FROM etapa
  WHERE salida=llegada;

-- 7. Listar el código de las etapas que su salida y llegada no sean en la misma población y que conozcamos el dorsal del ciclista que ha ganado

-- Πnumetapa (σsalida<>llegada ^ dorsal IS NOT NULL (etapa))
SELECT DISTINCT numetapa FROM etapa
  WHERE salida<>llegada AND dorsal IS NOT NULL;

-- 8. Listar el nombre de los puertos cuya altura esté entre 1000 y 2000 o que la altura sea mayor que 2400

-- Πnompuerto (σaltura between 1000 and 2000 v altura>2400 (puerto))
SELECT DISTINCT nompuerto FROM puerto
  WHERE altura BETWEEN 1000 AND 2000 OR altura>2400;

-- 9. Listar el dorsal de los ciclistas que hayan ganado los puertos cuya altura esté entre 1000 y 2000 o que la altura sea mayor que 2400

-- dorsal σaltura between 1000 and 2000 v altura>2400 (puerto)
SELECT dorsal FROM puerto
  WHERE altura BETWEEN 1000 AND 2000 OR altura>2400;

-- 10. Listar el número de ciclistas que hayan ganado alguna etapa

-- Πdorsal (etapa) -> c1
SELECT DISTINCT dorsal FROM etapa;
-- Ģcount(dorsal) (c1)
SELECT COUNT(dorsal) FROM (
    SELECT DISTINCT dorsal FROM etapa
  )c1;
