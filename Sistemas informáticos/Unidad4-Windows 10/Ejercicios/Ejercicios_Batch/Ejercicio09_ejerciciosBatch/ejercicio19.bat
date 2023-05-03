@ECHO OFF

CLS
MKDIR %USERPROFILE%\Desktop\Ej19bat
SET directory=%USERPROFILE%\Desktop\Ej19bat
MKDIR %directory%\sub1
MKDIR %directory%\sub1\sub2
CD %directory%\sub1\sub2
MKDIR ..\..\sub1a
TREE %USERPROFILE%\Desktop > %directory%\sub1a\listado.txt
TYPE %directory%\sub1a\listado.txt
COPY %directory%\sub1a\listado.txt %directory%\sub1
TYPE %directory%\sub1\listado.txt
ECHO Pulsa una tecla para salir...
PAUSE > nul
