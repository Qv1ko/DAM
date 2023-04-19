@ECHO OFF
rem Itera entre cada uno de los caracteres y los muestra por pantalla
FOR %%i IN (a b c) DO ECHO Parametro = %%i
ECHO Pulsa una tecla para continuar...
PAUSE > nul

SET num=50
rem Itera desde el 0 hasta el numero de la variable num de 2 en 2 imprimiendo en numero
FOR /L %%j in (0, 2, %num%) DO ECHO %%j
ECHO Pulsa una tecla para salir...
PAUSE > nul