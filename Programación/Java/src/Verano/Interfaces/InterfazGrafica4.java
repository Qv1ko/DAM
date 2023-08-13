package Verano.Interfaces;

import java.awt.*;

import javax.swing.*;

public class InterfazGrafica4 {

    public static void main(String[] args) {

        drawingWindow window = new drawingWindow();

        window.setVisible(true);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class drawingWindow extends JFrame {

    public drawingWindow() {

        setTitle("Drawing Window");

        setSize(400, 400);

        figureLayer layer1 = new figureLayer();

        add(layer1);

    }

}

class figureLayer extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // Rectangulo
        // g.drawRect(50, 50, 200, 200);

        // Linea
        // g.drawLine(100, 100, 300, 200);

        // Arco
        g.drawArc(50, 100, 100, 200, 120, 150);

    }

}
