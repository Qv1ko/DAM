USE ciclistas;

-- 1. Número de ciclistas que hay

-- Ģcount(*) (ciclista)
SELECT COUNT(*) FROM ciclista;

-- 2. Número de ciclistas que hay del equipo Banesto

-- Ģcount(*) (σnomequipo='Banesto' (ciclista))
SELECT COUNT(*) FROM ciclista
  WHERE nomequipo='Banesto';

-- 3. Edad media de los ciclistas

-- Ģavg(edad) (ciclista)
SELECT AVG(edad) FROM ciclista;

-- 4. La edad media de los del equipo Banesto

-- Ģavg(edad) (σnomequipo='Banesto' (ciclista))
SELECT AVG(edad) FROM ciclista
  WHERE nomequipo='Banesto';

-- 5. La edad media de los ciclistas por cada equipo

-- nomequipoĢavg(edad) (ciclista)
SELECT AVG(edad) FROM ciclista
  GROUP BY nomequipo;

-- 6. El número de ciclistas por equipo

-- nomequipoĢcount(*) (ciclista)
SELECT COUNT(*) FROM ciclista
  GROUP BY nomequipo;


-- 7. El número total de puertos

-- Ģcount(nompuerto) (puerto)
SELECT COUNT(nompuerto) FROM puerto;

-- 8. El número total de puertos mayores de 1500

-- Ģcount(nompuerto) (σaltura>1500 (puerto))
SELECT COUNT(nompuerto) FROM puerto
  WHERE altura>1500;

-- 9. Listar el nombre de los equipos que tengan más de 4 ciclistas

-- nomequipoĢnomequipo,count(nomequipo) (ciclista) -> c1
SELECT nomequipo, COUNT(nomequipo) AS numciclistas FROM ciclista
  GROUP BY nomequipo;
-- Πnomequipo (σnumciclistas>4 (c1))
SELECT DISTINCT nomequipo FROM (
    SELECT nomequipo, COUNT(nomequipo) AS numciclistas FROM ciclista
    GROUP BY nomequipo
  )c1
  WHERE c1.numciclistas>4;


-- 10. Listar el nombre de los equipos que tengan más de 4 ciclistas cuya edad esté entre 28 y 32

-- nomequipoĢnomequipo,count(nomequipo) (σedad between 28 and 32 (ciclista)) -> c1
SELECT nomequipo, COUNT(nomequipo) AS numciclistas FROM ciclista
  WHERE edad BETWEEN 28 AND 32
  GROUP BY nomequipo;
-- Πnomequipo (σnumciclistas>4 (c1))
SELECT DISTINCT c1.nomequipo FROM (
    SELECT nomequipo, COUNT(nomequipo) AS numciclistas FROM ciclista
    WHERE edad BETWEEN 28 AND 32
    GROUP BY nomequipo
  )c1
  WHERE c1.numciclistas>4;

-- 11. Indícame el número de etapas que ha ganado cada uno de los ciclistas

-- dorsalĢcount(numetapa) (etapa)
SELECT COUNT(numetapa) FROM etapa
  GROUP BY dorsal;


-- 12. Indícame el dorsal de los ciclistas que hayan ganado más de una etapa

-- dorsalĢdorsal,count(numetapa) (etapa) -> c1
SELECT dorsal, COUNT(numetapa) AS etapasganadas FROM etapa
  GROUP BY dorsal;

-- Πdorsal (σetapasganadas>1 (c1))
SELECT DISTINCT c1.dorsal FROM (
    SELECT dorsal, COUNT(numetapa) AS etapasganadas FROM etapa
    GROUP BY dorsal
  )c1
  WHERE c1.etapasganadas>1;
