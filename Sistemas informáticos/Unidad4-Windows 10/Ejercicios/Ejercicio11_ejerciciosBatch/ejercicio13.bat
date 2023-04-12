@ECHO OFF

SET usb=0
FOR /F %%i IN ('wmic logicaldisk get drivetype') DO (
	IF %%i==2 SET usb=1
)
IF %usb%==1 (
 	ECHO USB conectado
) ELSE (
 	ECHO No hay ninguna unidad USB conectada
)
ECHO Pulsa una tecla para salir...
PAUSE > nul