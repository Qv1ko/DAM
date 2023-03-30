@REM Comentario que no se ve sin el @ECHO OFF
REM Comentario que si se ve sin el @ECHO OFF

@REM Control de flujo con GOTO
@ECHO OFF
GOTO salto
DATE /T
TIME /T
VER
PAUSE

:salto
ECHO Fin del programa
PAUSE

REM Control de flujo - Ejemplo
@ECHO OFF
:inicio
CLS
SET /P resultado=Cuanto son 2+2?
IF %resultado%==4 GOTO correcto ELSE goto incorrecto

:incorrecto
ECHO Respuesta incorrecta.
ECHO Presione cualquier tecla para volver a intentarlo
PAUSE>NUL
GOTO inicio

:correcto
ECHO Has acertado
ECHO Presione cualquier tecla para salir
PAUSE>NUL
EXIT