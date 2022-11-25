package pack01_Exam;

import java.util.Scanner;

public class Ejercicio3_Correccion {

    public static void main(String[] args) {
        
        //tipo A
        // Scanner ent=new Scanner(System.in);

        // System.out.print("Introduce la carta: ");

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
            mostrarFecha(dia, mes, ano);
        } while (!validarFecha(dia,mes,ano));

        sc.close();

    } //fin main

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