@ECHO OFF

FOR %%i IN (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F) DO (
    FOR %%j IN (0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F) DO (
        COLOR %%i%%j
        PAUSE > nul
    )
)
COLOR
ECHO Pulse una tecla para salir...
PAUSE > nul
