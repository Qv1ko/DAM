package unidad1.ejercicios.ejercicio11_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

class Flow {

    public static void main(String[] args) {
        new App();
    }

}

class App {

    private JFrame frame;
    private JLabel title;
    private JButton greenButton;
    private JLabel text;
    private JTextField[] numbers = new JTextField[5], stars = new JTextField[2];
    private JButton redButton, blueButton;
    private JTextArea info;
    private Set<Integer> generated = new HashSet<Integer>();

    public App() {

        // App Window
        this.frame = new JFrame();
        this.frame.setBounds(400, 200, 400, 400);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);

        // Title
        this.title = new JLabel("EUROMILLONES");
        this.title.setBounds(96, 16, 208, 32);
        this.title.setHorizontalAlignment(JTextField.CENTER);
        this.title.setFont(new Font("Arial", Font.BOLD, 24));

        this.frame.getContentPane().add(this.title);

        // Green Button
        this.greenButton = new JButton("SORTEO");
        this.greenButton.setBounds(152, 64, 96, 24);
        this.greenButton.setFont(new Font("Arial", Font.BOLD, 16));

        this.greenButton.setBackground(Color.WHITE);
        this.greenButton.setForeground(Color.GREEN);
        this.greenButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        this.greenButton.addActionListener(actionGreenButton);
        this.frame.getContentPane().add(greenButton);

        // First Text
        this.text = new JLabel("Números");
        this.text.setBounds(16, 120, 80, 24);
        this.text.setFont(new Font("Arial", Font.BOLD, 16));

        this.frame.getContentPane().add(this.text);

        // Winning numbers
        this.numbers[0] = new JTextField();
        this.numbers[0].setBounds(104, 120, 24, 24);
        this.numbers[0].setHorizontalAlignment(JTextField.CENTER);
        this.numbers[0].setColumns(2);

        this.frame.getContentPane().add(this.numbers[0]);

        this.numbers[1] = new JTextField();
        this.numbers[1].setBounds(144, 120, 24, 24);
        this.numbers[1].setHorizontalAlignment(JTextField.CENTER);
        this.numbers[1].setColumns(2);

        this.frame.getContentPane().add(this.numbers[1]);

        this.numbers[2] = new JTextField();
        this.numbers[2].setBounds(184, 120, 24, 24);
        this.numbers[2].setHorizontalAlignment(JTextField.CENTER);
        this.numbers[2].setColumns(2);

        this.frame.getContentPane().add(this.numbers[2]);

        this.numbers[3] = new JTextField();
        this.numbers[3].setBounds(224, 120, 24, 24);
        this.numbers[3].setHorizontalAlignment(JTextField.CENTER);
        this.numbers[3].setColumns(2);

        this.frame.getContentPane().add(this.numbers[3]);

        this.numbers[4] = new JTextField();
        this.numbers[4].setBounds(264, 120, 24, 24);
        this.numbers[4].setHorizontalAlignment(JTextField.CENTER);
        this.numbers[4].setColumns(2);

        this.frame.getContentPane().add(this.numbers[4]);

        // Second Text
        this.text = new JLabel("Estrellas");
        this.text.setBounds(16, 160, 80, 24);
        this.text.setFont(new Font("Arial", Font.BOLD, 16));

        this.frame.getContentPane().add(this.text);

        // Winning stars
        this.stars[0] = new JTextField();
        this.stars[0].setBounds(104, 160, 24, 24);
        this.stars[0].setHorizontalAlignment(JTextField.CENTER);
        this.stars[0].setColumns(2);

        this.frame.getContentPane().add(this.stars[0]);

        this.stars[1] = new JTextField();
        this.stars[1].setBounds(144, 160, 24, 24);
        this.stars[1].setHorizontalAlignment(JTextField.CENTER);
        this.stars[1].setColumns(2);

        this.frame.getContentPane().add(this.stars[1]);

        // Red Button
        this.redButton = new JButton("ENVIAR");
        this.redButton.setBounds(96, 200, 96, 24);
        this.redButton.setFont(new Font("Arial", Font.BOLD, 16));

        this.redButton.setBackground(Color.WHITE);
        this.redButton.setForeground(Color.RED);
        this.redButton.setBorder(BorderFactory.createLineBorder(Color.RED));

        this.redButton.addActionListener(actionRedButton);
        this.frame.getContentPane().add(redButton);

        // Blue Button
        this.blueButton = new JButton("BORRAR");
        this.blueButton.setBounds(208, 200, 96, 24);
        this.blueButton.setFont(new Font("Arial", Font.BOLD, 16));

        this.blueButton.setBackground(Color.WHITE);
        this.blueButton.setForeground(Color.BLUE);
        this.blueButton.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        this.blueButton.addActionListener(actionBlueButton);
        this.frame.getContentPane().add(blueButton);

        // Third Text
        this.text = new JLabel("Información");
        this.text.setBounds(16, 256, 96, 16);
        this.text.setFont(new Font("Arial", Font.BOLD, 16));

        this.frame.getContentPane().add(this.text);

        // Information Area
        this.info = new JTextArea();
        this.info.setBounds(16, 280, 352, 64);
        this.info.setBorder(new EmptyBorder(8, 8, 8, 8));
        this.info.setFont(new Font("Arial", Font.BOLD, 12));

        this.frame.getContentPane().add(this.info);

        // Make Visible
        frame.setVisible(true);

    }

    ActionListener actionGreenButton = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            generated.clear();
            for (JTextField number : numbers) {
                number.setText(randomNumber(50));
            }

            generated.clear();
            for (JTextField star : stars) {
                star.setText(randomNumber(12));
            }

        }

    };

    private String randomNumber(int max) {

        int result;

        do {
            result = (int) (Math.random() * max) + 1;
        } while (!generated.add(result));

        return Integer.toString(result);

    }

    ActionListener actionRedButton = new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            info.setText("Sorteo de Euromillones\nNúmeros: " + numbers[0].getText() + "-" + numbers[1].getText() + "-" + numbers[2].getText() + "-" + numbers[3].getText() + "-" + numbers[4].getText() + "\nEstrellas: " + stars[0].getText() + "-" + stars[1].getText());
        }
        
    };
    
    ActionListener actionBlueButton = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            info.setText("");
        }
        
    };

}
