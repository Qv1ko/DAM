let firstRow = new Array(4)
let secondRow = new Array(4)
let threeRow = new Array(4)

for(let i = 0; i < threeRow.length; i++) {
    firstRow[i] = Math.random() * 11
    secondRow[secondRow.length - 1 - i] = Math.random() * 11
    threeRow[i] = firstRow[i] * secondRow[secondRow.length - 1 - i]
}

console.log(threeRow.toString())
