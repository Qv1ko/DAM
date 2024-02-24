package unidad1.ejercicios.ejercicio5_Overriding;

class Flow {

    public static void main(String[] args) {

        AulaInformatica obj = new AulaInformatica();

        obj.setNumeroPlazas(24);
        obj.setHabilitada(true);

        obj.imprimirEstado();

        obj.setOcupada(true);

        obj.imprimirEstado();

    }

}
