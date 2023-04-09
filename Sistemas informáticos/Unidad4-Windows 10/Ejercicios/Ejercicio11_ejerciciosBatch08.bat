@ECHO OFF

ECHO Iniciando Notepad.exe
START notepad.exe
PAUSE
ECHO Canclando la ejecucion del programa Notepad.exe
TASKKILL /IM notepad.exe /F /T