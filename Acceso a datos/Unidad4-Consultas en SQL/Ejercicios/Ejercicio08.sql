USE provincias; -- σΠĢ

-- 1. Provincia más poblada de las inferiores a 1 millón de habitantes

-- Πprovincia,poblacion (σpoblacion<1000000 (provincias)) -> c1
SELECT DISTINCT provincia, poblacion FROM provincias
  WHERE poblacion < 1000000;
-- Ģmax(poblacion) (c1) -> c2
SELECT MAX(poblacion) FROM  (
  SELECT DISTINCT provincia, poblacion FROM provincias
  WHERE poblacion < 1000000
  )c1;
-- Πprovincia (σpoblacion=c2 (c1));
SELECT provincia FROM (
  SELECT DISTINCT provincia, poblacion FROM provincias
  WHERE poblacion < 1000000
  )c1
  WHERE poblacion = (
    SELECT MAX(poblacion) FROM  (
    SELECT DISTINCT provincia, poblacion FROM provincias
    WHERE poblacion < 1000000
    )c1
    );

-- 2. ¿En qué autonomía está la provincia más extensa?

-- Ģmax(superficie) (provincias) -> c1
SELECT MAX(superficie) FROM provincias;
-- Πautonomia (σsuperficie=c1 (provincias))
SELECT DISTINCT autonomia FROM provincias
  WHERE superficie = (
    SELECT MAX(superficie) FROM provincias
    );

-- 3. ¿Qué provincias tienen una población por encima de la media nacional?

-- Ģavg(poblacion) (provincias) -> c1
SELECT AVG(poblacion) FROM provincias;
-- Πprovincia (σpoblacion>c1 (provincias))
SELECT DISTINCT provincia FROM provincias
  WHERE poblacion > (
    SELECT AVG(poblacion) FROM provincias
    );

-- 4. ¿Qué porcentaje del total nacional representa Cantabria en población?

-- Ģsum(poblacion)/((Ģsum(poblacion) (σautonomia='Cantabria' (provincias)))*100) (provincias)
SELECT SUM(poblacion) / ((SELECT SUM(poblacion) FROM provincias WHERE autonomia = 'Cantabria') * 100) FROM provincias;

-- 5. ¿En qué posición del ranking autonómico por población de mayor a menor está Cantabria?

-- autonomiaĢpoblacion (σautonomia='Cantabria' (provincias)) -> c1
SELECT poblacion FROM provincias
  WHERE autonomia = 'Cantabria'
  GROUP BY autonomia;
-- autonomiaĢautonomia (σpoblacion>c1 (provincias)) -> c2
SELECT autonomia FROM provincias
  WHERE poblacion > (
    SELECT poblacion FROM provincias
    WHERE autonomia = 'Cantabria'
    GROUP BY autonomia
  )
  GROUP BY autonomia;
-- Ģcount(*)+1 (c2)
SELECT COUNT(*) + 1 FROM (
  SELECT autonomia FROM provincias
  WHERE poblacion > (
    SELECT poblacion FROM provincias
    WHERE autonomia = 'Cantabria'
    GROUP BY autonomia
  )
  GROUP BY autonomia
  )c2;

USE ciclistas;


-- 6. Obtener el nombre de los puertos de montaña que tienen una altura superior a la altura media de todos los puertos

-- Ģavg(altura) (puerto) -> c1
SELECT AVG(altura) FROM puerto;
-- Πnompuerto (σaltura>c1 (puerto))
SELECT DISTINCT nompuerto FROM puerto
  WHERE altura > (
    SELECT AVG(altura) FROM puerto
    );


-- 7. Obtener el nombre y el equipo de los ciclistas que han llevado algún maillot o que han ganado algun puerto. Muestra la lista ordenada. Recuerda la diferencia entre UNION y UNION ALL



-- 8. ¿Qué códigos de maillots ha llevado Alfonso Gutierrez en los puertos que haya ganado

-- Πcódigo (σnombre='Alfonso Gutierrez' (lleva *dorsal ciclista))
SELECT DISTINCT l.código FROM lleva l JOIN ciclista c USING(dorsal)
  WHERE c.nombre = 'Alfonso Gutierrez';

-- 9. ¿Qué equipos no han ganado ningún puerto de montaña?



-- 10. Obtener el nombre de los ciclistas, ordenados alfabéticamente, que pertenecen a un equipo de más de cinco ciclistas y que han ganado alguna etapa, indicando también cuántas etapas han ganado


