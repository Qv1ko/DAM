package unidad1.ejercicios.ejercicio1_casting_basico.correccion;

public class Flow {
    
    public static void main(String[] args) {

        final double LARGO = 1.8, ANCHO = 0.5;

        TableroFabrica tablaFabrica;
        TableroCarpinteria tablaCarpinteria;
        
        try {

            tablaFabrica = new TableroFabrica(LARGO, ANCHO);
            tablaCarpinteria = new TableroCarpinteria((int)Math.ceil(LARGO), (int)Math.ceil(ANCHO));

            System.out.println("La tabla de fabrica: " + tablaFabrica.area() + " m²");
            System.out.println("La tabla de carpinteria: " + tablaCarpinteria.area() + " m²");
    
            System.out.println("La diferencia entre tablas es de " + diferencia(tablaFabrica.area(), (double)tablaCarpinteria.area()) + " m²");

        } catch (Exception exc) {
            System.out.println("Error - Valores invalidos");
        }


    }

    private static double diferencia(double areaFabrica, double areaCarpinteria) {
        return Math.abs(areaFabrica - areaCarpinteria);
    }

}
