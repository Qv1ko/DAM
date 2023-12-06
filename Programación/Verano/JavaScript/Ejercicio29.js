let altura = 0

do {
    altura = prompt("Define la altura del arbol:")
} while(altura < 1)

(altura === 1)? sprout() : (altura === 2)? short() : tree(altura)

function sprout() {
    console.log("\n*\nI")
}

function short() {
    console.log("\n *\n***\n I\n")
}

function tree(altura) {
    let leaf = "*"
    const body = "|_|"

    for(let i = 0; i < altura; i++) {
        console.log(leaf.padStart(altura + i, " "))
        leaf += "**";
    }

    console.log(body.padStart(altura + 1, " "))
}
