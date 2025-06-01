@ECHO OFF
IF "%1"=="" (
    ECHO ERRPR Batch sin parametros.
    ECHO Debe introducir el nombre del fichero en la orden.
    GOTO fin
)
IF NOT EXIST %USERPROFILE%\desktop\informes (
    ECHO Directorio <informe> no existe
    MD %USERPROFILE%\desktop\informes
    ECHO Directorio <informes> creado
)
DATE /T > %1
TIME /T >> %1
VER >> %1
TASKLIST >> %1
:fin
ECHO Finalizando archivo Batch
