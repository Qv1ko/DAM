package unidad1.ejercicios.ejercicio02_TablasVerdad;

public class TablaVerdad {

    private final static int NUMERO = 5;
    private final static int CANTIDADRETRASOS = 20;
    private final static int CANTIDADERRORES = 16;
    private final static boolean RECARGA = true;
    private final boolean CARGATOTAL = false;
    private final static double PORCENTAJECARGA = 19.80;
    private final static boolean ENERGIA = false;
    
    public static void main(String[] args) {
        
        System.out.println(verdad01());
        System.out.println(verdad02());
        System.out.println(verdad03());
        System.out.println(verdad04());
        System.out.println(verdad05());
        System.out.println(verdad06());
        System.out.println(verdad07());
        System.out.println(verdad08());
        System.out.println(verdad09());
        System.out.println(verdad10());
        System.out.println(verdad11());
        System.out.println(verdad12());
        System.out.println(verdad13());
        
    }
    
    private static boolean verdad01() {
        // numero > 5
        return NUMERO > 5;
    }

    private static boolean verdad02() {
        // numero = 5
        return NUMERO == 5;
    }

    private static boolean verdad03() {
        // numero > 5 o numero = 5
        return NUMERO > 5 || NUMERO == 5;
    }

    private static boolean verdad04() {
        // cantidadErrores y cantidadRetrasos son pares
        return (CANTIDADERRORES % 2 == 0) && (CANTIDADRETRASOS % 2 == 0);
    }
    
    private static boolean verdad05() {
        // cantidadErrores es menor que 6 o cantidadRetrasos es menor que 5
        return CANTIDADERRORES < 6 || CANTIDADRETRASOS < 5;
    }

    private static boolean verdad06() {
        // cantidadRetrasos > 8 y cantidadErrorres > 5
        return CANTIDADRETRASOS > 8 && CANTIDADERRORES > 5;
    }

    private static boolean verdad07() {
        // recarga es verdad y porcentajeCarga es menor de 20.00 y energia es verdad
        return RECARGA && PORCENTAJECARGA < 20.00 && ENERGIA;
    }

    private static boolean verdad08() {
        // 
        return 1==2;
    }

    private static boolean verdad09() {
        // 
        return 1==2;
    }

    private static boolean verdad10() {
        // 
        return 1==2;
    }

    private static boolean verdad11() {
        // 
        return 1==2;
    }

    private static boolean verdad12() {
        // 
        return 1==2;
    }

    private static boolean verdad13() {
        // 
        return 1==2;
    }

}
