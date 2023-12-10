# Modelo Relacional

Fue propuesto en 1970, como alternativa a los modelos existentes, por Edgar Codd.

Su base es el modelo de la teoría matemática de las relaciones. En un principio era un simple modelo teórico y hoy en día es el modelo más conocido y difundido en los modelos comerciales.

Para que un sistema gestor de bases de datos, pueda implementar un modelo relacional, necesita apoyarse en un lenguaje de programación que lo gestione. El lenguaje aceptado por todos los sistemas de bases de datos comerciales es SQL. Cada gestor incorpora su propio SQL.

## Elementos

Relacion → Tabla

Atributos de la tabla (columnas)

Registro o tuplas (filas)

### Representación

NombreRelacion(Atributo1, atributo2, …, atributoN):DominioN=()

Atributo clave → Subrayado

Atributo clave débil → Subrayado discontinuo

Atributo opcional → NombreAtributo*

- Ejemplo:
    
    ![imagen1.png](./Imágenes/imagen1.png)
    
    Artista(Codigo,~~dni~~,nombre,apellidos*,nacionalidad*,especialidad):DominioNacionalidad=(Francia,Alemania,Polinia,Rusia)
    

### Restricciones inherente (se tienen que cumplir siempre)

1. Que ningún atributo puede tomar mas de un valor en cada tupla
2. No importa el orden de las tuplas ni de los atributos
3. Tiene que haber una clave principal que identifique de forma univoca cada tupla
4. La clave puede estar formada por varios atributos, pero siempre sera una sola clave principal
5. En la clave primaria no se puede ni repetir ni tener un valor nulo

### Restricciones de usuario

1. Los valores de un atributo no pueden repetirse (no puede haber dos tuplas con el mismo valor en el Nombre)
2. Hay atributos que deben tener siempre valores para todas las tuplas de la relacion

**Integridad referencial:** trata la forma en la que los datos de dos o mas tablas, se deben relacionar, para no atentar contra la integridad de la base de datos

**Clave ajena/foránea(Foreign Key):**

1. No permite tener datos que no están en la columna clave a la que se relaciona
2. Representación → Flecha que relaciona la columna de la clave foranea con la tabla donde pertenece la clave. Tienen que tener el mismo tipo de valor.
- Ejemplo
    
    ![imagen2.png](./Imágenes/imagen2.png)
    
    - En algunos casos se escribe encima de la tabla el nombre de la tabla donde esta la clave

Tambien puede indicar ciertas caracteristicas de la clave ajena a la hora de actualizar y borrar datos:

- **No action (default):** no puedes borrar ni actualizar columnas de la tabla primaria, si tiene una columna relacionada a el.
- **Cascade:** al actualizar o borrar datos de una columna relacionada con otra, se eliminan o actualizan las relaciones.

## Reglas básicas de transformación del modelo entidad-relacion al modelo relacional

1. Toda entidad se transforma en una tabla y los atributos asociados, pasan a ser los atributos de la tabla
2. Nos indica que las interrelaciones, cuyo tipo de correspondencia es de varios a varios (N:M), se transforman en una nueva tabla donde la clave primaria se compone de los atributos identificadores de las dos entidades que relaciona.
    
    Ejemplo → Matricular(Id,fecha,dniAlumno,nombreCurso)
    
3. Nos indica que en las interrelaciones cuyo tipo de correspondencia es 1:N, se traduce en una propagación de clave o en una nueva tabla (si la interrelación posee atributos)
    1. Se pone el nombre de la clave de la tabla con 1 de cardinalidad maxima en la tabla de cardinalidad multiple
    2. Si hay atributos en la tabla no se puede propagar la clave, se hara una nueva tabla

![imagen3.png](./Imágenes/imagen3.png)