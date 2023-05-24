package examenes.examen1.solucion;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //tipo A
        float celsius=0.0f;
        int fah=0;

        for(int i=fah;i<=300;i+=20) {
            celsius=((float)(i-32)*5)/9;
            System.out.println(i+" ºF -> "+celsius+" ºC");
        }

        //tipo B
        float faren=0.0f;
        int kel=0;

        for(int j=kel;j<=500;j+=50) {
            faren=(((j-273.15f)*9)/5)+32;
            System.out.println(j+" ºK -> "+faren+" ºF");
        }

    }
    
}