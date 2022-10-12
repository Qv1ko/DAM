package pack;

public class Exercise02_LetraDni{

    public static void main(String[] args) {
        
        int dni=53933374;

        switch(dni%23) {

            case 0:
                System.out.println("DNI -> "+dni+"T");
                break;
            case 1:
                System.out.println("DNI -> "+dni+"R");
                break;
            case 2:
                System.out.println("DNI -> "+dni+"W");
                break;
            case 3:
                System.out.println("DNI -> "+dni+"A");
                break;
            case 4:
                System.out.println("DNI -> "+dni+"G");
                break;
            case 5:
                System.out.println("DNI -> "+dni+"M");
                break;
            case 6:
                System.out.println("DNI -> "+dni+"Y");
                break;
            case 7:
                System.out.println("DNI -> "+dni+"F");
                break;
            case 8:
                System.out.println("DNI -> "+dni+"P");
                break;
            case 9:
                System.out.println("DNI -> "+dni+"D");
                break;
            case 10:
                System.out.println("DNI -> "+dni+"X");
                break;
            case 11:
                System.out.println("DNI -> "+dni+"B");
                break;
            case 12:
                System.out.println("DNI -> "+dni+"N");
                break;
            case 13:
                System.out.println("DNI -> "+dni+"J");
                break;
            case 14:
                System.out.println("DNI -> "+dni+"Z");
                break;
            case 15:
                System.out.println("DNI -> "+dni+"S");
                break;
            case 16:
                System.out.println("DNI -> "+dni+"Q");
                break;
            case 17:
                System.out.println("DNI -> "+dni+"V");
                break;
            case 18:
                System.out.println("DNI -> "+dni+"H");
                break;
            case 19:
                System.out.println("DNI -> "+dni+"L");
                break;
            case 20:
                System.out.println("DNI -> "+dni+"C");
                break;
            case 21:
                System.out.println("DNI -> "+dni+"K");
                break;
            case 22:
                System.out.println("DNI -> "+dni+"E");
                break;
            default:
                System.out.println("Escribe el NIF correctamente");

        }

    }//fin main

}//fin class