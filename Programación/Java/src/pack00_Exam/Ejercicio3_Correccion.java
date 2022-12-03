package pack00_Exam;

public class Ejercicio3_Correccion {

    public static void main(String[] args) {
        //tipo A
        int al=0,mayor=0,contMayor=0;

        for(int i=0;i<100;i++) {
            al=(int)(Math.random()*101);
            if(al>mayor) {
                mayor=al;
                contMayor=1;
            } else if(al==mayor) {
                contMayor++;
            }
        }
        System.out.println("Numero menor -> "+mayor+"\nAparecio -> "+contMayor+" veces");


        //tipo B
        int aleatorio=0,menor=99,contMenor=0;

        for(int i=0;i<100;i++) {
            aleatorio=(int)(Math.random()*101);
            if(aleatorio<menor) {
                menor=aleatorio;
                contMenor=1;
            } else if(aleatorio==menor) {
                contMenor++;
            }
        }
        System.out.println("Numero menor -> "+menor+"\nAparecio -> "+contMenor+" veces");

    }
    
}