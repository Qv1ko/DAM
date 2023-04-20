@ECHO OFF

ECHO Iniciando Notepad.exe
rem Iniciar programa notepad.exe
START notepad.exe
ECHO Pulsa una tecla para continuar...
PAUSE > nul
ECHO Canclando la ejecucion del programa Notepad.exe
rem Mata la ejecucion del programa notepad.exe
TASKKILL /F /IM notepad.exe /T
ECHO Pulsa una tecla para salir...
PAUSE > nul