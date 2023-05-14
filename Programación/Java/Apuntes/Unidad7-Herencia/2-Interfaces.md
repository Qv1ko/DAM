# Interfaces

Una interfaz es como una clase Java, pero solo tiene constantes estáticas y métodos abstractos. Java usa la interfaz para implementar herencia múltiple. Una clase Java puede implementar múltiples interfaces Java. Todos los métodos en una interfaz son implícitamente públicos y abstractos.

Sintaxis para declarar la interfaz

```java
Public nombreInterfaz {
	// constantes
	// métodos
}
```

¿Por qué se requiere una interfaz?

Para comprender mejor el concepto de la interfaz Java, veamos un ejemplo. La clase “Reproductor multimedia” tiene dos subclases: reproductor de CD y reproductor de DVD. Cada uno tiene su método de implementación único para reproducir música.

![imagen4](./Im%C3%A1genes/imagen4.png)

Otra clase, “Combo drive”, hereda tanto CD como DVD (ver imagen a continuación).
¿Qué método de juego debería heredar? Esto puede causar serios problemas de diseño. Y,
por lo tanto, Java no permite herencia múltiple.

![imagen5](./Im%C3%A1genes/imagen5.png)

Supongamos que tiene un requisito en el que la clase “perro” hereda la clase “animal” y
“mascota” (ver imagen a continuación). Pero no puedes extender dos clases en
Java. Entonces, ¿qué harías? La solución es Interface.

![imagen6](./Im%C3%A1genes/imagen6.png)

```java
public interface Mascota {
	public void pasear();
}

public class Perro implements Mascota {
	@Override
	public void pasear() {
		System.out.println("Método de interfaz implementado");
	}
}

public class PruebaPerro {
	public static void main(String args[]) {
		Perro p = new Perro();
		p.pasear();
	}
}
```

## Diferencia entre clase e interfaz

| Clase | Interfaz |
| --- | --- |
| Puede crear instancias de variables y crear un objeto | No puede crear instancias de variables, ni crear un objeto |
| Puede contener métodos concretos (con implementación) | No puede contener métodos concretos (con implementación) |
| Los especificadores de acceso son privados, protegidos y públicos | Solo se utiliza un especificador público |

## ¿Cuándo usar Interface y Abstract Class?

- Use una clase abstracta cuando se necesita definir una plantilla para un grupo de subclases
- Use una interfaz cuando se debe definir un rol para otras clases, independientemente del árbol de herencia de estas clases

## Cualidades de las interfaces

- La clase que implementa la interfaz necesita proporcionar funcionalidad para los métodos declarados en la interfaz
- Todos los métodos en una interfaz son implícitamente públicos y abstractos
- Una interfaz no puede ser instanciada
- Una interfaz permite la herencia múltiple
- Una interfaz puede extenderse desde una o varias interfaces. Una clase puede extender solo una clase, pero implementar cualquier cantidad de interfaces