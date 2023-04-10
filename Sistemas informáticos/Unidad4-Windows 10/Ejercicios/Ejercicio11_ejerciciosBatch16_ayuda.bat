@ECHO OFF

IF NOT %1=="" GOTO :ayuda
ECHO ! Error | Formato -> ayuda comando

:ayuda
%1 /?
ECHO Pulse una tecla para salir...
PAUSE > nul
