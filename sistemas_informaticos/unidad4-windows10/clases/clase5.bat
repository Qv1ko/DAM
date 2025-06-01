@ECHO OFF

:menu
CLS
ECHO Selecciona una opcion
ECHO.
ECHO 1. Primera opcion
ECHO 2. Segunda opcion
ECHO 3. Salir
SET /P var=Introduce:
IF %var%==1 GOTO :primero
IF %var%==2 GOTO :segundo
IF %var%==3 GOTO :exit
IF %var% GTR 3 ECHO Error
GOTO :menu

:primero
ECHO Has seleccionado la primera opcion
ECHO Presione cualquier tecla para salir del programa...
PAUSE>nul
GOTO :menu

:segundo
ECHO Has seleccionado la segunda opcion
ECHO Presione cualquier tecla para salir del programa...
PAUSE>nul
GOTO :menu

:exit
ECHO Presione cualquier tecla para salir del programa...
PAUSE>nul
EXIT