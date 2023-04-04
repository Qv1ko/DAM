@ECHO OFF

IF %1 GEQ 0 GOTO :color

:error
ECHO Numero no valido
PAUSE
EXIT

:color
IF %1 GTR 9 GOTO :error
COLOR %1
PAUSE