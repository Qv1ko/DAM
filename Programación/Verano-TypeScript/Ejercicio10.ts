class Radio {

    freq: number
    max = 180.0
    min = 80.0

    constructor(freq: number) {
        this.freq = (freq < this.min)? this.min : (freq>this.max)? this.max : freq || this.min
    }

    getFreq() {
        return this.freq
    }

    upTuning() {
        this.freq = (this.freq < this.max)? this.freq + 0.5 : this.min
    }

    tuneDown() {
        this.freq = (this.freq > this.min)? this.freq - 0.5 : this.max
    }

    toString() {
        return "Frecuencia sintonizada -> " + this.getFreq()
    }

}

let radio: Radio = new Radio(90.8)
let input: string | null
let option = 0

do {

    input = prompt("(1) Subir frecuencia | (2) Bajar frecuencia | (3) Salir")
    option = (input !== null)? parseInt(input) : 0
    
    if (option === 1) {
        radio.upTuning()
    } else if (option === 2) {
        radio.tuneDown()
    } else {
        continue
    }

    console.log(radio.getFreq())

} while (option != 3)
