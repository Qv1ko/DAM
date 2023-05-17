package examenes.examen5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class SolucionApp {

    public static void main(String[] args) {
        ArrayList<Empleados> lista = new ArrayList<Empleados>();
        try {
            leerFichajes(lista);
            // for(Empleados empleado:lista) {
            //     System.out.println(empleado.toFichero());
            // }
            escribirFichero(lista);
        } catch (FileNotFoundException exc) {
            System.out.println("\n! Fichero no encontrado");
        } catch (IOException exc) {
            System.out.println("\n! Error de entrada o salida");
        }
    }

    private static void leerFichajes(ArrayList<Empleados> lista) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("Programación\\Java\\src\\examenes\\examen5\\fichajes.csv"));
        String[] linea = null;
        while (br.ready()) {
            br.readLine().split(";");
            try {
                if(linea[3].equalsIgnoreCase("operador")) {
                    lista.add(new Operadores(linea[0], linea[1], linea[2], LocalTime.parse(linea[5]), LocalTime.parse(linea[6]), Integer.parseInt(linea[4])));
                } else if(linea[3].equalsIgnoreCase("oficina")) {
                    lista.add(new Oficinistas(linea[0], linea[1], linea[2], LocalTime.parse(linea[5]), LocalTime.parse(linea[6]), linea[4]));
                }
            } catch(DateTimeException exc) {
                System.out.println("\n! Error de fecha "+Arrays.toString(linea));
            } catch(NumberFormatException exc) {
                System.out.println("\n! Taller erroneo "+Arrays.toString(linea));
            }
        }
    }

    private static void escribirFichero(ArrayList<Empleados> lista) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Programación\\Java\\src\\examenes\\examen5\\nominasSolucion.csv"));
        for(Empleados e:lista) {
            bw.write(e.toFichero());
            bw.newLine();
        }
        bw.close();
    }

}
