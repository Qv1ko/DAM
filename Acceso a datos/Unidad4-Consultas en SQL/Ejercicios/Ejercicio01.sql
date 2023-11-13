USE ciclistas;

-- 1. Listar las edades de los ciclistas (sin repetidos)

-- Πedad (ciclista)
SELECT DISTINCT edad FROM ciclista;

-- 2. Listar las edades de los ciclistas de Artiach

-- Πedad (σnomequipo='Artiach') (ciclista))
SELECT DISTINCT edad FROM ciclista
  WHERE nomequipo='Artiach';

-- 3. Listar las edades de los ciclistas de Artiach o de Amore Vita

-- Πedad (σnomequipo='Artiach' v nomequipo='Amore Vita' (ciclista))
SELECT DISTINCT edad FROM ciclista
  WHERE nomequipo='Artiach' OR nomequipo='Amore Vita';

-- 4. Listar los dorsales de los ciclistas cuya edad sea menor que 25 o mayor que 30

-- Πdorsal (σedad<25 v edad>30 (ciclista))
SELECT DISTINCT dorsal FROM ciclista
  WHERE edad<25 OR edad>30;

-- 5. Listar los dorsales de los ciclistas cuya edad esté entre 28 y 32 y además que sólo sean de Banesto

-- Πdorsal (σedad between 28 and 32 ^ nomequipo='Banesto' (ciclista))
SELECT DISTINCT dorsal FROM ciclista
  WHERE edad BETWEEN 28 AND 32 AND nomequipo='Banesto';

-- 6. Indícame el nombre de los ciclistas que el número de caracteres del nombre sea mayor que 8

-- Πnombre (σchar_length(nombre)>8 (ciclista))
SELECT DISTINCT nombre FROM ciclista
  WHERE CHAR_LENGTH(nombre)>8;

-- 7. Lístame el nombre y el dorsal de todos los ciclistas mostrando un campo nuevo denominado nombre mayúsculas que debe mostrar el nombre en mayúsculas

-- Πnombre,dorsal,upper(nombre) (ciclista)
SELECT DISTINCT nombre, dorsal, UPPER(nombre) AS 'Nombre mayúsculas' FROM ciclista;

-- 8. Listar todos los ciclistas que han ganado el maillot MGE (amarillo) en alguna etapa

-- Πdorsal (σcódigo='MGE' (lleva))
SELECT DISTINCT dorsal FROM lleva
    WHERE código='MGE';

-- 9. Listar el nombre de los puertos cuya altura sea mayor de 1500 

-- Πnompuerto (σaltura>1500 (puerto))
SELECT DISTINCT nompuerto FROM puerto
  WHERE altura>1500;

-- 10. Listar el dorsal de los ciclistas que hayan ganado algun puerto cuya pendiente sea mayor que 8 o cuya altura esté entre 1800 y 3000

-- Πdorsal (σpendiente>8 v altura between 1800 and 3000 (puerto))
SELECT DISTINCT dorsal FROM puerto
  WHERE pendiente>8 OR altura BETWEEN 1800 AND 3000;
