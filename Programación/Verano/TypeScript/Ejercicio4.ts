let input4: string | null = ""
let chilTickets = 0
let adulTickets = 0

input4 = prompt("Número de entradas infantiles:")
if (input4 !== null) {
    chilTickets = parseInt(input4)
} else {
    console.log("Input error")
}

input4 = prompt("Número de entradas de adulto:")
if (input4 !== null) {
    adulTickets = parseInt(input4)
} else {
    console.log("Input error")
}

console.log("El importe total es de " + importe(chilTickets, adulTickets) + " euros")

function importe(chilTickets: number, adulTickets: number) {
    let imp = (chilTickets * 10) + (adulTickets * 15)
    return ((imp > 100)? (imp - (imp / 10)) : imp)
}
