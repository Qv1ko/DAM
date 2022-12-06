package paqueteExamenes.examen1;


public class Ejercicio1 {

    public static void main(String[] args) {
        
        float salarioMen=1500.57f;

        float salario=salarioMen*14;

        if(salario<15000) {
            System.out.println("El IRPF sera del 9% -> "+(salario*0.09));
        } else if(salario>=15000 && salario<25000) {
            System.out.println("El IRPF sera del 12% -> "+(salario*0.12));
        } else if(salario>=25000 && salario<50000) {
            System.out.println("El IRPF sera del 20% -> "+(salario*0.2));
        } else if(salario>=50000) {
            System.out.println("El IRPF sera del 25% -> "+(salario*0.25));
        }

    } //fin main
    
} //fin class