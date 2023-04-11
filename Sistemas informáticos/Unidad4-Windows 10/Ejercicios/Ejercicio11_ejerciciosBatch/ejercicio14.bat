@ECHO OFF

FOR /F "SKIP=1" %%i IN ('wmic logicaldisk WHERE "drivetype=2" get name') DO (
	DIR . /A:HS /O:N > "%%i\Work\ADHome.txt"
)
ECHO Pulse una tecla para salir...
PAUSE > nul