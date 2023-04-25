@ECHO OFF

rem Muestra todos los archivos con la extension pasada como parametro 1
DIR *.%1
ECHO Pulsa una tecla para continuar...
PAUSE > nul
rem Guarda en una variable la ruta de destino
SET /P destino=Introduce el destino: 
rem Condicion si el destino existe va a copia
IF EXIST %destino% GOTO copia

:error
ECHO El directorio no existe.
GOTO salida

:copia
rem Copia todos los archivos con la extension pasada como parametro al destino
COPY *.%1 %destino%

:salida
ECHO Pulsa una tecla para salir...
PAUSE > nul
