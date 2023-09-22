let ascii = 65

do {
    console.log(String.fromCharCode(ascii))
    if (ascii === 78) {
        console.log("Ñ")
    }
    ascii++
} while (ascii <= 90)
