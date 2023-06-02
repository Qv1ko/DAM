@ECHO OFF

rem Condicion si existe el primer parametro introducido
IF EXIST %USERPROFILE%\Desktop\%1 (
	CD %USERPROFILE%\Desktop\%1
	MKDIR ..\..\nivel2up
) ELSE (
	ECHO El directorio no existe
)
ECHO Pulse una tecla para salir...
PAUSE > nul
