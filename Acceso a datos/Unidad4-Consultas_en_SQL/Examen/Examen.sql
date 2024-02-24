USE provincias;

-- autonomiaĢautonomia,sum(superficie) sup (provincia) -> c1
-- Ģmax(sup) (c1) -> c2
-- Πautonomia (σsup=c2 (c1)) -> c3
-- Πprovincia,poblacion (σautonomia=c3 (provincia)) -> c4
-- Ģmin(poblacion) (c4) -> c5
-- Πprovincia (σpoblacion=c5 (c4))
SELECT DISTINCT provincia FROM (
  SELECT DISTINCT provincia, poblacion FROM provincias
  WHERE autonomia = (
    SELECT DISTINCT autonomia FROM (
      SELECT autonomia, SUM(superficie) sup FROM provincias
        GROUP BY autonomia
      )c1
      WHERE c1.sup = (
        SELECT MAX(c1.sup) FROM (
          SELECT autonomia, SUM(superficie) sup FROM provincias
            GROUP BY autonomia
        )c1
      ) 
    )
  )c4
  WHERE poblacion = (
    SELECT MIN(poblacion) FROM (
      SELECT DISTINCT provincia,poblacion FROM provincias
        WHERE autonomia = (
          SELECT DISTINCT autonomia FROM (
            SELECT autonomia, SUM(superficie) sup FROM provincias
              GROUP BY autonomia
            )c1
            WHERE c1.sup = (
              SELECT MAX(c1.sup) FROM (
                SELECT autonomia, SUM(superficie) sup FROM provincias
                  GROUP BY autonomia
                )c1
              )
        )
    )c5
  );

USE ciclistas;

-- Πnumetapa (puerto) -> c1
-- Πnumetapa,dorsal (c1 *numetapa etapa) -> c2
-- dorsalĢdorsal,count(*) numetapas (c2) -> c3
-- Ģmax(numetapas) (c3) -> c4
-- Πdorsal (σnumetapas=c4 (c3))
SELECT DISTINCT dorsal FROM (
  SELECT dorsal, COUNT(*) numetapas FROM (
    SELECT DISTINCT numetapa, dorsal FROM (
      SELECT DISTINCT numetapa FROM puerto
      )c1 INNER JOIN etapa USING(numetapa)
    )c2
    GROUP BY dorsal
  )c3
  WHERE c3.numetapas = (
    SELECT MAX(c3.numetapas) FROM (
      SELECT dorsal, COUNT(*) numetapas FROM (
        SELECT DISTINCT numetapa, dorsal FROM (
          SELECT DISTINCT numetapa FROM puerto
        )c1 INNER JOIN etapa USING(numetapa)
      )c2
      GROUP BY dorsal
    )c3
  );
