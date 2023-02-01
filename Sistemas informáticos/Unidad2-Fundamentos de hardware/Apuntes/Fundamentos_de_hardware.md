# Fundamentos de hardware

## Tipos de ordenadores

- **Superordenadores:** los utilizan los grandes centros de investigación, universidades, aplicaciones empresariales muy complejas, etc. Se trata de equipamientos a medida.
- **Mainframe:** pueden tener miles de usuarios conectados simultáneamente .Las utilizan las grandes empresas y entidades gubernamentales para procesos continuos (bancos, empresas eléctricas, hacienda, etc.). Su nombre proviene de la comparación con los mainframes.
- **Miniordenador:** habituales en todo tipo de empresas grandes y pequeñas. Se le suele llamar servidor, en referencia a las aplicaciones que sirve al resto de los equipos de la empresa .HP, Dell, IBM, Fujitsu.
- **Ordenador personal o microordenador:** amplia difusión. Equipo autónomo . Uso doméstico o profesional. Enorme variedad de dispositivos y empresas que compiten por el mercado.
- **Ordenadores portátiles:** ligeros de peso y que permiten trabajar sin conexión a la red. Los Notebooks son una variante aún más ligera.
- **Tablet:** ordenador pizarra sin teclado físico y con pantalla táctil.
- **Terminal:** dependen de un servidor central para funcionar. Habitualmente no cuentan con disco duro, Sustituyen al PC en algunos entornos laborales.

Concurrencia: cuando un procesador no puede ejecutar dos procesos a la vez.

Paralelismo: puede tener varios procesos ejecutándose simultáneamente.

![imagen1](./Im%C3%A1genes/imagen1.png)

## Hardware. Componentes funcionales

Los componentes físicos fundamentales de un ordenador son los siguientes:

- Unidad central de proceso UCP(CPU)
- Memoria central
- Unidades de entrada y salida
- Buses
- Unidades periféricas

Estas partes están interconectadas entre sí a trabes del bus del sistema.

![imagen2](./Im%C3%A1genes/imagen2.gif)

## Arquitectura de computadoras

La arquitectura de computadores describe el diseño conceptual y la estructura operacional del sistema.

Algunos de los factores que definen la arquitectura de la computadora son los siguientes:

- El conjunto de instrucciones:
    - CISC (Complex Instruction Set Computing): Hardware complejo y fácil de programar. → Intel
    - RISC (Reduced Instruction Set Computing): Hardware sencillo y difícil de programar. → AMD
- La forma de representar la información:
    - Little endian: representación de los números del más pequeño al más grande (LSB).
    - Big endian: representación de los números del más grande al más pequeño (MSB).
- El tamaño de instrucción: 32 bits, 64 bits u 86 bits (archivos de 32 bits adaptados a los 64 bits).
- La organización hardware: Von Neumann o Harvard.

## Arquitectura Hardware

La arquitectura actual vigente hoy día en la construcción de ordenadores fue ideada por Von Neumann en el siglo pasado, está basada en los siguientes componentes que se interrelacionan entre sí a través del Bus del sistema que actúa como canal de comunicación entre ellos.

![imagen3](./Im%C3%A1genes/imagen3.png)

ENIAC (1946) → Decimal utilizando Tarjetas perforadas

EDVAC (1951) → Binario utilizando programas en una memoria interna

Bug → Se le llaman bug a los errores porque se colaban polillas en las tuberías y rompían los sistemas.

## La unidad central de proceso

- La Unidad Central de Proceso (UCP o CPU), también denominada procesador, es el elemento encargado del control y ejecución de las operaciones que se efectúan dentro del ordenador con el fin de realizar el tratamiento automático de la información.
- El procesador es la parte fundamental del ordenador; se encarga de controlar todas las tareas y procesos que se realizan dentro de él.
- Está formado por la unidad de control (UC), la unidad aritmético-lógica (UAL) y su propia memoria interna integrada en él.
- El procesador es la parte que gobierna el ordenador; se encarga de todo: controla los dispositivos periféricos, la memoria, la información que se va a procesar, etc...
- Tiene una estructura basada en un circuito integrado denominado microprocesador, que puede cambiar y de hecho lo hace entre las diferentes marcas de ordenadores que existen en el mercado.
- Se trata de un dispositivo que interpreta una serie de instrucciones que están contenidas dentro de un programa, o bien, que se definen en las entradas e inician la ejecución del proceso de los datos.

## Funciones de la CPU

- **Ejecución de programas**. Se ocupa de que se aborden las instrucciones de los mismos para su arranque y puesta en funcionamiento.
- **Programación**. Se refiere a la coordinación de todas las funciones del sistema a través de una preparación de organigrama previo. Así, se evita la saturación del sistema y se controla lo que este puede soportar en todo momento a nivel de disco y memoria.
- **Comunicación con todas las unidades de entrada-salida**. Se realiza el acuerdo entre cada una de las unidades, de manera que los periféricos puedan responder sin que se produzca un colapso entre ellos y por lo general de manera inmediata.
- **Almacenamiento primario**. Esto equivale a una buena gestión de la memoria, de manera que se controla con los programas tengan el espacio necesario para que puedan funcionar correctamente, asignándoselo a cada cual que precise en función de sus características y del uso que se les esté dando en cada momento.

## Características de la CPU

- Frecuencia de reloj: o velocidad de calculo Se mide en Hercios e indica el numero de ciclos por segundo, es decir, el máximo de operaciones por segundo que puede procesar.
- Instrucciones por segundo: es otra forma de medir el rendimiento del pc y normalmente se utiliza la escala de los MIPS (millones de instrucciones por segundo).
- Numero de núcleos: un núcleo es una porción de CPU que funciona como una unidad de procesamiento independiente. Los procesadores con varios núcleos pueden realizar varias tareas de forma simultanea.
- Arquitectura 32/64 bits: hace referencia al tamaño de las instrucciones con las que trabaja el microprocesador. Va a determinar el tamaño de las direcciones de memoria, el ancho de los registros de los buses de datos.

## Unidad de control

- La UC es la parte pensante del ordenador; es como el director de una orquesta, ya que se encarga del gobierno y funcionamiento del ordenador.
- La tarea fundamental de la UC es recibir información para interpretarla y procesarla después mediante las órdenes que envía a los otros componentes del ordenador.
- Se encarga de traer a la memoria interna o central del ordenador (memoria RAM) las instrucciones necesarias para la ejecución de los programas y el procesamiento de los datos. Estas instrucciones y datos se extraen, normalmente de los soportes de almacenamiento externo. Además, la UC interpreta y ejecuta las instrucciones en el orden adecuado para que cada una de ellas se procese en el debido instante y de forma correcta.

## Funcionamiento de la UC

![imagen4](./Im%C3%A1genes/imagen4.png)

## Componentes de la UC

- **Registro de instrucción**. Contiene la instrucción que se esta ejecutando. Consta de diferentes campos:
    - CO: Código de la operación que se va a realizar.
    - MD: Modo de direccionamiento de la memoria para acceder a la información que se va a procesar.
    - CDE: Campo de dirección efectiva de la información.
- **Registro de contador de programa**. Contiene la dirección de memoria de la siguiente  instrucción a ejecutar.
- **Decodificador**. Controla el flujo de instrucciones de la CPU e interpreta la instrucción para su posterior procesamiento. Se encarga de extraer el código de la operación de la instrucción en curso.
- **Secuenciador**. Genera las micro ordenes necesarias para ejecutar la instrucción.
- **Reloj**. Proporciona una sucesión de impulsos eléctricos a intervalos constantes.

## ALU (Unidad Aritmético Lógica)

- Las computadoras más modernas, que incluyen procesadores de múltiples núcleos, incorporan a su vez múltiples dispositivos ALU.
    
    ![imagen5](./Im%C3%A1genes/imagen5.png)
    
- La UAL es la parte de la CPU encargada de realizar las operaciones de tipo aritmético (suma, multiplicación, etc.) así como las de tipo lógico (comparación).
- Los elementos que componen la ALU son:
    - Circuito operacional. Realiza las operaciones con los datos de los registros de entrada.
    - Registros de entrada. Contienen los operandos de la operación.
    - Registro acumulador. Almacena los resultados de las operaciones.
    - Registro de estado. Registra las condiciones de la operación anterior mediante flags.

## Ejecución de una instrucción

1. La CPU extrae de memoria la siguiente instrucción a ejecutar, y la almacena en el registro de instrucción. La posición de memoria en la que se encuentra esta instrucción la almacena el registro contador de programa.
2. Se cambia el registro contador de programa con la dirección de memoria de la siguiente instrucción a ejecutar.
3. Se analiza el código de operación (CO) de la instrucción, que está contenido en el registro de instrucciones.
4. A continuación, se determina a qué datos de memoria hay que acceder, y cómo hay que hacerlo. Para ello se analiza el modo de direccionamiento (MD) de memoria para acceder a la información que se va a procesar, así como el campo de dirección efectiva (CDE) de la información.
5. Se extraen los datos, si los hay, de la posición de memoria especificada por el campo de dirección efectiva, y se cargan en los registros necesarios de la CPU para ser procesados.

## La memoria

- Existen una gran cantidad de memorias distintas. Antes de empezar a hablar de la memoria central, vamos a ver algunas clasificaciones que se pueden realizar con la memoria.
- Según la persistencia de la información, podemos hablar de:
    - Memorias volátiles: representan un medio de almacenamiento temporal, que almacenan la información mientras el ordenador esta encendido, ya que estas memorias necesitan un refresco continuo, es decir, la información se pierde en el momento en que se apaga el ordenador.
    - Memorias no volátiles o permanentes: nos permiten almacenar información, datos y programas de forma indefinida. Al contrario de lo que ocurre con las memorias volátiles, estas memorias no se borran cuando apagamos el ordenador.
- Según las propiedades de lectura/escritura:
    - Memorias de acceso aleatorio (RAM)
    - Memorias de solo lectura (ROM)
    - Memorias de lectura preferente (PROM, EPROM)

## Memoria externa o secundaria

- Reciben este nombre los soportes de almacenamiento masivo, ya que son capaces de almacenar gran cantidad de información de manera permanente.
- Son soportes de lectura escritura y no volátiles. Algunos ejemplos de memoria externa son: discos duros, disquetes, cintas DAT, DVD, etc.
- Este tipo de memoria es más lenta que la propia memoria principal, ya que está formada por componentes electrónicos de baja velocidad y componentes mecánicos.
- Es memoria no volátil, lo que significa que la información permanece en ella, incluso después de interrumpir el suministro de energía eléctrica al ordenador.

## Memoria interna

- La memoria interna esta situada físicamente dentro de la carcasa del ordenador, y conectada directamente a la placa base mediante buses de alta velocidad.
- Existen dos tipos principales de memoria interna:
    - RAM (Memoria de acceso aleatorio). En ella es posible almacenar y modificar información, y es lo que se conoce como memoria principal o central. Es una memoria volátil y de lectura/escritura. Casi todo lo que se tiene que procesar dentro del ordenador, debe pasar tarde o temprano por la memoria central.
    - ROM ( Memoria de solo lectura). Contiene información que no se puede modificar y que sirve, básicamente, para poder inicializar el sistema informático. Es una memoria`…`

## Memoria central

- La memoria interna, principal o central (MC) es la que está situada físicamente dentro de la carcasa del ordenador, y conectada directamente a la placa base mediante buses de alta velocidad. También es conocida como memoria RAM y es un componente necesario para que se pueda procesar la información. Casi todo lo que se tiene que procesar dentro del ordenador, debe pasar tarde o temprano por la memoria central.
- Existen dos tipos principales de memoria interna:
    - RAM (Random Access Memory , Memoria de acceso aleatorio). En ella es posible almacenar y modificar información, y es lo que se conoce como memoria principal o central. Es una memoria volátil y de lectura/escritura
    - ROM (Read Only Memory , Memoria de sólo lectura). Contiene información que no se puede modificar y que sirve, básicamente, para poder inicializar el sistema informático. Es una memoria no volátil y de solo lectura.

## Memoria RAM

- La memoria RAM almacena físicamente los programas y los datos que se tienen que procesar.
- Desde el punto de vista físico, los componentes electrónicos por los que esta formada la MC se denominan celdas o biestables, que actúan como pequeños condensadores de forma que la presencia de energía dentro de ellas puede traducirse como un uno (1) lógico, y la ausencia de energía como un cero (0) lógico.
- La información almacenada en la memoria se suele referenciar por bloques (palabras, son la unidad mínima de información que se puede direccionar). Así un ordenador que trabaje con bloques de 8 celdas (palabra de 8 bits), grabará o leerá de la memoria cada vez 8 bits. Así, si queremos grabar en la memoria una letra A, en realidad grabaremos 8 bits (01000001).

## Fases de una instrucción

## Fase de búsqueda de una instrucción

Es esta fase se realiza la búsqueda en memoria de la instrucción cuya dirección guarda el registro contador de programa y se almacena en el registro de instrucción.

El contenido del contador de programa se incrementa de manera que almacena la dirección de la siguiente instrucción en secuencia.

1. La unidad de control envía una micro orden para que el contenido del registro contador de programa, que contiene la dirección de la siguiente instrucción, sea transferido al registro de dirección de memoria.
    
    ![imagen6](./Im%C3%A1genes/imagen6.png)
    
2. La posición de memoria que figura en el registro de dirección de memoria es utilizada por el selector para transferir su contenido al registro de intercambio de memoria.
    
    ![imagen7](./Im%C3%A1genes/imagen7.png)
    
3. Se transfiere la instrucción desde el registro de intercambio de memoria al registro de instrucción.
    
    ![imagen8](./Im%C3%A1genes/imagen8.png)
    
4. Posteriormente el decodificador procede a interpretar la instrucción que acaba de llegar al registro de instrucción, en este caso SUMAR, quedando dispuesto para la activación del circuito sumador de la UAL e informando al secuenciador.
    
    ![imagen9](./Im%C3%A1genes/imagen9.png)
    
5. El registro contador de programa se autoincrementa con un valor 1 de tal forma que quede apuntado a la siguiente instrucción situada consecutivamente en memoria. Si la instrucción en ejecución es de ruptura de secuencia, el contador de programa se cargara con la dirección que corresponda.
    
    ![imagen10](./Im%C3%A1genes/imagen10.png)
    

## Fase de ejecución de una instrucción

En esta fase se realiza la operación indicada por la instrucción y si esta lo procesa se almacena el resultado en los registros internos de la CPU o en la memoria.

La fase de ejecución se realiza en los siguientes pasos, pero hay que tener en cuenta que si la instrucción no tuviese operandos, los pasos del 1 al 6 y el paso 8 se omitirían.

1. Se transfiere la dirección del primer operando desde el registro de instrucción al registro de dirección de memoria.
    
    ![imagen11](./Im%C3%A1genes/imagen11.png)
    
2. El selector extrae de la memoria dicho dato depositándolo en el registro de intercambio de memoria.
    
    ![imagen12](./Im%C3%A1genes/imagen12.png)
    
3. Se lleva este operando desde este registro al registro de entrada 1 de la UAL.
    
    ![imagen13](./Im%C3%A1genes/imagen13.png)
    
4. Se transmite la dirección del segundo operando desde el registro de de instrucción al registro de memoria.
    
    ![imagen14](./Im%C3%A1genes/imagen14.png)
    
5. El selector extrae de la memoria dicho dato y lo deposita en el registro de intercambio de memoria.
    
    ![imagen15](./Im%C3%A1genes/imagen15.png)
    
6. Se lleva este operando desde este registro al registro de entrada 2 de la UAL.
    
    ![imagen16](./Im%C3%A1genes/imagen16.png)
    
7. El secuenciador envía una micro orden a la UAL para que se ejecuta la operación. El resultado de la operación queda almacenado en el acumulador.
    
    ![imagen17](./Im%C3%A1genes/imagen17.png)
    
8. Este resultado se envía desde el acumulador al registro de intercambio de memoria.
    
    ![imagen18](./Im%C3%A1genes/imagen18.png)
    
9. Se transfiere desde el registro de instrucción al registro de dirección de memoria la dirección donde ha de almacenarse el resultado en la memoria.
    
    ![imagen19](./Im%C3%A1genes/imagen19.png)
    
10. Se transfiere el resultado desde el registro de intercambio de memoria a la dirección de memoria indicada en el registro de dirección de memoria.
    
    ![imagen20](./Im%C3%A1genes/imagen20.png)
    

## Direccionamiento de memoria

- Cada celda está definida por su dirección de memoria.
- El conjunto de 8 bits a los que se accede se denomina byte, octeto o carácter. A partir de aquí, la información se medirá como conjunto de bytes; es decir, como bloques de 8 bits.
- Cuando se dice que un ordenador es de 8, 16, 32 o 64 bits, nos estamos refiriendo al tamaño de los registros de la CPU, y el tamaño de estos registros nos indica el tamaño de la palabra de ese ordenador.
- El direccionamiento es una operación que se realiza cuando el procesador ejecuta o interpreta una instrucción.

## Tipos de direccionamientos

1. Inmediato → La información va directamente a los registro de entrada de la ALU.
2. Directo → La información tiene que buscar la información de memoria.
3. Indirecto → Tiene una dirección que apunta a otra dirección con el dato almacenado.
4. Relativo → Guarda una dirección y un número constante guardado en un registro para posteriormente sumarse y acceder a los datos.
    
    ![imagen21](./Im%C3%A1genes/imagen21.png)
    

## Tipos de memoria RAM

- Existen 2 tipos básicos de memoria RAM: RAM dinámica (DRAM) y RAM estática (SRAM), ambas utilizan diferentes tecnologías para almacenar los datos. La RAM dinámica (DRAM) necesita ser refrescada 100 veces por segundo mientras que la RAM estática (SRAM) no necesita ser refrescada tan frecuentemente lo que la hace mas rápida pero también mas cara que la memoria RAM dinámica.
- SRAM: memoria estática constituida a base de biestables, son muy rápidas y mas caras y se utilizan como memoria cache. RAM estática. Cada bit de datos en 6 transistores de efecto campo (MOSFET). Velocidad, capacidad reducida. Empleados en cachés y buffers. Velocidad y consumo bajo. No tiene tanto consumo y tiene circuitería adicional. Disponen de un circuito de actualización constante que requiere menos consumo. Son adecuados para portátiles. El diseño más simple hace más fácil la interfaz con memoria y la programación.
- DRAM: memorias dinámicas, tiene necesidad de ser refrescadas (reescribir el dato) continuamente. RAM dinámica. Cada bit tiene un transistor y condensador asociados. El condensador pierde constantemente electricidad y requiere que el controlador de memoria tenga que “refrescar” la memoria. Al necesitar menos elementos por bit, los chips son más densos y en consecuencia más baratos.

## La memoria RAM

La memoria RAM almacena físicamente los programas y los datos que se tienen que procesar.

Desde el punto de vista físico, los componentes electrónicos por los que esta formada la MC se denominan celdas o biestables, que actúan como pequeños condensadores de forma que la presencia de energía dentro de ellas puede traducirse como un uno (1) lógico, y lo ausencia de energía como un cero (0) lógico.

La información almacenada en la memoria se suele referenciar por bloques (*palabras*). Así un ordenador que trabaje con bloques de  celdas (palabra de 8 bits), grabara o leerá de la memoria cada vez 8 bits

Biestables: circuito que tiene dos estados estables y puede almacenar energía. Puede ser síncrono y asíncrono.

Transistor: dispositivo que regula el flujo de corriente o de tensión sobre un circuito, actuando como interruptor o amplificador.

MOSFET (Metal Oxide Semiconductor Field Effect Transistor): Es un tipo de transistor que regula la tensión de salida a partir de la tensión de entrada. Regulan la señal de salida en voltaje. En los ordenadores los transistores permiten regular el voltaje que reciben los componentes conectados: CPUs, tarjetas, fuentes de alimentación, placas base... Suelen estar debajo de un disipador, para evacuar el calor.

## Memorias DDR SDRAM

- DDR conocida como SDRAM (Synchronous Dram) es un tipo de memoria RAM, dinámica que es casi un 20% más rápida que la RAM EDO. Esta memoria entrelaza dos o más matrices de memoria interna de manera que mientras se accede a una matriz, la próxima se está preparando para acceder, dicha memoria permite leer y escribir datos a 2 veces la velocidad de la luz.
- DDR2 son unas mejoras de la memoria DDR que permite que los búferes de entrada salida funcionan al doble de la frecuencia del núcleo, permitiendo que durante cada ciclo de reloj se realizan 4 transferencias.
- DDR3 puede ser 2 veces más rápida que la memoria DRR2, la DDR3 teóricamente podía transferir datos a una tasa de reloj efectiva de 800 2600 MHZ, comparado con el rango de DDR2 de 400 1200MHZ o 200 533MHZ del DDR2.
- DDR4 es la evolución del estándar DDR3 y, por tanto, los módulos de memoria compatibles con esta tecnología son capaces de trabajar a una frecuencia de reloj más alta. También consumen menos, permiten la fabricación de módulos con más capacidad, y tienen una tasa de operaciones de entrada y salida más alta que las memorias DDR3.

## Tipos de memoria DDR

| Nombre estándar | Frecuencia de reloj y bus | Velocidad de transferencia | Nombre del modulo | Capacidad de transferencia |
| --- | --- | --- | --- | --- |
| DDR-200 | 100MHz | 200MHz | PC-1600 | 1,6GB/s |
| DDR-266 | 133MHz | 266MHz | PC-2100 | 2,1GB/s |
| DDR-333 | 166MHz | 333MHz | PC-2700 | 2,7GB/s |
| DDR-400 | 200MHz | 400MHz | PC-3200 | 3,2GB/s |

## Características de las memorias

Ciclo de reloj o velocidad de bus: marca la pauta para realizar una operación se mide en MHz.

- Velocidad efectiva o MHz efectivos: los ciclos de reloj que marcan los tiempos, se dividen en flancos de subida y de bajada, existen memorias que utilizan cada flanco para realizar una operación diferente, por lo que la velocidad se multiplica por dos.
- Ancho de banda: es el numero de palabras transferidas entre la CPU y la memoria principal por unidad de tiempo se mide en MB/s.
- Tiempo de acceso: representa el tiempo máximo que se tarda en leer una posición de memoria o escribir en ella.
- Latencia CAS: tiempo transcurrido desde que se solicita un dato hasta que el primer bit de este es transferido. Viene expresada por 4 números (CAS-RAS-PRECHARGE-ACTIVE)=(columna, fila, desactivación, activación).

Frecuencia: numero de repeticiones por unidad de tiempo de cualquier evento periódico.

Periodo: duración en tiempo de ese evento repetitivo.

$$
f=1/T
$$

$$
T=1/f
$$

## Memorias de solo lectura

- En contrapartida de la memoria RAM existe la memoria ROM es la memoria no volátil ya que la información contenida en ella no es borrable al apagar el ordenador ni con el corte de la energía eléctrica.
- Son baratas y se usan sobre todo para el firmware del dispositivo. Se basan en tecnología MOS.
- Tipos de memoria ROM:
    - PROM: programables por el usuario una sola vez.
    - EPROM: memorias de solo lectura que pueden borrarse y volverse a escribir, el borrado se realiza con luz ultravioleta.
    - EEPROM: memorias de solo lectura que pueden ser escritas y borradas electrónicamente.

## Memoria cache

- Una memoria cache es una parte de memoria RAM estática de alta velocidad (SRAM) que mejora el rendimiento del PC precargando información de la memoria principal (relativamente lenta) y pasándola al procesador bajo demanda.
- La mayoría de los CPU’s tienen una memoria cache interna (integrada en el procesador) que se conoce como Nivel 1 (L1) o memoria cache primaria. Esto puede complementarse con memoria cache externa instalada en la placa base. Este es el Nivel 2 (L2) o cache secundario.

## Jerarquía de las memorias

![imagen22](./Im%C3%A1genes/imagen22.jpg)

## Otras memorias

- Otro tipo de memoria interna es la que incorporan las tarjetas graficas, para liberar la memoria RAM de las tareas de procesamiento grafico.

- En la actualidad la mayoría de los ordenadores incorporan en la propia tarjeta o adaptador grafico un tipo de memoria especializado denominado SGDRAM (Synchronous Graphics Dynamic RAM) que se caracteriza por su alta velocidad y bajo consumo.

![imagen23](./Im%C3%A1genes/imagen23.png)

## Unidad de entrada/salida. Buses

- La unidad de entrada y salida comunica el procesador con el resto de componentes internos del ordenador, con los periféricos de entrada y salida y con los dispositivos de almacenamiento externo.
- Entre los elementos básicos que definen la estructura de un ordenador hay que incluir además de la memoria, la unidad de control, los periféricos, etc., los elementos de comunicación entre todos estos dispositivos. El elemento más habitual de comunicación en los ordenadores el Bus es el elemento de comunicación entre los diferentes componentes del ordenador.
- Físicamente su descripción es: conjunto de hilos físicos utilizados para la transmisión de datos entre los componentes de un sistema informático. Por ejemplo, un bus es el cable que une el disco duro con la placa base.
- Un bus está compuesto por conductos, o vías, que permiten la interconexión de los diferentes componentes, principalmente, entre la CPU y la memoria.

## Tipos de buses

Los buses principales son:

- Bus de datos: transmite information (datos) entre la CPU y los periféricos.
- Bus de direcciones: identifica el dispositivo al que va destinada la información que se transmite por el bus de datos.
- Bus de control o del sistema: organiza y redirige la información hacia el bus pertinente según la información que se desea transmitir.

## Cables de Bus

El bus se caracteriza por el número y la disposición de sus líneas (cada una de ellas es capaz de transmitir un bit, que es la unidad mínima de transmisión de la información). En los primeros PC el bus era de 8 bits; es decir, solamente tenía ocho líneas de datos. En la actualidad, los buses que se utilizan pueden ser de 16, 32, 64, 128 o más bits.

$2^n$

## Velocidad del bus

La frecuencia o velocidad del bus queda determinada por los impulsos de reloj. Por tanto, el reloj es el componente que determina la velocidad, ya que a mayor frecuencia en MHz, más rápida es la circulación de bits por las líneas del bus.

Esta velocidad se mide en megahercios, y de ello depende el rendimiento global del equipo.

El tipo de bus y su velocidad dependen, en primer lugar, del fabricante y, en segundo lugar, del procesador que lo gestione.

La frecuencia del microprocesador es importante, pero también lo es la de los buses porque desempeñan un papel importante en las prestaciones del ordenador.

## Unidades de frecuencia

| Unidad | Siglas | Medida |
| --- | --- | --- |
| 1 Hertz | 1Hz | 1 operación/segundo |
| 1 Kilo Hertz | 1KHz | 1000 op/s → 1000Hz |
| 1 Mega Hertz | 1MHz | 1000000 op/s → 1000KHz |
| 1 Giga Hertz | 1GHz | 1000000000 op/s → 1000MHz |
| 1 Tera Hertz | 1THz | 1000000000000 op/s → 1000GHz |

## Periféricos de E/S

- Los periféricos de entrada y salida son dispositivos hardware con los cuales el usuario puede interactuar con el ordenador, almacenar o leer datos y programas, imprimir resultados, etc.
- Los periféricos se conectan con el ordenador y sus componentes a través de los denominados puertos o conectores externos. Esta gestión la realiza otra parte esencial del ordenador: la unidad de entrada y salida, que es el componente hardware utilizado para la gestión de periféricos.
- En los periféricos de entrada, la información circula por el bus datos desde el periférico a la memoria central.
- En los periféricos de salida, la información circula por el bus de datos desde la memoria central al periférico.
- En los periféricos de entrada y salida, la información circula por el bus de datos en ambos sentidos.
- Los periféricos de almacenamiento externo, denominados también memorias masivas o auxiliares, tratan de suplir las deficiencias de la memoria principal, que son: baja capacidad y el hecho de que sea una memoria volátil.

## Características de los periféricos de E/S

- Fiabilidad: es la probabilidad de que se produzca un error en la entrada y salida, y depende de la naturaleza del periférico, de las condiciones ambientales en que se conserva el mismo o de sus características.
- Tipo de acceso: se dice que un dispositivo es de acceso secuencial si para acceder a un dato determinado debemos acceder primero a todos los que le preceden físicamente (por ejemplo: las cintas magnéticas). En cambio, se dice que un dispositivo permite el acceso directo si es posible acceder a un dato de forma directa, es decir, sin necesidad de acceder primero a los datos que le preceden (por ejemplo: discos duros).
- Velocidad de transferencia: es la cantidad de información que el dispositivo puede leer o grabar, o bien enviar o recibir, por unidad de tiempo. La velocidad de transferencia se mide por ejemplo, en bits/segundo, caracteres/segundo, etc. Se le suele denominar “ancho de banda”.

---

## La placa base

![imagen24](./Im%C3%A1genes/imagen24.png)

## Formato de placa base

- **E-ATX**: es la placa base de forma más grande del que disponemos en el mercado. Sus dimensiones son de 305 x 330 mm. Estas placas disponen normalmente de abundantes huecos para tarjetas de expansión y muchas posibilidades en cuanto a instalación de tarjetas gráficas. Además, tendremos disponibles hasta 8 slots para la instalación de memoria RAM.
- **ATX**: estas placas llevan en el mercado desde 1995 gracias a su implementación por parte de Intel. También son las más comunes que podemos encontrar. Sus dimensiones son de 305 x 244 mm aunque también hay algunas con dimensiones ligeramente diferentes. Eso sí, los agujeros para su colocación en los chasis deben estar ubicados exactamente en los lugares estandarizados. Este tipo de placas bases son utilizadas para casi todos los tipos de sistemas, oficina, gaming, etc. Esto se debe a sus amplias posibilidades de expansión. Normalmente disponemos de 7 slots de expansión y 4 ranuras para la instalación de memorias RAM.
- **Micro ATX**: las placas base con este formato tienen unas dimensiones de 244 x 244 mm, por lo que son bastante más pequeñas que las anteriores, en torno a un 25%. Estas placas al ser de un formato más pequeño están orientadas a equipos de trabajo en oficina, los cuales no necesitan tantas ranuras de expansión y además ocupan chasis más pequeños. Entre sus posibilidades de expansión cuenta con un máximo de 5 slots de expansión, aunque lo normal son 3 y huecos de hasta 4 memorias RAM. Este tipo de placas necesitarán chasis compatibles con su fijación ya que la posición de los tornillos será distinta a las placas ATX.
- **Mini ITX**: este es el formato de placas más pequeño disponible para equipos domésticos. Consta de unas dimensiones de 170 x 170 mm. Para su fijación consta de cuatro taladros que coinciden con los instalados para una placa ATX. En estas placas podemos encontrar un solo slot de expansión destinado a la tarjeta gráfica y dos slots para memorias RAM.

![imagen25](./Im%C3%A1genes/imagen25.png)

## Placa base

- La placa base es la encargada de establecer un bus de comunicación entre esos componentes (CPU, RAM, tarjeta gráfica) y los periféricos instalados en ella (ratón, teclado, pantalla, etc.)

- En ella se instalan los elementos principales:
    - CPU
    - Memoria principal
    - Circuito integrado auxiliar (chipset)
    - Dispositivos E/S
    - Buses

![imagen26](./Im%C3%A1genes/imagen26.png)

## Chipset

- Chipset es el nombre que se le da al conjunto de chips (o circuitos integrados) utilizado en la placa madre y cuya función es realizar diversas funciones de hardware, como control de los Bus (PCI, AGP), control y acceso a la memoria, control de la interfaz I/O y USB, Timer, control de las señales de interrupción IRQ y DMA, entre otras.
- Es el Componente principal de la placa que condiciona las características del resto de componentes del equipo (CPU, memoria principal, discos duros, etc.)
- Dos elementos principales:
    - Northbridge: Chip de alta velocidad que controla la comunicación entre la CPU, memoria y la gráfica (AGP o PCIe).
    - Southbridge: Chip de baja velocidad que controla la comunicación con el resto de componentes (principalmente dispositivos de E/S).
- Cada vez se incluyen más componentes integrados en el chipset (audio, red, modem, . . . )
- Actualmente con la aparición de los procesadores de varios núcleos como los Intel Core y los AMD FX este chipset se ha visto significativamente reducido a un solo chip, desapareciendo así el puente sur.

![imagen27](./Im%C3%A1genes/imagen27.png)

## Zocalo de la CPU (Socket)

- Aquí es donde la CPU, o procesador, se conecta. Todos los ordenadores modernos tienen grandes dispositivos de refrigeración en la parte superior del procesador, que normalmente consiste en un bloque de metal con aletas y un ventilador. El zócalo está cuidadosamente diseñado para que el procesador solo quepa en el lugar adecuado.
- Tipos de socket:
    - **PGA** (ya obsoleto)
    - **ZIF** (Zero Insertion Force): Se trata de una evolución del PGA, donde los pines los lleva el microprocesador y se insertan en los conectores del zócalo.
    - **LGA** (Land Grid Array). Este zócalo sigue la filosofía del ZIF, pero en esta ocasión los pines se encuentran en la placa base en lugar de estar en el microprocesador, mientras que el microprocesador contiene huecos en su parte inferior donde éstos se insertarán. De esta manera se evita que se dañen los pines del microprocesador. Es el más actual de todos los zócalos.
    - **BGA** (Ball Grid Array): En este caso tenemos en lugar de pines existen unas bolitas cobre que se sueldan directamente a la placa base. Elimina cualquier posibilidad de ampliación o sustitución del microprocesador.

## Ranuras de la memoria RAM

- La mayoría de los equipos de escritorio tienen dos, cuatro u ocho ranuras para la memoria RAM. Más ranuras significa que se puede ajustar más RAM, hasta el máximo especificado en el manual de la placa base. En los portátiles, las ranuras de RAM suelen ser la única parte de la placa base que el usuario puede reemplazar.
- Los módulos RAM son largos y delgados. Las ranuras tienen un mecanismo a lo largo que corresponde a un hueco en el módulo RAM, por lo que el módulo solo se ajustará de la manera correcta. Este hueco también asegura que no se pueda instalar RAM incompatible en una placa, como un módulo DDR2 antiguo en una placa base DDR4 moderna.
- La memoria de acceso aleatorio, o RAM, por lo general se refiere a los chips de ordenador que almacenan temporalmente los datos dinámicos para mejorar el rendimiento del ordenador mientras está trabajando.
- Cuando un ordenador se apaga correctamente, todos los datos ubicados en la RAM se devuelven al almacenamiento permanente en el disco duro o unidad flash. En el siguiente arranque, la memoria RAM comienza a llenarse con programas cargados automáticamente al inicio, un proceso llamado arranque.
- La memoria RAM multiplica por 2(DDR1), 4(DDR2), 8(DDR3), 16(DDR4), 32(DDR5) la frecuencia.
- Existen tres tipos de módulos:
    - Módulos SIMM(Sigle In-line Memory Module)
    - Módulos DIMM(Double In-line Memory Module)
    - Módulos RIMM(Rambus In-line Memory Module)

- Los módulos para portátiles deben ser de menor tamaño:
    - SO-DIMM
    - SO-RIMM
    - Micro-DIMM

![imagen28](./Im%C3%A1genes/imagen28.png)

- Las ranuras de memoria DIMM (Dual In-line Memory Module) de 13,3 cm de largo son las más comunes de encontrar. Los módulos se introducen en ellas de manera perpendicular a la placa base.
- Existen los siguientes tipos de ranuras DIMM:
    - Ranura DIMM de 168 contactos, para memorias SDRAM.
    - Ranura DIMM de 184 contactos, para memorias DDR.
    - Ranura DIMM de 240 contactos, para memorias DDR2 o DDR3.
    - Ranura DIMM de 288 contactos, para memorias DDR4.
- A parte del número de contactos, las ranuras poseen un puente de plástico en la zona de contactos que se encuentra en posiciones diferentes en cada uno de los tipos de ranuras, y así evitar que nos confundamos al meter un tipo de memoria RAM en una ranura de memoria no compatible.

![imagen29](./Im%C3%A1genes/imagen29.webp)

![imagen30](./Im%C3%A1genes/imagen30.png)

## Ranuras de expansión: PCI Express y PCI

- Son las ranuras que tienen la funcionalidad de ampliar el hardware instalado en nuestro equipo. En ellas se podrán instalar tarjetas gráficas, discos duros, tarjetas de red, tarjetas de sonido, etc.

- Estos slots actualmente reciben el nombre de PCI-Express o PCI-E y son los sustitutos de los tradicionales PCI. Cada ranura de expansión PCI-E lleva 1, 2, 4, 8, 16 ó 32 enlaces de datos entre la placa base y las tarjetas conectadas. Este número de enlaces lo codificamos como un x de prefijo, por ejemplo, x1 para un enlace simple o unitario y x16 para una tarjeta con 16 enlaces, que son las utilizadas para las tarjetas gráficas. Cada uno de estos enlaces da una velocidad de 250 MB/s.

![imagen31](./Im%C3%A1genes/imagen31.gif)

## Conectores de almacenamiento

- Las unidades de discos duros pueden tener distintos tipos de conexión o interfaces de datos con la placa base. Cada unidad de disco rígido puede tener una de las siguientes opciones:
- **IDE**: Usados para conectar discos duros y dispositivos de almacenamiento óptico como los DVD. Suelen venir un máximo de 2 que permiten conectar has 4 dispositivos.
    
    ![imagen32](./Im%C3%A1genes/imagen32.png)
    

- **SATA**: Para conectar discos duros, lectores y grabadoras de DVD. Suelen venir por parejas, sí habrá 2,4, o 6 conectores, cada conector admite un solo dispositivo. SATA es el más común de los estándares de conexión, utiliza un bus serie para la transmisión de datos. Notablemente más rápido y eficiente que IDE. Físicamente es mucho más pequeño y cómodo que los IDE, además de permitir conexión en caliente (hot plug).

![imagen33](./Im%C3%A1genes/imagen33.png)

- **SCSI**: son interfaces preparadas para discos duros de gran capacidad de almacenamiento y velocidad de rotación. Un controlador SCSI puede manejar hasta 7 discos duros SCSI (o 7 periféricos SCSI). A diferencia de los discos IDE, pueden trabajar asincrónicamente con relación al microprocesador, lo que posibilita una mayor velocidad de transferencia.

![imagen34](./Im%C3%A1genes/imagen34.jpeg)

- **SAS**: es la interfaz de transferencia de datos en serie, sucesor del SCSI paralelo. Aumenta la velocidad y permite la conexión y desconexión rápidamente. el conector es el mismo que en la interfaz SATA. Por lo tanto, las unidades SATA pueden ser utilizadas por controladoras SAS pero no a la inversa, una controladora SATA no reconoce discos SAS.

## Puertos de red

- Es donde se conecta un cable Ethernet (red) para crear una conexión de red alámbrica, en lugar de inalámbrica, a un router doméstico o a la red de la oficina.
- Todas las placas base modernas tienen puertos Gigabit Ethernet, también llamados 10/100/1000, lo que significa que pueden transferir datos a 1.000 megabits por segundo (Mbit/s), o un máximo teórico de 125 megabytes por segundo (MB/s). Aunque en un futuro muy próximo las conexiones 10 Gigabit estarán incluidas en todas las placas bases.

![imagen35](./Im%C3%A1genes/imagen35.png)

## Puertos USB

- La mayoría de las placas base tienen conectores USB 2 y USB 3, y todos los dispositivos USB 2, USB 3 y USB 3.1 funcionarán cuando se conecten a cualquiera de los puertos; aunque es posible que funcionen un poco más despacio en el USB 2.
- Las placas base modernas ahora también vienen con USB-C de segunda generación. Con unas tasas de lectura muy mejoradas en cada actualización.

![imagen36](./Im%C3%A1genes/imagen36.jpeg)

## Conectores de alimentación

- La placa base se debe conectar a una fuente de alimentación y para ello cuenta con distintos tipos de conectores de alimentación.
- El ATX de 24 pines es el conector tradicional que alimenta la placa base en la mayoría de sus componentes. Está compuesto por 24 cables o pines y normalmente está situado en el lateral derecho de esta, junto a los slots de RAM.

![imagen37](./Im%C3%A1genes/imagen37.webp)

## Batería CMOS

- El CMOS también es un chip de computadora en la placa base, o más específicamente un chip RAM, lo que significa que normalmente perdería la configuración que está almacenando cuando se apaga la computadora. Sin embargo, la batería del CMOS se utiliza para proporcionar energía constante al chip.

- Cuando la computadora se inicia por primera vez, el BIOS extrae información del chip CMOS para comprender la configuración del hardware, la hora y cualquier otra característica importante que esté almacenada en el mismo.

![imagen38](./Im%C3%A1genes/imagen38.webp)

## La BIOS

- La BIOS o Basic Input-Output System es una memoria de tipo ROM, EPROM o Flash-RAM que contiene información sobre la configuración de la placa base al más bajo nivel.

- Dentro de la BIOS también hay un chip de memoria llamado CMOS, con el programa que almacena en su interior, es capaz de inicializar todos los componentes físicos de la placa para poder arrancar el equipo. Además, se encarga de chequearlos en busca de errores o ausencia de dispositivos, por ejemplo, falta de RAM, CPU o Disco duro.

![imagen39](./Im%C3%A1genes/imagen39.png)

- La memoria de la BIOS está continuamente alimentada mediante una pila. De esta forma cuando se apaga la máquina no se pierdan los datos y parámetros configurados en el ordenador. Si por algún caso esta pila se agota o nosotros la retiramos, la información de la BIOS se reinicia a los valores por defecto, pero nunca se pierden.
- Sus funciones son:
    - Ajustar los parámetros de configuración del microprocesador (voltaje, velocidad del bus...)
    - Identificar la memoria RAM y ajustar sus valores tales como latencia, velocidades, capacidad.
    - Comprueba que todos los elementos que deberían estar conectados lo están realmente y que no se han producido fallos.
    - Activa y configura dispositivos integrados: IDE, SATA, USB, etc.

## Otros conectores internos

- **Conector I/O frontal**: para los indicadores del panel frontal de la caja, como el botón de encendido, el botón de reiniciar, las luces que indican la actividad del disco duro o la alimentación del ordenador, los altavoces internos.
    
    ![imagen40](./Im%C3%A1genes/imagen40.png)
    
- **Puerto FDD**: para disquetera.
    
    ![imagen41](./Im%C3%A1genes/imagen41.png)
    
- **Conectores para ventilador(FAN)**
    
    ![imagen42](./Im%C3%A1genes/imagen42.png)
    
- **Conector ATX de 12V de 4 pines**: para conectar la alimentación desde la fuente de alimentación y dar corriente al procesador, suele estar situada al lado del procesador.
    
    ![imagen43](./Im%C3%A1genes/imagen43.png)
    
- **Conector ATX 12V 8 pines:** para dar energía a diferentes componentes de la placa base.
    
    ![imagen44](./Im%C3%A1genes/imagen44.png)
    

## Conectores externos

![imagen45](./Im%C3%A1genes/imagen45.png)

- **USB**: el Bus Serie Universal o USB es un tipo de interfaz que soporta dispositivos periféricos de baja velocidad, como teclados o ratones, y dispositivos de una velocidad mayor, como las cámaras digitales, impresoras, adaptadores de red, sintonizadores de TV, discos removibles, etc.
    - Proporciona al ordenador capacidades plug-and-play para los dispositivos externos.
    - El sistema operativo los reconoce automáticamente e instala los controladores, o bien solicita al usuario los controladores correspondientes.
    - Amplia variedad de dispositivos disponibles.
- **Puerto FIREWIRE**: el estándar IEEE 1394, o más conocido como FireWire, define las especificaciones para un bus serie de alta velocidad para dispositivos que realmente funcionan a alta velocidad, como las cámaras de vídeo digitales o las cámaras fotográficas digitales.
    - Comparte características con la interfaz USB, ambos son buses de alta velocidad, plug and-play e intercambiables en caliente.
    - Las versiones más recientes de IEEE 1394 que se están desarrollando ofrecerán velocidades desde 800 Mb/s (a 1,6 Gb/s).
    - Los conectores más utilizados por IEEE 1394 son los conectores 1394a-2000, denominados mini-DV, ya que se utilizan en cámaras de vídeo digital, y 1394a-1995, con un ancho de seis pines.
    
    ![imagen46](./Im%C3%A1genes/imagen46.png)
    

- **Puerto SERIE**: el puerto serie, también conocido como puerto COM, tiene su principal utilidad en las comunicaciones. Constan de nueve pines y tiene la particularidad de que trasmite los datos uno tras otro (en serie) por un mismo canal.

![imagen47](./Im%C3%A1genes/imagen47.png)

- **Puerto PARALELO**: el puerto paralelo ,conocido como LPT, también se utiliza para comunicaciones, tiene 25 pines y se creó para mejorar del puerto serie, ya que este puerto trasmite un grupo de datos deforma simultánea (en paralelo) por varios canales, ambos sustituidos principalmente por las conexiones USB para la conexión de periféricos.

![imagen48](./Im%C3%A1genes/imagen48.png)

- **Puerto MIDI**: también conocido como Puerto Joystick, la irrupción de la informática en el ámbito doméstico propició el uso de ordenadores personales para la creación y producción musical. De este modo, facilita cables que permiten la conexión MIDI a través de un puerto de tipo Joystick (15 pines), integrado normalmente en la propia tarjeta de sonido (depende del modelo).

![imagen49](./Im%C3%A1genes/imagen49.png)

## Memorias secundarias

- Son componentes usados por el PC para guardar grandes cantidades de almacenamiento.
- Características:
    - Su elevada capacidad de almacenamiento
    - No son volátiles
    - Menor velocidad de transferencia
    - Relación precio/byte es menor que en las memorias internas
- Tipos:
    - Memorias magnéticas
    - Memorias ópticas
    - Memorias sólidas

## Memorias secundarias magnéticas

- Utilizan un campo magnético para realizar la escritura/lectura de un dato.
- Tipos:
    - Memorias o discos magnéticos rígidos (discos duros, Hard Disk, HDD)
    - Memorias o discos flexibles (disquetes)
    - Memorias o discos magnético-ópticos
    - Cintas magnéticas

## Discos magnéticos rígidos

- Memorias de gran capacidad, imprescindibles hoy día. El uso de sistemas operativos cada vez más complejos, así como las aplicaciones multimedia hacen necesario un gran número de bits para almacenar toda la información.
- Partes de un disco duro:
    - Uno o varios discos o platos, divididos en caras, cilindros/pistas y sectores
    - Material de soporte magnético que cubre los platos con un coeficiente de rozamiento muy bajo y alta resistencia al calor
    - Cabezales de lectura/escritura (por cada plato dispone de 2 cabezales)
    - Motor y electroimán para mover el eje de rotación y el brazo en cuyo extremo está el cabezal de lectura/escritura
    - Circuito impreso o tarjeta controladora
    
    ![imagen50](./Im%C3%A1genes/imagen50.png)
    
- El HDD está compuesto por **platos**
- Cada plato tiene dos **caras**

- Cada cara está dividida en circunferencias concéntricas, que abarcan una zona de datos, a cada circunferencia se le denomina **pista**. La pista 0 es la que está más cerca del borde
- A las pistas situadas en la misma posición en vertical en todas las caras y platos se les llama **cilindros**
- Las pistas se dividen en partes, cada una de ellas de 512 bytes. A cada una de estas partes se les llama **sector**
- A la unión de varios sectores se les denomina **cluster**

![imagen51](./Im%C3%A1genes/imagen51.png)

## Características HDD

- **Capacidad de un disco duro**: indica la cantidad de información que puede almacenar, viene expresadas en potencias de 2. Hoy días las potencias más habituales se expresan en GB y TB.
- La capacidad de un disco duro puede calcularse conociendo el número de cilindros, sectores, cabezales y el número de bytes que supone un sector.
    
    $$
    Capacidad=Cilindros*Cabezales*sectores*(bytesPorSector~512)
    $$
    
- **Velocidad de transferencia interna**: mide la velocidad de lectura/escritura internamente, es decir lo rápido que se leen o escribe los datos en el plato.
- **Velocidad de transferencia externa**: velocidad a la que el disco se comunica con el resto de componentes, se le llama también memoria ráfaga.
- **Memoria Caché**: es la memoria de la unidad de HDD donde se almacenan los datos de forma temporal hasta que lo solicitan el interfaz o controlador del bus. Es como un buffer donde se almacena información hasta que pueda ser usado por el controlador.
- Siempre que un disco duro lee información deja parte almacenada en esta memoria de acceso rápido que es la caché. De esta forma, si es necesario volver a recuperar esos datos no hace falta que el cabezal vuelva a buscar la información en el disco (en un disco duro magnético), mejorando así la velocidad de respuesta.
- **Velocidad de giro**: velocidad a la que gira el eje que atraviesa los platos de un disco duro, se mide en revoluciones/minuto.
- **Latencia**: tiempo que se tarda desde que se realiza la petición de un dato, hasta que se localiza y empieza a ser trasmitido el primer bit.

## Tamaño HDD

- Hoy en día el tamaño más habitual para los discos duros de ordenadores de sobremesa es de 3,5 pulgadas, mientras que los discos duros para ordenadores portátiles suelen ser de 2,5 pulgadas. Los discos de estado sólido también se comercializan con el tamaño heredado de los discos duros magnéticos.
    - 3,5 pulgadas: 10,2 cm de alto x 14,6 cm de ancho x
    2,54 cm de grosor
    - 2,5 pulgadas: 69, 9 cm de alto x 10 cm de ancho x 1-1,5 cm de grosor
- Los discos de 2,5 pulgadas llevan reciben la alimentación a través del propio cable del interfaz. Los de 3,5 pulgadas son los que necesitan alimentación adicional a través de otro puerto.
    
    ![imagen52](./Im%C3%A1genes/imagen52.png)
    

## Interfaz

- El interfaz hace referencia al modo en que el disco duro se conecta al PC.
- **IDE** (Dispositivo electrónico integrado, o también ATA o PATA): la conexión IDE tiene 40 conectores y acepta hasta dos dispositivos conectados a la misma fuente. Sin embargo, es una tecnología desfasada que se ha quedado atrás tanto en velocidad como compatibilidad.
- **SATA** (Serial ATA): se trata del interfaz más común hoy en día para los discos duros internos. Existen ya varias versiones y las nuevas son compatibles con las anteriores. De esta forma un dispositivo SATA 1.0 será totalmente compatible con una conexión por cable SATA 3.0.
    - **SATA 1.0** ofrece velocidades de transferencia de hasta 150 MB/segundo pero hoy en día ya no se comercializa.
    - **SATA 2.0** permite velocidades de hasta 300 MB/segundo y seguramente sea el más popular actualmente.
    - **SATA 3.0** alcanza velocidades de transferencia de hasta 300 MB/segundo y permite conexión en caliente (conectarse o desconectarse del ordenador sin tener que apagarlo).
    - **Esata o eSATA** utiliza el propio cable para recibir la alimentación eléctrica, por lo que se utiliza para conectar discos duros externos a la placa base del ordenador. Es tan fácil usarlos como conectar el disco duro al equipo informático (como si de un USB se tratara) siempre que éste tenga un puerto Esata. Su velocidad de transferencia va desde los 300 MB hasta los 750 MB por segundo.
        
        ![imagen53](./Im%C3%A1genes/imagen53.png)
        

## Disco duros solidos (SSD)

- Un disco duro sólido o disco SSD es un sistema de almacenamiento que guarda los datos en chips. El disco sólido no tiene partes mecánicas en movimiento como los discos duros tradicionales. La capacidad de almacenamiento de un disco duro sólido llega actualmente hasta los 2TB y el precio por TB es mucho más alto que el de un disco duro mecánico. Podemos encontrar el disco sólido con conexiones SATA, mSATA, M.2 y alguna más.

- Las unidades de estado sólido o SSD (Solid State Drive) son una alternativa a los discos duros. La gran diferencia es que mientras los discos duros utilizan componentes mecánicos que se mueven, las SSD almacenan los archivos en microchips con memorias flash interconectadas entre sí. Por lo tanto, casi podríamos considerarlos como una evolución de las memorias USB.

![imagen54](./Im%C3%A1genes/imagen54.png)

- Los SSD suelen utilizar memorias flash basadas en NAND, que como también son no-volátiles mantienen la información almacenada cuando el disco se desconecta. No tienen cabezales físicos para grabar los datos, en su lugar incluyen un procesador integrado para realizar operaciones relacionadas con la lectura y escritura de datos.
- Estos discos suelen ser de 2,5", y tienen un diseño casi idéntico al de los discos duros mecánicos, lo que ayuda a que puedan encajar en las mismas carcasas y ranuras donde van montados los discos duros convencionales en un ordenador.

## Discos ópticos

- Son memorias secundarias que usan tecnología óptica para la lectura/escritura de la información. Estas tecnologías usan un láser de una determinada longitud de onda para la lectura/escritura.

- Un disco óptico es un medio de almacenamiento de datos, que consiste en un disco circular (CD) en el cual se codifica información, se guarda y se almacena haciendo unos surcos microscópicos con un láser sobre las caras planas del disco, es decir es un tipo de disco donde se puede almacenar películas, canciones, imágenes, datos numéricos etc.

![imagen55](./Im%C3%A1genes/imagen55.png)

- Clasificación de discos ópticos por su uso:
    - **Discos-Rom**: este disco es el que venden ya grabado y no se puede volver a grabar en él.
    - **Discos -R y +R**: este disco es el más vendido, se trata de un disco en blanco que solo se puede grabar una vez en él.
    - **Discos-RW, +RW y -Ram**: este tipo de disco se caracteriza en que se puede grabar, borrar y volver a grabar todas las veces que se desee.
- Clasificación de discos por capacidad de almacenaje:
    - **Disco compacto (CD):** este se diseñó para almacenar audio pero más adelante se adaptó a otros formatos, en el momento en que salió a la venta tenía más capacidad de almacenaje que un disco duro de esa época. El tamaño de enfoque de este disco es de 780 nm, lo que hace que tenga una capacidad máxima de 700 MB en un disco duro tamaño estándar.
    - **DVD:** similar al CD pero que puede albergar mayor cantidad de datos. Utiliza una longitud de onda de láser menor que las del CD. La capacidad de este disco es de:
        - Una cara de una capa (común) 4.7 GB
        - Una cara de doble capa 8 GB
        - Dos caras de una capa 9.4 GB
        - Dos caras de doble capa (muy poco común) 17 GB
    - **Blu-ray (BD):** formato físico similar al DVD. Utiliza una tecnología de láser azul que tiene una longitud de onda de 400 nm (capacidad de enfoque) . La capacidad este disco es de:
        - Una capa 25 GB
        - Doble capa 50 GB
        - BDXL 100 GB
    - **Discos de cuarta generación, disco versátil holográfico (HVD):** el tamaño de enfoque es complejo al ser este disco del tipo "disco óptico ultra-denso", la capacidad de este disco es de 3.9 TB y utiliza una técnica conocida como holografía colinear en la cual dos láseres, un rojo y otro verde-azul se combinan en un único haz.
    
    ![imagen56](./Im%C3%A1genes/imagen56.png)
    

## Cintas magnéticas

- La cinta magnética es un tipo de medio o soporte de almacenamiento de datos que se graba en pistas sobre una banda plástica con un material magnetizado, generalmente óxido de hierro o algún cromato. El tipo de información que se puede almacenar en las cintas magnéticas es variado, como vídeo, audio y datos.

- Hay diferentes tipos de cintas, tanto en sus medidas físicas (media pulgada, 8mm, 4mm, etc...), como en su constitución química, así como diferentes formatos de grabación, especializados en el tipo de información que se quiere grabar.
- Aún se sigue usando en las empresas para la realización de copias de seguridad.

![imagen57](./Im%C3%A1genes/imagen57.png)