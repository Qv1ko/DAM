package verano.interfaces;

import javax.swing.*;

import java.awt.*;

public class InterfazGrafica7 {
    
    public static void main(String[] args) {
        
        FontsWindow window = new FontsWindow();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);

    }

}

class FontsWindow extends JFrame {

    public FontsWindow() {

        setTitle("Fonts Window");

        setSize(600, 450);

        FontLayer layer1 = new FontLayer();
        add(layer1);

        // Color para todos los graficos de la ventana
        layer1.setForeground(Color.BLUE);

    }

}

class FontLayer extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Fuente
        Font myFont = new Font("Arial", Font.BOLD, 15);
        g2d.setFont(myFont);

        // g2d.setColor(Color.ORANGE);

        // Texto
        g2d.drawString("Lorem ipsum dolor sit amet.", 100, 100);

        g2d.setFont(new Font("Verdana", Font.ITALIC, 20));
        // g2d.setColor(Color.BLACK);
        g2d.drawString("Lorem ipsum dolor sit amet.", 100, 200);

    }

}
