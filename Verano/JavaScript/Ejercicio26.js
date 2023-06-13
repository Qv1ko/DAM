let data = "";

while (true) {
    data = prompt("Introduce un número:").replace(",", ".");
    if (isNumber(data)) {
        calc(parseFloat(data));
    } else {
        console.log("Número erroneo")
        break
    }
}

function isNumber(data) {
    let isNumber = true;

    data.split("").forEach(character => {
        if (!(character.match(/^\d$/) || character === ".")) {
            isNumber = false;
        }
    });

    return isNumber;
}

function calc(number) {
    console.log("El número " + number + " es " + ((number % 2 === 0) ? "par" : "impar"));
}
