let base = parseInt(Math.random() * 11)
let exp = parseInt(Math.random() * 11)
let result = 1

for (let i=1; i <= exp; i++) {
    result *= base
}

console.log("Resultado de " + base + "^" + exp + " = " + result)
