let input3: string | null = prompt("Número de asignaturas:")
let assignments = 0
let note = 0

if (input3 !== null) {
    assignments = parseInt(input3)
    for (let i = 1; i <= assignments; i++) {
        input3 = prompt("Nota de la " + i +"º asignatura:")
        if (input3 !== null) {
            note += parseFloat(input3)
        } else {
            console.log("Nota incorrecta")
            i--
        }
    }
    console.log("La nota media es de " + (note / assignments) + " (" + message(note / assignments) + ")")
} else {
    console.log("Input error")
}

function message(avg: number): string {
    return (avg < 5)? "Insuficiente" : (avg >= 5 && avg < 6)? "Suficiente" : (avg >= 6 && avg < 7.5)? "Bien" : (avg >= 7.5 && avg < 9)? "Notable" : "Sobresaliente"
}
