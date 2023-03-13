package paqueteEjercicios3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejercicio02_Fecha {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true,diaCorrecto=false,mesCorrecto=false,anoCorrecto=false;
        int dia=0,mes=0,ano=0;
        LocalDate fecha=null;
        String input="";
        while(flag) {
            if(!diaCorrecto) {
                try {
                    System.out.print("Introduce el día: ");
                    input=sc.nextLine();
                    dia=Integer.parseInt(input);
                    if(input.length()<2||input.length()>2) {
                        throw new Exception("\nError - Introduce el día con formato \"dd\" \n");
                    }
                    diaCorrecto=true;
                } catch(NumberFormatException exc) {
                    System.out.println("\nError - Introduce el día correctamente\n");
                    continue;
                } catch(NoSuchElementException exc) {
                    System.out.println("\nError - Introduce el día correctamente\n");
                    continue;
                } catch(Exception exc) {
                    System.out.println(exc.getMessage());
                    continue;
                }
            }
            if(!mesCorrecto) {
                try {
                    System.out.print("Introduce el mes: ");
                    input=sc.nextLine();
                    mes=Integer.parseInt(input);
                    if(input.length()<2||input.length()>2) {
                        throw new Exception("\nError - Introduce el mes con formato \"mm\" \n");
                    }
                    mesCorrecto=true;
                } catch(NumberFormatException exc) {
                    System.out.println("\nError - Introduce el mes correctamente\n");
                    continue;
                } catch(NoSuchElementException exc) {
                    System.out.println("\nError - Introduce el mes correctamente\n");
                    continue;
                } catch(Exception exc) {
                    System.out.println(exc.getMessage());
                    continue;
                }
            }
            if(!anoCorrecto) {
                try {
                    System.out.print("Introduce el año: ");
                    input=sc.nextLine();
                    ano=Integer.parseInt(input);
                    if(input.length()<4||input.length()>4) {
                        throw new Exception("\nError - Introduce el año con formato \"aaaa\" \n");
                    }
                    anoCorrecto=true;
                } catch(NumberFormatException exc) {
                    System.out.println("\nError - Introduce el año correctamente\n");
                    continue;
                } catch(NoSuchElementException exc) {
                    System.out.println("\nError - Introduce el año correctamente\n");
                    continue;
                } catch(Exception exc) {
                    System.out.println(exc.getMessage());
                    continue;
                }
            }
            try {
                fecha=LocalDate.of(ano,mes,dia);
                flag=false;
            }  catch(DateTimeException exc) {
                System.out.println("\nError - La fecha es incorrecta\n");
                diaCorrecto=false;
                mesCorrecto=false;
                anoCorrecto=false;
            }
        }
        System.out.println("La fecha es "+fecha);
        sc.close();
    }//main

}//class