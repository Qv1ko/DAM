@ECHO OFF

SET usb=0
rem Bucle que itera por cada resultado del comando, si es 2 es un USB
FOR /F %%i IN ('wmic logicaldisk get drivetype') DO (
	IF %%i==2 SET usb=1
)
rem Condicion si es 1 es USB
IF %usb%==1 (
 	ECHO USB conectado
) ELSE (
 	ECHO No hay ninguna unidad USB conectada
)
ECHO Pulsa una tecla para salir...
PAUSE > nul

rem ---

rem Condicion si existe el almacenamiento E esta conectado
IF EXIST E: (
	ECHO USB conectado
) ELSE (
	ECHO No hay USB conectados
)
ECHO Pulsa una tecla para salir...
PAUSE > nul
