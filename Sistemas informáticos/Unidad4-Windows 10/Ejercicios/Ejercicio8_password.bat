@ECHO OFF
CLS
SET password=qwerty123

:inicio
SET /P inputpass=Introduzca la password: 
IF %password%==%inputpass% GOTO truepass ELSE GOTO falsepass

:truepass
ECHO Password correcta
PAUSE
EXIT

:falsepass
ECHO Password incorrecta
PAUSE
GOTO inicio