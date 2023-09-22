class CuentaCorriente {

    titular
    saldo
    static titularConstructor

    constructor(titular, saldo = 0) {
        this.titular = titular
        this.saldo = saldo
    }

    setTitular(titular) {
        this.titular = titular
    }

    setSaldo(saldo) {
        this.saldo = saldo
    }

    ingresar(cantidad) {
        if(cantidad > 0) {
            this.saldo += cantidad
        }
    }

    retirar(cantidad) {
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

    ingresarInfo(cantidad) {
        this.ingresar(cantidad)
        return (cantidad > 0)? "Se han ingresado a " + this.getTitular() + " " + cantidad + " euros. El saldo final es de " + this.saldo + " euros" : "No se permite ingresar cantidades negativas"
    }

    retirarInfo(cantidad) {
        let mensaje = ""
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

let clientes = []
let saldoTotal = 0

clientes.push(new CuentaCorriente("Saul"))
clientes.push(new CuentaCorriente("Andres"))
clientes.push(new CuentaCorriente("Marta"))
clientes.push(new CuentaCorriente("Irene", 55))
clientes.push(new CuentaCorriente("Constantin"))

clientes[0].ingresar(100)
clientes[1].ingresar(99)

clientes.forEach(cli => {
    console.log(cli)
    saldoTotal += cli.getSaldo()
})

console.log("El banco maneja " + saldoTotal + " euros")
