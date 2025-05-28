/*1 En la base de datos ALQUILERES visualizar los precios de alquiler diario de los automóviles de la marca SEAT actuales, los mismos valores incrementados en 
un 4.5% redondeando el nuevo precio a entero hacia arriba e incrementados en un 4.5% redondeados a entero */
SELECT precio,precio*1.045,CEIL(precio*1.045),ROUND(precio*1.045) FROM automoviles WHERE marca_marcas="Seat";

/*2 Obtener, para todos los contratos de alquiler realizados, la relación entre los días de duración de cada contrato y el precio de alquiler del correspondiente 
automóvil. Obtener esa relación de las formas: truncada con dos decimales y truncada con cuatro decimales y redondeada con dos decimales. */
SELECT TRUNCATE(DATEDIFF(contratos.ffinal,contratos.finicial)*automoviles.precio,4) AS "Trucate de 4",
    TRUNCATE(DATEDIFF(contratos.ffinal,contratos.finicial)*automoviles.precio,2) AS "Trucate de 2",
    ROUND(DATEDIFF(contratos.ffinal,contratos.finicial)*automoviles.precio,2) AS "Redondeo de 2",numcontrato FROM contratos 
    INNER JOIN automoviles ON contratos.matricula_automoviles=automoviles.matricula WHERE contratos.ffinal IS NOT NULL;

--3 Obtener una lista con los 10 primeros caracteres de los apellidos y los 6 primeros de los nombres de todos los clientes
SELECT LEFT(apellidos,10),LEFT(nombre,6) FROM clientes;

--4 Obtener una lista con los apellidos y los nombres de todos los clientes separados con 8 guiones
SELECT CONCAT_WS("--------",apellidos,nombre) AS "Nombres y apellidos" FROM clientes;
SELECT CONCAT_WS(REPEAT('-',8),apellidos,nombre) AS "Nombres y apellidos" FROM clientes;

--5 Obtener una lista de las matrículas en formato tabla
SELECT matricula AS Matricula,ELT(alquilado+1,"libre","ocupado") AS Estado FROM automoviles;

/*6 Obtener una lista con las marcas y modelos de los automóviles en una misma columna que ocupa 40 caracteres (los sobrantes se rellenan con puntos por la 
derecha) y los precios de alquiler ocupando 10 caracteres (los sobrantes se rellenan con puntos por la izquierda) Encabezar el listado como "Lista de precios" */
SELECT CONCAT(RPAD(CONCAT(marca_marcas,' ',modelo),40,'.'),LPAD(precio,10,'.')) AS "Lista de precios" FROM automoviles;

--7 Obtener los nombres y apellidos de todos los clientes que tienen alguna letra ‘O’ en sus apellidos
SELECT nombre,apellidos FROM clientes WHERE apellidos LIKE "%o%";

--8 Modificar las marcas de todos los automóviles para que queden almacenados en mayúsculas
UPDATE automoviles SET marca_marcas=UPPER(marca_marcas);
UPDATE automoviles SET marca_marcas=UCASE(marca_marcas);

--9 Obtener la lista de los apellidos de los clientes y su longitud en caracteres
SELECT nombre,apellidos,CHAR_LENGTH(apellidos) AS "Longitud apellidos" FROM clientes;
SELECT nombre,apellidos,LENGTH(apellidos) AS "Longitud apellidos" FROM clientes;

--10 Obtener los apellidos de todos los clientes sustituyendo los caracteres de los apellidos comprendidos entre el tercero y séptimo por la cadena 'MYSQL'
SELECT nombre,INSERT(apellidos,3,5,"MYSQL") FROM clientes;
SELECT CONCAT(LEFT(apellidos,2),"MYSQL",RIGHT(apellidos,LENGTH(apellidos)-2)) FROM clientes;

--11 Repetir pero ahora sin sustitución de caracteres, es decir, insertando MySQL a partir del segundo carácter del apellido
SELECT nombre,INSERT(apellidos,2,0,"MYSQL") FROM clientes;

--12 Obtener para todos los clientes, su dirección y la posición de dirección donde se encuentra la primera coma
SELECT nombre,direccion,INSTR(direccion,',') AS Posicion FROM clientes;
SELECT nombre,direccion,INSERT(direccion,INSTR(direccion,','),1,'-') AS Posicion FROM clientes;

--13 Obtener para todos los clientes, su nombre, apellidos, dirección sustituyendo la coma por un guión
SELECT nombre,apellidos,REPLACE(direccion,',','-') FROM clientes;

--14 Los nombres y apellidos de los clientes cuyo permiso de conducir fue expedido en el mes de octubre
SELECT nombre,apellidos FROM clientes WHERE MONTH(fechaexp)=10;

/*15 Los nombres, apellidos y fechas de expedición del permiso de conducir de los 4 clientes con fecha de expedición más reciente. La fecha de expedición se ha 
de presentar con el formato "El día 12 de diciembre de 2022" */
SELECT nombre,apellidos,CONCAT("El dia ",DAY(fechaexp)," de ",ELT(MONTH(fechaexp),'Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre',
    'Octubre','Nobiembre','Diciembre')," de ",YEAR(fechaexp)) AS "Fecha de expedición" FROM clientes ORDER BY fechaexp DESC LIMIT 4;
--Cambio de valor de la variable para que salga el mes en español
SET lc_time_names='ja_Ja';
SELECT nombre,apellidos,CONCAT("El dia ",DAY(fechaexp)," de ",MONTHNAME(fechaexp)," de ",YEAR(fechaexp)) AS "Fecha de expedición" 
    FROM clientes ORDER BY fechaexp DESC LIMIT 4;
SELECT nombre,apellidos,DATE_FORMAT(fechaexp,"El dia %e de %b de %Y") FROM clientes ORDER BY fechaexp DESC LIMIT 4;

--16 Cual es la hora actual con el formato "Son las 15 horas 13 minutos"
SELECT DATE_FORMAT(CURTIME(),"Son las %H horas %i minutos");

--17 El nombre del día de la semana (castellano) en que naciste encabezado por "Nací en"
SELECT CONCAT("Nací en ",ELT(WEEKDAY("1998-08-08")+1,"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")) AS "Día de nacimiento";

--18 El número de días que has vivido hasta la fecha actual
SELECT DATEDIFF(NOW(),"2004-11-04") AS "Días vividos";

--19 La fecha y el nombre del día de la semana que será dentro de tres meses
SELECT DATE(ADDDATE(NOW(),INTERVAL 3 MONTH)) AS "Fecha",
    ELT(WEEKDAY(ADDDATE(NOW(),INTERVAL 3 MONTH))+1,"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo") AS "Día de la semana";

/*20 Todos los datos de los contratos asociando a cada uno de ellos 1 si tienen uno o dos días de duración, 2 si tienen una duración entre 3 y 5 días, 3 si 
tienen una duración entre 6 y 10 días y 4 si tienen una duración mayor */
SELECT *,INTERVAL(DATEDIFF(ffinal,finicial),0,3,6,11) AS "Tipo de duración" FROM contratos WHERE ffinal IS NOT NULL;

--21 Obtén los nombres de las marcas de cohes junto con una lista con los modelos de cada una, separándolos con tres guiones
SELECT marca_marcas,GROUP_CONCAT(modelo SEPARATOR "---") FROM automoviles GROUP BY marca_marcas;

/*22 Crea una tabla con una sola columna que contenga el valor encriptado de los nombres y apellidos de los clientes mediante alguno de los sistemas de 
encriptación usando la clave FEBRERO. Comprueba que se desencripta correctamente */
CREATE TABLE clientese SELECT ENCODE(CONCAT(nombre,apellidos),"FEBRERO") AS "Nombre" FROM clientes;
SELECT DECODE(nombre,"FEBRERO") FROM clientese;