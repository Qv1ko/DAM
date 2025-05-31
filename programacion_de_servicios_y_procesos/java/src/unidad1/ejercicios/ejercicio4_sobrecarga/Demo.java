package unidad1.ejercicios.ejercicio4_sobrecarga;

class Demo {

    public void premiar(int numero) {
        System.out.println("\nNúmero premiado: " + numero);
    }

    public void premiar(String cadena) {
        System.out.println("\nNúmero premiado: " + cadena);
    }

    public boolean premiar(int numeroPremiado, int numeroJugado) {
        System.out.println("\nNúmero premiado: " + numeroPremiado + "\nNúmero jugado: " + numeroJugado);
        return numeroPremiado == numeroJugado;
    }

}

class Flow {

    public static void main(String[] args) {
        
        Demo test = new Demo();
        int numero = 3, PREMIADO = (int)(Math.random() * 11);
    
        test.premiar(numero);
        test.premiar(Integer.toString(PREMIADO));
        System.out.println(test.premiar(numero, PREMIADO) ? "\n¡Has ganado!" : "\nHas perdido...");
    
    }

}
