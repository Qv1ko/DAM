let password = "qwerty123"

for (let i = 0; i < 3; i++) {
    if (password === prompt("Escriba la contraseña:")) {
        console.log("Enhorabuena")
        break
    } else {
        console.log("Contraseña incorrecta")
    }
}
