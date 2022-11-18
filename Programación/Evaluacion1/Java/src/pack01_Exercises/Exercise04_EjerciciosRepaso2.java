package pack01_Exercises;

import java.util.Scanner;

public class Exercise04_EjerciciosRepaso2 {

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

        System.out.println("En total "+time+" son "+(horasSec(time.charAt(0),time.charAt(1))+minSec(time.charAt(3),time.charAt(4))+sec(time.charAt(6),time.charAt(7)))+" segundo/s");

        ent.close();

    } //fin main

    public static int horasSec(char h1,char h2) {

        int hora=Character.getNumericValue(h1)+Character.getNumericValue(h2);
        return hora*3600;

    } //fin horasSec

    public static int minSec(char m1,char m2) {

        int min=Character.getNumericValue(m1)+Character.getNumericValue(m2);
        return min*60;

    } //fin minSec

    public static int sec(char s1,char s2) {

        int secs=Character.getNumericValue(s1)+Character.getNumericValue(s2);
        return secs;

    } //fin sec
    
} //fin class