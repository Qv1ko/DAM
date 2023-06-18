class CuentaCorriente {

    titular: string
    saldo: number

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

let clientes: CuentaCorriente[] = [];

clientes.push(new CuentaCorriente("Saul"))
clientes.push(new CuentaCorriente("Andres"))
clientes.push(new CuentaCorriente("Marta"))
clientes.push(new CuentaCorriente("Irene", 55))
clientes.push(new CuentaCorriente("Constantin"))

let input: string | null
let opcion: number = 0
let titular: string = ""
let beneficiario: string = ""
let cantidadIngresar: number = 0
let cantidadRetirar: number = 0
let cantidadTransferente: number = 0
let clienteEncontrado: CuentaCorriente | undefined
let beneficiarioEncontrado: CuentaCorriente | undefined

do {

    do {
        input = prompt("Opciones: (1) Ver clientes | (2) Ingresar dinero | (3) Retirar dinero | (4) Transferir dinero | (5) Salir")
        opcion = (input !== null)? parseInt(input) : 0
    } while (opcion < 1 || opcion > 5)

    switch(opcion) {

        case 1: 
            clientes.forEach(cliente => {
                console.log(cliente)
            })
            break

        case 2:
            input = prompt("Escriba el titular:")
            titular = (input !== null)? input : "Sin identificar"
            for(let i = 0; i < clientes.length; i++) {
                if (clientes[i].getTitular() === titular) {
                    input = prompt("Cantidad a ingresar:")
                    cantidadIngresar = (input !== null)? parseInt(input) : 0
                    clientes[i].ingresar(cantidadIngresar)
                    break
                }
            }
            break

        case 3:
            input = prompt("Escriba el titular:")
            titular = (input !== null)? input : "Sin identificar"
            clienteEncontrado = clientes.find(cliente => cliente.getTitular() === titular)
            if (clienteEncontrado) {
                input = prompt("Cantidad a retirar:")
                cantidadRetirar = (input !== null)? parseInt(input) : 0
                clienteEncontrado.retirar(cantidadRetirar)
            }
            break

        case 4:
            input = prompt("Titular ordenante:")
            titular = (input !== null)? input : "Sin identificar"
            input = prompt("Titular beneficiario:")
            beneficiario = (input !== null)? input : "Sin identificar"
            input = prompt("Cantidad a transferir:")
            cantidadTransferente = (input !== null)? parseInt(input) : 0
            clienteEncontrado = clientes.find(cliente => cliente.getTitular() === titular)
            beneficiarioEncontrado = clientes.find(cliente => cliente.getTitular() === beneficiario)
            if (clienteEncontrado && beneficiarioEncontrado) {
                clienteEncontrado.retirar(cantidadTransferente)
                beneficiarioEncontrado.ingresar(cantidadTransferente)
            }
            break

        case 5:
            console.log("Saliendo...")

    }

} while (opcion != 5)
