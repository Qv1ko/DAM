package unidad1.ejercicios.ejercicio12_TareaFinal;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista {

	private JFrame torre;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.torre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Vista() throws IOException {
		initialize();
	}

	private void initialize() throws IOException {
		torre = new JFrame();
		torre.getContentPane().setFont(new Font("Arial", Font.PLAIN, 11));
		torre.setTitle("Torre de control");
		torre.setBounds(100, 100, 700, 500);
		torre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		torre.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(220, 75, 250, 150);
		torre.getContentPane().add(textPane);
		
		JButton aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		aceptar.setFont(new Font("Arial", Font.BOLD, 11));
		aceptar.setBackground(new Color(0, 223, 112));
		aceptar.setForeground(new Color(0, 0, 0));
		aceptar.setBounds(220, 400, 100, 25);
		torre.getContentPane().add(aceptar);
		
		JButton denegar = new JButton("DENEGAR");
		denegar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				denegar.setBackground(new Color(255, 122, 122));
			}
		});
		denegar.setBackground(new Color(255, 102, 102));
		denegar.setFont(new Font("Arial", Font.BOLD, 11));
		denegar.setBounds(370, 400, 100, 25);
		torre.getContentPane().add(denegar);
		
		JLabel lblNewLabel = new JLabel("TORRE DE CONTROL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(0, 11, 684, 23);
		torre.getContentPane().add(lblNewLabel);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(30, 75, 150, 256);
		torre.getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBounds(510, 75, 150, 256);
		torre.getContentPane().add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBounds(220, 256, 250, 75);
		torre.getContentPane().add(textPane_3);
		
		JTextFieldPlaceholder textField = new JTextFieldPlaceholder("Introduzca el c�digo...");
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setForeground(new Color(109, 109, 109));
		textField.setToolTipText("");
		textField.setBounds(245, 350, 200, 25);
		torre.getContentPane().add(textField);
		textField.setColumns(10);
		
		BufferedImage despegue = ImageIO.read(this.getClass().getResource("imagenes/despegue.png"));
		JLabel labelDespegue = new JLabel(new ImageIcon(despegue));
		labelDespegue.setToolTipText("");
		labelDespegue.setBounds(510, 325, 150, 120);
		torre.getContentPane().add(labelDespegue);
		
		BufferedImage aterrizaje = ImageIO.read(this.getClass().getResource("imagenes/aterrizaje.png"));
		JLabel labelAterrizaje = new JLabel(new ImageIcon(aterrizaje));
		labelAterrizaje.setToolTipText("");
		labelAterrizaje.setBounds(30, 325, 150, 120);
		torre.getContentPane().add(labelAterrizaje);
		
		
	}
}