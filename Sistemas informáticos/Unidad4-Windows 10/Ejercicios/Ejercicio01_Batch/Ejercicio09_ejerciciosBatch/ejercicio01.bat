@ECHO OFF

ECHO Bienvenido a ficheros BATCH
rem Guardar variable escrita por teclado
SET /P nombre=Introduce tu nombre: 
rem Imprimir texto con variable
ECHO Hola %nombre%
ECHO Pulse una tecla para salir...
PAUSE > nul
