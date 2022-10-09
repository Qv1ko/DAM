package exercises;

public class Exercise01_Repaso2Weekend {

    public static void main(String[] args) {
        
        //declaracion y inicializacion
        float num1=5.31f,num2=2.53f,num3=4.61f,num4=1.02f,num5=8.6f;
        float mid;
        
        //media aritmetica
        mid=(num1+num2+num3+num4+num5)/5;//almaceno la media aritmetica

        System.out.println("Media aritmetica -> "+mid);//muestra de la media aritmetica

        //convertir a entero la media
        int entMid=(int)mid;

        System.out.println("Media en formato entero -> "+entMid);//media en formato entero
        
        //Correccion clase
        int bbdd=5,sis=4,prog=1,lm=6,ed=8;
        double resultado=(bbdd+sis+prog+lm+ed)/5f;
        System.out.println("\nNota final "+resultado);
        System.out.println("Nota yedra "+(int)resultado);

    }//fin main

}//fin class
