package Verano.Interfaces;

import java.awt.Frame;

import javax.swing.*;

public class Interfaces1 {
    

    public static void main(String[] args) {
        
        window w = new window();        

    }

}

class window extends JFrame {

    public window(){

        // Dimensiones de la ventana
        // setSize(500, 300);

        // Hacer la ventana visible
        setVisible(true);

        // Funcion para que al cerrar la ventana el programa finalice
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Localizacion de la ventana en un eje de cordenadas (pantalla)
        // setLocation(500,300);

        // Dimensiones y localizacion de la ventana
        setBounds(500, 300, 550, 250);

        // Modificacion de las dimensiones de la ventana
        // setResizable(false);

        // Permite maximizar la ventana
        // setExtendedState(Frame.MAXIMIZED_BOTH);

        // Titulo de la ventana
        setTitle("Graphic window");

    }
    
}
