@ECHO OFF
CLS
IF %1==""(
    ECHO ERROR. Batch sin parametros.
    ECHO Debe introducir el nombre del fichero en la orden.
    GOTO fin
)
DATE /T > ej5.txt
TIME /T >> ej5.txt
ECHO Informe de localizacion del fichero %1 >> ej5.txt
DIR C:\%1 /S /P >> ej5.txt

:fin
ECHO Pulsa para finalizar
PAUSE > nul