-- Encontra la provincia menos poblada de la autonomia mas poblada

-- autonomiaĢautonomia, SUM(poblacion) as pobauto (provincias) -> c1
-- ĢMAX(pobauto) (c1) -> c2
-- Πautonomia(σpobauto=c2 (c1)) -> c3
-- Πprovincia,poblacion(σautonomia=c3 (provincias)) -> c4
-- ĢMIN(poblacion) (c4) -> c5
-- Πprovincia(σpoblacion=c5 (c4))


-- c1 - Tabla con las autnomías y su población
SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
  GROUP BY autonomia;

-- c2 - Valor mas alto de poblacion de las autonomías
SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
  GROUP BY autonomi;

-- c3 - Autonimía más poblada
SELECT c1.autonomia FROM (SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
  GROUP BY autonomia) AS c1
  WHERE c1.pobauto = (SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
  GROUP BY autonomia);