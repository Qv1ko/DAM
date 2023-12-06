const number1 = prompt("Primer número:")
const number2 = prompt("Primer número:")

console.log(rand(number1, number2))

function rand(number1, number2) {
    const max = Math.max(number1, number2)
    const min = Math.min(number1, number2)

    return parseInt(Math.random() * (max - min + 1) + min)
}
