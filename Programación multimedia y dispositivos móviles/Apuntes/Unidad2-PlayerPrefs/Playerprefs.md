# PlayerPrefs

`PlayerPrefs` es una clase que almacena las preferencias del jugador entre sesiones de juego. Puede almacenar valores de `string`, `float` y `integer` en el registro de la plataforma del usuario.

Unity almacena `PlayerPrefs` en un registro local, sin encriptación. No utilice los datos de `PlayerPrefs` para almacenar datos confidenciales.

Unity almacena los datos `PlayerPrefs` de manera diferente basado en que sistema operativo corre la aplicación.

### Métodos estáticos

| DeleteAll | Elimina todas las claves y valores de las preferencias. |
| --- | --- |
| DeleteKey | Elimina la clave dada de PlayerPrefs. Si la clave no existe, DeleteKey no tiene ningún efecto. |
| GetFloat | Devuelve el valor correspondiente a la clave en el archivo de preferencias si existe. |
| GetInt | Devuelve el valor correspondiente a la clave en el archivo de preferencias si existe. |
| GetString | Devuelve el valor correspondiente a la clave en el archivo de preferencias si existe. |
| HasKey | Devuelve true si la clave dada existe en PlayerPrefs, en caso contrario devuelve false. |
| Save | Guarda todas las preferencias modificadas. |
| SetFloat | Establece el valor flotante de la preferencia identificada por la clave dada. |
| SetInt | Establece un único valor entero para la preferencia identificada por la clave dada. |
| SetString | Establece un único valor de cadena para la preferencia identificada por la clave dada. |