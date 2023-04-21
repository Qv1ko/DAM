@ECHO OFF

rem Bucle que itera por cada uno de los parametros introducidos y luego lo muestra por pantalla
FOR %%i IN (%*) DO ECHO Parametro = %%i
ECHO Pulse una tecla para salir...
PAUSE > nul
