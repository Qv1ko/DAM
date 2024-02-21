package unidad1.ejercicios.ejercicio12_TareaFinal.version1;

import javax.swing.JOptionPane;

public class Controler {

	private FrontData view;
	private Nave nave;

	public void setFrontData(FrontData view) {
		this.view = view;
	}

	public void setNave(Nave nave) {
		this.nave = nave;
	}

	public int codigoNave() {
		return nave.codigo;
	}

	public String nombreNave() {
		return nave.nombre;
	}

	public int capacidad() {
		return nave.capacidad;
	}

	public boolean getNaveEstado() {
		return nave.estado;
	}

	public String despegar() {
		return nave.despegar();
	}

	public String aterrizar() {
		return nave.aterrizar();
	}

	public String permisoDespegar() {
		return nave.solicitarDespegar();
	}

	public String permisoAterrizar() {
		return nave.solicitarAterrizar();
	}

	private void activarArmamento() {
		if (nave instanceof NaveMilitar) {
			NaveMilitar naveMilitar = (NaveMilitar) nave;
			view.setVoladorInfo("¡Armamento activado! nº serie: " + naveMilitar.getArmamento());
		} else {
			view.setVoladorInfo("Esta nave no tiene armamento");
		}
	}


	public Nave getNave() {
		return nave;
	}

	public void cargarDescargarMercancia() {

		Nave nave = getNave();

		if (nave instanceof NaveTransporte) {

			NaveTransporte naveTransporte = (NaveTransporte) nave;
			int cantidadMercancia = naveTransporte.getCargaMercancia();

			if (cantidadMercancia > 0) {
				naveTransporte.descargarMercancia();
			} else {
				naveTransporte.cargarMercancia();
			}

			view.actualizarEstadoMercancia(naveTransporte.getCargaMercancia());

		} else {
			JOptionPane.showMessageDialog(null, "Esta operación solo está disponible para naves de transporte.", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}
	
	public boolean validarCodigoNave(String codigo) {
		try {
			int codigoNave = Integer.parseInt(codigo);
			return codigoNave >= 0;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
