package Verano.Interfaces;

import javax.swing.*;

import java.awt.*;

public class InterfazGrafica3 {
    
    public static void main(String[] args) {
        
        TextWindow window = new TextWindow();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class TextWindow extends JFrame {

    public TextWindow() {

        setVisible(true);

        setSize(600, 450);

        setLocation(400, 200);

        setTitle("Text Window");

        // Añadimos la capa de texto a la ventana
        TextLayer layer1 = new TextLayer();
        add(layer1);

    }

}

class TextLayer extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.drawString("Lorem ipsum dolor sit amet.", 20, 20);

    }

}
