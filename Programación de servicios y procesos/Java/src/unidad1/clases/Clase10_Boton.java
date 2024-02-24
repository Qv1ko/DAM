package unidad1.clases;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Clase10_Boton {

    public static void main(String[] args) {
        new ButtonFront();
    }

}

class ButtonFront {

    private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField;
    private JTextArea textArea;
    private JButton button;
    private String str = "vacio\n";

    public ButtonFront() {

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

        this.button = new JButton("Opcion");
        this.button.setBounds(190, 400, 158, 34);
        this.button.setFont(new Font("Tahoma", Font.BOLD, 16));
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
               textField.setText("Botón pulsado...");
            }
        });
        this.button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked (MouseEvent e) {
                str += "Ratón en movimiento\n";
                textArea.setText(str);
            }
        });
        this.button.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                str += "Ratón en movimiento - Frame\n";
                textArea.setText(str);
            }
        });
        this.frame.getContentPane().add(this.button);

        this.frame.setVisible(true);

    }

}
