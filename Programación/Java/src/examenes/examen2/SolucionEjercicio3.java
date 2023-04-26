package examenes.examen2;

import java.util.Scanner;

public class SolucionEjercicio3 {

    public static void main(String[] args) {
        
        //tipo A
        // Scanner ent=new Scanner(System.in);
        // int numPalos=0,numCarta=0;

        // do {
        //     System.out.print("Introduce el numero de la carta: ");
        //     numCarta=ent.nextInt();
        //     System.out.print("Introduce el numero del palo: ");
        //     numPalos=ent.nextInt();
        // } while(validaCarta(numPalos, numCarta));
        // mostrarCarta(numPalos,numCarta);


        // ent.close();

        //tipo B
        int dia=0,mes=0,ano=0;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.print("Introduce el dia: ");
            dia=sc.nextInt();
            System.out.print("Introduce el mes: ");
            mes=sc.nextInt();
            System.out.print("Introduce el ano: ");
            ano=sc.nextInt();
        } while (!validarFecha(dia,mes,ano));
        mostrarFecha(dia, mes, ano);

        sc.close();

    } //fin main

    //metodo validaCarta - tipo A
    public static boolean validaCarta(int palo,int carta) {

        boolean valida=false;
        if((palo<1||palo>4)||(carta<1||carta>12)) {
            valida=true;
        }
        return valida;

    } //fin validaCarta - tipo A

    //metodo mostrarCarta - tipo A
    public static void mostrarCarta(int palo,int carta) {

        String nombreCarta="",nombrePalo="";

        switch(carta) {
            case 1: nombreCarta="as "; break;
            case 2: nombreCarta="2 "; break;
            case 3: nombreCarta="3 "; break;
            case 4: nombreCarta="4 "; break;
            case 5: nombreCarta="5 "; break;
            case 6: nombreCarta="6 "; break;
            case 7: nombreCarta="7 "; break;
            case 8: nombreCarta="8 "; break;
            case 9: nombreCarta="9 "; break;
            case 10: nombreCarta="sota "; break;
            case 11: nombreCarta="caballo "; break;
            case 12: nombreCarta="rey "; break;
        }
        switch(palo) {
            case 1: nombrePalo=" oros"; break;
            case 2: nombrePalo=" copas"; break;
            case 3: nombrePalo=" bastos"; break;
            case 4: nombrePalo=" espadas"; break;
        }

        System.out.println(nombreCarta+"de"+nombrePalo);

    } //fin mostrarCarta - tipo A

    //metodo validarFecha - tipo B
    public static boolean validarFecha(int dia,int mes,int ano) {

        boolean valida=true;

        if((mes==4||mes==6||mes==9||mes==11)&&(dia<1&&dia>30)) {
            valida=false;
        } else if(mes==2&&(dia<1||dia>28)) {
            valida=false;
        } else if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&(dia<1||dia>31)) {
            valida=false;
        }

        return valida;

    } //fin validarFecha - tipo B

    //metodo mostrarFecha - tipo B
    public static void mostrarFecha(int dia,int mes,int ano) {
        
        String nombreMes="";

        switch(mes) {
            case 1: nombreMes="enero"; break;
            case 2: nombreMes="febrero"; break;
            case 3: nombreMes="marzo"; break;
            case 4: nombreMes="abril"; break;
            case 5: nombreMes="mayo"; break;
            case 6: nombreMes="junio"; break;
            case 7: nombreMes="julio"; break;
            case 8: nombreMes="agosto"; break;
            case 9: nombreMes="septiembre"; break;
            case 10: nombreMes="octubre"; break;
            case 11: nombreMes="noviembre"; break;
            case 12: nombreMes="diciembre"; break;
        } //fin switch

        System.out.println(dia+" de "+nombreMes+" de "+ano);

    } //fin mostrarFecha - tipo B
    
} //fin class