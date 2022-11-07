package pack01_Exercises;

import java.util.Scanner;

public class Exercise00_EjerciciosScanner4 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase=entrada.nextLine();
        String[] separador=frase.split(" "); //separa la frase en palabras distintas cuando hay un "%32" y las guarda en espacios del array

        // bucle de todos los espacios de array (palabras separadas por "%32")
        for(int i=0;i<separador.length;i++) {
            System.out.println("Palabra "+i+" -> "+separador[i]); //imprime por pantalla el espacio del array equivalente al numero de i
        }

        entrada.close();
        
    } //fin main
    
} //fin class