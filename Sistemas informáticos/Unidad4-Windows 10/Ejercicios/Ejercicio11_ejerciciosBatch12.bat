@ECHO OFF

FOR %%i IN (%*) DO (
    ECHO Parametro = %%i
)
ECHO Pulse una tecla para salir...
PAUSE > nul
