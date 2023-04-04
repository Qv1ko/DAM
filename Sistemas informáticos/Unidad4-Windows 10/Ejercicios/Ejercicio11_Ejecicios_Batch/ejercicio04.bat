@ECHO OFF

IF EXIST %1 GOTO :copia ELSE :error

:error
ECHO El archivo no existe.
PAUSE
EXIT

:copia
MKDIR PruebaCopia
COPY %1 PruebaCopia
PAUSE