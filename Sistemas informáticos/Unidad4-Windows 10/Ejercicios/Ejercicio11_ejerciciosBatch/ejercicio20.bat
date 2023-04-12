@ECHO OFF

IF NOT EXIST %1 GOTO :error
MKDIR %1\..\..\nivel2up
GOTO :salida

:error
ECHO El directorio no existe

:salida
ECHO Pulse una tecla para salir...
PAUSE > nul