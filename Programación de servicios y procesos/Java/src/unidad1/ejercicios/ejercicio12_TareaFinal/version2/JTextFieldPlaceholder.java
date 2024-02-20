package unidad1.ejercicios.ejercicio12_TareaFinal.version2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JTextFieldPlaceholder extends JTextField implements FocusListener {
    private String placeholder;
    private Font originalFont = new Font("Arial", Font.PLAIN, 12); // Almacenar la tipograf�a original

    public JTextFieldPlaceholder(String text) {
        super(text);
        this.placeholder = text;
        this.addFocusListener(this);

        // Agregar un MouseListener para detectar clics en el campo de texto
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setText(""); // Vaciar el campo de texto cuando se haga clic en �l
            }
        });
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Si el campo de texto est� vac�o y no tiene el foco, dibuja el texto del marcador
        if (getText().isEmpty() && !hasFocus()) {
        	g.setFont(originalFont);
            g.setColor(Color.gray);
            double padding = (getHeight() - g.getFontMetrics().getHeight()) / 1.5; // Casteo para que el texto se centre de manera vertical en el textField
            g.drawString(placeholder, getInsets().left, (int) (getHeight() - padding));
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        setFont(originalFont); // Al obtener el foco, establecer la tipograf�a original
        repaint();
    }

    @Override
    public void focusLost(FocusEvent e) {
        setFont(originalFont); // Al perder el foco, restaurar la tipograf�a original
        repaint();
    }
}
