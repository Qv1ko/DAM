const sentencesNumber = parseInt(prompt("Número de frases que vas a introducir:"))
let sentences = new Array(sentencesNumber)

for(let i = 0; i < sentences.length; i++) {
    sentences[i] = prompt("Frase número " + (i + 1) + ": ")
}

imprimir(sentences)

function imprimir(sentences) {
    sentences.forEach(sentence => {
        console.log(sentence)
    })
}
