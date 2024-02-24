USE provincias;

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

-- ((Ģsum(poblacion) (σautonomia='Cantabria' (provincias)))*100)/Ģsum(poblacion) (provincias)
SELECT ((SELECT SUM(poblacion) FROM provincias WHERE autonomia = 'Cantabria') * 100) / SUM(poblacion) FROM provincias;

-- Ģsum(poblacion) (σautonomia='Cantabria' (provincias)) -> c1
SELECT SUM(poblacion) FROM provincias
  WHERE autonomia = 'Cantabria';
-- Ģsum(poblacion) (provincias) -> c2
SELECT SUM(poblacion) FROM provincias;
-- (c1 * 100) / c2
SELECT ((
  SELECT SUM(poblacion) FROM provincias
  WHERE autonomia = 'Cantabria'
  ) * 100) / (
  SELECT SUM(poblacion) FROM provincias
  );

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


-- 7. Obtener el nombre y el equipo de los ciclistas que han llevado algún maillot o que han ganado algun puerto. Muestra la lista ordenada.

-- Πdorsal (lleva) ∪ Πdorsal (puerto) -> c1
SELECT distinct dorsal FROM lleva UNION SELECT DISTINCT dorsal FROM puerto;
-- Πnombre,equipo (σdorsal in c1 (ciclista))
SELECT DISTINCT nombre, nomequipo FROM (ciclista)
  WHERE dorsal IN (
    SELECT distinct dorsal FROM lleva UNION SELECT DISTINCT dorsal FROM puerto
    )
  ORDER BY nombre;

-- 8. ¿Qué códigos de maillots ha llevado Alfonso Gutierrez en los puertos que haya ganado

-- Πcódigo (σnombre='Alfonso Gutierrez' (lleva *dorsal ciclista))
SELECT DISTINCT l.código FROM lleva l JOIN ciclista c USING(dorsal)
  WHERE c.nombre = 'Alfonso Gutierrez';

-- 9. ¿Qué equipos no han ganado ningún puerto de montaña?

-- Πnomequipo (ciclista *dorsal puerto) -> c1
SELECT DISTINCT nomequipo FROM ciclista JOIN puerto USING(dorsal);
-- Πnomequipo (σnomequipo not in c1 (ciclista))
SELECT DISTINCT nomequipo FROM ciclista
  WHERE nomequipo NOT IN (
  SELECT DISTINCT nomequipo FROM ciclista JOIN puerto USING(dorsal)
  );

-- 10. Obtener el nombre de los ciclistas, ordenados alfabéticamente, que pertenecen a un equipo de más de cinco ciclistas y que han ganado alguna etapa, indicando también cuántas etapas han ganado

-- nomequipoĢnomequipo,count(*) numciclistas (ciclista) -> c1
SELECT nomequipo, COUNT(*) numciclistas FROM ciclista
  GROUP BY nomequipo;
-- Πnomequipo (σnumciclistas>5 (c1)) -> c2
SELECT DISTINCT nomequipo FROM (
  SELECT nomequipo, COUNT(*) numciclistas FROM ciclista
  GROUP BY nomequipo
  )c1
  WHERE numciclistas > 5;
-- Πdorsal (etapa) -> c3
SELECT DISTINCT dorsal FROM etapa;
-- dorsalĢdorsal,count(*) numetapasganadas (ciclista *dorsal etapa) -> c4
SELECT dorsal, nombre, nomequipo, count(*) numetapasganadas FROM ciclista INNER JOIN etapa USING(dorsal)
  GROUP BY dorsal;
-- Πnombre,numetapasganadas (σnomequipo in c2 ^ dorsal in c3 (c4))
SELECT DISTINCT nombre, numetapasganadas from (
  SELECT dorsal, nombre, nomequipo, count(*) numetapasganadas FROM ciclista INNER JOIN etapa USING(dorsal) GROUP BY dorsal
  )c4
  WHERE nomequipo in (
  SELECT DISTINCT nomequipo FROM (
    SELECT nomequipo, COUNT(*) numciclistas FROM ciclista
    GROUP BY nomequipo
    )c1
    WHERE numciclistas > 5
  ) AND dorsal in (
  SELECT DISTINCT dorsal FROM etapa
  )
  ORDER BY nombre;
