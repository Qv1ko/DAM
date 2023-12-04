USE provincias; -- ΠσĢ

-- 1. Listado de provincias

-- Πprovincia (provincias)
SELECT DISTINCT provincia FROM provincias;

-- 2. ¿Cuánto suman 2 y 3?

-- Ģ2+3
SELECT 2 + 3;

-- 3. ¿Cuánto vale la raíz cuadrada de 2?

-- Ģsqrt(3)
SELECT SQRT(3);

-- 4. Listado de autonomías

-- Πautonomia (provincias)
SELECT DISTINCT autonomia FROM provincias;

-- 5. Provincias que empiezan por A

-- Πprovincia (σprovincia LIKE 'A%' (provincias))
SELECT DISTINCT provincia FROM provincias
  WHERE provincia LIKE 'A%';

-- 6. Densidades de población de las provincias

-- Πpoblacion/superficie (provincias)
SELECT DISTINCT poblacion / superficie AS Densidades FROM provincias;

-- 7. ¿Cuántos caracteres tiene cada nombre de provincia?

-- provinciaĢprovincia,char_length(provincia) (provincias)
SELECT provincia, CHAR_LENGTH(provincia) FROM provincias
  GROUP BY provincia;

-- 8. Provincias con el mismo nombre que su comunidad autónoma

-- Πprovincia (σprovincia=autonomia (provincias))
SELECT DISTINCT provincia FROM provincias
  WHERE provincia = autonomia;

-- 9. Provincias que contienen el diptongo 'ue'

-- Πprovincia (σprovincia LIKE '%ue%' (provincias))
SELECT DISTINCT provincia FROM provincias
  WHERE provincia LIKE '%ue%';

-- 10. ¿Qué provincias tienen nombre compuesto?

-- Πprovincia (σprovincia LIKE '% %' (provincias))
SELECT DISTINCT provincia FROM provincias
  WHERE provincia LIKE '% %';

-- 11. ¿Qué provincias tienen nombre simple?

-- Πprovincia (σprovincia NOT LIKE '% %' (provincias))
SELECT DISTINCT provincia FROM provincias
  WHERE provincia NOT LIKE '% %';

-- 12. Autonomías terminadas en 'ana'

-- Πautonomia (σautonomia LIKE '%ana' (provincias))
SELECT DISTINCT autonomia FROM provincias
  WHERE autonomia LIKE '%ana';

-- 13. ¿Cuántos caracteres tiene cada nombre de comunidad autónoma? Ordena el resultado por el nombre de la autonomía de forma descendente

-- Πautonomia,char_length(autonomia) (provincias)
SELECT DISTINCT autonomia, CHAR_LENGTH(autonomia) FROM provincias
  ORDER BY autonomia DESC;

-- 14. ¿Qué autonomías tienen nombre compuesto? Ordena el resultado alfabéticamente en orden inverso

-- Πprovincia (σprovincia LIKE '% %' (provincias))
SELECT DISTINCT provincia FROM provincias
  WHERE provincia LIKE '% %'
  ORDER BY provincia DESC;

-- 15. ¿Qué autonomías tienen provincias con nombre compuesto? Ordenar el resultado alfabéticamente

-- 
SELECT DISTINCT autonomia FROM provincias
  WHERE provincia LIKE '% %'
  ORDER BY;
