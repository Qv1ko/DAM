package examenes.examen1.solucion;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        //tipo A
        float kg=80.0f, altura=1.80f, imc=0.0f;
        float metros2=(float)Math.pow(altura, 2);

        imc=kg/metros2;

        if(imc<18.5f) {
            System.out.println("Necesitas comer mas");
        } else if(imc>=18.5f && imc<25f) {
            System.out.println("Normal");
        } else if(imc>=25f && imc<30f) {
            System.out.println("Obesidad");
        } else {
            System.out.println("Obesidad morvida");
        }

        //tipo B
        float salario=1533.98f,salarioAnual=0.0f;

        salarioAnual=salario*14;

        if(salarioAnual<15000) {
            System.out.println("IRPF del 9%");
        } else if(salarioAnual>=15000&&salarioAnual<25000) {
            System.out.println("IRPF del 12%");
        } else if(salarioAnual>=25000&&salarioAnual<50000) {
            System.out.println("IRPF del 20%");
        } else {
            System.out.println("IRPF del 25%");
        }

    }

}