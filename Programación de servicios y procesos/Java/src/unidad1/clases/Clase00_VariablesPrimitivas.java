package unidad1.clases;

public class Clase00_VariablesPrimitivas {
    
    public static void main(String[] args) {
        
        long l = 0L;
        long lm = 0l;
        float f = 0.0F;
        float fm = 0.0f;
        double d = 0D;
        double dm = 0d;
        char ch = '\u0000'; // null

        System.out.println(l);
        System.out.println(lm);
        System.out.println(f);
        System.out.println(fm);
        System.out.println(d);
        System.out.println(dm);
        System.out.println(ch);

        System.out.println("Valor vacio del int: " + VariablesPrimitivas.i);
        System.out.println("Valor vacio del long: " + VariablesPrimitivas.l);
        System.out.println("Valor vacio del float: " + VariablesPrimitivas.f);
        System.out.println("Valor vacio del double: " + VariablesPrimitivas.d);
        System.out.println("Valor vacio del char: " + VariablesPrimitivas.ch);
        System.out.println("Valor vacio del boolean: " + VariablesPrimitivas.bool);

    }

}

class VariablesPrimitivas {

    public static int i;
    public static long l;
    public static float f;
    public static double d;
    public static char ch;
    public static boolean bool;

    // public String toString() {
    //     return "Valor vacio del int: " + VariablesPrimitivas.i + "\nValor vacio del long: " + VariablesPrimitivas.l + "\nValor vacio del float: " + VariablesPrimitivas.f + "\nValor vacio del double: " + VariablesPrimitivas.d + "\nValor vacio del char: " + VariablesPrimitivas.ch + "\nValor vacio del boolean: " + VariablesPrimitivas.bool;
    // }

}
