let number = 0
let max = 0
let min = 0
let sumTotal = 0
let sumPos = 0
let sumNeg = 0
let count = 0
let avg = 0

do {
    num = prompt("Numero:")
    if (num != -1) {
        max = (num > max)? num : max
        min = (num < min)? num : min
        if(num >= 0) {
            sumPos += parseInt(num)
        } else {
            sumNeg += parseInt(num)
        }
        count++
        sumTotal += parseInt(num)
        avg = parseInt(sumTotal / count)
    }
} while(num != -1)

console.log("Mayor numero introducido -> " + max)
console.log("Menor numero introducido -> " + min)
console.log("Suma de todos los numeros -> " + sumTotal)
console.log("Suma de los numeros positivos -> " + sumPos)
console.log("Suma de los numeros negativos -> " + sumNeg)
console.log("Media de la suma total -> " + avg)
