package pack01_Exam;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner ent=new Scanner(System.in);
        boolean correctFormat = true;
        int dia=0,mes=0,ano=0;

        do{
            System.out.print("Escribe un dia: ");
            dia=ent.nextInt();
            System.out.print("Escribe un mes: ");
            mes=ent.nextInt();
            System.out.print("Escribe un ano: ");
            ano=ent.nextInt();

            correctFormat=format(dia,mes,ano);
            if(correctFormat==false) {
                System.out.println("\nIntroduce una fecha valida...\n");
            } else {
                fecha(dia,mes,ano);
            }

        } while(correctFormat!=true);

        ent.close();
        
    } //fin main

    public static boolean format(int dia,int mes,int ano) {

        boolean bool=true;

        if(mes>12||mes<1||ano<0) {
            bool=false;
        } else if(mes==1&&(dia<1||dia>31)||mes==3&&(dia<1||dia>31)||mes==5&&(dia<1||dia>31)||mes==7&&(dia<1||dia>31)||mes==8&&(dia<1||dia>31)||mes==10&&(dia<1||dia>31)||mes==12&&(dia<1||dia>31)) {
            bool=false;
        } else if(mes==2&&(dia<1||dia>28)) {
            bool=false;
        } else if(mes==4&&(dia<1||dia>30)||mes==6&&(dia<1||dia>30)||mes==9&&(dia<1||dia>30)||mes==11&&(dia<1||dia>30)) {
            bool=false;
        }
        return bool; 

    } //fin format

    public static void fecha(int dia,int mes,int ano) {

        String nombreMes="";

        switch(mes) {

            case 1:
                nombreMes="enero";
                break;
            case 2:
                nombreMes="febrero";
                break;
            case 3:
                nombreMes="marzo";
                break;
            case 4:
                nombreMes="abril";
                break;
            case 5:
                nombreMes="mayo";
                break;
            case 6:
                nombreMes="junio";
                break;
            case 7:
                nombreMes="julio";
                break;
            case 8:
                nombreMes="agosto";
                break;
            case 9:
                nombreMes="septiembre";
                break;
            case 10:
                nombreMes="octubre";
                break;
            case 11:
                nombreMes="noviembre";
                break;
            case 12:
                nombreMes="diciembre";
                break;
            default:

        } //fin switch

        System.out.println(dia+" de "+nombreMes+" de "+ano);

    } //fin fecha
    
} //fin class