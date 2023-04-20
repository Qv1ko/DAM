@ECHO OFF

CLS
rem Condicion si la carpeta no existe se crea
IF NOT EXIST "%USERPROFILE%\Desktop\EJ10bat" MKDIR "%USERPROFILE%\Desktop\EJ10bat"
rem Condicion si existe el fichero redirecciona sin sobreescribir y si no existe redirecciona sobreescribiendo
IF EXIST "%USERPROFILE%\Desktop\EJ10bat\recursos.txt" (
	ECHO Añadiendo informacion al fichero.
	DIR "%USERPROFILE%\Desktop" >> "%USERPROFILE%\Desktop\EJ10bat\recursos.txt"
) ELSE (
	ECHO Creado listado de recursos.
	DIR "%USERPROFILE%\Desktop" > "%USERPROFILE%\Desktop\EJ10bat\recursos.txt"
)
CD "%USERPROFILE%\Desktop"
rem Imprime por pantalla el contenido del fichero
TYPE EJ10bat\recursos.txt
ECHO Pulsa una tecla para salir...
PAUSE > nul