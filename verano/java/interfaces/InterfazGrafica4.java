package verano.interfaces;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class InterfazGrafica4 {

    public static void main(String[] args) {

        DrawingWindow window = new DrawingWindow();

        window.setVisible(true);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class DrawingWindow extends JFrame {

    public DrawingWindow() {

        setTitle("Drawing Window");

        setSize(400, 400);

        FigureLayer layer1 = new FigureLayer();

        add(layer1);

    }

}

class FigureLayer extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // Rectangulo
        // g.drawRect(50, 50, 200, 200);

        // Linea
        // g.drawLine(100, 100, 300, 200);

        // Arco
        // g.drawArc(50, 100, 100, 200, 120, 150);


        // Figuras 2D

        Graphics2D g2d = (Graphics2D) g;

        // Rectangulo
        Rectangle2D rect = new Rectangle2D.Double(100, 100, 200.25, 150);
        // g2d.draw(rect);

        // Elipse
        Ellipse2D ellip = new Ellipse2D.Double();
        // Usamos el rectangulo para definir las dimensiones de la elipse
        ellip.setFrame(rect);
        g2d.draw(ellip);

        // Linea
        g2d.draw(new Line2D.Double(100, 100, 350, 250));


        // Elipse
        double xCenter = rect.getCenterX();
        double yCenter = rect.getCenterY();
        double radio = 150;

        Ellipse2D elli = new Ellipse2D.Double();
        elli.setFrame(xCenter, yCenter, xCenter + radio, yCenter + radio);
        g2d.draw(elli);

    }

}
