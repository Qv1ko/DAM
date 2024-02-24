package unidad7.ejercicios.ejercicio1_Hospital;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Validaciones {

    public static int validacionTel(int tel) throws Exception {
        if (Integer.toString(tel).length() != 9) {
            throw new Exception("\n! Numero de telefono inválido\n");
        }
        return tel;
    }

    public static String validacionDni(String dni) throws Exception {
        String nif = "", patronDni = "^\\d{8}\\w$";
        char[] letters = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        if (Pattern.compile(patronDni).matcher(dni).find()) {
            for (int i = 0; i < dni.length() - 1; i++) {
                nif += dni.charAt(i);
            }
            if (letters[Integer.parseInt(nif) % 23] != dni.toUpperCase().charAt(dni.length() - 1)) {
                throw new Exception("\n! DNI inválido");
            }
        } else {
            throw new Exception("\n! Formato incorrecto");
        }
        return dni.toUpperCase();
    }

    public static LocalDate validacionCita(LocalDate fecha) throws Exception {
        if (fecha.isBefore(LocalDate.now())) {
            throw new Exception("\n! Cita inválida\n");
        }
        return fecha;
    }

    public static float validacionSueldo(float sueldo) throws Exception {
        if (sueldo<=0) {
            throw new Exception("\n! Sueldo inválido\n");
        }
        return sueldo;
    }

    public static int validacionLicencia(int licencia) throws Exception {
        if (licencia<=0) {
            throw new Exception("\n! Licencia inválida\n");
        }
        return licencia;
    }

    public static int validacionPacientes(int pacientes) throws Exception {
        if (pacientes<0) {
            throw new Exception("\n! Número de pacientes inválido\n");
        }
        return pacientes;
    }

}
