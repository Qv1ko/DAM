package pack00_Exam;

public class Recuperacion1 {

    public static void main(String[] args) {
        
        int mes=(int)(Math.random()*15);

        if(mes>=1&&mes<=3) {
            System.out.println("Invierno");
        } else if(mes>=4&&mes<=6) {
            System.out.println("Primavera");
        } else if(mes>=7&&mes<=9) {
            System.out.println("Verano");
        } else if(mes>=10&&mes<=12) {
            System.out.println("Otono");
        } else {
            System.out.println("Error");
        }

    } //fin main
    
} //fin class