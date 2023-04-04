@ECHO OFF
CLS
MKDIR "%USERPROFILE%\Desktop\EJ10bat"

IF EXIST "%USERPROFILE%\Desktop\EJ10bat\recursos.txt" GOTO :existe ELSE :noexiste

:noexiste
ECHO Creado listado de recursos.
GOTO :nextpoint

:existe
ECHO Añadiendo informacion al fichero.
GOTO :nextpoint

:nextpoint
DIR "%USERPROFILE%\Desktop" >> "%USERPROFILE%\Desktop\EJ10bat\recursos.txt"
CD "%USERPROFILE%\Desktop"
TYPE EJ10bat\recursos.txt
PAUSE