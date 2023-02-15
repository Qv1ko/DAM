# Visualizar elementos
* Ver bases de datos -> `SHOW DATABASES;`
* Ver tablas de una base de datos -> `SHOW TABLES;`
* Ver configuracion de la tabla -> `SHOW CREATE TABLE nombreTabla;`
* Ver estructura de la tabla -> `DESC nombreTabal;`
* Ver valor de la variable AUTOCOMMIT -> `SELECT @@AUTOCOMMIT;`

# Configuracion de bases de datos
* Crear base de datos -> `CREATE DATABASE nombreBaseDeDatos;`
* Eliminar base de datos -> `DROP DATABASE nombreBaseDeDatos;`
* Entrar en una base de datos -> `USE nombreBaseDeDatos;`
* Crear tabla -> `CREATE TABLE nombreTabla(...);`
* Eliminar tabla -> `DROP TABLE nombreTabla;`
* Eliminar tabla permanentemente -> `TRUNCATE TABLE nombreTabla;`
* Crear tabla apartir de otra -> `CREATE TABLE tabla2 LIKE tabla1;`
* Cargar datos de un archivo de texto a una tabla -> `LOAD DATA LOCAL INFILE "PathFile" INTO TABLE nombreTabla;`
    ## INSERT
    * Introducir datos -> `INSERT INTO nombreTabla VALUES(...),(...);`
    ## UPDATE
    * Cambiar valores de una tabla -> `UPDATE nombreTabla SET nombreColumna=valor;`
    ## DELETE
    * Borrar valores de una tabla -> `DELETE FROM nombreTabla;`
    ## ALTER TABLE
    * Añadir columna -> `ALTER TABLE nombreTabla ADD nombreColumna valoresColumna;`
    * Eliminar columna -> `ALTER TABLE nombreTabla DROP COLUMN nombreColumna;`
    * Añadir primary key -> `ALTER TABLE nombreTabla ADD PRIMARY KEY(nombreColumna);`
    * Eliminar primary key -> `ALTER TABLE nombreTabla DROP PRIMARY KEY nombrePrimaryKey;`
    * Añadir foreign key -> `ALTER TABLE nombreTabla ADD FOREIGN KEY(nombreColumna) REFERENCES nombreTabla(nombreColuman);`
    * Eliminar foreign key -> `ALTER TABLE nombreTabla DROP FOREIGN KEY nombreForeignKey;`
    * Modificar los datos de una columna -> `ALTER TABLE nombreTabla MODIFY COLUMN nombreColumna datos`

# TRANSACTION
* Iniciar transaccion -> `START TRANSACTION;`
* Guardar transaccion -> `COMMIT;`
* Borrar transaccion -> `ROLLBACK;`
* Predefinir transaccion -> `AUTOCOMMIT=1;`

# SELECT
* Seleccionar todas las columnas -> `SELECT * FROM nombreTabla;`
* Seleccinar columnas -> `SELECT nombreColumna FROM nombreTabla;`
* Seleccinar varias columnas -> `SELECT nombreColumna1,nombreColumna2 FROM nombreTabla;`
    ## FUNCIONES
    * Valor máximo -> `MAX()`
    * Valor mínimo -> `MIN()`
    * Media de valores -> `AVG()`
    * Cuenta -> `COUNT()`
    * Suma los valores numéricos -> `SUM()`
    ## ALIAS
    * Alias -> `SELECT nombreColumna AS Alias FROM nombreTabla;`
    * Alias grande -> `SELECT nombreColumna AS "Alias grande" FROM nombreTabla;`
    ## JOIN
    * Relaciones entre dos tablas -> `SELECT * FROM A INNER JOIN B ON A.key=B.key;`
    * Seleccionar tabla de la izquierda junto a sus relaciones de la otra tabla -> `SELECT * FROM A LEFT JOIN B ON A.key=B.key;`
    * Seleccionar tabla de la derecha junto a sus relaciones de la otra tabla -> `SELECT * FROM A RIGHT JOIN B ON A.key=B.key;`
    * Seleccionar tabla de la izquierda -> `SELECT * FROM A LEFT JOIN B ON A.key=B.key WHERE B IS NULL;`
    * Seleccionar tabla de la derecha -> `SELECT * FROM A RIGHT JOIN B ON A.key=B.key WHERE A IS NULL;`
    * Seleccionar todo entre dos tablas -> `SELECT * FROM A OUTER JOIN B ON A.key=B.key;`
    * Seleccionar todo entre dos tablas menos las relaciones -> `SELECT * FROM A OUTER JOIN B ON A.key=B.key WHERE A IS NULL OR B IS NULL;`
    ## WHERE
    * Comparacion
        * Mayor -> `SELECT * FROM nombreTabla WHERE nombreColumna>x;`
        * Menor -> `SELECT * FROM nombreTabla WHERE nombreColumna<x;`
        * Distinto -> `SELECT * FROM nombreTabla WHERE nombreColumna<>x;`
        * Menor o igual -> `SELECT * FROM nombreTabla WHERE nombreColumna<=x;`
        * Mayor o igual -> `SELECT * FROM nombreTabla WHERE nombreColumna>=x;`
        * Igual -> `SELECT * FROM nombreTabla WHERE nombreColumna=x;`
    * Booleans
        * Y -> `SELECT * FROM nombreTabla WHERE comparacion AND comparacion;`
        * O -> `SELECT * FROM nombreTabla WHERE comparacion OR comparacion;`
        * No -> `SELECT * FROM nombreTabla WHERE nombreColumna NOT (valor1,valor2);`
    * Rangos -> `SELECT * FROM nombreTabla WHERE nombreColumna BETWEEN rango1 AND rango2;`
    * Relacion -> `SELECT * FROM nombreTabla WHERE nombreColumna LIKE valor;`
    * Dentro -> `SELECT * FROM nombreTabla WHERE nombreColumna IN (valor1,valor2,valor3);`
    ## GROUP BY
    * Agrupar por columna -> `SELECT * FROM nombreTabla GROUP BY nombreColumna;`
    * Agrupar por columna con filtro -> `SELECT * FROM nombreTabla GROUP BY nombreColumna HAVING condicion;`
    ## ORDER BY
    * Ascendente (bajo a alto) -> `SELECT * FROM nombreTabla ORDER BY nombreColumna ASC;`
    * Descendente (alto a bajo) -> `SELECT * FROM nombreTabla ORDER BY nombreColumna DESC;`

# Copias de seguridad
* Copia de seguridad -> mysqldump -u root -p nombreBD > archivo.sql
* Recuperar copia de seguridad → source archivo.sql

# Creas BD y tablas

# Tipos de datos

# Mostrar elementos y estructura

# Consultas

## Operadores

## Con filtro

## Con ordenacion

## Agrupacion

### Having

## Subconsultas

### Devuelven 1 valor

### Devuelven varios datos

# Consultas multitabla

## Cross join

## Inner join

## Left join

## Outer join

# Consultas de resumen
* COUNT()

# Insertar y modificar datos

# Modificar estructura

# Transacciones