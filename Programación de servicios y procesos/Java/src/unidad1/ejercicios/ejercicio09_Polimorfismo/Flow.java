package unidad1.ejercicios.ejercicio09_Polimorfismo;

class Flow {

    public static void main(String[] args) {

        Monoplaza monoplaza;
        
        Formula1 williams = new Formula1(5.65, 2, 0.95, 746, 15000, 2.4, true, 110, 8);
        FormulaE jaguar = new FormulaE(5.32, 1.78, 1.05, 920, 200, 140, 100, "Trasero");

        williams.mostrar();
        jaguar.mostrar();

        monoplaza = williams;
        monoplaza.mostrar();

        monoplaza = jaguar;
        monoplaza.mostrar();

    }

}
