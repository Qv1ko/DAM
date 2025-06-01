@ECHO OFF

CLS
ECHO Pulsa la tecla x para salir
:loop
rem Almacena la tecla pulsada en una variable
SET /P tecla= Introduce una tecla: 
rem Condicion si la variable es igual a x sale, si no repite el :loop
IF "%tecla%"=="x" (
	ECHO Saliendo...
	rem Sale del archivo por lotes sin cerrar la terminal
	EXIT /B
) ELSE (
	GOTO loop
)
