@ECHO OFF
IF NOT EXIST E:\ GOTO noexiste
MD Exbat
MD Exbat\Ejercicio4
MD Exbat\Ejercicio4\Solucion
ECHO Estructura de arbol creada E:\Exbat\Ejercicio4\Solucion
DATE /T > E:\Exbat\Ejercicio4\Solucion\ej4.txt
TIME /T >> E:\Exbat\Ejercicio4\Solucion\ej4.txt
TREE E:\ >> E:\Exbat\Ejercicio4\Solucion\ej4.txt
IF EXIST E:\ E:\Exbat\Ejercicio4\Solucion\ej4.txt (
    ECHO Atchivo ej4.txt creado correctamente.
) ELSE (
    ECHO ERROR El archivo ej4.txt creado correctamente.
)
GOTO fin

:noexiste
ECHO No esta conectado USB.
ECHO Conecte la unidad y vuelva ha lanzar el ejecutable batch.
GOTO fin

:fin
ECHO Pulsa cualquier tecla para continuar
PAUSE > nul
