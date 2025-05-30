package unidad1.clases;

public class Clase13_String {

    public static void main(String[] args) {
        
        //declaracion y asignacion del objeto String
        // String str="data";
        // String str= new String("data");

        String frase="La lluvia de sevilla es una maravilla";
        System.out.println("La longitud de la frase es -> "+frase.length());
        System.out.println("El primer caracter es -> "+frase.charAt(0));
        System.out.println("El ultimo caracter es -> "+frase.charAt(frase.length()-1));
        
        //ejercicio 0 - Caracteres
        //bucle para representar todos los caracteres de una frase
        for(int i=0;i<frase.length();i++) {
            System.out.print("\nEl caracter "+i+" es \'"+frase.charAt(i)+"\'");
        }

    }

}