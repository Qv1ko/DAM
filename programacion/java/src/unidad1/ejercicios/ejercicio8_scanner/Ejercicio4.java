package unidad1.ejercicios.ejercicio8_scanner;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase=entrada.nextLine();
        String[] separador=frase.split(" "); //separa la frase en palabras distintas cuando hay un "%32" y las guarda en espacios del array

        // bucle de todos los espacios de array (palabras separadas por "%32")
        for(int i=0;i<separador.length;i++) {
            System.out.println("Palabra "+i+" -> "+separador[i]); //imprime por pantalla el espacio del array equivalente al numero de i
        }

        for(int i=0;i<frase.length();i++) {
            if(frase.charAt(i)==' ') {
                System.out.println();
            } else {
                System.out.print(frase.charAt(i));
            }
        }

        entrada.close();
        
    } //fin main
    
} //fin class