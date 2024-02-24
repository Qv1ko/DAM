@ECHO OFF

rem Condicion si existe se realizara la copia
IF EXIST %1 GOTO copia

:error
ECHO El archivo no existe.
rem Se dirige al apartado de salida para finalizar el programa despues de imprimir el mensaje de error
GOTO salida

:copia
rem Crea la carpeta PruebaCopia en el directorio actual
MKDIR PruebaCopia
rem Copia el archivo del parametro uno en la carpeta creada
COPY %1 PruebaCopia

:salida
ECHO Pulsa una tecla para salir...
PAUSE > nul
