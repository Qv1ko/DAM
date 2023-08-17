package Verano.Interfaces;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

public class InterfazGrafica8 {

    public static void main(String[] args) {

        ImageWindow window = new ImageWindow();

        window.setVisible(true);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class ImageWindow extends JFrame {

    public ImageWindow() {

        setTitle("Image Window");

        setBounds(750, 300, 300, 200);

        ImageLayer layer1 = new ImageLayer();
        add(layer1);

    }

}

class ImageLayer extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // File myImage = new File("Programación\\Java\\src\\Verano\\Interfaces\\content\\icon.png");

        try {
            image = ImageIO.read(new File("Programación\\Java\\src\\Verano\\Interfaces\\content\\icon.png"));
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        g.drawImage(image, 5, 5, null);

    }

    private Image image;

}
