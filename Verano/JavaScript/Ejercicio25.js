let time = ""

do {
    time = prompt("Escriba una hora:")
} while(!time.match("^\\d{2}:\\d{2}:\\d{2}$"))

console.log("Total segundos " + seconds(time));

function seconds(time) {
    const parts = time.split(":")
    return (parseInt(parts[0]) * 3600) + (parseInt(parts[1]) * 60) + parseInt(parts[2])
}
