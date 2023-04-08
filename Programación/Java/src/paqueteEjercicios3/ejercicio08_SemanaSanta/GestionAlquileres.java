package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.util.regex.Pattern;

/*
 * @author Victor
 * @version 0.1
 */

public class GestionAlquileres {
    
    public static String validadorMatricula(String matricula) throws Exception {
        String matriculaPatron="^\\d{4}\\w{3}$";
        if(!Pattern.compile(matriculaPatron).matcher(matricula).find()) {
           throw new Exception("\n! La matricula no es valida\n");
        }
        return matricula;
    }

}
