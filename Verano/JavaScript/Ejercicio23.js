let option = 0
let number1 = 0
let number2 = 0

do {
    option = parseInt(prompt("1) Sumar\n2) Restar\n3) Multiplicar\n4) Dividir\n0) Salir\nSeleccione una opción:"))
    switch (option) {
        case 0:
            console.log("Saliendo...")
            break

        case 1:
            number1 = parseFloat(prompt("Primer número:").replace(",", "."))
            number2 = parseFloat(prompt("Segundo número:").replace(",", "."))
            console.log("Resultado -> " + (number1 + number2))
            break

        case 2:
            number1 = parseFloat(prompt("Primer número:").replace(",", "."))
            number2 = parseFloat(prompt("Segundo número:").replace(",", "."))
            console.log("Resultado -> " + (number1 - number2))
            break

        case 3:
            number1 = parseFloat(prompt("Primer número:").replace(",", "."))
            number2 = parseFloat(prompt("Segundo número:").replace(",", "."))
            console.log("Resultado -> " + (number1 * number2))
            break

        case 4:
            number1 = parseFloat(prompt("Primer número:").replace(",", "."))
            number2 = parseFloat(prompt("Segundo número:").replace(",", "."))
            console.log("Resultado -> " + (number1 / number2))
            console.log("Resto de la división -> " + (number1 % number2))
            break

        default:
            console.log("Opción no valida")

    }
} while (option != 0)
