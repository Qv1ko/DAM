package unidad1.ejercicios.ejercicio02_TablasVerdad;

public class TablaVerdad {

    private final static int NUMERO = 5;
    private final static int CANTIDADRETRASOS = 20;
    private final static int CANTIDADERRORES = 16;
    private final static boolean RECARGA = true;
    private final static boolean CARGATOTAL = false;
    private final static double PORCENTAJECARGA = 19.80;
    private final static boolean ENERGIA = false;
    
    public static void main(String[] args) {
        
        System.out.println("numero > 5 -> " + verdad01());
        System.out.println("numero = 5 -> " + verdad02());
        System.out.println("numero > 5 o numero = 5 ->" + verdad03());
        System.out.println("cantidadErrores y cantidadRetrasos son pares -> " + verdad04());
        System.out.println("cantidadErrores es menor que 6 o cantidadRetrasos es menor que 5 -> " + verdad05());
        System.out.println("cantidadRetrasos > 8 y cantidadErrorres > 5 -> " + verdad06());
        System.out.println("recarga es verdad y porcentajeCarga es menor de 20.00 y energia es verdad -> " + verdad07());
        System.out.println("recarga es verdad y energia es falso -> " + verdad08());
        System.out.println("cargaTotal es falso y recarga es verdad y energia es verdad -> " + verdad09());
        System.out.println("cargaTotal es verdad y recarga es falso y energia es falso -> " + verdad10());
        System.out.println("Si porcentajeCarga es igual a 100.00, entonces cargaTotal es verdad y recarga es falso -> " + verdad11());
        System.out.println("(cantidadErrores es mayor que 10 y energia es verdad) o (numero es 5 y cantidadRetrasos es menor que 20) -> " + verdad12());
        
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
        // recarga es verdad y energia es falso
        return RECARGA && !ENERGIA;
    }

    private static boolean verdad09() {
        // cargaTotal es falso y recarga es verdad y energia es verdad
        return !CARGATOTAL && RECARGA && ENERGIA;
    }

    private static boolean verdad10() {
        // cargaTotal es verdad y recarga es falso y energia es falso
        return CARGATOTAL && !RECARGA && !ENERGIA;
    }

    private static boolean verdad11() {
        // Si porcentajeCarga es igual a 100.00, entonces cargaTotal es verdad y recarga es falso
        return (PORCENTAJECARGA == 100.00) ? CARGATOTAL && !RECARGA : !CARGATOTAL && RECARGA;
    }

    private static boolean verdad12() {
        // (cantidadErrores es mayor que 10 y energia es verdad) o (numero es 5 y cantidadRetrasos es menor que 20)
        return (CANTIDADERRORES > 10 && ENERGIA) || (NUMERO == 5 && CANTIDADRETRASOS < 20);
    }

}
