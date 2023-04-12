package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * @author Victor
 * @version 0.8
 */

public class GestionAlquileres {

    public static ArrayList<Vehiculos> vehiculos=new ArrayList<Vehiculos>();
    public static ArrayList<Reservas> reservas=new ArrayList<Reservas>();
    
    public static String validadorMatricula(String matricula) throws Exception {
        String patronMatricula="^\\d{4}\\w{3}$";
        if(!Pattern.compile(patronMatricula).matcher(matricula).find()) {
           throw new Exception("\n! La matricula no es valida");
        }
        return matricula.toUpperCase();
    }//validadorMatricula

    public static int validadorPlazas(int plazas) throws Exception {
        if(plazas<1||plazas>9) {
            throw new Exception("\n! El número de plazas no es valido");
        }
        return plazas;
    }//validadorPlazas

    public static Combustibles validadorCombustible(String combustible) throws Exception {
        Combustibles tipoCombustible=null;
        if(combustible.equalsIgnoreCase(Combustibles.DIESEL.toString())||combustible.equalsIgnoreCase("D")) {
            tipoCombustible=Combustibles.DIESEL;
        } else if(combustible.equalsIgnoreCase(Combustibles.GASOLINA.toString())||combustible.equalsIgnoreCase("G")) {
            tipoCombustible=Combustibles.GASOLINA;
        } else if(combustible.equalsIgnoreCase(Combustibles.ELECTRICO.toString())||combustible.equalsIgnoreCase("E")) {
            tipoCombustible=Combustibles.ELECTRICO;
        } else if(combustible.equalsIgnoreCase(Combustibles.HIBRIDO.toString())||combustible.equalsIgnoreCase("H")) {
            tipoCombustible=Combustibles.HIBRIDO;
        } else {
            throw new Exception("\n! Combustible no valido");
        }
        return tipoCombustible;
    }//validadorCombustible

    public static float validadorPrecio(float precio) throws Exception,NumberFormatException {
        precio=Float.parseFloat(new DecimalFormat("#.##").format(precio).replace(',','.'));
        precio=(float)Math.round(precio*100)/100;
        if(precio<=0) {
            throw new Exception("\n! El precio no puede ser 0 o inferior");
        }
        return precio;
    }//validadorPrecio

    public static String validarDni(String dni) throws Exception {
        String nif="",patronDni="^\\d{8}\\w$";
        char[] letters={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        if(Pattern.compile(patronDni).matcher(dni).find()) {
            for(int i=0;i<dni.length()-1;i++) {
                nif+=dni.charAt(i);
            }
            if(letters[Integer.parseInt(nif)%23]!=dni.charAt(dni.length()-1)) {
                throw new Exception("\n! DNI invalido");
            }
        } else {
            throw new Exception("\n! Formato incorrecto");
        }
        return dni.toUpperCase();
    }//validarDni

    public static LocalDateTime validarFechaHora(LocalDateTime fechaHora) throws Exception {
        if(fechaHora.isAfter(LocalDateTime.now())) {
            throw new Exception("Fecha invalida");
        }
        return fechaHora;
    }//validarFechaHora

    public static float importeDevolucion(Reservas reserva) {
        return reserva.getVehiculo().getPrecio()*ChronoUnit.DAYS.between(reserva.getFecha(),LocalDateTime.now());
    }//importeDevolucion

}//class
