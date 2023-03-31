@ECHO OFF
CLS
SET password=qwerty123

:inicio
SET /p inputpass=Introduzca la password: 
IF "%password%"=="%inputpass%" GOTO truepass ELSE GOTO falsepass

:falsepass
ECHO Password incorrecta
ECHO Pulse una tecla para continuar
PAUSE>nul
GOTO inicio

:truepass
ECHO Password correcta
ECHO Pulse una tecla para salir
PAUSE>nul
EXIT