# Lenguaje básico C#

## Hola mundo

```csharp
using System;

namespace Pruebas {
	class HolaMundo {
		public static void Main(string[] args) {
			Console.WriteLine("Hello World!");
		}
	}
}
```

## Tipos de datos

```csharp
public static void Main(string[] args) {
	// Tipos de datos
	bool logico = false;
	char character = 'c';
	int num = 5;
	long largo = 22;
	float dec = 12.5f;
	double doble = 22.222;
	string cadena = "hola";
}
```

## Operadores aritméticos

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| + | Suma | a + b |
| - | Resta | a - b |
| * | Multiplicación | a * b |
| / | División | a / b |
| % | Módulo | a % b |

## Operadores de asignación

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| = | Asignación | a = b |
| += | Suma y asignación | a += b (a = a + b) |
| -= | Resta y asignación | a -= b (a = a - b) |
| *= | Multiplicación y asignación | a *= b (a = a * b) |
| /= | División y asignación | a /= b (a = a / b) |
| %= | Módulo y asignación | a %= b (a = a % b) |

## Operadores relacionales

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| == | Igualdad | a == b |
| != | Distinto | a != b |
| < | Menor que | a < b |
| > | Mayor que | a > b |
| <= | Menor o igual que | a <= b |
| >= | Mayor o igual que | a >= b |

## Operadores lógicos

| Operador | Significado | Ejemplo | Resultado |
| --- | --- | --- | --- |
| && | y | (7 > 2) && (2 < 4) | Las dos condiciones son verdaderas |
| || | o | (7 > 2) || (2 < 4) | Al menos una de las condiciones en verdadera |
| ! | no | !(7 > 2) | La condición es falsa |

## Operadores especiales

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| ++ | Incremento | a++ (postincremento)
++a (preincremento) |
| -- | Decremento | a-- (posdecremento)
--a (predecremento) |
| (tipo)expr | Cast | a = (int)b |
| + | Concatenación de cadenas | a = "str1" + "str2"  |
| . | Acceso a variables y métodos | a = obj.var1 |
| ( ) | Agrupación de expresiones | a = (a + b) * c |

## Condicionales

```csharp
public static void Main(string[] args) {
	int num = 21;

	if (num % 2 == 0) {
		Console.WriteLine("par");
	} else {
		Console.WriteLine("impar");
	}

	var edad = 7;

	if (edad < 12 || edad > 65) {
		Console.WriteLine("Recibe descuento");
	}

	var opcion = "salir";

	switch (opcion) {
		case "saludar":
			Console.WriteLine("Buenas");
			break;
		case "despedir":
			Console.WriteLine("Hasta luego");
			break;
		case "salir":
			Console.WriteLine("Saliendo del programa");
			break;
		default:
			Console.WriteLine("No se reconoce la opcion");
			break;
}
```

## Bucle while y do while

```csharp
public static void Main(string[] args) {
	var i = 0;

	while (i < 10) {
		Console.WriteLine(i);
		i++;
	}

	var condicion = false;

	do {
		Console.WriteLine("Hola");
	while (condicion);
}
```

## Bucle for

```csharp
public static void Main(string[] args) {
	for (int i = 0; i < 10; i ++) {
		Console.WriteLine(i);
	}
}
```

## Clase string

```csharp
public static void Main(string[] args) {
	string cadena = "Hola mundo";

	Console.WriteLine("Longitud de la cadena: " + cadena.Length);
	Console.WriteLine("Indice de subcadena: " + cadena.IndexOf("mundo"));
	Console.WriteLine("Devolver subcadena: " + cadena.Substring(0, 4));
	Console.WriteLine("Comparar dos cadenas: " + cadena.Equals("Hola mundo"));
	Console.WriteLine("Empieza con una subcadena: " + cadena.StartsWith("Hola"));
	Console.WriteLine("Acaba con una subcadena: " + cadena.EndsWith("mundo"));
	Console.WriteLine("Reemplazar una palabra: " + cadena.Replace("Hola", "Hello"));
	Console.WriteLine("Reemplazar un caracter: " + cadena.Replace("o", "a"));

	string cadena2 = "        muchos espacios         "
	Console.WriteLine("Borrar espacios: " + cadena2.Trim());

	string cadena3 = "";
	Console.WriteLine("Cadena nula o vacia: " + String.IsNullOrEmpty(cadena3));

	string cadena4 = "  ";
	Console.WriteLine("Cadena nula o espacios en blanco: " + String.IsNullOrWhiteSpace(cadena4));
}
```

## Arrays

```csharp
class MainClass
	public static void Main(string[] args) {
		int[] numeros = {4, 1, -6, 12};

		for (var i = 0; i < numeros.Length; i++) {
			Console.WriteLine(numeros[i]);
		}
	}
}
```

## Listas

```csharp
public static void Main(string[] args) {
	List<int> numeros = new List<int>();
	
	numeros.Add(1);
	numeros.Add(2);
	numeros.Add(3);

	foreach (int numero in numeros) {
		Console.WriteLine(numero);
	}
}
```