package paqueteEjercicios3.ejercicio08_SemanaSanta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * @author Victor
 * @version 0.3
 */

public class Principal {

    public static void main(String[] args) {
        int opcion=-1;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader buffer=new BufferedReader(in);
    
        //  Menú para la gestión de los vehículos de la empresa:
            // o Buscar un vehículo (el campo a buscar será la matricula).
            // o Actualizar un vehículo (se podrá reutilizar la búsqueda del apartado anterior).
            // o Eliminar un vehículo.
        //  Realizar una reserva.
        //  Devolver un vehículo. Se debe controlar que la devolución se pueda realizar, la fecha y hora de devolución será la automática del sistema y se calculara el importe a pagar.

        while(opcion!=0) {
            System.out.print("Alquiler de vehículos:\n\s1) Gestión de vehículos\n\s2) Reservar un vehículo\n\s3) Devolver un vehículo\n\s0) Salir\n\nSeleccione una opción: ");
            try {
                opcion=Integer.parseInt(buffer.readLine());
                switch(opcion) {
                    case 0 -> System.out.println("\n- Saliendo...\n");
                    case 1 -> menuVehiculos(buffer);
                    case 2 -> reserva();
                    case 3 -> devolucion();
                    default -> System.out.println("\n+ Seleccione una opción valida\n");
                }
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción\n");
            } catch(NumberFormatException  exc) {
                System.out.println("\n! Opción no valida\n");
            }
        }
    }//main

    private static void menuVehiculos(BufferedReader buffer) {
        int opcion=0;
        ArrayList<Vehiculos> vehiculos=new ArrayList<Vehiculos>();
        while(opcion!=0) {
            System.out.print("Gestión de vehículos:\n\s1) Añadir un nuevo vehículo\n\s2) Listar todos los vehículos\n\s3) Buscar un vehículo\n\s4) Actualizar un vehículo\n\s5) Eliminar un vehículo\n\s0) Salir\n\nSeleccione una opción: ");
            try {
                opcion=Integer.parseInt(buffer.readLine());
                switch(opcion) {
                    case 0 -> System.out.println("\n- Saliendo...\n");
                    case 1 -> anadirVehiculo(vehiculos,buffer);
                    case 2 -> listarVehiculos(vehiculos);
                    case 3 -> System.out.println(buscarVehiculo(vehiculos,buffer).toString());
                    case 4 -> actualizarVehiculo(vehiculos,buffer);
                    // case 5 ->
                    default -> System.out.println("\n+ Seleccione una opción valida\n");
                }
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción\n");
            } catch(NumberFormatException  exc) {
                System.out.println("\n! Opción no valida\n");
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
            }
        }
    }

    private static void anadirVehiculo(ArrayList<Vehiculos> vehiculos,BufferedReader buffer) {
        Vehiculos vehiculo=null;
        int correctas=0;
        System.out.println("\nIntroduzca los datos del nuevo vehículo");
        vehiculo=new Vehiculos();
        while(correctas<4) {
            try {
                if(correctas<1) {
                    System.out.print("Matricula del vehículo: ");
                    vehiculo.setMatricula(buffer.readLine());
                    correctas++;
                }
                if(correctas<2) {
                    System.out.print("Plazas del vehículo: ");
                    vehiculo.setPlazas(Integer.parseInt(buffer.readLine()));
                    correctas++;
                }
                if(correctas<3) {
                    System.out.print("Combustible del vehículo: ");
                    vehiculo.setCombustible(buffer.readLine());
                    correctas++;
                }
                if(correctas<4) {
                    System.out.print("Precio/día del vehículo: ");
                    vehiculo.setPrecio(buffer.readLine());
                    correctas++;
                }
                vehiculo.setAlquilado(false);
                vehiculos.add(vehiculo);
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción\n");
            } catch(NumberFormatException  exc) {
                System.out.println("\n! El valor de las plazas a de ser númerico\n");
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
            }
        }
    }

    private static void listarVehiculos(ArrayList<Vehiculos> vehiculos) {
        System.out.println("\nLista de vehiculos de la empresa:");
        for(Vehiculos vehiculo:vehiculos) {
            System.out.println("| "+vehiculo);
        }
    }

    private static Vehiculos buscarVehiculo(ArrayList<Vehiculos> vehiculos,BufferedReader buffer) throws IOException,Exception {
        Vehiculos vehiculoBuscado=null;
        String matricula="";
        System.out.println("\nIntroduzca la matricula del vehículo busca: ");
        matricula=buffer.readLine();
        for(Vehiculos vehiculo:vehiculos) {
            if(vehiculo.getMatricula().equalsIgnoreCase(matricula)) {
                vehiculoBuscado=vehiculo;
            }
        }
        if(vehiculoBuscado.equals(null)) {
            throw new Exception("\n! El vehículo no ha sido encontrado\n");
        }
        return vehiculoBuscado;
    }

    private static void actualizarVehiculo(ArrayList<Vehiculos> vehiculos,BufferedReader buffer) {
        Vehiculos vehiculoModificado=null;
        int correctas=0;
        try {
            vehiculoModificado=buscarVehiculo(vehiculos,buffer);
            System.out.println("\nIntroduzca los nuevos datos del vehículo");
            while(correctas<4) {
                if(correctas<1) {
                    System.out.print("Matricula: ");
                    vehiculoModificado.setMatricula(buffer.readLine());
                    correctas++;
                }
                if(correctas<2) {
                    System.out.print("Plazas: ");
                    vehiculoModificado.setPlazas(Integer.parseInt(buffer.readLine()));
                    correctas++;
                }
                if(correctas<3) {
                    System.out.print("Combustible: ");
                    vehiculoModificado.setCombustible(buffer.readLine());
                    correctas++;
                }
                if(correctas<4) {
                    System.out.print("Precio por día: ");
                    vehiculoModificado.setPrecio(buffer.readLine());
                    correctas++;
                }
            }
        } catch(IOException exc) {
            System.out.println("\n! Error al introducir la opción\n");
        } catch(NumberFormatException exc) {
            System.out.println("\n! El valor de las plazas a de ser númerico\n");
        } catch(Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    private static void reserva() {

    }

    private static void devolucion() {

    }

}//class
