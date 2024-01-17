package unidad1.clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Clase10_ModeloVistaControlador {

	public static void main(String[] args) {
		
		View view = new View();
		Controller controller = new Controller();
		NumberModel number = new NumberModel();

		controller.setView(view);
        controller.setNumber(number);
       
        view.setController(controller);
        number.setController(controller);

	}

}

class Controller {

	private View view;
	private NumberModel number;

	public void setView(View view) {
		this.view = view;
	}

	public void setNumber(NumberModel number) {
		this.number = number;
	}

	public void saveNumber(String newNumber) {

		int aux;

		try {
			aux = Integer.parseInt(newNumber);
		} catch (Exception exc) {
			aux = 0;
		}

		this.number.setN(aux);

	}

	public String getNumber() {
		return String.valueOf(this.number.getN());
	}

}

class NumberModel {
	
	private int n;
	private Controller controller;

	public NumberModel() {
		this.n = 0;
	}

	public NumberModel(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

}

class View {

	private JFrame frame;
	private JLabel numberText;
	private JTextField numberField;
	private JButton clearButton, displayButton, saveButton;
	private JTextArea displayArea;
	private Controller controller;

	public View() {

		this.frame = new JFrame();
		this.frame.setBounds(200, 200, 232, 264);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(null);
	
		this.numberText = new JLabel("Número");
		this.numberText.setBounds(16, 16, 88, 24);
		this.numberText.setFont(new Font("Dialog", Font.BOLD, 18));
        this.frame.getContentPane().add(this.numberText);
	
		this.numberField = new JTextField(8);
		this.numberField.setBounds(16, 48, 88, 24);
        this.frame.getContentPane().add(this.numberField);
	
		this.clearButton = new JButton("Limpiar");
		this.clearButton.setBounds(112, 48, 88, 24);
        this.clearButton.setFont(new Font("Dialog", Font.PLAIN, 14));
		clearButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				numberText.setText("");
				displayArea.setText("");
			}
		});
		this.frame.getContentPane().add(this.clearButton);
	
		this.saveButton = new JButton("Guardar");
		this.saveButton.setBounds(16, 80, 88, 24);
        this.saveButton.setFont(new Font("Dialog", Font.PLAIN, 14));
		saveButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				controller.saveNumber(numberField.getText());
			}
		});
		this.frame.getContentPane().add(this.saveButton);
		
		this.displayArea = new JTextArea();
		this.displayArea.setBounds(16, 112, 88, 64);
        this.frame.getContentPane().add(this.displayArea);
		
		this.displayButton = new JButton("Mostrar");
		this.displayButton.setBounds(16, 184, 88, 24);
		this.displayButton.setFont(new Font("Dialog", Font.PLAIN, 14));
		displayButton.addActionListener((new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				displayArea.setText(controller.getNumber());
			}
		}));
        this.frame.getContentPane().add(this.displayButton);
	
		this.frame.setVisible(true);

	}

	public void setNumberModel(String s) {
		numberText.setText(s);
	}

	public int getNumberModel() {
		try {
			return Integer.parseInt(numberField.getText());
		} catch (NumberFormatException exc) {
			return 0;
		}
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

}
    