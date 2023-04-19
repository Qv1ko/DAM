@ECHO OFF

rem Condicion si es mayor que 0 va a color
IF %1 GEQ 0 GOTO color

:error
ECHO Numero no valido
GOTO salida

:color
rem Condicion si es menos que 9 cambia de color
IF %1 GTR 9 GOTO error
COLOR %1

:salida
ECHO Pulsa una tecla para salir...
PAUSE > nul