class CuentaCorriente {

    titular: string
    saldo: number
    static titularConstructor: any

    constructor(titular: string, saldo?: number) {
        this.titular = titular
        this.saldo = saldo || 0
    }

    setTitular(titular: string) {
        this.titular = titular
    }

    setSaldo(saldo: number) {
        this.saldo = saldo
    }

    ingresar(cantidad: number) {
        if(cantidad > 0) {
            this.saldo += cantidad
        }
    }

    retirar(cantidad: number) {
        if(cantidad <= this.saldo && cantidad > 0) {
            this.saldo -= cantidad
        }
    }

    getTitular() {
        return this.titular
    }

    getSaldo() {
        return this.saldo
    }

    ingresarInfo(cantidad: number) {
        this.ingresar(cantidad)
        return (cantidad > 0)? "Se han ingresado a " + this.getTitular() + " " + cantidad + " euros. El saldo final es de " + this.saldo + " euros" : "No se permite ingresar cantidades negativas"
    }

    retirarInfo(cantidad: number) {
        let mensaje: string = ""
        if(cantidad > 0&& cantidad <= this.getSaldo()) {
            this.retirar(cantidad)
            mensaje = "Se han retirado " + this.getTitular() + " " + cantidad + " euros. El saldo final es de " + this.getSaldo() + " euros"
        } else {
            mensaje = "La cantidad es incorrecta o el saldo es insuficiente"   
        }
        return mensaje
    }

    toString() {
        return "Titular: " + this.getTitular() + " dispone de un saldo de " + this.getSaldo().toFixed(2) + " euros"
    }

}

let pablo: CuentaCorriente = new CuentaCorriente("Pablo")
console.log(pablo.ingresarInfo(100))
console.log(pablo.retirarInfo(50))
console.log(pablo)

let input: string | null
let titular: CuentaCorriente
let continuar = " "
let operacion = " "

input = prompt("Introduce el nombre del titular de la cuenta:")

titular = new CuentaCorriente((input !== null)? input : "Sin identificar")

do {
    console.log("Ingresar(I) / Retirar(R)")

    operacion = (input !== null)? input : ""

    if (operacion === "i" || operacion === "ingresar") {
        console.log("Cantidad a ingresar:")
        console.log(titular.ingresarInfo((input !== null)? parseFloat(input) : 0))
    } else if (operacion === "r" || operacion === "retirar") {
        console.log("Cantidad a retirar:")
        console.log(titular.retirarInfo((input !== null)? parseFloat(input) : 0))
    } else {
        console.log("! Error")
    }

    console.log(titular)

    console.log("Desea continuar (Si/No)")
    continuar = (input !== null)? input : ""

} while (continuar === "si" || continuar === "s")

console.log("Saliendo de la cuenta...")
