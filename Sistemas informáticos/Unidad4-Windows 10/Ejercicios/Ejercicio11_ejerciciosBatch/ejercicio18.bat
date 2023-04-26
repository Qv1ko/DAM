@ECHO OFF

rem Mata la tarea con el pid pasado como parametro
TASKKILL /PID %1 /T /F
ECHO Pulse una tecla para salir...
PAUSE > nul
