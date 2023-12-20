package unidad1.clases;

import java.lang.management.ManagementFactory;
import java.time.Instant;

class Clase07_Eficiencia {

    public static void main(String[] args) {

        long inicio = System.nanoTime(), fin = 0, tiempo = 0;
        Frase frase = new Frase(), frase2 = new Frase();

        frase.setTexto("Programando en Java");
        
        System.out.println("Caracter inicial: " + frase.getCaracter());
        frase.mostrarFrase();
        System.out.println("Palabras: " + frase.contar());
        System.out.println("Caracteres 'a': " + frase.contar(true));

        frase2.setTexto("Programa en Java, segunda frase");

        frase2.mostrarFrase();
        System.out.println("Palabras: " + frase2.contar());
        System.out.println("Caracteres 'a': " + frase2.contar(true));

        System.out.println(frase.toString());
    
        fin = System.nanoTime();
        tiempo = (fin - inicio) / 1000000;
    
        System.out.println("Tiempo de ejecución: " + tiempo + " milisegundos");

        executionTime1();
        executionTime2();
        executionTime3();
    
    }

    public static void executionTime1() {

        long inicio = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime(), fin = 0, tiempo = 0;
        Frase frase = new Frase(), frase2 = new Frase();
        
        System.out.println("\n -------- Obtener tiempo de ejecución 1 -------- \n");
        
        frase.setTexto("Programando en Java");
        
        System.out.println("Caracter inicial: " + frase.getCaracter());
        frase.mostrarFrase();
        System.out.println("Palabras: " + frase.contar());
        System.out.println("Caracteres 'a': " + frase.contar(true));
        
        frase2.setTexto("Programa en Java, segunda frase");
        
        frase2.mostrarFrase();
        System.out.println("Palabras: " + frase2.contar());
        System.out.println("Caracteres 'a': " + frase2.contar(true));
        
        System.out.println(frase.toString());
        
        fin = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
        System.out.println(inicio);
        System.out.println(fin);
        tiempo = (fin - inicio) / 1000000;

        System.out.println("Tiempo de ejecución de la CPU: " + tiempo + " milisegundos");

    }

    public static void executionTime2() {

        long inicio = System.currentTimeMillis(), fin = 0, tiempo = 0;
        Frase frase = new Frase(), frase2 = new Frase();

        System.out.println("\n -------- Obtener tiempo de ejecución 2 -------- \n");

        frase.setTexto("Programando en Java");
        
        System.out.println("Caracter inicial: " + frase.getCaracter());
        frase.mostrarFrase();
        System.out.println("Palabras: " + frase.contar());
        System.out.println("Caracteres 'a': " + frase.contar(true));

        frase2.setTexto("Programa en Java, segunda frase");

        frase2.mostrarFrase();
        System.out.println("Palabras: " + frase2.contar());
        System.out.println("Caracteres 'a': " + frase2.contar(true));

        System.out.println(frase.toString());
    
        fin = System.currentTimeMillis();
        tiempo = fin - inicio;
    
        System.out.println("Tiempo de ejecución: " + tiempo + " milisegundos");

    }

    private static void executionTime3() {
    
        long inicio = Instant.now().toEpochMilli(), fin = 0, tiempo = 0;
        Frase frase = new Frase(), frase2 = new Frase();
    
        System.out.println("\n -------- Obtener tiempo de ejecución 3 -------- \n");
    
        frase.setTexto("Programando en Java");
        
        System.out.println("Caracter inicial: " + frase.getCaracter());
        frase.mostrarFrase();
        System.out.println("Palabras: " + frase.contar());
        System.out.println("Caracteres 'a': " + frase.contar(true));
    
        frase2.setTexto("Programa en Java, segunda frase");
    
        frase2.mostrarFrase();
        System.out.println("Palabras: " + frase2.contar());
        System.out.println("Caracteres 'a': " + frase2.contar(true));
    
        System.out.println(frase.toString());
    
        fin = Instant.now().toEpochMilli();
        tiempo = fin - inicio;

        System.out.println("Tiempo de ejecución: " + tiempo + " milisegundos");
    
    }

}

class Frase {

    private String texto;

    public Frase() {
        this.texto = "";
    }

    public Frase(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCaracter() {
        return (getTexto().toCharArray().length > 0) ? Character.toString(getTexto().toCharArray()[0]) : "";
    }

    public int contar() {
        return getTexto().split(" ").length;
    }

    public int contar(boolean contarA) {

        int contador = 0;

        if (contarA) {
            for (char letra : getTexto().toCharArray()) {
                contador += (letra == 'a')? 1 : 0;
            }
        } else {
            contador = getTexto().split(" ").length;
        }

        return contador;

    }

    @Override
    public String toString() {
        return texto;
    }

    public void mostrarFrase() {
        System.out.println(this.toString());
    }

}
