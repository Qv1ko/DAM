let number = Math.floor(Math.random() * 999999)
let cifras = 0

console.log("Numero generado: " + number)

do {
    number = Math.floor(number / 10);
    cifras++
} while (number > 0)

console.log((cifras == 1) ? "El numero tiene " + cifras + " cifra" : "El numero tiene " + cifras + " cifras")
