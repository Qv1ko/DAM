package unidad1.ejercicios.ejercicio4_Sobrecarga;

class Final {

    public void premiar(int numGanador) {
        System.out.println("\nNúmero premiado: " + numGanador);
    }

    public void premiar(String numGanador) {
        System.out.println("\nNúmero premiado: " + numGanador);
    }

    public boolean premiar(int numeroPremiado, int numeroJugado) {
        System.out.println("\nNúmero premiado: " + numeroPremiado + "\nNúmero jugado: " + numeroJugado);
        return numeroPremiado == numeroJugado;
    }

}

class FlowFinal {

    public static void main(String[] args) {
        
        Demo test = new Demo();
    
        test.premiar(4);
        test.premiar(Integer.toString(3));
        System.out.println(test.premiar(4, (int)(Math.random()*11)) ? "\n¡Has ganado!" : "\nHas perdido...");
    
    }

}