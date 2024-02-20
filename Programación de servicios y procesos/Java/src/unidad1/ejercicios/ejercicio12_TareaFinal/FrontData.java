package unidad1.ejercicios.ejercicio12_TareaFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontData {

    private JFrame frame;
    private JLabel voladorLabel;
    private JTextArea textArea;
    private JTextArea textArea1;
    private JTextArea textArea3;
    private JButton btnMostrar;
    private JButton btnDespegar;
    private JButton btnAterrizar;
    private JButton btnListado;
    private JButton btnValidar;
    private Controler controler;
    private JTextField txtCodigo;
    private JButton btnArmamento;
    private JTextArea txtArmamento;
    

    private JButton btnCargarDescargarMercancia;

    public FrontData() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setTitle("Control de Torre de Naves Espaciales");
        frame.setBounds(100, 100, 800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        Font font = new Font("Arial", Font.PLAIN, 18);

        btnListado = new JButton("Listado");
        btnListado.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnListado.setEnabled(true); 
        btnListado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int codigo = controler.codigoNave();
                String nombre = controler.nombreNave();
                String mensaje = "Codigo: " + codigo + " || Nombre: " + nombre;
                textArea3.setText(mensaje);
            }
        });
        btnListado.setBounds(88, 5, 100, 20);
        frame.getContentPane().add(btnListado);

        textArea3 = new JTextArea();
        textArea3.setFont(new Font("Monospaced", Font.PLAIN, 11));
        textArea3.setBounds(200, 5, 500, 20);
        frame.getContentPane().add(textArea3);

        JLabel lblCodigo = new JLabel("Ingrese el código de la nave:");
        lblCodigo.setFont(font);
        lblCodigo.setBounds(88, 30, 250, 30);
        frame.getContentPane().add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setFont(font);
        txtCodigo.setBounds(350, 30, 150, 30);
        frame.getContentPane().add(txtCodigo);

        btnValidar = new JButton("Validar");
        btnValidar.setFont(font);
        btnValidar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (controler.validarCodigoNave(txtCodigo.getText())) {
                    btnMostrar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese un valor numérico válido en el campo de código", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnValidar.setBounds(520, 30, 100, 30);
        frame.getContentPane().add(btnValidar);

        btnMostrar = new JButton("Mostrar");
        btnMostrar.setFont(font);
        btnMostrar.setEnabled(false);
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                int codigoIngresado = Integer.parseInt(txtCodigo.getText());

                if (codigoIngresado == controler.codigoNave()) {

                    int codigo = controler.codigoNave();
                    String nombre = controler.nombreNave();
                    int capacidad = controler.capacidad();
                    String estado;

                    if (controler.getNaveEstado()) {
                        estado = "volando";
                    } else {
                        estado = "en tierra";
                    }

                    String permiso;

                    if (estado.equals("volando")) {
                        permiso = controler.permisoAterrizar();
                    } else {
                        permiso = controler.permisoDespegar();
                    }

                    String mensaje = "Codigo: " + codigo + "\nNombre: " + nombre + "\nLa capacidad de la nave es de: " + capacidad + ". \nLa nave está: " + estado + ". \n" + permiso;

                    textArea1.setText(mensaje);

                    btnDespegar.setEnabled(true);
                    btnAterrizar.setEnabled(true);
                    btnCargarDescargarMercancia.setEnabled(true);
                    btnArmamento.setEnabled(true);
                    
                }

            }
        });
        btnMostrar.setBounds(88, 60, 122, 32);
        frame.getContentPane().add(btnMostrar);

        textArea1 = new JTextArea();
        textArea1.setFont(new Font("Monospaced", Font.PLAIN, 24));
        textArea1.setBounds(88, 100, 1000, 200);
        frame.getContentPane().add(textArea1);

        btnDespegar = new JButton("Despegar");
        btnDespegar.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnDespegar.setEnabled(false);
        btnDespegar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (controler.getNaveEstado()) {
                    textArea.setText("La nave está volando. Solicita permiso para aterrizar.");
                } else {
                    textArea.setText(controler.despegar());
                }
            }
        });
        btnDespegar.setBounds(88, 320, 150, 32);
        frame.getContentPane().add(btnDespegar);

        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 24));
        textArea.setBounds(88, 380, 1000, 100);
        frame.getContentPane().add(textArea);

        btnAterrizar = new JButton("Aterrizar");
        btnAterrizar.setFont(new Font("Tahoma", Font.PLAIN, 24));
        btnAterrizar.setEnabled(false);
        btnAterrizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (controler.getNaveEstado()) {
                    textArea.setText(controler.aterrizar());
                } else {
                    textArea.setText("La nave está en tierra. Solicita permiso para despegar.");
                }
            }
        });
        btnAterrizar.setBounds(250, 320, 150, 32);
        frame.getContentPane().add(btnAterrizar);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(88, 500, 1500, 600);
        frame.getContentPane().add(panel);

        btnArmamento = new JButton("Escanear Nave");
        btnArmamento.setFont(font);
        btnArmamento.setEnabled(false);
        btnArmamento.setBounds(10, 10, 200, 30);
        panel.add(btnArmamento);

        txtArmamento = new JTextArea();
        txtArmamento.setBackground(Color.WHITE);
        txtArmamento.setFont(new Font("Monospaced", Font.PLAIN, 24));
        txtArmamento.setEditable(false);
        txtArmamento.setBounds(10, 50, 1000, 100);
        panel.add(txtArmamento);

        btnArmamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                activarArmamento();
            }
        });

        btnCargarDescargarMercancia = new JButton("Cargar/Descargar Mercancía");
        btnCargarDescargarMercancia.setFont(font);
        btnCargarDescargarMercancia.setEnabled(false); // Deshabilitar el botón inicialmente
        btnCargarDescargarMercancia.setBounds(400, 320, 250, 32);
        btnCargarDescargarMercancia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controler.cargarDescargarMercancia();
            }
        });
        frame.getContentPane().add(btnCargarDescargarMercancia);
        frame.setVisible(true);

    }

    public void setControler(Controler controler) {
        this.controler = controler;
    }

    public void setArmamentoOcargaMaxima(String texto) {
        txtArmamento.setText(texto);
    }

    public void setVoladorInfo(String info) {
        voladorLabel.setText(info);
    }

    private void activarArmamento() {
        if (controler.getNave() instanceof NaveMilitar) {
            NaveMilitar naveMilitar = (NaveMilitar) controler.getNave();
            txtArmamento.setText(naveMilitar.nombre + "\nEstado: ¡Armamento activado!"+"\nArmamento: " + naveMilitar.getArmamento());
        } else if (controler.getNave() instanceof NaveTransporte) {

            NaveTransporte naveTransporte = (NaveTransporte) controler.getNave();
            String info = naveTransporte.nombre + "\nEstado: Sin armamento"+"\nCarga Máxima: " + naveTransporte.getCargaMaxima();

            if (naveTransporte.getCargaMercancia() > 0) {
                info += "\nCantidad de mercancía: " + naveTransporte.getCargaMercancia();
            } else {
                info += "\nLa nave está vacía.";
            }

            txtArmamento.setText(info);

        } else {
            txtArmamento.setText("Esta nave no tiene armamento ni carga máxima.");
        }
    }

    public void actualizarEstadoMercancia(int cantidad) {
        txtArmamento.setText("Cantidad de mercancía: " + cantidad);
    }

}
