@ECHO OFF

CLS
MKDIR %USERPROFILE%\Desktop\Ej9bat
MKDIR %USERPROFILE%\Desktop\Ej9bat\sub1
MKDIR %USERPROFILE%\Desktop\Ej9bat\sub2
CD %USERPROFILE%\Desktop\Ej9bat\sub2
MKDIR %USERPROFILE%\Desktop\Ej9bat\sub1a
TREE %USERPROFILE%\Desktop\ > %USERPROFILE%\Desktop\Ej9bat\sub1a\listado.txt
TYPE %USERPROFILE%\Desktop\Ej9bat\listado.txt
COPY %USERPROFILE%\Desktop\Ej9bat\listado.txt %USERPROFILE%\Desktop\Ej9bat\sub1a\
TYPE %USERPROFILE%\Desktop\Ej9bat\sub1a\listado.txt
ECHO Pulsa una tecla para salir...
PAUSE > nul
