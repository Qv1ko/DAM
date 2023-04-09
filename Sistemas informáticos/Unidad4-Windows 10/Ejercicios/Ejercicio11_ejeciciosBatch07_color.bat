@ECHO OFF

IF %1 GEQ 0 GOTO :color

:error
ECHO Numero no valido
GOTO :salida

:color
IF %1 GTR 9 GOTO :error
COLOR %1

:salida
PAUSE