USE provincias;

-- Consulta incorrecta
SELECT provincia, MIN(provincia) FROM provincias;

-- Ģmin(poblacion) (provincias) -> c1
-- Πprovincia (σpoblacion=c1 (provincias))
SELECT DISTINCT provincia FROM provincias
  WHERE poblacion = (SELECT MIN(poblacion) FROM provincias);

USE ciclistas;

-- Ģdorsal,count(*) (etapa)
SELECT dorsal, COUNT(*) FROM etapa;