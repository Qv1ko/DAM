@ECHO OFF

CLS
GOTO :loop

:error
ECHO Tecla incorrecta

:loop
ECHO Pulse la tecla x
CHOICE /C x > nul
IF errorlevel 2 GOTO :error
