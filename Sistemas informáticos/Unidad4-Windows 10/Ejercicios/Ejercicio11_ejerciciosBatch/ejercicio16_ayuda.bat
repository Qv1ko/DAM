@ECHO OFF

rem Condicion si el primer parametro introducido es vacio muestra un mensaje de uso, si no muestra la ayuda del parametro
IF "%1"=="" (
	ECHO Uso: ayuda comando
) ELSE (
	%1 /?
	ECHO Pulse una tecla para salir...
)
PAUSE > nul
