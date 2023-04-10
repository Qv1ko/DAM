@ECHO OFF

CLS
MKDIR "%USERPROFILE%\Desktop\EJ10bat"

IF EXIST "%USERPROFILE%\Desktop\EJ10bat\recursos.txt" GOTO :existe

:noexiste
ECHO Creado listado de recursos.
GOTO :fin

:existe
ECHO Añadiendo informacion al fichero.
GOTO :fin

:fin
DIR "%USERPROFILE%\Desktop" >> "%USERPROFILE%\Desktop\EJ10bat\recursos.txt"
CD "%USERPROFILE%\Desktop"
TYPE EJ10bat\recursos.txt
PAUSE