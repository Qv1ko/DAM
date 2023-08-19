package verano.interfaces;

import javax.swing.*;

public class InterfazGrafica1 {
    

    public static void main(String[] args) {
        
        Window w = new Window();

        // Hacer la ventana visible
        w.setVisible(true);
        
        // Funcion para que al cerrar la ventana el programa finalice
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Window extends JFrame {

    public Window(){

        // Dimensiones de la ventana
        // setSize(500, 300);

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
