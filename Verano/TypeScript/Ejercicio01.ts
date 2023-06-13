let number1 = 0
let number2 = 0

let input: string | null = prompt("Ingresa un número:")

if (input !== null) {
    number1 = parseInt(input)
} else {
    console.log("No ingresaste ningún valor")
}

input = prompt("Ingresa otro número:")

if (input !== null) {
    number2 = parseInt(input)
} else {
    console.log("No ingresaste ningún valor")
}

if (number1 != number2) {
    console.log(mayorQue(number1, number2))
    console.log(menorQue(number1, number2))
} else {
    console.log("Los números son iguales")
}

function mayorQue(num1: number, num2: number) {
    return (num1 > num2)? "El número " + num1 + " es el mayor" : "El número " + num2 + " es el mayor"
}

function menorQue(num1: number, num2: number) {
    return (num1 < num2)? "El número " + num1 + " es el menor" : "El número " + num2 + " es el menor"
}
