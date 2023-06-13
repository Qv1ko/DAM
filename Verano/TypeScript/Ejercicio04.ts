let input: string | null = ""
let chilTickets = 0
let adulTickets = 0

input = prompt("Número de entradas infantiles:")
if (input !== null) {
    chilTickets = parseInt(input)
} else {
    console.log("Input error")
}

input = prompt("Número de entradas de adulto:")
if (input !== null) {
    adulTickets = parseInt(input)
} else {
    console.log("Input error")
}

console.log("El importe total es de " + importe(chilTickets, adulTickets) + " euros")

function importe(chilTickets: number, adulTickets: number) {
    let imp = (chilTickets * 10) + (adulTickets * 15)
    return ((imp > 100)? (imp - (imp / 10)) : imp)
}
