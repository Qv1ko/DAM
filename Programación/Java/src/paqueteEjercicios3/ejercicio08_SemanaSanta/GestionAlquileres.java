package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

/*
 * @author Victor
 * @version 0.2
 */

public class GestionAlquileres {
    
    public static String validadorMatricula(String matricula) throws Exception {
        String matriculaPatron="^\\d{4}\\w{3}$";
        if(!Pattern.compile(matriculaPatron).matcher(matricula).find()) {
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
        } else if(combustible.equalsIgnoreCase(Combustibles.GAS.toString())||combustible.equalsIgnoreCase("G")) {
            tipoCombustible=Combustibles.GAS;
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
        precio=Float.parseFloat(new DecimalFormat("#.##").format(precio));
        if(precio<=0) {
            throw new Exception("\n! El precio no puede ser 0 o inferior");
        }
        return precio;
    }//validadorPrecio

}//class
