# Configuracion de BD y tablas
* Crear base de datos -> `CREATE DATABASE nombreBaseDeDatos;`
* Crear tabla -> `CREATE TABLE nombreTabla(...);`
* Eliminar base de datos -> `DROP DATABASE nombreBaseDeDatos;`
* Eliminar tabla -> `DROP TABLE nombreTabla;`
* Eliminar tabla permanentemente -> `TRUNCATE TABLE nombreTabla;`
* Entrar en una base de datos -> `USE nombreBaseDeDatos;`
* Crear tabla apartir de otra -> `CREATE TABLE tabla2 LIKE tabla1;`
* Cargar datos de un .txt a una tabla -> `LOAD DATA LOCAL INFILE "archivo" INTO TABLE nombreTabla;`

# Tipos de datos
* Numeros enteros -> `INT[(num)]` o `INTEGER[(num)]`
* Numeros decimales -> `FLOAT(escala,precision)`
* Datos numericos -> `NUMERIC(escala,precision)`
* Cadenas de caracteres con longitud fija -> `CHAR(long)`
* Cadenas de caracteres con longitud variable -> `VARCHAR(long)`
* Cadenas de gran longitud -> `TEXT`
* Cadenas de maxima longitud -> `LONGTEXT`
* Fechas formato `YYYY-MM-DD`-> `DATE`
* Fecha y hora con formato `YYYY-MM-DD HH:MM:SS` -> `DATETIME`
* Hora con formato `HH:MM:SS` -> `TIME`
* Booleanos -> `BOOLEAN`

# Mostrar elementos y estructura
* Ver bases de datos -> `SHOW DATABASES;`
* Ver tablas de una base de datos -> `SHOW TABLES;`
* Ver configuracion de la tabla -> `SHOW CREATE TABLE nombreTabla;`
* Ver estructura de la tabla -> `DESC nombreTabal;`
* Ver valor de la variable AUTOCOMMIT -> `SELECT @@AUTOCOMMIT;`

# Consultas
* Seleccionar todas las columnas -> `SELECT * FROM nombreTabla;`
* Seleccinar columnas -> `SELECT nombreColumna FROM nombreTabla;`
* Seleccinar varias columnas -> `SELECT nombreColumna1,nombreColumna2 FROM nombreTabla;`
* Seleccionar valores diferentes -> `SELECT DISTINCT * FROM NombreTabla;`
    ## Operadores
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
    * Rangos
        * Entre dos rangos -> `SELECT * FROM nombreTabla WHERE nombreColumna BETWEEN rango1 AND rango2;`
        * Fuera de dos rangos -> `SELECT * FROM nombreTabla WHERE nombreColumna NOT BETWEEN rango1 AND rango2;`
    * Patrones
        * Compracion con patron -> `SELECT * FROM nombreTabla WHERE nombreColumna LIKE patron;`
        * Diferente al patron -> `SELECT * FROM nombreTabla WHERE nombreColumna NOT LIKE patron;`
        * Filtro de patrones
            * Indica que hay x caracteres pudiendo ser 0
                * Empieza por x -> `"x%"`
                * Acaba con x -> `"%x"`
                * Esta entre -> `"%x%"`
                * Empieza y acaba -> `"x%x"`
            * Indica que hay un caranter
                * Con un caracter delante -> `"_x"`
                * Con dos caracter delante -> `"__x"`
                * Con un caracter detras -> `"x_"`
    * Compara lista de valores
        * Dentro de lista de valores -> `SELECT * FROM nombreTabla WHERE nombreColumna IN (valor1,valor2,valor3);`
        * Fuera de una lista de valores -> `SELECT * FROM nombreTabla WHERE nombreColumna NOT IN (valor1,valor2,valor3);`
    ## ALIAS
    * Alias -> `SELECT nombreColumna AS Alias FROM nombreTabla;`
    * Alias grande -> `SELECT nombreColumna AS "Alias grande" FROM nombreTabla;`
    ## Filtrar
    * Filtro de la consulta -> `SELECT * FROM NombreTabla WHERE condicion;`
    ## Ordenar
    * Ascendente (bajo a alto) -> `SELECT * FROM NombreTabla ORDER BY nombreColumna ASC;`
    * Descendente (alto a bajo) -> `SELECT * FROM nombreTabla ORDER BY nombreColumna DESC;`
    * Ordenar por varias columnas -> `SELECT * FROM NombreTabla ORDER BY nombreColumna1, nombreColumna2;`
    ## Agrupar
    * Agrupar por columna -> `SELECT * FROM nombreTabla GROUP BY nombreColumna;`
    * Agrupar por varias columnas -> `SELECT * FROM nombreTabla GROUP BY nombreColumna1, nombreColumna2;`
    * Agrupar por columna con filtro -> `SELECT * FROM nombreTabla GROUP BY nombreColumna HAVING condicion;`
    ## Subconsultas
    * Devuelven 1 valor -> `SELECT * FROM nombreTabla WHERE nombreColumna=(SELECT nombreColumna FROM nombreTabla WHERE nombreColumna condicion);`
    * Devuelven varios datos -> `SELECT * FROM nombreTabla WHERE nombreColumna IN (SELECT nombreColumna FROM nombreTabla WHERE nombreColumna condicion);`

# Consultas multitabla
* Seleccionar todos los valores de las tablas entre si -> `SELECT * FROM nombreTabla1 CROSS JOIN nombreTabla2;`
* Relaciones entre dos tablas -> `SELECT * FROM A INNER JOIN B ON A.key=B.key;`
* Seleccionar tabla de la izquierda junto a sus relaciones de la otra tabla -> `SELECT * FROM A LEFT JOIN B ON A.key=B.key;`
* Seleccionar tabla de la derecha junto a sus relaciones de la otra tabla -> `SELECT * FROM A RIGHT JOIN B ON A.key=B.key;`
* Seleccionar tabla de la izquierda -> `SELECT * FROM A LEFT JOIN B ON A.key=B.key WHERE B IS NULL;`
* Seleccionar tabla de la derecha -> `SELECT * FROM A RIGHT JOIN B ON A.key=B.key WHERE A IS NULL;`
* Seleccionar todo entre dos tablas -> `SELECT * FROM A OUTER JOIN B ON A.key=B.key;`
* Seleccionar todo entre dos tablas menos las relaciones -> `SELECT * FROM A OUTER JOIN B ON A.key=B.key WHERE A IS NULL OR B IS NULL;`
* Unir el resultado de dos consultas -> `SELECT * FROM nombreTabla1 UNION SELECT * FROM nombreTabla2;`

# Consultas de resumen
* Valor máximo -> `MAX()`
* Valor mínimo -> `MIN()`
* Media de valores -> `AVG()`
* Cuenta -> `COUNT(*)` o `COUNT(nombreColumna)`
* Suma los valores numéricos -> `SUM()`

# Insertar y modificar datos
* Introducir datos -> `INSERT INTO nombreTabla VALUES(...),(...);`
* Cambiar valores de una tabla -> `UPDATE nombreTabla SET nombreColumna=valor;`
* Borrar valores de una tabla -> `DELETE FROM nombreTabla;`

# Modificar estructura
* Añadir columna -> `ALTER TABLE nombreTabla ADD nombreColumna valoresColumna;`
* Eliminar columna -> `ALTER TABLE nombreTabla DROP COLUMN nombreColumna;`
* Añadir primary key -> `ALTER TABLE nombreTabla ADD PRIMARY KEY(nombreColumna);`
* Eliminar primary key -> `ALTER TABLE nombreTabla DROP PRIMARY KEY nombrePrimaryKey;`
* Añadir foreign key -> `ALTER TABLE nombreTabla ADD FOREIGN KEY(nombreColumna) REFERENCES nombreTabla(nombreColuman);`
* Eliminar foreign key -> `ALTER TABLE nombreTabla DROP FOREIGN KEY nombreForeignKey;`
* Modificar el tipo de dato de una columna -> `ALTER TABLE nombreTabla MODIFY COLUMN nombreColumna TipoDeDato;`

# Transacciones
* Inicia la transaccion -> `START TRANSACTION;`
* Confirma los cambios -> `COMMIT;`
* Deshace los cambios -> `ROLLBACK;`
* Predefinir transaccion -> `SET AUTOCOMMIT=1;`
        
# Copias de seguridad
* Copia de seguridad (fuera de MySQL) -> `mysqldump -u root -p nombreBD > archivo.sql`
* Recuperar copia de seguridad → `source archivo.sql;`