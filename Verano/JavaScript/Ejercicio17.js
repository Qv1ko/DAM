let ventas = 0
let total = 0

ventas = parseInt(prompt("Numero de ventas:"))
for (let i = 1; i <= ventas; i++) {
    total += parseInt(prompt("Importe de la " + i + "º venta:"))
}
console.log("Coste total -> " + total)
