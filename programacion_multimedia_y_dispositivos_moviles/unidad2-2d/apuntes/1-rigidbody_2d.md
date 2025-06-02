# Rigidbody 2D

Un componente `Rigidbody 2D` coloca un objeto debajo del contro del motor de física. Muchos conceptos similares del componente estándar `Rigidbody` son llevados al `Rigidbody 2D`, con la diferencia de que en 2D, los objetos solo se puede movilizar en el plano XY y solo pueden girar en un eje perpendicular al plano.

| Propiedad | Función |
| --- | --- |
| Use Auto Mass | ¿Detectar la masa del objeto a partir de su colisionador? Marque la casilla para sí. |
| Mass | Masa del cuerpo rígido. (Grisado si ha seleccionado Usar Masa Automática). |
| Linear Drag | El coeficiente de fricción afectando el movimiento de posición. |
| Angular Drag | El coeficiente de fricción afectando el movimiento de rotación. |
| Gravity Scale | Grado el cual el objeto es afectado por gravedad. |
| Is Kinematic | Es el rigidbody movido por fuerzas y colisiones? |
| Interpolate | Como el movimiento del objeto es interpolado entre actualizaciones de física (útil cuando el movimiento tiende a ser desigual). |
| None | No se aplica ningún movimiento suavizado. |
| Interpolate | El movimiento es suavizado basado en la posición del objeto en previos cuadros (frames). |
| Extrapolate | El movimiento es suavizado basado en una estimación de su posición en el siguiente cuadro (Frame). |
| Sleeping Mode | Cómo el objeto “duerme” para ahorrar tiempo de procesador cuando está inactivo. |
| Never Sleep | Sleeping is disabled (should be avoided where possible). |
| Start Awake | El objeto inicialmente está despierto. |
| Start Asleep | El objeto está inicialmente durmiendo pero se puede despertar por colisiones. |
| Collision Detection | Cómo las colisiones con otros objetos son detectados. |
| Discrete | Una colisión es registrada solamente si el collider del objeto está en contacto con otro durante la actualización de física. |
| Continuous | Una colisión es registrada si el collider del objeto parece ser contactado otro entre actualizaciones. |
| Constraints | Restrictions on the rigidbody’s motion:- |
| Freeze Position | Stops the rigidbody moving in the world X & Y axes selectively. |
| Freeze Rotation | Stops the rigidbody rotating around the Z axes selectively. |