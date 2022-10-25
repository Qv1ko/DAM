# Elementos de un programa informático

## Elementos de un programa informático

- Estructura de bloques
- Entornos integrados de desarrollo → Frameworks
- Uso de variables (modificables)
- Diferentes tipos de datos
- Constantes (inmodificables)

## Lenguajes de programación

Lenguaje de alto nivel → Lenguaje más parecido al humano

Java, C#, PHP, Python…

Lenguaje de bajo nivel → Lenguaje más computacional 

Ensamblador, COBOL, C…

## Compilación y ejecución de java

1. Edición de código java
    
    Crea un archivo .java
    
2. Compilador → javac [archivo.java]
    
    Crea un ejecutable .class
    
3. El computador interpreta el código con el ejecutable .class y ejecuta el código del archivo

![Untitled](Imagenes/imagen1.png)

![Untitled](Imagenes/imagen2.png)

## Objetos y clases

- **Objeto:** conjunto de variables junto con los métodos relacionados
con estas. Contiene la información (las variables) y la forma de
manipular la información (los métodos).
- **Clase:** prototipo que define las variables y métodos que va a
emplear un determinado tipo de objeto.
- **Atributos/Propiedades:** contienen la información relativa a la clase.
- **Métodos:** permiten manipular dicha información.
- **Constructores:** reservan memoria para almacenar un objeto de esa
clase.

## Tipos de datos primitivos

| Tipo | Ocupación en memoria | Descripción | Ejemplos |
| --- | --- | --- | --- |
| byte | 8 bits | Entero de 1 byte (deprecated) | 210 |
| short  | 16 bits | Entero corto | 21000 |
| int | 32 bits | Entero | 2100000 |
| long | 64 bits | Entero largo | 210000l |
| float | 32 bits | Decimal simple | 3.1223f |
| double | 64 bits | Decimal doble | 3.141596d |
| char | 16 bits | Carácter simple | 'a’ |
| String | +16 bits | Cadena de caracteres | “cadena” |
| boolean | true / false | verdadero / falso | true, false |

## Comentarios en Java

// → Comentarios para una sola linea

/* [codigo] */ → Comentarios de una o más líneas

/** [codigo] */ → Comentarios de documentacion para Javadoc, de una o más líneas

- Al exportarlo te genera un archivo .xml con todos los comentarios en Javadoc

## Comentarios en Java (Javadoc)

Javadoc, es una herramienta del SDK que permite documentar, de una manera rápida y sencilla, las clases y métodos que se proveen, siendo de gran utilidad para la compresión del desarrollo.

| Etiqueta | Descripción |
| --- | --- |
| @author | Autor del elemento a documentar |
| @version | Versión del elemento de la clase |
| @return | Indica los parámetros de salida |
| @exception | Indica la excepción que puede generar |
| @param | Código para documentar cada uno de los parámetros |
| @see | Una referencia a otra utilidad |
| @deprecated | El método ha sido reemplazado por otro |

## Operadores aritmeticos

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| + | Suma | a+b |
| - | Resta | a-b |
| * | Multiplicación | a*b |
| / | División | a/b |
| % | Módulo / Resto | a%b |

## Operadores de asignación

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| = | Asignación | a=b |
| += | Suma y asignación | a+=b → a=a+b |
| -= | Resta y asignación | a-=b → a=a-b |
| *= | Multiplicación y asignación | a*=b → a=a*b |
| /= | División y asignación | a/=b → a=a/b |
| %= | Módulo y asignación | a%=b → a=a%b |

## Operadores relacionales

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| == | Igualdad | a==b |
| != | Distinto | a!=b |
| < | Menor que | a<b |
| > | Mayor que | a>b |
| <= | Menor o igual que | a<=b |
| >= | Mayor o igual que | b>=b |

## Operadores lógicos

| Operador | Significado | Ejemplo | Descripción |
| --- | --- | --- | --- |
| && | y (AND) | (7>2) && (2<4) | Las dos condiciones son verdaderas |
| || | o (OR) | (7>2) || (2<4) | Al menos una de las condiciones es verdadera |
| ! | no (NOT) | !(7>2) | La condición es falsa |

| Valor A | Valor B | AND && |
| --- | --- | --- |
| F | F | F |
| F | V | F |
| V | F | F |
| V | V | V |

| Valor A | Valor B | OR || |
| --- | --- | --- |
| F | F | F |
| F | V | V |
| V | F | V |
| V | V | V |

| Valor A | Not A |
| --- | --- |
| F | V |
| V | F |

## Operadores especiales

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| ++ | Incremento | a++ (posincremento)
++a (preincremento) |
| -- | Decremento | a-- (posdecremento)
--a (predecremento) |
| (tipo)expr | Cast | a=(int)b |
| + | Concatenación de cadenas | a=“cad1”+“cad2” → cad1cad2 |
| . | Acceso a variables y métodos | a=obj.var1 |
| ( ) | Agrupación de expresiones | a=(a+b)*c |