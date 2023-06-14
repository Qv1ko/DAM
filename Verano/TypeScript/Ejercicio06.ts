let input: string | null = prompt("Escribe una frase:")

if (input != null) {
    let words = input.toLocaleLowerCase().split(" ")
    
    words.forEach(word => {
        vocals(word)
    })
} else {
    console.log("Input error")
}

function vocals(word: string): void {
    let countA = 0, countE = 0, countI = 0, countO = 0, countU = 0, other = 0

    word.split("").forEach((letter: string) => {
        (letter === "a")? countA++ : (letter === "e")? countE++ : (letter === "i")? countI++ : (letter === "o")? countO++ : (letter === "u")? countU++ : other++
    })

    console.log("Las vocales de la palabra \""+word+"\" son:")
    if (countA!=0) {
        console.log("A -> "+countA)
    }
    if (countE!=0) {
        console.log("E -> "+countE)
    }
    if (countI!=0) {
        console.log("I -> "+countI)
    }
    if (countO!=0) {
        console.log("O -> "+countO)
    }
    if (countU!=0) {
        console.log("U -> "+countU)
    }
}
