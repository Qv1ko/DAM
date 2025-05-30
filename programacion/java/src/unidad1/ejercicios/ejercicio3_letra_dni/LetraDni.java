package unidad1.ejercicios.ejercicio3_letra_dni;

public class LetraDni{

    public static void main(String[] args) {
        
        int nif=76879811;

        switch(nif%23) {

            case 0:
                System.out.println("DNI -> "+nif+'T');
                break;
            case 1:
                System.out.println("DNI -> "+nif+'R');
                break;
            case 2:
                System.out.println("DNI -> "+nif+'W');
                break;
            case 3:
                System.out.println("DNI -> "+nif+'A');
                break;
            case 4:
                System.out.println("DNI -> "+nif+'G');
                break;
            case 5:
                System.out.println("DNI -> "+nif+'M');
                break;
            case 6:
                System.out.println("DNI -> "+nif+'Y');
                break;
            case 7:
                System.out.println("DNI -> "+nif+'F');
                break;
            case 8:
                System.out.println("DNI -> "+nif+'P');
                break;
            case 9:
                System.out.println("DNI -> "+nif+'D');
                break;
            case 10:
                System.out.println("DNI -> "+nif+'X');
                break;
            case 11:
                System.out.println("DNI -> "+nif+'B');
                break;
            case 12:
                System.out.println("DNI -> "+nif+'N');
                break;
            case 13:
                System.out.println("DNI -> "+nif+'J');
                break;
            case 14:
                System.out.println("DNI -> "+nif+'Z');
                break;
            case 15:
                System.out.println("DNI -> "+nif+'S');
                break;
            case 16:
                System.out.println("DNI -> "+nif+'Q');
                break;
            case 17:
                System.out.println("DNI -> "+nif+'V');
                break;
            case 18:
                System.out.println("DNI -> "+nif+'H');
                break;
            case 19:
                System.out.println("DNI -> "+nif+'L');
                break;
            case 20:
                System.out.println("DNI -> "+nif+'C');
                break;
            case 21:
                System.out.println("DNI -> "+nif+'K');
                break;
            case 22:
                System.out.println("DNI -> "+nif+'E');
                break;
            default:
                System.out.println("Escribe el NIF correctamente");

        }

    }//fin main

}//fin class