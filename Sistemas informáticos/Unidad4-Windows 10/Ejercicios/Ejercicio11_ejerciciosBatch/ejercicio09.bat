@ECHO OFF

CLS
rem Crea el directorio
MKDIR "%USERPROFILE%\Desktop\Ej9bat"
rem Ejecuta el tree y redirecciona el output al fichero
TREE "%USERPROFILE%\Desktop" >> "%USERPROFILE%\Desktop\Ej9bat\listado.txt"
rem Muestra el contenido del fichero
TYPE "%USERPROFILE%\Desktop\Ej9bat\listado.txt"
ECHO Pulsa una tecla para salir...
PAUSE > nul