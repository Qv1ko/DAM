package unidad1.clases;

class Clase02_Casting {

    public static void main(String[] args) {

        Float floatVar = 42.0f;
        Number n = floatVar;  // Implicit
        Float floatVar2 = (Float)n;  // Explicit
        System.out.println(floatVar2);
        Double doubleVar = (Double)n;  //Throws exception
        System.out.println(doubleVar);

    }

}
