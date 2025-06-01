@ECHO OFF

rem Bucle que itera por cada unidad si esta es de tipo USB, escapando la primera linea del comando
FOR /F "SKIP=1" %%i IN ('wmic logicaldisk WHERE "drivetype=2" get name') DO (
	rem Redirecciona al archivo del USB todos los archivos ocultos y del sistema en orden alfabetico que esten en la ruta actual
	DIR . /A:HS /O:N > "%%i\Work\ADHome.txt"
)
ECHO Pulse una tecla para salir...
PAUSE > nul

rem ---

rem Condicion si no existe el almacenamiento E muestra por pantalla un mensaje de error y va a la salida
IF NOT EXIST E:\ GOTO noexiste
rem Crea el directorio
MKDIR E:\Work
rem Redirecciona al archivo de dentro del directorio todos los archivos ocultos y del sistema en orden alfabetico que esten en la ruta actual
DIR . /A:HS /O:N > E:\Work\ADHome.txt
GOTO fin

:noexiste
ECHO no existe la memoria

:fin
ECHO Pulsa una tecla para salir...
PAUSE > nul
