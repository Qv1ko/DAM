class Habitaciones {

    id
    cama
    terraza
    libre
    precio

    constructor(id, cama, terraza, precio, libre) {
        this.id = id
        this.cama = cama
        this.terraza = terraza
        this.precio = precio
        this.libre = libre
    }

    isLibre() {
        return this.libre
    }

    liberar() {
        this.libre = true
        let dias = parseInt(Math.random() * 5) + 1
        return this.precio + " por dia, por " + dias + ", total = " + (this.precio * dias)
    }

    reservar() {
        this.libre = false
        return this.id + " habitacion reservada"
    }

    getHabitaculo() {
        let vistas = ""
        if (this.terraza) {
            vistas = " con terraza"
        } else {
            vistas = " con ventanas"
        }
        return vistas
    }

    toString() {
        return "Habitación " + id + ", cama " + cama + getHabitaculo() + ", "+ (libre)? "libre" : "ocupado" + " a " + precio + " euros"
    }

}

let lista = []
let input
let opcion = 0
let habElegida = 0

lista.push(new Habitaciones(101, "matrimonio", true, 40, true))
lista.push(new Habitaciones(102, "matrimonio", false, 30, true))
lista.push(new Habitaciones(103, "matrimonio", false, 30, true))
lista.push(new Habitaciones(104, "individuales", true, 25, true))
lista.push(new Habitaciones(105, "individuales", false, 20, true))
lista.push(new Habitaciones(106, "individuales", false, 20, true))

do {

    input = prompt("1) Ver habitaciones   2) Reservar habitación   3) Devolver habitación   4) Salir")
    opcion = (input !== null)? parseInt(input) : 0

    switch (opcion) {
        case 1:
            lista.forEach(hab => {
                console.log(hab)
            })
            break

        case 2:
            lista.forEach(hab => {
                if (hab.isLibre()) {
                    console.log(hab)
                }
            })

            input = prompt("La habitación que quiere:")
            habElegida = (input !== null)? input : 0

            if (lista[habElegida - 101].isLibre()) {
                console.log(lista[habElegida - 101].reservar())
            } else {
                console.log("Habitación no disponible")
            }

            break

        case 3:
            lista.forEach(hab => {
                if (!hab.isLibre()) {
                    console.log(hab)
                }
            })

            input = prompt("Que habitacion va a devolver:")
            habElegida = (input !== null)? input : 0

            if (!lista[habElegida - 101].isLibre()) {
                console.log("Se debe por la habitacion " + lista[habElegida - 101].liberar())
            } else {
                console.log("La habitación no se puede devolver")
            }

            break

        case 4:
            console.log("Saliendo...")
            break

        default:
            console.log("Opción no valida")

    }

} while (opcion !== 4)
