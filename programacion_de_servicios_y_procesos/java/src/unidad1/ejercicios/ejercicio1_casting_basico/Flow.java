package unidad1.ejercicios.ejercicio1_casting_basico;

public class Flow {
    
    public static void main(String[] args) {

        final double LARGO = 1.8, ANCHO = 0.5;
        
        TableroFabrica tablaFabrica = new TableroFabrica(LARGO, ANCHO);
        // TableroCarpinteria tablaCarpinteria = new TableroCarpinteria((int)LARGO, (int)ANCHO);
        TableroCarpinteria tablaCarpinteria = new TableroCarpinteria((int)Math.round(LARGO), (int)Math.round(ANCHO));

        System.out.println("La tabla de fabrica: " + tablaFabrica.area() + " m²");
        System.out.println("La tabla de carpinteria: " + tablaCarpinteria.area() + " m²");

        System.out.println("La diferencia entre tablas es de " + diferencia(tablaFabrica.area(), (double)tablaCarpinteria.area()) + " m²");

    }

    private static double diferencia(double areaFabrica, double areaCarpinteria) {
        return Math.max(areaFabrica, areaCarpinteria) - Math.min(areaFabrica, areaCarpinteria);
    }

}
