@ECHO OFF
CLS
MKDIR "%USERPROFILE%\Desktop\Ej9bat"
TREE "%USERPROFILE%\Desktop" >> "%USERPROFILE%\Desktop\Ej9bat\listado.txt"
TYPE "%USERPROFILE%\Desktop\Ej9bat\listado.txt"
PAUSE