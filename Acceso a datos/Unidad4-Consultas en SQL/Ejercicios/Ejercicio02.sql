USE ciclistas; -- σ Π Ģ

-- 1. Número de ciclistas que hay

-- Ģcount(nombre) (ciclista)
SELECT COUNT(nombre) FROM ciclista;

-- 2. Número de ciclistas que hay del equipo Banesto

-- Ģcount(nombre) (σnomequipo='Banesto' (ciclista))
SELECT COUNT(nombre) FROM ciclista
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

-- nomequipoĢcount(nombre) (ciclista)
SELECT COUNT(nombre) FROM ciclista
  GROUP BY nomequipo;


-- 7. El número total de puertos

-- Ģcount(nompuerto) (puerto)
SELECT COUNT(nompuerto) FROM puerto;

-- 8. El número total de puertos mayores de 1500

-- Ģcount(nompuerto) (σaltura>1500 (puerto))
SELECT COUNT(nompuerto) FROM puerto
  WHERE altura>1500;

-- 9. Listar el nombre de los equipos que tengan más de 4 ciclistas

-- nomequipoĢcount(nombre) (ciclista) -> c1
SELECT COUNT(nombre) FROM ciclista
  GROUP BY nomequipo;
-- Πnomequipo (σc1>4 (ciclista))
SELECT DISTINCT nomequipo FROM ciclista
  WHERE (
    SELECT COUNT(nombre) FROM ciclista
    GROUP BY nomequipo
  )>4;

-- 10. Listar el nombre de los equipos que tengan más de 4 ciclistas cuya edad esté entre 28 y 32

-- 

-- 11. Indícame el número de etapas que ha ganado cada uno de los ciclistas

-- dorsalĢcount(numetapa) (etapa)
SELECT COUNT(numetapa) FROM etapa
  GROUP BY dorsal;


-- 12. Indícame el dorsal de los ciclistas que hayan ganado más de una etapa

-- 
