let list = new Array(15)
let evenList = []
let oddList = []

for(let i = 0; i < list.length; i++) {
    list[i] = parseInt(Math.random() * 101)
    if(list[i] % 2 == 0) {
        evenList.push(list[i])
    } else {
        oddList.push(list[i])
    }
}

console.log("Numeros pares -> " + evenList)
console.log("Numeros impares -> " + oddList)
