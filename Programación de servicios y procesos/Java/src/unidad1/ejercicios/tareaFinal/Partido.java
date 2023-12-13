package unidad1.ejercicios.tareaFinal;

public class Partido {

	// Atributos del partido

	private Equipo local, visitante;

	private final int TIEMPOFINAL = 90;
	private final int MEDIOTIEMPO = TIEMPOFINAL / 2;
	private final int PRORROGA = 120;
	private int minuto = 1;

	private int golesLocal = 0;
	private int golesVisitante = 0;

	private final int PENALTIS = 5;
	private int tirador = 0;

	private int ronda = 1;
	private int penaltisLocal = 0;
	private int penaltisVisitante = 0;

	// Constructores (Overloading)

	public Partido() {
		this.local = null;
		this.visitante = null;
	}

	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
	}

	// Método principal

	public Equipo jugarPartido() {

		System.out.println("\n\n-------- " + local.getNombre() + " VS " + visitante.getNombre() + " --------");

		System.out.println(local.toString());

		System.out.println(visitante.toString());

		esperaLenta();

		System.out.println("\n---------------- PRIMER TIEMPO ----------------");

		for (minuto = 1; minuto <= TIEMPOFINAL; minuto++) {

			if (aleatoriedad()) {
				jugadaLocal();
			} else {
				jugadaVisitante();
			}

			espera();

			if (minuto == MEDIOTIEMPO) {
				espera();
				System.out.println("\n---------------- SEGUNDO TIEMPO ----------------");
			}

		}

		esperaLenta();

		if (golesLocal == golesVisitante) {

			System.out.println("\n---------------- PRORROGA ----------------");

			for (; minuto <= PRORROGA; minuto++) {

				espera();

				if (aleatoriedad()) {
					jugadaLocal();
				} else {
					jugadaVisitante();
				}

			}

			if (golesLocal == golesVisitante) {
				System.out.println("\n---------------- PENALTIS ----------------");
				penaltis(aleatoriedad());
			} else {
				System.out.println("\n---------------- RESULTADO FINAL ----------------\n" + local.getNombre() + " "
						+ golesLocal + " - " + golesVisitante + " " + visitante.getNombre());
			}

		} else {
			System.out.println("\n---------------- RESULTADO FINAL ----------------\n" + local.getNombre() + " "
					+ golesLocal + " - " + golesVisitante + " " + visitante.getNombre());
		}

		esperaLenta();

		return (golesLocal + penaltisLocal > golesVisitante + penaltisVisitante) ? local : visitante;

	}

	// Métodos de tiros a puerta

	private void jugadaLocal() {

		for (Jugador jugador : local.getConvocatoria()) {
			if (tiro(jugador.getTiro()) && !parada(visitante)) {
				golesLocal++;
				System.out.println(jugador.getNombre() + " " + minuto + "\'" + (isPenalti() ? " (P)" : "") + " ("
						+ local.getNombre() + ")");
				espera();
				break;
			}
		}

	}

	private void jugadaVisitante() {

		for (Jugador jugador : visitante.getConvocatoria()) {
			if (tiro(jugador.getTiro()) && !parada(local)) {
				golesVisitante++;
				System.out.println(jugador.getNombre() + " " + minuto + "\'" + (isPenalti() ? " (P)" : "") + " ("
						+ visitante.getNombre() + ")");
				espera();
				break;
			}
		}

	}

	// Método de la fase de penaltis

	private void penaltis(boolean moneda) {
		System.out.println("\n" + local.getNombre() + " " + golesLocal
				+ ((penaltisLocal != 0) ? "(" + penaltisLocal + ") - " : " - ") + golesVisitante
				+ ((penaltisVisitante != 0) ? "(" + penaltisVisitante + ") - " : " ") + visitante.getNombre());

		esperaLenta();

		System.out.println("\n---------------- RONDA " + ronda + " ----------------");

		for (int i = 0; i < PENALTIS; i++) {

			tirador--;

			if (tirador < 0) {
				tirador = Math.min(local.getConvocatoria().length, visitante.getConvocatoria().length) - 1;
			}

			esperaLenta();

			if (moneda) {
				penaltiLocal(tirador);
				esperaLenta();
				penaltiVisitante(tirador);
			} else {
				penaltiVisitante(tirador);
				esperaLenta();
				penaltiLocal(tirador);
			}

			if ((PENALTIS - 1) - i + penaltisLocal < penaltisVisitante
					|| (PENALTIS - 1) - i + penaltisVisitante < penaltisLocal) {
				break;
			}

		}

		ronda++;

		if (penaltisLocal != penaltisVisitante) {
			esperaLenta();
			System.out.println("\n---------------- RESULTADO FINAL ----------------\n" + local.getNombre() + " "
					+ golesLocal + "(" + penaltisLocal + ") - " + golesVisitante + "(" + penaltisVisitante + ") "
					+ visitante.getNombre());
		} else {
			penaltis(moneda);
		}

	}

	// Métodos de tiros en penaltis

	private void penaltiLocal(int tirador) {

		if (penalti(local.getConvocatoria()[tirador].getTiro()) && !paradaPenalti(visitante)) {
			penaltisLocal++;
			System.out.println(
					"Goool de " + local.getConvocatoria()[tirador].getNombre() + " (" + local.getNombre() + ")");
		} else {
			System.out.println(
					"Fallo de " + local.getConvocatoria()[tirador].getNombre() + " (" + local.getNombre() + ")");
		}

	}

	private void penaltiVisitante(int tirador) {

		if (penalti(visitante.getConvocatoria()[tirador].getTiro()) && !paradaPenalti(local)) {
			penaltisVisitante++;
			System.out.println("Goool de " + visitante.getConvocatoria()[tirador].getNombre() + " ("
					+ visitante.getNombre() + ")");
		} else {
			System.out.println("Fallo de " + visitante.getConvocatoria()[tirador].getNombre() + " ("
					+ visitante.getNombre() + ")");
		}

	}

	// Métodos de aleatoriedad

	private boolean aleatoriedad() {
		return ((int) (Math.random() * 100)) % 2 == 0;
	}

	private boolean tiro(int tiro) {
		return (int) (Math.random() * 100) < tiro && fallo();
	}

	private boolean fallo() {
		return aleatoriedad() && aleatoriedad() && aleatoriedad() && aleatoriedad() && aleatoriedad() && aleatoriedad();
	}

	private boolean isPenalti() {
		return aleatoriedad() && aleatoriedad() && aleatoriedad() && aleatoriedad();
	}

	private boolean parada(Equipo equipo) {

		boolean parada = false;

		if (aleatoriedad()) {
			parada = (int) (Math.random() * 100) <= equipo.getPortero().getParada();
		} else {
			parada = (int) (Math.random() * 100) <= equipo
					.getConvocatoria()[(int) (Math.random() * equipo.getConvocatoria().length)].getParada();
		}

		return parada;

	}

	private boolean penalti(int tiro) {
		return (int) (Math.random() * 100) < (tiro * 2);
	}

	private boolean paradaPenalti(Equipo equipo) {
		return (int) (Math.random() * 100) <= equipo.getPortero().getParada() && aleatoriedad();
	}

	// Métodos de espera

	private void espera() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException exc) {
			System.out.println("ERROR - Fallo en la espera");
		}
	}

	private void esperaLenta() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException exc) {
			System.out.println("ERROR - Fallo en la espera");
		}
	}

}
