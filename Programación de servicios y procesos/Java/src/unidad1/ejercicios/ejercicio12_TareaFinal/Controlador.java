package unidad1.ejercicios.ejercicio12_TareaFinal;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Controlador {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controlador window = new Controlador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Controlador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(255, 104, 143, 146);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(36, 104, 143, 146);
		frame.getContentPane().add(textPane_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(61, 261, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(286, 261, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("TEXTO 1");
		lblNewLabel.setBounds(36, 80, 143, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TEXTO 2");
		lblNewLabel_1.setBounds(255, 79, 137, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TORRE DE CONTROL");
		lblNewLabel_2.setBounds(196, 11, 308, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(485, 104, 143, 146);
		frame.getContentPane().add(textPane_2);
		
		JLabel lblNewLabel_3 = new JLabel("C\u00F3digo");
		lblNewLabel_3.setBounds(36, 327, 57, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(90, 324, 89, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("path-to-file"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		frame.getContentPane().add(picLabel);
	}
}
