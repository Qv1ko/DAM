@ECHO OFF

rem Condicion si el parametro no existe va a error
IF NOT EXIST %1 GOTO error
IF NOT EXIST %2 GOTO error

:copia
rem Copia el archivo del primer parametro en el segundo
COPY %1 %2
ECHO La copia se ha realizado con exito.
rem Goto para saltarse el echo de error
GOTO salida

:error
ECHO La copia ha fallado.

:salida
ECHO Pulse una tecla para salir...
PAUSE > nul
