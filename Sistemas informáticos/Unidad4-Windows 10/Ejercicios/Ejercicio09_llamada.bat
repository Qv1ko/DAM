@ECHO OFF
CLS
rem SET passwordBat="C:\Users\Usuario\DAM\Sistemas informáticos\Unidad4-Windows 10\Ejercicios\Ejercicio8_password.bat"
CALL C:\Users\Usuario\Desktop\carpetaPrueba\Ejercicio8_password.bat
SET /P file=Introduce la ruta: 
IF EXIST %file%  GOTO exist ELSE GOTO notExist

:notExist
ECHO La ruta %file% no existe
GOTO :pause

:exist
ECHO La ruta %file% existe
GOTO :pause

:pause
ECHO Pulse una tecla para salir
PAUSE>nul