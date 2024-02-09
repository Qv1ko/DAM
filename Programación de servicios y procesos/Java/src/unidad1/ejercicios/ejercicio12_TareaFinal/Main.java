package unidad1.ejercicios.ejercicio12_TareaFinal;

public class Main {

   public static void main(String[] args) {
	// Crear una instancia de la vista
        Vista vista = new Vista();

        // Crear una instancia de la nave (puedes elegir entre NaveMilitar y NaveTransporte)
        Nave nave = new NaveMilitar("Falcon", 100, 5); // Por ejemplo, una nave militar
        Nave nave2 = new NaveTransporte("Elite", 200, 550); // Por ejemplo, una nave de transporte

        // Crear una instancia del controlador y pasarle la vista y la nave
//        Controlador controlador = new Controlador(vista, nave);
   }
}
