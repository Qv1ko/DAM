package paqueteExamenes.examen4;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Facturas> facturas=new ArrayList<Facturas>();
        Scanner ent=new Scanner(System.in);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String codigo="",nombre="";
        float importe=0.0f,importeTotal=0.0f;
        LocalDate fecha=null;
        boolean error=false;
        for(int i=0;i<5;i++) {
            System.out.println("\nFactura "+(i+1)+":");
            System.out.print("Escribe el codigo: ");
            codigo=ent.nextLine();
            System.out.print("Escribe el nombre del cliente: ");
            nombre=ent.nextLine();
            do {
                try {
                    System.out.print("Escribe el importe de la factura: ");
                    importe=Float.parseFloat(ent.nextLine().replace(',','.'));
                    if(importe<0) {
                        throw new NumberFormatException();
                    }
                    System.out.print("Escribe la fecha de factura: ");
                    fecha=LocalDate.parse(ent.nextLine(),df);
                    if(fecha.isAfter(LocalDate.now())) {
                        throw new DateTimeException("\nError - La fecha no puede ser posterior a la fecha actual\n");
                    }
                    facturas.add(new Facturas(codigo,nombre,importe,fecha));
                    error=false;
                } catch(NullPointerException exc) {
                    System.out.println("\nError - El valor del importe no puede estar vacio\n");
                    error=true;
                } catch(NumberFormatException exc) {
                    System.out.println("\nError - Escribe el importe correctamente\n");
                    error=true;
                } catch(DateTimeParseException exc) {
                    System.out.println("\nError - Escribe la fecha correctamente\n");
                    error=true;
                } catch(DateTimeException exc) {
                    System.out.println(exc.getMessage());
                }
            } while(error);
        }
        for(Facturas factura:facturas) {
            System.out.println(factura);
            importeTotal+=factura.getImporte();
        }
        System.out.println("El importe de todas las facturas es de "+importeTotal+" euros");
        ent.close();
    }//main

}//class