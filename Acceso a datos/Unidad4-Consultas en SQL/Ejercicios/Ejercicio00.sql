-- Encontrar la provincia menos poblada de la autonomia mas poblada

-- autonomiaĢautonomia, SUM(poblacion) as pobauto (provincias) -> c1
-- ĢMAX(pobauto) (c1) -> c2
-- Πautonomia(σpobauto=c2 (c1)) -> c3
-- Πprovincia,poblacion(σautonomia=c3 (provincias)) -> c4
-- ĢMIN(poblacion) (c4) -> c5
-- Πprovincia(σpoblacion=c5 (c4))


USE provincias;

-- c1 - Tabla con las autnomías y su población
SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
  GROUP BY autonomia;

-- c2 - Valor más alto de población de las autonomías
SELECT MAX(c1.pobauto) FROM (
  SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
  GROUP BY autonomia
  )c1;

-- c3 - Autonimía más poblada
SELECT c1.autonomia FROM (
  SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
  GROUP BY autonomia
  )c1
  WHERE c1.pobauto = (
    SELECT MAX(c1.pobauto) FROM (
    SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
    GROUP BY autonomia
    )c1
  );

-- c4 - Tabla con las provincias de la autonomía más poblada y sus valores de población
SELECT provincia, poblacion FROM provincias
  WHERE autonomia = (
    SELECT c1.autonomia FROM (
    SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
    GROUP BY autonomia
    )c1
    WHERE c1.pobauto = (
      SELECT MAX(c1.pobauto) FROM (
      SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
      GROUP BY autonomia
      )c1
    )
  );

-- c5 - Valor mínimo de población de la tabla con las provincias de la autonomía más poblada y su población
SELECT MIN(c4.poblacion) FROM (
  SELECT provincia, poblacion FROM provincias
    WHERE autonomia = (
      SELECT c1.autonomia FROM (
      SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
      GROUP BY autonomia
      )c1
      WHERE c1.pobauto = (
        SELECT MAX(c1.pobauto) FROM (
        SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
        GROUP BY autonomia
        )c1
      )
    )
  )c4;

-- Solución: El nombre de la provincia menos poblada de la autonomía más poblada
SELECT c4.provincia FROM (
  SELECT provincia, poblacion FROM provincias
    WHERE autonomia = (
      SELECT c1.autonomia FROM (
      SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
      GROUP BY autonomia
      )c1
      WHERE c1.pobauto = (
        SELECT MAX(c1.pobauto) FROM (
        SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
        GROUP BY autonomia
        )c1
      )
    )
  )c4
  WHERE poblacion = (
    SELECT MIN(c4.poblacion) FROM (
    SELECT provincia, poblacion FROM provincias
      WHERE autonomia = (
        SELECT c1.autonomia FROM (
        SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
        GROUP BY autonomia
        )c1
        WHERE c1.pobauto = (
          SELECT MAX(c1.pobauto) FROM (
          SELECT autonomia, SUM(poblacion) AS pobauto FROM provincias
          GROUP BY autonomia
          )c1
        )
      )
    )c4
  );
