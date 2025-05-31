package unidad1.ejercicios.ejercicio7_composicion;

class Flow {

    public static void main(String[] args) {
        
        Formula1 mclaren = new Formula1(5.224, 1.9, 1.097, 755, 8750, 2.9, true, 125, 6, "Licencia 844", "Lando", 22, 1.87, 84);
        FormulaE nissan = new FormulaE(5.16, 1.77, 1.050, 900, 250, 174, 250, "Trasero", "Licencia 983", "Waldo", 20, 1.92, 79);

        mclaren.mostrar();
        nissan.mostrar();

    }

}
