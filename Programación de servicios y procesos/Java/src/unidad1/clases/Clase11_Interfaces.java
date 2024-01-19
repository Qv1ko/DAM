package unidad1.clases;

class Clase11_Interfaces {

    public static void main(String[] args) {
        
    }

}

interface DatosMinisterioTransportes {

    int PLAZAS_PASAJEROS = 9;
    String VEHICULO_M1 = "Sentados";
    double FURGONETA_N1 = 3500;
    static void infoTurismo() {
        System.out.println("\nInformación del ministerio de transportes\n\nVehículo privado\nNúmero máximo de pasajeros: " + PLAZAS_PASAJEROS + "\nNúmero máximo de plazas: " + VEHICULO_M1);
    };
    static void infoFurgoneta() {
        System.out.println("\nInformación del ministerio de transportes\n\nVehículo privado\nNúmero máximo de pasajeros: " + PLAZAS_PASAJEROS + "\nNúmero máximo de plazas: " + VEHICULO_M1);
    }

}
