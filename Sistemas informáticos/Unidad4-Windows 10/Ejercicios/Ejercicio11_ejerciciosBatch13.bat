@ECHO OFF

@REM FOR %%i IN (wmic logicaldisk get description)

@REM Disco extraíble

@REM set "usb_connected=false"

@REM for %%a in ('wmic logicaldisk get caption^, drivetype /value') do (
@REM   if "%%b"=="2" (
@REM     vol %%a | find "Serial Number" > nul
@REM     if errorlevel 1 (
@REM       echo La unidad %%a es un USB.
@REM       set "usb_connected=true"
@REM     )
@REM   )
@REM )

@REM if "%usb_connected%"=="false" (
@REM   echo No se ha encontrado un USB.
@REM )

@REM pause > nul