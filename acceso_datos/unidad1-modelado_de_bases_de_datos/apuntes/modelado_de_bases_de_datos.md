# Modelado de bases de datos

El modelo entidad relación establece las normas y los diagramas representan la realidad en base a ese modelo.

## Reglas de negocio

Son condiciones que se deben cumplir en nuestro sistema.

Se definen durante el análisis del proyecto.

Hechos ciertos que se definen en nuestro sistema.

**Tipos de reglas**:

- Restricciones: condición a chequear sobre un valor.
- Definición: características o propiedades de un objeto en el sistema.
- Hechos: cosas ciertas en el sistema.
- Fórmulas: cálculos empleados en el sistema.
- Requerimientos: especificación funcional y/o no funcional en el sistema.
- Validación: restricción sobre un valor en el sistema.

Cuando en las reglas de negocio no hay suficiente información, se dice que hay una falta de contexto. Se identifica en el diagrama con el `*`, añadiendo también una descripción.

Ejemplos:

- El NIF de un cliente estará formada por 8 valores numéricos y carácter de la A a la Z → Hecho
- Un empleado pertenecerá a uno o solo a un departamento → Hecho
- Los clientes deberán poder consultar sus datos almacenados en el sistema mientras estén en situación de ‘Alta’ → Hecho
- La consulta de los datos de clientes deberá ejecutarse en menos de 5 segundos → Requerimiento no funcional
- Un usuario del sistema no logueado no podrá acceder a la acción ‘logout’ → Hecho

## Modelos de datos: Modelo E/R

Creado por Peter Chen.

Son fáciles de entender, no deben ser complejos.

Los modelos E/R son conceptuales y semánticos, utilizándose para representar la realidad a un alto nivel de abstracción.

El nivel de abstracción a de ser alta, para representar correctamente los elementos de la vida real.

Mediante los modelos conceptuales se puede construir una descripción de la realidad fácil de entender.

**Características**:

- **Expresividad**: deben tener suficientes conceptos para expresar perfectamente la realidad.
- **Simplicidad**: deben ser simples para que los esquemas sean fáciles de entender.
- **Minimalidad**: cada concepto debe tener un significado distinto.
- **Formalidad**: todos los conceptos deben tener una interpretación única, precisa y bien definida.

Creamos diagrama E/R para reflejar la realidad en el sistema.

## Elementos del modelo E/R

**Conjuntos de entidades**:

- Definimos conjuntó de entidades como un grupo de entidades que comparten las mismas propiedades o atributos.
- **Representaremos los nombres de los conjuntos de entidades en mayúsculas y con sustantivos**.
    - Siempre hay varios elementos (plural).
- Entidades: una entidad es una “cosa” u “objeto” del mundo real que es diferenciable del resto de objetos.
    - Entidad es cada uno de los registros de un conjunto de entidades.
- Los elementos de los conjuntos no se repiten y se relacionan con los elementos de otros conjuntos. Lo que hace a las bases de datos redundantes.
- En un conjunto de entidades puede haber infinitas entidades.
- El sistema que va a gestionar la BBDD nunca va a ser un conjunto de entidades.

**Relaciones**:

- Grado de una relación (conjunto de entidades involucradas en esa relación)
    - Las relaciones de 1º (monarias o reflexivas), 2º (binarias), 3º (ternarias)
- **Representaremos las relaciones en minúsculas con verbos conjugados**.
- En los diagramas entidad relación hay que tener cuidado con los bucles porque pueden crear redundancias.
- Las relaciones monarias tendrán roles.

**Atributos**:

- Los atributos son un conjunto de elementos que representan a una entidad. Describen las propiedades que posee cada miembro de un conjunto de entidades.
    - Un atributo es una característica de un grupo de elementos.

Cardinalidad de una relación:

- Expresa cuantas entidades del conjunto de entidades de un extremo de la relación están relacionadas con cuantas entidades del conjunto del otro extremo.
- La cardinalidad se representa en los extremos de la relación.
- Tipos:
    - Uno a uno (`1:1`)
    - Uno a varios (`1:N`)
    - Varios a uno (`N:1`)
    - Varios a varios (`N:N`)
- Hallar cardinalidad:
    - Reflexivas: siempre `1:N`
    - Binarias: una **entidad** cuantas **entidades** **verbo** (cardinalidad en el extremo del conjunto de entidades preguntado)
    - Ternarias: una **entidad** **verbo** una **entidad** cuantas **entidades** **verbo**

## Atributos

Tipos de atributos:

- Simples
- Compuestos (atributo con varios componentes)
- Monovalentes (para cada entidad solo tiene un valor)
- Multivaluado (para cada entidad tiene varios valores) → Doble línea
    - Da la posibilidad de que la característica tenga varios valores
- Derivados (atributo cuyo valor puede ser calculado) → Línea discontinua

Un atributo es simple o compuesto y es monovalente o multivaluado.

Se representa con una elipse.

![imagen1](./Imágenes/imagen1.png)

## Modelo E/R extendido

Nos provee de herramientas y/o elementos que nos permiten representar elementos del mundo real de una manera más completa.

### Conjuntos de entidades débiles

Una **entidad débil** es aquella que no puede identificarse por si misma

- Una entidad débil no tiene clave primaria
- El conjunto de atributos de la entidad débil que permiten realizar esta distinción se denomina **discriminante**
- Se define con el discriminante y la clave principal del conjunto de entidades del que depende.
    
    
    | Discriminante | Clave principal |
    | --- | --- |
    | 1 | 01 |
    | 2 | 02 |
- Los discriminantes se representan subrayados con línea discontinua
- Tanto el conjunto de entidades como la relación tienen doble línea de borde porque relaciona un conjunto de entidades débil con un conjunto de entidades fuerte.
- La relación siempre va a ser binaria (`1:N`)
    
    ![imagen2](./Imágenes/imagen2.png)
    
    ![imagen3](./Imágenes/imagen3.png)
    

Una **entidad fuerte** es aquella que puede identificarse por si misma (tienen clave primaria)

### Generalización (ISA)

Establece una jerarquía entre los conjuntos de entidades

- Se define cuando se observan conjuntos de entidades con algunas características en común
- La generalización se usa para resaltar las similitudes entre los conjuntos de entidades de nivel más bajo
- Permite economizar la representación para que los atributos compartidos no estén repetidos.
    
    ![imagen4](./Imágenes/imagen4.png)
    
- Restricciones de la generalización
    - Exclusiva: una relación exclusiva requerirá que una entidad solo pertenezca a una de las entidades de nivel más bajo.
    - Solapada: una relación solapada permite que una entidad pertenezca a varias entidades de nivel más bajo.
    - Total: cada entidad de nivel más alto debe pertenecer a una conjunto de entidades de nivel más bajo.
    - Parcial: algunas entidades de nivel más alto pueden no pertenecer a algún conjunto de entidades de nivel más bajo.
    
    Una restricción puede ser exclusiva o solapada y total o parcial.
    
    Relación exclusiva parcial
    
    ![imagen5](./Imágenes/imagen5.png)
    
    Relación exclusiva total
    
    ![imagen6](./Imágenes/imagen6.png)
    
    Relación solapada parcial
    
    ![imagen7](./Imágenes/imagen7.png)
    
    Relación solapada total
    
    ![imagen8](./Imágenes/imagen8.png)
    
- Ejemplos de generalización
    
    
    Generalización total y exclusiva
    
    ![imagen9](./Imágenes/imagen9.png)
    
    Los empleados son docentes o no docentes, pero nunca los dos.
    
    Generalización parcial y solapada
    
    ![imagen10](./Imágenes/imagen10.png)
    
    Los empleados son docentes o no docentes o los dos a la vez o ninguno de los dos.
    

### Agregación

Herramienta de abstracción para tratar relaciones como entidades de más alto nivel.

- No se pueden enlazar un conjunto de entidades con un conjunto de entidades ni una relación con una relación

Es un elemento del modelo entidad relación extendido que nos permite relacionar una relación con otra relación, saltándose una norma del modelo E/R. 

Se la salta, agregando un subsistema en la relación que se quiere relacionar con la otra relación.

![imagen11](./Imágenes/imagen11.png)

Los profesores que pertenecen a un departamento pueden solicitar subvenciones