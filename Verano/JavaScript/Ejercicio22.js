let rand = parseInt(Math.random()*101)
let number = 0

for(let i = 5; i > 0; i--) {
    number = prompt("Introduce un numero:")
    if (i == 1 && number != rand) {
        console.log("No adivinaste el numero -> "+rand);
    } else {
        if (number > rand) {
            console.log("Se ha pasado");
        } else if (number < rand) {
            console.log("Se ha quedado corto");
        } else {
            console.log("Adivino el numero");
            break;
        }
    }
}
