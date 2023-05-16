package examenes.examen5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        BufferedReader br=null;
        BufferedWriter bw=null;
        String[] linea;
        ArrayList<Empleados> empleados=new ArrayList<Empleados>();

        try {
            br=new BufferedReader(new FileReader("Programación\\Java\\src\\examenes\\examen5\\fichajes.csv"));
            while(br.ready()) {
                linea=br.readLine().split(";");
                if(linea[3].equals("oficina")) {
                    empleados.add(new Oficinistas(linea[0], linea[1], linea[2], LocalTime.parse(linea[5]), LocalTime.parse(linea[6]), linea[4]));
                } else if(linea[3].equals("operador")) {
                    empleados.add(new Operadores(linea[0], linea[1], linea[2], LocalTime.parse(linea[5]), LocalTime.parse(linea[6]), Integer.parseInt(linea[4])));
                }
            }
        } catch (FileNotFoundException exc) {
            System.out.println("\n! El archivo de fichajes.csv no existe");
        } catch (IOException exc) {
            System.out.println("\n! Error de entrada o salida");
        } catch (DateTimeParseException exc) {
            System.out.println("\n! Error de hora");
        } catch (NumberFormatException exc) {
            System.out.println("\n! Error en el numero de talleres");
        } catch (Exception exc) {
            exc.getMessage();
        }

        try {
            bw=new BufferedWriter(new FileWriter("Programación\\Java\\src\\examenes\\examen5\\nominas.csv"));
            for(Empleados empleado:empleados) {
                bw.write(empleado.toNominas());
                bw.newLine();
            }
            bw.close();
        } catch (IOException exc) {
            System.out.println("\n! Error de entrada o salida");
        } catch (Exception exc) {
            exc.getMessage();
        }

    }
    
}
