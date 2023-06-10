let number1 = 0
let number2 = 0

while(number1 == number2) {
    number1 = prompt("Primer numero:")
    number2 = prompt("Segundo numero:")
}

let min = Math.min(number1, number2)
let max = Math.max(number1, number2)
let rand = 0

do {
    rand = parseInt(Math.random() * (max + 1))
} while (rand < min || rand > max);

console.log(rand)
