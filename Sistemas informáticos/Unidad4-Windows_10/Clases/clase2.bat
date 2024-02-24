@REM esto es un primer ejercicio de batch
PAUSE

@ECHO off
ECHO.
ECHO %username%
ECHO.
ECHO %computername%
ECHO.
PAUSE
EXIT

@ECHO off
SET name=usuario
ECHO Nombre de usuario por defecto: %name%
SET /P name=Introduzca nombre de usuario:
ECHO Nuevo nombre de usuario: %name%