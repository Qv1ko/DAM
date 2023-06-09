let number1 = parseInt(Math.random() * 101)
let number2 = parseInt(Math.random() * 101)

let min = Math.min(number1, number2)
let max = Math.max(number1, number2)

console.log("Numeros pares entre " + number1 + " y " + number2 + ":")

for (let i = min; i <= max; i++) {
    if (i % 2 === 0) {
        console.log(i + " ")
    }
}
