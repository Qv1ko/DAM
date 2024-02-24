# Editor Unity

## Introducción al editor de Unity

El diseño predeterminado de Unity Editor está organizado con las ventanas más importantes que necesitarás ubicar para ayudarte a completar las actividades básicas.

![Untitled](Editor%20Unity%2088421946b5cc45ccb66289f6b8bc6145/Untitled.png)

Hay cinco áreas clave de la interfaz básica del Editor.

### Vista de escena y vista de juego

En el centro del diseño predeterminado de Unity Editor se encuentra la vista Escena. Esta es tu ventana interactiva al mundo que estás creando. Utilizará la vista Escena para manipular objetos y verlos desde varios ángulos.

En el diseño predeterminado, la vista Juego también aparece en esta área. Usarás la vista Juego para probar tu juego.

### Ventana de jerarquía

La Jerarquía es donde puedes organizar todas las cosas en tu proyecto. Estas cosas se llaman GameObjects.

Si agrega un GameObject a su proyecto en la vista Escena, aparecerá en la Jerarquía. Si elimina un GameObject de la escena, ya no aparecerá en la lista.

### Ventana de proyecto

La ventana Proyecto es donde puede encontrar todos los archivos (activos) disponibles para usar en su proyecto, ya sea que los use o no.

La ventana Proyecto funciona como un explorador de archivos, organizado en carpetas. Puede arrastrar recursos directamente desde la ventana del Proyecto a la vista Escena para agregarlos a la escena.

Tenga en cuenta la diferencia entre las ventanas Proyecto y Jerarquía: la jerarquía contiene todos los GameObjects en la escena actual y la ventana Proyecto contiene todos los recursos disponibles para todo su proyecto.

### Ventana de inspección

El Inspector es donde encontrarás y configurarás información detallada sobre GameObjects.

Cuando seleccionas un GameObject en la vista Escena o en la Jerarquía, verás sus componentes en el Inspector. Los componentes describen las propiedades y comportamientos de GameObjects.

### Barra de herramientas

Utilice los botones de la barra de herramientas para cambiar su punto de vista en la escena e iniciar y detener el modo de reproducción.

Las funciones de navegación de escenas están alojadas en una barra de herramientas flotante en la vista de escena.

Estas funciones te permiten mover, rotar y escalar tus GameObjects seleccionados.

## Revise las opciones de diseño del Editor.

Puede utilizar el menú Diseño en la barra de herramientas para cambiar la disposición de las ventanas en el Editor. Se proporcionan varios diseños y puede guardar sus propios diseños.

El mejor diseño para el Editor depende de lo que esté haciendo y de sus preferencias personales. Por ejemplo:

- Si dedica mucho tiempo a configurar componentes, es posible que desee acoplar el Inspector junto a la Jerarquía.
- Si está diseñando mucho entorno, es posible que desee ampliar la vista de la escena lo más posible.
- Si estás editando la interfaz de usuario, querrás asegurarte de que la vista Juego esté visible.

Se recomienda que utilices el diseño predeterminado mientras aprendes Unity.

## Usar escenas en tu proyecto

Los proyectos en Unity Editor están organizados en escenas. Las escenas son contenedores para todo lo que hay en la experiencia que estás creando.

Una forma de pensar en las escenas es como experiencias discretas. Por ejemplo, cada nivel de un juego podría ser una escena separada y el menú principal del juego podría ser otro.

Un proyecto de Unity puede tener una escena o más de cien, dependiendo de su alcance y complejidad. No existen reglas estrictas sobre cómo organizar exactamente un proyecto de Unity en escenas, excepto que un proyecto en Unity debe tener al menos una escena.

### Revisar las escenas del proyecto.

Las escenas de un proyecto de Unity normalmente se almacenan en una carpeta llamada Escenas. Los proyectos de Unity que proporcionamos en Unity Learn a menudo tienen esta carpeta creada previamente. Sin embargo, si estás creando un proyecto desde cero, esta carpeta no existirá hasta que la crees.

Para revisar las escenas en un proyecto de Unity:

1. En la ventana del Proyecto, use el panel de navegación o la barra de búsqueda para encontrar la carpeta Escenas.
2. Haga doble clic en una escena para abrirla. Verá el contenido de esa escena en la vista Jerarquía y Escena.

## Practica navegar por la escena.

Cuando se trabaja en Unity Editor, navegar en la vista Escena es muy importante. Una forma de pensar en navegar en esta ventana es como operar la cámara de un dron: te permite examinar tus GameObjects desde cualquier ángulo o distancia.

Con la práctica podrás aprender a navegar con facilidad. También hay configuraciones más generales que puede usar para configurar la vista de escena.

Repasemos rápidamente los conceptos básicos:

- Panorámica: seleccione la herramienta Mano en la barra de herramientas y haga clic y arrastre en la vista de escena para mover la vista.
- Zoom: manteniendo presionada la tecla `Alt` (Windows) u Opción (macOS), haga clic derecho y arrastre en la vista de escena para hacer zoom.
- Órbita: manteniendo presionada la tecla `Alt` (Windows) u Opción (macOS), haga clic izquierdo y arrastre para orbitar alrededor del punto de pivote actual. Nota: esta opción no está disponible en modo 2D.
- Enfoque (selección de cuadro): cuando se selecciona un GameObject, seleccione `F` con el cursor en la vista de escena para enfocar su vista en ese GameObject.
    
    Nota: Si el cursor no está en la vista de escena, la selección de fotograma no funcionará.
    
- Modo Flythrough
    
    También puedes usar el modo Flythrough para navegar en la vista de escena volando en primera persona, lo cual es común en muchos juegos. Para hacer esto:
    
    - Haga clic y mantenga presionado el botón derecho del mouse.
    - Utilice `W`, `A`, `S`, `D` para mover la vista hacia la izquierda/derecha/adelante/atrás.
    - Utilice `Q` y `E` para mover la vista hacia arriba y hacia abajo.
    - Seleccione y mantenga presionada la tecla Mayus para moverse más rápido.
        
        Nota: El modo Flythrough no está disponible en el modo 2D. En su lugar, mantenga presionado el botón derecho del mouse mientras mueve el cursor para desplazarse por la vista de escena.
        

## Revisar las herramientas

El uso efectivo de las herramientas de transformación y navegación de escenas es una habilidad esencial en Unity, que te permite posicionar, escalar y ver tus GameObjects de manera eficiente en el espacio 3D. Con estas herramientas y algo de práctica, podrás desarrollar hábitos para obtener los resultados que deseas de forma rápida y sencilla.

Nota: Si estás en una escena sin ningún GameObjects para practicar, haz clic derecho en la ventana Jerarquía y selecciona Objeto 3D > Cubo.

Los atajos de teclado para las barras de herramientas corresponden a las teclas `QWERTY` en la parte superior izquierda de un teclado estándar. Con estas teclas, puede cambiar rápidamente entre las herramientas y mantener el mouse en la vista de escena.

![Untitled](Editor%20Unity%2088421946b5cc45ccb66289f6b8bc6145/Untitled%201.png)

`Q` → Herramienta Manual, para realizar una panorámica de la vista

`W` → Herramienta Mover, para seleccionar y cambiar de posición

`E` → Herramienta Rotar, para seleccionar y rotar

`R` → Herramienta Escala, para seleccionar y cambiar tamaño

`T` → Herramienta Rect Transform, para escalar en 2D

`Y` → Herramienta Transformar, para mover, escalar y rotar con un Gizmo

Para cada una de las herramientas de transformación, aparece un Gizmo que te permite manipular el GameObject a lo largo de cada eje específico. A medida que manipula estos controles, los valores en el componente de transformación cambian en consecuencia.

![Untitled](Editor%20Unity%2088421946b5cc45ccb66289f6b8bc6145/Untitled%202.png)

Descubrirás tu propio sistema para navegar por la vista de escena y manipular GameObjects de manera eficiente. Por ejemplo, su sistema podría consistir en apoyar los dedos de la mano que no es el mouse en las teclas `QWER` para cambiar de herramienta, apoyar el pulgar en la tecla `ALT` para orbitar su vista de la escena y mover el dedo índice a la tecla `F` para céntrese en un GameObject según sea necesario.