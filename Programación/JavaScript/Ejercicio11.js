let ascii = 97

while (ascii <= 122) {
    console.log(String.fromCharCode(ascii))
    if (ascii === 110) {
        console.log("ñ")
    }
    ascii++
}
