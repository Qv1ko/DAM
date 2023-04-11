@ECHO OFF

IF "%1"=="" (
	ECHO Uso: ayuda comando
) ELSE (
	%1 /?
	ECHO Pulse una tecla para salir...
	PAUSE > nul
)
