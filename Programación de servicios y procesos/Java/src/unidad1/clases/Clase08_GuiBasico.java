package unidad1.clases;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Clase08_GuiBasico {

    public static void main(String[] args) {
        Front window = new Front();
    }

}

class Front {

    private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField;
    private JTextArea textArea;

    public Front() {

        this.frame = new JFrame();
        this.frame.setBounds(200, 200, 600, 500);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);

        this.label1 = new JLabel("Titulo");
        this.label1.setBounds(190, 45, 118, 34);
        this.label1.setFont(new Font("Dialog", Font.BOLD, 18));
        this.frame.getContentPane().add(this.label1);

        this.label2 = new JLabel("Subtitulo");
        this.label2.setBounds(200, 85, 118, 34);
        this.label1.setFont(new Font("Dialog", Font.BOLD, 18));
        this.frame.getContentPane().add(this.label2);

        this.label3 = new JLabel("Apartado");
        this.label3.setBounds(200, 105, 118, 34);
        this.label1.setFont(new Font("Dialog", Font.BOLD, 18));
        this.frame.getContentPane().add(this.label3);

        this.textField = new JTextField();
        this.textField.setBounds(250, 45, 64, 24);
        this.textField.setColumns(10);
        this.frame.getContentPane().add(this.textField);

        this.textField = new JTextField();
        this.textField.setBounds(275, 85, 64, 24);
        this.textField.setColumns(10);
        this.frame.getContentPane().add(this.textField);

        this.textArea = new JTextArea();
        this.textArea.setBounds(200, 128, 200, 200);
        this.frame.getContentPane().add(this.textArea);

        frame.setVisible(true);

    }

}
