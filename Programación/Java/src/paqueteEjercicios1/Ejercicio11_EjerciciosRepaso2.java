package paqueteEjercicios1;

import java.util.Scanner;

public class Ejercicio11_EjerciciosRepaso2 {

    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        boolean correctFormat=true;
        String time="";

        do{
            System.out.print("Escriba una hora con el siguiente formato (HH:MM:SS): ");
            time=ent.nextLine();
            correctFormat=true;
            for(int i=0;i<time.length();i++) {
                if(!(Character.isDigit(time.charAt(i))||time.charAt(i)==':')) {
                    correctFormat=false;
                }
            }
        } while(time.length()!=8||correctFormat!=true);

        System.out.println("En total "+time+" son "+(sec(time.charAt(0),time.charAt(1),time.charAt(3),time.charAt(4),time.charAt(6),time.charAt(7)))+" segundo/s");
        System.out.println("Total segundos "+correccion(time));

        ent.close();

    } //fin main

    public static int sec(char h1,char h2,char m1,char m2,char s1,char s2) {

        int hora=Character.getNumericValue(h1)+Character.getNumericValue(h2);
        int min=Character.getNumericValue(m1)+Character.getNumericValue(m2);
        int secs=Character.getNumericValue(s1)+Character.getNumericValue(s2);
        return (hora*3600)+(min*60)+secs;

    } //fin sec

    public static long correccion(String tiempo) {

        long horas=Long.parseLong(tiempo.substring(0,2));
        long min=Long.parseLong(tiempo.substring(3,5));
        long sec=Long.parseLong(tiempo.substring(6, 8));

        return (horas*3600)+(min*60)+sec;

    } //fin correccion
    
} //fin class