let numbers = new Array(6)
let result = new Array(6)

let number = 0

for (let i = 0; i < numbers.length; i++) {
    numbers[i] = Math.floor(Math.random() * 20) + 1
    result[i] = "*"
}

for (let i = 0; i < 10; i++) {
    number = input()
    for (let j = 0; j < numbers.length; j++) {
        if (numbers[j] === number) {
            result[j] = number
        }
    }
    console.log(result)
    if(finished(result)) {
        break
    } else if (i === 1) {
        console.log("Finalizaste los intentos")
        console.log("Resultado -> " + numbers)
        break
    } else {
        help(numbers, result, number)
    }
}

function input(): number {
    let input: string | null
    let result = 0

    while (true) {
        input = prompt("Escribe un número:")
        if (input !== null && !Number.isNaN(parseInt(input))) {
            result = parseInt(input)
            break
        } else {
            console.log("Número invalido")
        }
    }

    return result
}

function finished(result: Array<string>): boolean {
    let finish = true

    for(let i = 0; i < result.length; i++) {
        if (result[i] === "*") {
            finish = false
            break
        }
    }

    return finish
}

function help(numbers: Array<number>, result: Array<string>, number: number) {
    for(let i = 1; i <= numbers.length; i++) {
        if (!(numbers[i] === parseInt(result[i]))) {
            console.log("El número de la posición " + i + " es " + ((numbers[i] > number)? "mayor" : "menor"));
        }
    }
}
