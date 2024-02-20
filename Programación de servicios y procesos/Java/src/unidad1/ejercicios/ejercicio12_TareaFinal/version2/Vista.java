package unidad1.ejercicios.ejercicio12_TareaFinal.version2;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista {

	private JFrame torre;
	private JLabel titulo;
	private JTextPane listaAterrizar;
	private JTextPane infoHangar;
	private JButton actualizar;
	private JTextPane infoNave;
	private JTextPane listaDepegar;
	private JTextFieldPlaceholder textField;
	private JButton aceptar;
	private JButton denegar;
	private BufferedImage despegue;
	private JLabel imagenDespegue;
	private BufferedImage aterrizaje;
	private JLabel imagenAterrizaje;

	Controlador controlador = new Controlador();

	public static void run() {
		try {
			Vista window = new Vista();
			window.torre.setVisible(true);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public Vista() throws IOException {

		controlador.generadorNaves(5, 20, 100f);

		for (Nave nave : controlador.getRegistro()) {
			nave.imprimir();
		}

		initialize();
		
	}
	
	private void initialize() throws IOException {

		torre = new JFrame();
		torre.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		torre.setTitle("Torre de control");
		torre.setBounds(100, 100, 700, 500);
		torre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		torre.getContentPane().setLayout(null);
		
		titulo = new JLabel("TORRE DE CONTROL");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Arial", Font.BOLD, 24));
		titulo.setBounds(0, 11, 684, 23);
		torre.getContentPane().add(titulo);		
		
		listaAterrizar = new JTextPane();
		listaAterrizar.setEditable(false);
		listaAterrizar.setBounds(30, 75, 150, 256);
		torre.getContentPane().add(listaAterrizar);
		
		
		infoHangar = new JTextPane();
		infoHangar.setEditable(false);
		infoHangar.setBounds(220, 75, 250, 124);
		torre.getContentPane().add(infoHangar);

		actualizar = new JButton("ACTUALIZAR");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioEstado();
			}
		});

		actualizar.setFont(new Font("Arial", Font.BOLD, 12));
		actualizar.setBackground(new Color(211, 211, 211));
		actualizar.setForeground(new Color(0, 0, 0));
		actualizar.setBounds(220, 215, 250, 25);
		torre.getContentPane().add(actualizar);
		
		infoNave = new JTextPane();
		infoNave.setEditable(false);
		infoNave.setBounds(220, 256, 250, 75);
		torre.getContentPane().add(infoNave);
		
		listaDepegar = new JTextPane();
		listaDepegar.setEditable(false);
		listaDepegar.setBounds(510, 75, 150, 256);
		torre.getContentPane().add(listaDepegar);
		
		textField = new JTextFieldPlaceholder("Introduzca el código...");
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setForeground(new Color(109, 109, 109));
		textField.setToolTipText("");
		textField.setBounds(245, 350, 200, 25);
		torre.getContentPane().add(textField);
		textField.setColumns(10);
		
		aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioEstado();
			}
		});

		aceptar.setFont(new Font("Arial", Font.BOLD, 12));
		aceptar.setBackground(new Color(0, 223, 112));
		aceptar.setForeground(new Color(0, 0, 0));
		aceptar.setBounds(220, 400, 100, 25);
		torre.getContentPane().add(aceptar);
		
		denegar = new JButton("DENEGAR");
		denegar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				denegar.setBackground(new Color(255, 122, 122));
				controlador.cambioEstado();
			}

		});

		denegar.setFont(new Font("Arial", Font.BOLD, 12));
		denegar.setBackground(new Color(255, 102, 102));
		denegar.setForeground(new Color(0, 0, 0));
		denegar.setBounds(370, 400, 100, 25);
		torre.getContentPane().add(denegar);

		despegue = ImageIO.read(this.getClass().getResource("imagenes/despegue.png"));
		imagenDespegue = new JLabel(new ImageIcon(despegue));
		imagenDespegue.setToolTipText("");
		imagenDespegue.setBounds(510, 325, 150, 120);
		torre.getContentPane().add(imagenDespegue);
		
		aterrizaje = ImageIO.read(this.getClass().getResource("imagenes/aterrizaje.png"));
		imagenAterrizaje = new JLabel(new ImageIcon(aterrizaje));
		imagenAterrizaje.setToolTipText("");
		imagenAterrizaje.setBounds(30, 325, 150, 120);
		torre.getContentPane().add(imagenAterrizaje);
		
	}

	private void actualizarListas() {



		listaAterrizar.setText("Texto a agregar al JTextPane");
		listaDepegar.setText("null");
	}

}
