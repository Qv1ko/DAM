@ECHO OFF

DIR *.%1

SET /P destino=Introduce el destino: 
IF EXIST %destino% GOTO :copia ELSE :error

:error
ECHO El directorio no existe.
PAUSE
EXIT

:copia
COPY *.%1 %destino%
PAUSE