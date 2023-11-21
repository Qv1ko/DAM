USE ciclistas;

-- 1. Listar el número de etapas que tengan puerto

-- Πnumetapa (puerto) -> c1
SELECT DISTINCT numetapa FROM puerto;
-- Ģcount(*) (c1)
SELECT COUNT(*) FROM (
    SELECT DISTINCT numetapa FROM puerto
  )c1;

-- 2. Listar el número de ciclistas que hayan ganado algún puerto

-- Πdorsal (puerto) -> c1
SELECT DISTINCT dorsal FROM puerto;
-- Ģcount(*) (c1)
SELECT COUNT(*) FROM (
    SELECT DISTINCT dorsal FROM puerto
  )c1;

-- 3. Listar el código de la etapa con el número de puertos que tiene

-- numetapaĢumetapa,count(*) (puerto)
SELECT numetapa, COUNT(*) FROM puerto
  GROUP BY numetapa;

-- 4. Indicar la altura media de los puertos

-- Ģavg(altura) (puerto)
SELECT AVG(altura) FROM puerto;

-- 5. Indicar el código de etapa cuya altura media de sus puertos está por encima de 1500

-- numetapaĢnumetapa,avg(altura) (puerto) -> c1
SELECT numetapa, AVG(altura) alturamedia FROM puerto
  GROUP BY numetapa;
-- Πnumetapa (σalturamedia>1500 (c1))
SELECT DISTINCT c1.numetapa FROM (
    SELECT numetapa, AVG(altura) alturamedia FROM puerto
    GROUP BY numetapa
  )c1
  WHERE c1.alturamedia>1500;

SELECT DISTINCT numetapa FROM puerto
  GROUP BY numetapa
  HAVING AVG(altura)>1500;

-- 6. Indicar el número de etapas que cumplen la condición anterior

-- numetapaĢnumetapa,avg(altura) (puerto) -> c1
-- Πnumetapa (σalturamedia>1500 (c1)) -> c2
-- Ģcount(*) (c2)
SELECT COUNT(*) FROM (
    SELECT DISTINCT numetapa FROM puerto
    GROUP BY numetapa
    HAVING AVG(altura)>1500
  )c2;

-- 7. Listar el dorsal del ciclista con el número de veces que ha llevado algún maillot

-- dorsalĢdorsal,count(*) (lleva)
SELECT dorsal, COUNT(*) FROM lleva
  GROUP BY dorsal;

-- 8. Listar el dorsal del ciclista con el código de maillot y cuántas veces ese ciclista ha llevado ese maillot

-- dorsal,códigoĢdorsal,código,count(*) (lleva)
SELECT dorsal, código, COUNT(*) FROM lleva
  GROUP BY dorsal, código;

-- 9. Listar el dorsal, el código de etapa, el ciclista y el número de maillots que ese ciclista ha llevado en cada etapa

-- dorsal,numetapaĢdorsal,numetapa,count(*) (lleva)
SELECT dorsal, numetapa, COUNT(*) FROM lleva
  GROUP BY dorsal, numetapa;
