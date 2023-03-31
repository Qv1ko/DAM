@ECHO OFF
CLS
SET num=1

:loop
IF %num% LEQ 10 GOTO :continue ELSE GOTO :exit

:exit
ECHO Pulse una tecla para salir
PAUSE>nul
EXIT

:continue
ECHO %num%
SET /A num=%num%+1
GOTO :loop