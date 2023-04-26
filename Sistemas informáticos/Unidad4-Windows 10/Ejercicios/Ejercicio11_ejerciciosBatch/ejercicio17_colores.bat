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

rem ---

REM Hace que las variables se puedan manejar de forma local
SETLOCAL ENABLEDELAYEDEXPANSION
for %%i in (0 1 2 3 4 5 6 7 8 9 A B C D E F) do (
    for %%j in (0 1 2 3 4 5 6 7 8 9 A B C D E F) do (
        CLS
        color %%i%%j
        ECHO Mira que colores tiene la consola!
        set /p continuar=Introduzca una s para salir

        REM Exclamaciones para trabajar con variable local
        REM (Valor dinámico)
        echo Valor de la variable !continuar!
        
        REM Porcentajes para trabajar con variable global
        REM (Valor estático)
        echo Valor de la variable %continuar%
        pause > nul
        if !continuar!==s GOTO salir
    ) 
)

:salir
color 07
echo Hasta luego!
pause > nul
