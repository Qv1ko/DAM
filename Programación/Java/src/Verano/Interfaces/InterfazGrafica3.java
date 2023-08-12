package Verano.Interfaces;

import javax.swing.*;

import java.awt.*;

public class InterfazGrafica3 {
    
    public static void main(String[] args) {
        
        textWindow window = new textWindow();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class textWindow extends JFrame {

    public textWindow() {

        setVisible(true);

        setSize(600, 450);

        setLocation(400, 200);

        setTitle("Text Window");

        // Añadimos la capa de texto a la ventana
        layer layer1 = new layer();
        add(layer1);

    }

}

class layer extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawString("Lorem ipsum dolor sit amet.", 20, 20);

    }

}
