let planta1 = 200
let planta2 = 150
let planta3 = 100
let pesoVehiculo = 300

if (pesoVehiculo < 500 && planta1 > 0) {
    console.log("Su vehiculo de " + pesoVehiculo + " KG debe aparcar en la primera planta")
} else if (pesoVehiculo < 500 && planta2 > 0) {
    console.log("Su vehiculo de " + pesoVehiculo + " KG debe aparcar en la segunda planta")
} else if (pesoVehiculo >= 500 && planta3 > 0) {
    console.log("Su vehiculo de " + pesoVehiculo + " KG debe aparcar en la tercera planta")
} else {
    console.log("No hay plazas disponibles")
}
