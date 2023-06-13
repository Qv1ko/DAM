let input: string | null = prompt("Escribe una cadena de texto:")

if(input !== null) {
    const text = input
    counter(text)
} else {
    console.log("Input error")
}


function counter(text: string): void {
    let a = 0
    let e = 0
    let i = 0
    let o = 0
    let u = 0
    let other = 0

    text.toLowerCase().split("").forEach((letter: string) => {
        (letter === "a")? a++ : (letter === "e")? e++ : (letter === "i")? i++ : (letter === "o")? o++ : (letter === "u")? u++ : other++
    })

    console.log("Número de A: " + a)
    console.log("Número de E: " + e)
    console.log("Número de I: " + i)
    console.log("Número de O: " + o)
    console.log("Número de U: " + u)
}
