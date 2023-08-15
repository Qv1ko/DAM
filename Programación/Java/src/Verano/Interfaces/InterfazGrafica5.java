package Verano.Interfaces;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class InterfazGrafica5 {

    public static void main(String[] args) {

        ColorWindow window = new ColorWindow();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setVisible(true);

    }

}

class ColorWindow extends JFrame {

    public ColorWindow() {

        setTitle("Color Window");

        setSize(400, 400);

        ColorLayer layer1 = new ColorLayer();

        add(layer1);

        // Color de fondo
        // layer1.setBackground(Color.PINK);

        //Color por defecto del sistema operativo
        layer1.setBackground(SystemColor.window);

    }

}

class ColorLayer extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Rectangulo
        Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 150);

        // Color del borde
        g2d.setPaint(Color.WHITE);
        g2d.draw(rect);

        // Color
        g2d.setPaint(Color.BLUE);
        g2d.fill(rect);

        // Elipse
        Ellipse2D ellip = new Ellipse2D.Double();

        ellip.setFrame(rect);

        // Color
        // g2d.setPaint(Color.ORANGE);
        // g2d.setPaint(new Color(0, 140, 255));

        Color myColor = new Color(125, 189, 200);
        g2d.setPaint(myColor);
        g2d.fill(ellip);

        g2d.draw(ellip);

    }

}
