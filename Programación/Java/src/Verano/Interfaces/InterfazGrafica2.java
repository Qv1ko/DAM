package Verano.Interfaces;

import javax.swing.*;
import java.awt.*;

public class InterfazGrafica2 {

    public static void main(String[] args) {

        CenterWindow window = new CenterWindow();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);

    }

}

class CenterWindow extends JFrame {

    public CenterWindow() {

        // Objeto pantalla
        Toolkit screen = Toolkit.getDefaultToolkit();

        // Dimensiones de la pantalla
        Dimension size = screen.getScreenSize();

        // Alto y ancho de la pantalla
        int heightScreen = size.height;
        int widthScreen = size.width;

        setSize(widthScreen / 2, heightScreen / 2);

        setLocation(widthScreen / 4, heightScreen / 4);

        setTitle("Center Window");

        // Nuevo icono de la ventana
        Image myIcon = screen.getImage("Programaci\u00F3n\\Java\\src\\Verano\\Interfaces\\content\\icon.png");
        setIconImage(myIcon);

    }

}
