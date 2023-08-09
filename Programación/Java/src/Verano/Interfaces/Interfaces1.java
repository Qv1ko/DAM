package Verano.Interfaces;

import javax.swing.*;

public class Interfaces1 {
    

    public static void main(String[] args) {
        
        window w = new window();        

    }

}

class window extends JFrame {

    public window(){

        // Dimensiones de la ventana
        setSize(500, 300);

        // Hacer la ventana visible
        setVisible(true);

        // Funcion para que al cerrar la ventana el programa finalice
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
