package examenes.examen4.solucion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Facturas> facturas=new ArrayList<Facturas>();
        Scanner ent=new Scanner(System.in);
        Facturas fact=null;
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        float totalF=0.0f;
        for(int i=0;i<2;i++) {
            try {
                fact=new Facturas();
                System.out.println("Introducce el número de la "+(i+1)+"ª factura: ");
                fact.setNumFactura(Integer.parseInt(ent.nextLine()));
                System.out.println("Nombre del cliente: ");
                fact.setNomCliente(ent.nextLine());
                System.out.println("Importe de la factura: ");
                fact.setImporte(Float.parseFloat(ent.nextLine().replace(",",".")));
                System.out.println("Fecha de la factura: ");
                fact.setFechaF(LocalDate.parse(ent.nextLine(),df));
                facturas.add(fact);
            } catch(NumberFormatException ex) {
                System.out.println("Valor no númerico");
                i--;
            } catch(DateTimeParseException ex) {
                System.out.println("Fecha incorrecta");
                i--;
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
                i--;
            }
        }
        for(Facturas factura:facturas) {
            System.out.println(factura);
            totalF+=factura.getImporte();
        }
        System.out.println(totalF);
        ent.close();
    }

}
