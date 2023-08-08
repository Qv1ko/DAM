let words = prompt("Frase:").split(" ")

for (let i = 1; i <= words.length; i++) {
    console.log(i + "º " + words[i-1])
}
