@ECHO OFF

IF EXIST %1 GOTO :copia

:error
ECHO El archivo no existe.
GOTO :salida

:copia
MKDIR PruebaCopia
COPY %1 PruebaCopia

:salida
PAUSE