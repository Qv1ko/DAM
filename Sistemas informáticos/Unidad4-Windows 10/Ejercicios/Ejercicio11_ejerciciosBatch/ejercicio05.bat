@ECHO OFF

DIR *.%1
PAUSE

SET /P destino=Introduce el destino: 
IF EXIST %destino% GOTO :copia

:error
ECHO El directorio no existe.
GOTO :salida

:copia
COPY *.%1 %destino%

:salida
PAUSE