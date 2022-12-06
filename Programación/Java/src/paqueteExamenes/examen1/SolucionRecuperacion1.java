package paqueteExamenes.examen1;

public class SolucionRecuperacion1 {
    
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

        switch(mes) {
            case 1,2,3:
                System.out.println("Invierno");
                break;
            case 4,5,6:
                System.out.println("Primavera");
                break;
            case 7,8,9:
                System.out.println("Verano");
                break;
            case 10,11,12:
                System.out.println("Otono");
                break;
            default:
                System.out.println("Error");
        }

    } //fin main
    
} //fin class