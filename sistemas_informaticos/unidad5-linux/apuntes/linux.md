# Linux

## Linux

GNU/Linux es un conjunto de sistemas operativos libres multiplataforma, multiusuario y multitarea basados en Unix, un núcleo del sistema operativo fue lanzado por primera vez el 17 de septiembre de 1991 por Linus Torvalds.

El sistema operativo Linux sigue un diseño modular que es la clave de sus muchas variaciones y distribuciones. Un cargador de arranque es responsable de iniciar el kernel de Linux.

El Kernel o núcleo de Linux se podría definir como el corazón del sistema. Es el encargado de que el software y el hardware funcionen de forma adecuada en el computador en el que se encuentra.

Las funciones más importantes del mismo, aunque no las únicas, son:

- Administración de la memoria, para todos los programas en ejecución.
- Administración del tiempo de procesador, que estos programas en ejecución utilizan.

Es el encargado de que podamos acceder a los periféricos/elementos de nuestro ordenador de una manera cómoda.

## Distribuciones de Linux

Linux generalmente está empaquetado en una distribución.

Una distribución GNU/Linux es una distribución de software basada en el núcleo Linux que incluye determinados paquetes de software para satisfacer las necesidades de un grupo específico de usuarios, dando así origen a ediciones domésticas, empresariales y para servidores. Por lo general están compuestas, total o mayoritariamente, de software libre, aunque a menudo incorporan aplicaciones o controladores propietarios.

Cientos de diferentes distribuciones, están disponibles hoy en día. Cada una suele estar desarrollada para sistemas de destino específicos, como servidores, escritorios, dispositivos móviles u otros dispositivos.

### Ubuntu

Ubuntu sigue siendo una de las distribuciones de Linux más populares y era la más utilizada hasta la fecha.

### Linux Mint

Linux Mint es ahora la distribución líder de Linux, superando a Ubuntu y todas las demás
distribuciones para convertirse en la principal competencia de Windows y Mac OS.

### OpenSuse

OpenSUSE es también muy popular, principalmente por la flexibilidad de su interfaz y su sencilla instalación de archivos.

### Fedora

Fedora es un sistema operativo flexible con tres opciones separadas según tus necesidades. Están disponibles versiones para servidor, otra orientada a la nube y una tercera para la estación de trabajo.

### Debian

Debian es una de las distribuciones de Linux más antiguas, se lanzó por primera vez en 1996. Desde entonces, ha servido como marco para muchas otras distribuciones, como Ubuntu y Mint.

### Solus

Lanzada a finales de 2015, Solus se convirtió en una de las distribuciones más utilizadas en los dos años siguientes a su lanzamiento.

### Manjaro

Manjaro está basado en otra distribución de Linux llamada Arch, que está optimizada para usuarios avanzados.

### Zorin

Zorin fue creada para reemplazar Windows y MacOS. De hecho, aunque se basa en Ubuntu, proporciona interfaces visuales que imitan esos sistemas operativos.

## Ubuntu

Ubuntu significa “Humanidad para otros” o “Yo soy porque nosotros somos”. El proyecto pretende impregnar al mundo de esta mentalidad y hacer de Ubuntu un sistema operativo de fácil uso y accesible para todos

Ubuntu es uno de los sistemas operativos basados en Linux más utilizado en la actualidad, algo que ha conseguido gracias a su rendimiento, a la posibilidad de descargarse gratis y tratarse de software libre que cualquiera puede modificar para mejorar su código, algo que ha propiciado la aparición de otros entornos gráficos como Kubuntu o Xubuntu entre muchos otros. El periodo aproximado de actualizaciones de Ubuntu es de seis meses y es Canonical la que se encarga de aportar los updates de seguridad para solucionar errores críticos y bugs.

### Características

- El usuario tiene capacidad para descargar, instalar, copiar, distribuir, analizar el código fuente, modificarle, compilarle y compartirlo una vez modificado, sin tener que pagar derechos de licencia.
- Se puede usar en el idioma elegido por el usuario
- Está adaptado para poder usarlo usuarios con alguna discapacidad
- Usa la versión de kernel Linux 5.4
- El entorno gráfico usado es Unity (desde la versión 11.04) con GNOME 3.36
- Dock de acceso fácil a aplicaciones que podemos prescindir de él.
- Desaparece la partición swap que pasa a ser sustituida por swapfile utilizando memoria virtual.
- El centro de software es una verdadera tienda de aplicaciones donde se pueden encontrar miles de aplicaciones, organizándose estas según las visitas que hayan recibido, lo destacado que sean y la categoría en que se encasillen.
- Utiliza Thunderbird como gestor de correo electrónico.
- Incluye multitud de drivers que permiten la conexión y configuración de gran variedad de dispositivos.
- Usa Firefox como navegador por defecto.
- La suite ofimática usada es LibreOffice

### Requisitos

Requisitos del sistema para su instalación:

- Procesador Dual Core de 2 Ghz o superior
- 1 Gb de RAM
- 10 Gb de disco duro
- Resolución de pantalla de 800*600
- Unidad de DVD/CD o USB para la instalación
- Acceso a Internet recomendado

### Configuración del sistema

- Se pueden observar todas sus características desde el botón Configuración → Acerca de
- Actualizaciones:
- También podemos acceder a la ventana de software y a actualizaciones desde:
    
    Configuración → Acerca de → Software y actualizaciones
    

### Sistemas de archivos

- El sistema de archivos utilizado por Ubuntu es EXT4 sus principales características son:
    - El número máximo de caracteres para el nombre es de 256.
    - Distingue entre mayúsculas y minúsculas.
    - Soporta volúmenes o unidades hasta 1 Exabyte
    - Los ficheros pueden tener un tamaño máximo de 16 TeraBytes.
    - La X en el nombre indica extensión. El significado de extensión es de una serie de bloques físicos de disco continuos en el espacio.
    - Dispone de registro diario.
- Nomenclatura para referenciar las unidades
    - Solamente existe un directorio raíz (`/`) de él cuelgan todos los demás.
    - Los discos duros y particiones creadas siguen una nomenclatura concreta. Cuando se referencia un disco se tiene en cuenta si es IDE (hd) o SATA (sd), tipo de partición y número de partición.
    - De igual forma y en función de donde estén conectados en la placa se utilizan las letras a, b, c...
    - Las particiones se denominan con números 1,2,3 y 4 para las primarias y 5,6.. para las lógicas.
    - En terminal de comandos de Linux comando: lsblk
- Descripción de los directorios principales
    - Por debajo del directorio raíz (/) hay un importante grupo de directorios común a la mayoría de las distribuciones de
    GNU/Linux.
    - `/bin` → Aplicaciones binarias importantes
    - `/boot` → Ficheros de configuración del arranque, núcleos y otros ficheros necesarios para el arranque (boot) del equipo.
    - `/dev` → Los ficheros de dispositivo
    - `/etc` → Ficheros de configuración, scripts de arranque, etc.
    - `/home` → Directorios personales (home) para los diferentes usuarios.
    - `/initrd` → Usado cuando se crea un proceso de arranque initrd personalizado.
    - `/lib` → Librerías del sistema (libraries)
    - `/lost+found` → Proporciona un sistema de "perdido+encontrado" (lost+found) para los ficheros que existen debajo del directorio raíz (/)
    - `/media` - Particiones montadas (cargadas) automáticamente en el disco duro y medios (media) extraíbles como CDs, cámaras digitales, etc.
- Descripción de los directorios principales
    - `/mnt` → Sistemas de archivos montados manualmente en el disco duro.
    - `/opt` → Proporciona una ubicación donde instalar aplicaciones opcionales (de terceros)
    - `/proc` → Directorio dinámico especial que mantiene información sobre el estado del sistema, incluyendo los procesos actualmente en ejecución
    - `/root` → Directorio personal del usuario root (superusuario);también llamado "barra root".
    - `/sbin` → Binarios importantes del sistema
    - `/srv` → Puede contener archivos que se sirven a otros sistemas
    - `/sys` → Archivos del sistema (system)
    - `/tmp` → Temporary files
    - `/usr` → Aplicaciones y archivos a los que puede acceder la mayoría de los usuarios
    - `/var` → Archivos variables como archivos de registros y bases de datos

### Usuario root

- El usuario root
    
    En antiguas versiones de Linux solamente había dos tipos usuarios: el usuario root y el resto de usuarios sin privilegios.
    
    El acceso como root puede ocasionar fallos en el sistema si no es un administrador muy experimentado, para ello se crea el comando `SUDO` que permite a usuarios pseudo administradores ejecutar comandos como si fueran root pero sin acceder al sistema como él.
    
- Sudo password for usuario
    
    Ejemplo: `sudo passwd pepe`, permite cambiar el password del usuario pepe sin ser el usuario root.
    
    Existen pues, usuarios pseudo-administradores, que pueden ejecutar ciertas funciones antes no permitidas, pero la administración real del sistema y el acceso a todos sus lugares solo es permitida por root.
    
- Comando SU:
    
    Permite cambiar de usuario. Sintaxis: su usuario, si no se especifica nada y escribimos solamente su indicamos que queremos cambiar al usuario root.
    
    Para poder utilizar root debe tener un password concreto.
    
    Proceso para asignar un password al usuario administrador:
    
    - Sudo passwd root
    - Pregunta contraseña del usuario pseudo-administrador: `[sudo] passwd` for usuario
    - Si es correcta pide el password para root, que deberá ser confirmado.
    - Establecida la contraseña sale el mensaje passwd: contraseña actualizad correctamente.
    - Al usar el comando su sin ningún tipo de usuario nos preguntará la contraseña de root.

### Terminal

- Uso del Terminal
    - El terminal simula un entrono en modo texto, que ejecuta un intérprete de comandos (Shell).
    - La ventaja de la terminal es su increíble potencia, permite con unas pocas órdenes realizar operaciones de forma masiva, así como la velocidad de ejecución.
- El prompt
    - Es el carácter o conjunto de caracteres que se muestra en el terminal.
    - El prompt viene determinado por la variable de entorno PS1 y suele proporcionar información bastante útil.
    - `Usuario@usuarioPC~$`
    - `Usuario` → Usuario que inicia la sesión.
    - `usuarioPC` → Nombre del PC
    - `~` → Representa la carpeta personal del usuario
    - `$` → Indica que no somos el usuario root. Cuando iniciamos sesión con root aparece el símbolo `#`.
- Variables de entorno
    
    Las variables de entorno son elementos del sistema operativo que almacenan un valor que puede variar durante la ejecución del mismo. Las variables de entorno más usuales son:
    
    - `Path`: Contiene información de todos los directorios que almacenan ficheros ejecutables, de modo que podemos acceder a ellos sin necesidad de acceder a la carpeta en la que se almacenan.
    - `Home`: Almacena la ruta al directorio personal del usuario con la que hemos iniciado sesión.
    - `User`: Almacena el nombre del usuario que ha iniciado sesión.
    - `Shell`: Almacena la ruta del intérprete de comandos que se está ejecutando por defecto.
    - `Hostname`: Guarda el nombre del PC.

## Comandos

- Comandos más usuales en sistemas operativos Linux
    
    Sintaxis básica → `Nombre_del_comando [opciones][valor]\`
    
    - Opciones: serie de modificadores que al agregarse al comando modifican su comportamiento base.
    - Valor: puede ser un fichero, un directorio, un número o conjunto de caracteres.
- Comandos para la ejecución de procesos
    
    Un proceso es un programa en ejecución. Los procesos se identifican con un número entero llamado PID.
    
    Ejecución en primer y segundo plano: Un proceso puedes ser ejecutado en primer o segundo plano. Si un comando se ejecuta en primer plano deja inutilizable el terminal, para que un comando se ejecute en segundo plano deberemos añadir el símbolo &, con ello indicaremos que quede libre el terminal para que puede seguir usándose.
    
- Comandos
    
    `ps` y `pstree` → Se encargan de visualizar información de todos los procesos que se están ejecutando en el sistema. pstree muestra información en forma de árbol de procesos.
    
    `top` → Muestra un listado de procesos en ejecución, identificando la memoria que se está ocupando.
    
    `kill` → Comando usado para “matar” procesos, acaba con la ejecución de un proceso liberando memoria, siempre va acompañado del PID del mismo.
    
    `jobs` → Visualiza todos los procesos que están ejecutándose en segundo plano.
    
    - Se denominan demonios a los procesos cargados en memoria ejecutándose en segundo plano y que están continuamente a la espera para ofrecer un determinado servicio. Ejemplos de demonios son los servidores http, de correo electrónico, etc.
- Comandos para la gestión del sistema de archivos
    
    Para trabajar con el sistema de archivos debemos tener en cuenta si vamos a escribir su ruta absoluta o relativa. Una ruta absoluta es aquella que localiza el fichero o directorio desde la raíz mientras que en una ruta relativa no será necesario comenzar siempre por la raíz sino expresar la ruta dese del directorio donde nos encontremos.
    
- Caracteres especiales o caracteres comodines
    
    Se utilizan para sustituir uno o varios datos alfanuméricos.
    
    El asterisco (`*`). Significa 0, uno o varios (el `*` se puede sustituir por ningún carácter por uno solo o por varios).
    
    La interrogación (`?`). Significa 0 o uno.
    
    Los corchetes(`[ ]`). Sustituir un único carácter con la condición que debe ser uno de los incluidos en el par de corchetes.
    
    Corchetes con exclamación (`[^ ]`) Igual que el anterior pero en vez de incluir excluye.
    
- Comandos más utilizados
    
    `ls` → Realiza un listado de los ficheros y directorios que se encuentran en la ubicación indicada.
    
    Las opciones disponibles con éste comando son las siguientes:
    
    - `ls -a` → Nos muestra los archivos y directorios dentro del directorio actual, incluyendo los archivos y directorios ocultos.
    - `ls -t` → Ordena los archivos por fecha de modificación.
    - `ls -X` → Ordena los archivos por extensión.
    - `ls -l` → Muestra toda la información: usuario, grupo, permisos, tamaño, fecha y hora de creación.
    - `ls -lh` → Muestra la misma información que ls -l pero con las unidades de tamaño en KB, MB, etc.
    - `ls -R` → Muestra el contenido de todos los subdirectorios de forma recursiva.
    - `ls -S` → Ordena los resultados por tamaño de archivo.
    - `cd` → Permite cambiar de directorio
    
    `pwd` → Muestra la ruta del directorio donde estamos
    
    `touch nombre_fichero` → Si `nombre_fichero` no existe crea el fichero, en caso contario actualiza su fecha de modificación.
    
    `cp origen destino` → Copia un fichero o directorio.
    
    `mv origen destino` → Mueve un fichero o directorio, en ocasiones se usa para cambiar el nombre de un fichero.
    
    `rm nombre_fichero` → Elimina un fichero o directorio vacío, con la opción -R elimina de forma recursiva `rm -R directorio` también se puede usar rmdir.
    
    `mkdir nombre_directorio` → Crea un directorio.
    
    `cat` → Visualiza el contenido de un fichero.
    
    `echo` → Muestra por pantalla o salida estándar un dato.
    
- Enlaces
    
    Un enlace es una referencia a un fichero o directorio ubicado en un lugar concreto del sistema de archivos.
    
    Tipos:
    
    Enlace simbólico: similar al acceso directo en Windows. Se crea con el comando `ln`.
    
    - `ln -s (fichero a enlazar) (nombre enlace)`
    
    Enlace duro: se trata de poner acceder a la misma información con dos nombres distintos al mismo fichero. Se crea usando el comando `ln` sin opciones.
    
    - `ln (archivo origen) (nombre enlace)`
    
    La hacer un listado largo la línea de un enlace empieza por l, un enlace simbólico se diferencia de uno duro por el número que aparece en la segunda columna (1 ó 2).
    
- Comandos de control del sistema
    
    `halt` → Apaga el equipo
    
    `reboot` → Resetea el sistema
    
    `shutdown -h now` → Indica que el sistema debe ser apagado en ese momento. (advierte a los usuarios)
    
    `shutdown -r now` → Ordena al sistema que debe ser reiniciado en ese momento. (advierte a los usuarios)
    
- Otros comandos
    
    `date` → Visualizamos y cambiamos la hora del sistema.
    
    `cal` → Muestra calendario con los días del mes actual. Con cal año visualizamos el año completo.
    
    `du` → Muestra el espacio que ocupa un fichero en disco. Con loa opción du -h se muestra en la forma de Kb, Mb, Gb, etc.
    
    `df` → Muestra información sobre todo los sistemas de archivos montados sobre la máquina.
    
- Comandos de búsqueda y filtrado de información
    
    `find` → Para buscar ficheros en el árbol de directorios de Linux. Podemos buscarle por su nombre, por parte de su contenido y otros parámetros.
    
    - `find ruta [opciones] fichero`
    
    `grep` → Permite extraer elementos que cumplen una condición establecida por él. Se usa bastante en tuberías.
    
    - `grep [opciones] patrón fichero`.
    
    `cut` → Trocea la información. Extrae la parte de la información que indiquemos en sus opciones.
    
    - `cut [opciones] fichero`
- Tuberías
    
    Se utilizan para concatenar varios comandos de forma que el resultado del primeo pase como valor para el siguiente. Se usa el carácter `|` para representarla. Puede estar formada por tantos comandos como se necesiten.
    
- Alias
    
    Consiste en llamar con otro nombre a cualquiera de los comandos. Se usan apara facilitar la ejecución de los comandos.
    
    - `alias nombe_nuevo="comandos"`

## **Comandos para usuarios**

### Usuarios, grupos y permisos

En un Sistema Operativo un usuario es un elemento del mismo que representa a una persona real con ciertos privilegios y usos sobre el software base y sus recursos.

En Linux siempre han existido dos tipos de usuarios, el usuario root y el resto de usuarios, siendo root el administrador. En las nuevas distribuciones, existen usuarios pseudo administradores, con poderes para realizar ciertas modificaciones.

### Comandos relacionados con usuarios

`who` → Muestra información de los usuarios que han iniciado sesión, además de indicar el terminal donde han iniciado y el momento del acceso.

`whoami` → Muestra el nombre del usuario que haya iniciado sesión en ese terminal.

`id` → Muestra información relativa del usuario con el que hemos iniciado sesión o del que le indiquemos. Se mostrará el nombre del usuario y los grupos a que pertenece.

### Nuevos usuarios

Se utilizan los comandos: `adduser` y `useradd`

Los dos comandos conducen al único objetivo de la creación de un usuario en un sistema Linux. Las diferencias entre ambos son que adduser nos permite agregar un usuario de manera más interactiva y useradd nos permite más opciones a la hora de crear los usuarios.

`sudo adduser *usuario*`

`sudo useradd -c *comentario* -d *directorio_home* -p *password* *usuario*`

Es recomendable para la creación de usuarios el comando adduser ya que nos configura más variables del sistema de forma manual, en el useradd debemos ser nosotros los que configuremos todos los parámetros.

### Eliminación de usuarios

Se realiza a través de los comandos: `deluser` y `userdel`

La diferencia entre ambos es que el funcionamiento de deluser es más sencillo. deluser cuando borra un usuario no elimina sus ficheros y directorios aunque si queremos que si los borre solo tenemos que añadir la opción `–remove-home` (para su home) o `–remove-all-files` (todos los archivos del usuario).

### Grupos

Los grupos sirven para agrupar a usuarios que tienen algo en común. Todos los grupos del sistema se guardan en un fichero de configuración llamado `etc/group`.

Cada línea de este fichero representa un grupo con partes bien diferenciadas separadas por el carácter `:`.

### Creación de grupos

La creación de grupos puede hacerse de forma sencilla accediendo al fichero etc/group y editarlo agregando un nueva línea.

Para realizarlo con los comandos: `addgroup` y `groupadd`.

Puedes asignarle una GID con: `addgroup --gid *id* *grupo*`

### Gestión de usuarios y grupos

Comando `usermod`

Permite agregar usuarios a grupos y nos permite:

- Cambiar el grupo primario de un usuario
    
    `usermod –g *grupo* *usuario*`
    
- Agregar a usuarios a otros grupos indicando que estos son sus grupos secundarios
    
    `usermod –G *grupo* *usuario*`
    
- Activar o bloquear cuentas de usuarios
    
    `usermod –L *usuario*` → Bloquea usuario
    
    `usermod –U *usuario*` → Activa usuario
    

### Eliminar grupos

`delgroup *grupo*`

### Permisos

Permiten controlar el acceso a directorios, ficheros o recursos de determinados usuarios o grupos del sistema.

`ls –l` → Visualizar los permisos de los ficheros y directorios de una carpeta

Significado del primer carácter de los archivos:

| Permiso | Identifica |
| --- | --- |
| - | Archivo |
| d | Directorio |
| b | Archivo de bloque especiales |
| c | Archivo de caracteres especiales |
| l | Archivo de vinculo o enlace |
| p | Archivo especial de cauce |

Caracteres que definen los permisos:

| Permiso  | Identifica |
| --- | --- |
| - | Sin permiso |
| r | Permiso de lectura |
| w | Permiso de escritura |
| x | Permiso de ejecución |

Permisos sobre ficheros:

- Lectura (r) → Podemos abrirlo para leer su contenido.
- Escritura (w) → Podemos modificar el fichero.
- Ejecución (x) → Indica que es un fichero ejecutable y al hacer doble clic se ejecutará.

Permisos sobre directorios:

- Lectura (r) → Podemos listar su contenido pero no acceder a él.
- Escritura(w) → Podemos crear en él otros ficheros o directorios, además de poder eliminar o modificar los que ya existan.
- Ejecución (x) → Indica que el directorio es accesible.

### Cambiar los permisos

Se pueden cambiar los permisos de nuestros ficheros y directorios mediante el comando chmod.

`chmod permisos *fichero*/*directorio*`

Se puede usar chmod de dos formas: modo simbólico y modo numérico.

- Modo simbólico:
    
    `chmod (u|g|o|a) (+|-|=) (r|w|x) *fichero*/*directorio*`
    
    | U → Usuario | + → Añade permisos | R → Permiso de lectura |
    | --- | --- | --- |
    | G → Grupo | - → Quita permisos | W → Permiso de escritura |
    | O → Otros | = → Asigna solo los permisos indicados | x → Permiso de ejecución |
    | A → Todos los usuarios |  |  |
    
    `chmod u+x pruebas` → Agrega el permiso de ejecución al fichero pruebas para el usuario propietario
    
    `chmod ug+x pruebas` → Agrega el permiso de ejecución a pruebas tanto al usuario como al grupo
    
    `chmod o-r pruebas` → Elimina el permiso de lectura al resto de usuarios
    
    `chmod ug=rw pruebas` → Asigna a usuario y grupo solamente los permisos `r` y `w`
    
- Modo numérico:
    
    Se indican los permisos que das a otros a través de números.
    
    Se trabaja con tres números x x x, el primero hace referencia al usuario, el segundo al grupo y el tercero resto de usuarios, y cada uno de ellos dividido en 3 permisos lectura escritura y ejecución.
    
    Permisos de usuario: `r w x` = `111` → `7` traducido a decimal
    
    Permisos del grupo: `r - -` = `100` → `4`
    
    Permisos del resto: `r - -` = `110` → `6`
    
    745 son los tres números que representan los permisos de pruebas
    
    | 4 2 1 | Total |
    | --- | --- |
    | r w x | 4 + 2 + 1 = 7 |
    | r w - | 4 + 2 + 0 = 6 |
    | r - x | 4 + 0 + 1 = 5 |
    | r - - | 4 + 0 + 0 = 4 |
    | - w x | 0 + 2 + 1 = 3 |
    | - w - | 0 + 2 + 0 = 2 |
    | - - x | 0 + 0 + 1 = 1 |
    | - - - | 0 + 0 + 0 = 0 |

### Permisos especiales

Hay una serie de permisos especiales sobre el sistema de archivos de Linux que pueden resultarnos útiles para determinadas tareas o para organizar directorios colaborativos entre diferentes usuarios.

**SUID**: Al aplicare este permiso conseguimos que cualquiera pueda usar el fichero como si fuera el usuario propietario, con los mismos privilegios.

- La forma de establecer este permiso es con el `flag +s`
- Ejemplo: `chmod u + s *pruebas*`

**SGID**: Similar a SUID aunque aplicado al grupo propietario.

- También se aplica con el `flag +s`
- Ejemplo: `chmod g +s *pruebas*`

**Sticky**: Permiso aplicado sobre carpetas. Con él aseguramos que un directorio se pueda acceder por todos los usuarios, pero cada uno de ellos solo puede borrar o modificar los ficheros y subdirectorios creados por ellos mismos.

- La forma de establecer este permiso es con el `flag +t`
- Ejemplo: `chmod +t *carpeta*`

### Cambio de propietario

**chown**: Se utiliza para cambiar el propietario al cual pertenece un archivo o directorio. Puede especificarse tanto el nombre de un usuario, así como un número de identidad de usuario (UID).

- `chown [opciones] *usuario*[:*grupo*] *archivo*/*directorio*`
- Ejemplo: `chown usuario *archivo*/*directorio*` → Cambia de propietario sobre el archivo.

**chgrp**: Se utiliza para cambiar el grupo al cual pertenece un archivo o directorio. Puede especificarse tanto el nombre de un grupo, así como un número de identidad de grupo (GID).

- `chgrp [opciones] *archivo*/*directorio*`
- Ejemplo: `chgrp *grupo* *archivo*/*directorio*` → Cambia de grupo sobre el archivo.

### Monitor del sistema

Es una herramienta de Ubuntu por lo que podemos observar el estado de los procesos del sistema. Así como en que medida se están usando los recursos del mismo.

Accedemos al monitor del sistema desde Aplicaciones → Monitor del Sistema.

La aplicación dispone de tres pestañas:

- Procesos: Muestra la lista de procesos del sistema, pueden estar durmiéndose o ejecutándose yal hacer clic sobre ellos con botón derecho, podemos matar el proceso, reiniciarlo.
- Recursos: Muestra la gráfica relacionada con los recursos: CPU, RAM y RED.
- Sistema de archivos: Lista información de cada una de las particiones creadas en el sistema.