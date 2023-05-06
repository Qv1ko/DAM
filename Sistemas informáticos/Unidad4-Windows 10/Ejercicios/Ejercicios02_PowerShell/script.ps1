# Limpiar pantalla
Clear-Host
# Fecha y hora
Get-Date > $env:USERPROFILE\Desktop\ejsc.txt
# Variable con la política de ejecución del scope LocalMachine
$POLICY=Get-ExecutionPolicy -Scope LocalMachine
# Condición - Si la variable anterior es diferente a "RemoteSigned" se ejecutará
IF (!($POLICY -eq "RemoteSigned")) {
    Write-Host "Estableciendo política de ejecución..."
    # Establece como política RemoteSigned para el Scope LocalMachine 
    Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope LocalMachine -Force
}
Write-Output "Listado de políticas de privacidad:" >> $env:USERPROFILE\Desktop\ejsc.txt
# Mostrar política
Get-ExecutionPolicy -List >> $env:USERPROFILE\Desktop\ejsc.txt
Write-Host "Política de ejecución configurada correctamente`n"
# Pausa
Pause
