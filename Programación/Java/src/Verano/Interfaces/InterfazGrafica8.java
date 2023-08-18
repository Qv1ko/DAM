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

    public ImageLayer() {

        // File myImage = new File("Programación\\Java\\src\\Verano\\Interfaces\\content\\icon.png");
    
        try {
            image = ImageIO.read(new File("Programación\\Java\\src\\Verano\\Interfaces\\content\\icon.png"));
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // Valores de la imagen
        int widthImage = image.getWidth(this);
        int heigthImage = image.getHeight(this);

        g.drawImage(image, 0, 0, null);

        // Mosaico de la imagen
        for (int i = 0; i < 300; i ++) {

            for (int j = 0; j < 200; j ++) {

                if (i + j > 0) {
                    g.copyArea(0, 0, widthImage, heigthImage, i * 200, j * 200);
                }
                
            }

        }

    }

    private Image image;

}
