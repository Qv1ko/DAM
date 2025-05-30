package unidad5.ejercicios.ejercicio9_semana_santa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

/**
 * @author Víctor
 * @version 2.6
 */

public class Principal {

    public static void main(String[] args) throws Exception {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader buffer=new BufferedReader(in);
        int opcion=-1;
        while(opcion!=0) {
            System.out.print("\nAlquiler de vehículos:\n\s1) Gestión de vehículos\n\s2) Reservar un vehículo\n\s3) Devolver un vehículo\n\s0) Salir\n\nSeleccione una opción: ");
            try {
                opcion=Integer.parseInt(buffer.readLine());
                switch(opcion) {
                    case 0 -> System.out.println("\nSaliendo...\n");
                    case 1 -> menuVehiculos(GestionAlquileres.vehiculos,buffer);
                    case 2 -> reserva(GestionAlquileres.reservas,GestionAlquileres.vehiculos,buffer);
                    case 3 -> devolucion(GestionAlquileres.reservas,GestionAlquileres.vehiculos,buffer);
                    default -> System.out.println("\n! Seleccione una opción válida");
                }
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción");
            } catch(NumberFormatException  exc) {
                System.out.println("\n! Opción no válida");
            }
        }
    }//main

    private static void menuVehiculos(ArrayList<Vehiculos> vehiculos,BufferedReader buffer) {
        int opcion=-1;
        while(opcion!=0) {
            System.out.print("\nGestión de vehículos:\n\s1) Añadir un nuevo vehículo\n\s2) Listar todos los vehículos\n\s3) Buscar un vehículo\n\s4) Actualizar un vehículo\n\s5) Eliminar un vehículo\n\s0) Salir\n\nSeleccione una opción: ");
            try {
                opcion=Integer.parseInt(buffer.readLine());
                switch(opcion) {
                    case 0 -> System.out.println("\nSaliendo del menú de gestión...");
                    case 1 -> anadirVehiculo(vehiculos,buffer);
                    case 2 -> listarVehiculos(vehiculos);
                    case 3 -> System.out.println(buscarVehiculo(vehiculos,buffer).toString());
                    case 4 -> actualizarVehiculo(vehiculos,buffer);
                    case 5 -> eliminarVehiculo(vehiculos,buffer);
                    default -> System.out.println("\n! Seleccione una opción válida");
                }
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción");
            } catch(NumberFormatException  exc) {
                System.out.println("\n! Opción no válida");
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
            }
        }
    }//menuVehiculos

    private static void anadirVehiculo(ArrayList<Vehiculos> vehiculos,BufferedReader buffer) {
        Vehiculos vehiculo=null;
        int correctas=0;
        String ent="";
        System.out.println("\nIntroduzca los datos del nuevo vehículo");
        vehiculo=new Vehiculos();
        while(correctas<4) {
            try {
                if(correctas<1) {
                    System.out.print("\nMatricula del vehículo: ");
                    ent=buffer.readLine();
                    if(ent.equals("0")) {
                        System.out.println("\nSaliendo...");
                        break;
                    }
                    vehiculo.setMatricula(GestionAlquileres.validadorMatricula(ent));
                    correctas++;
                }
                if(correctas<2) {
                    System.out.print("\nPlazas del vehículo: ");
                    ent=buffer.readLine();
                    if(ent.equals("0")) {
                        System.out.println("\nSaliendo...");
                        break;
                    }
                    vehiculo.setPlazas(GestionAlquileres.validadorPlazas(Integer.parseInt(ent)));
                    correctas++;
                }
                if(correctas<3) {
                    System.out.print("\nCombustible del vehículo: ");
                    ent=buffer.readLine();
                    if(ent.equals("0")) {
                        System.out.println("\nSaliendo...");
                        break;
                    }
                    vehiculo.setCombustible(GestionAlquileres.validadorCombustible(ent));
                    correctas++;
                }
                if(correctas<4) {
                    System.out.print("\nPrecio/día del vehículo: ");
                    ent=buffer.readLine();
                    if(ent.equals("0")) {
                        System.out.println("\nSaliendo...");
                        break;
                    }
                    vehiculo.setPrecio(GestionAlquileres.validadorPrecio(ent.replace(',','.')));
                    correctas++;
                }
                vehiculo.setAlquilado(false);
                vehiculos.add(vehiculo);
                System.out.println("\n+ Vehículo añadido correctamente");
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción");
            } catch(NumberFormatException  exc) {
                System.out.println("\n! El valor ha de ser numérico");
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
            }
        }
    }//anadirVehiculo

    private static void listarVehiculos(ArrayList<Vehiculos> vehiculos) {
        if(vehiculos.size()>0) {
            System.out.println("\nLista de vehículos de la empresa:");
            for(Vehiculos vehiculo:vehiculos) {
                System.out.println("| "+vehiculo);
            }
        } else {
            System.out.println("\n! No hay vehículos");
        }
    }//listarVehiculos

    private static Vehiculos buscarVehiculo(ArrayList<Vehiculos> vehiculos,BufferedReader buffer) throws IOException,Exception {
        Vehiculos vehiculoBuscado=null;
        String matricula="",ent="";
        boolean encontrado=false;
        if(vehiculos.size()<1) {
            throw new Exception("\n! No hay vehículos");
        }
        System.out.print("\nIntroduzca la matrícula del vehículo que busca: ");
        ent=buffer.readLine();
        if(!ent.equals("0")) {
            matricula=GestionAlquileres.validadorMatricula(ent);
            for(Vehiculos vehiculo:vehiculos) {
                if(vehiculo.getMatricula().equalsIgnoreCase(matricula)) {
                    encontrado=true;
                    vehiculoBuscado=vehiculo;
                }
            }
        }
        if(!encontrado) {
            throw new Exception("\n! El vehículo con matrícula "+matricula+" no ha sido encontrado");
        }
        return vehiculoBuscado;
    }//buscarVehiculo

    private static void actualizarVehiculo(ArrayList<Vehiculos> vehiculos,BufferedReader buffer) {
        Vehiculos vehiculoModificado=null;
        int correctas=0;
        String ent="";
        if(vehiculos.size()>0) {
            while(correctas<5) {
                try {
                    if(correctas<1) {
                        vehiculoModificado=GestionAlquileres.validarNoAlquilado(buscarVehiculo(vehiculos,buffer));
                        System.out.println("\nIntroduzca los nuevos datos del vehículo");
                        correctas++;
                    }
                    if(correctas<2) {
                        System.out.print("\nMatrícula: ");
                        ent=buffer.readLine();
                        if(ent.equals("0")) {
                            System.out.println("\nSaliendo...");
                            break;
                        }
                        vehiculoModificado.setMatricula(GestionAlquileres.validadorMatricula(ent));
                        correctas++;
                    }
                    if(correctas<3) {
                        System.out.print("\nPlazas: ");
                        ent=buffer.readLine();
                        if(ent.equals("0")) {
                            System.out.println("\nSaliendo...");
                            break;
                        }
                        vehiculoModificado.setPlazas(GestionAlquileres.validadorPlazas(Integer.parseInt(ent)));
                        correctas++;
                    }
                    if(correctas<4) {
                        System.out.print("\nCombustible: ");
                        ent=buffer.readLine();
                        if(ent.equals("0")) {
                            System.out.println("\nSaliendo...");
                            break;
                        }
                        vehiculoModificado.setCombustible(GestionAlquileres.validadorCombustible(ent));
                        correctas++;
                    }
                    if(correctas<5) {
                        System.out.print("\nPrecio por día: ");
                        ent=buffer.readLine();
                        if(ent.equals("0")) {
                            System.out.println("\nSaliendo...");
                            break;
                        }
                        vehiculoModificado.setPrecio(GestionAlquileres.validadorPrecio(ent.replace(',','.')));
                        correctas++;
                    }
                    System.out.println("\n+ Vehículo actualizado correctamente");
                } catch(IOException exc) {
                    System.out.println("\n! Error al introducir la opción");
                } catch(NumberFormatException exc) {
                    System.out.println("\n! El valor de las plazas ha de ser numérico");
                } catch(Exception exc) {
                    if(exc.getMessage().equals("\n! El vehículo con matrícula  no ha sido encontrado")) {
                        System.out.println("\nSaliendo...");
                        break;
                    } else {
                        System.out.println(exc.getMessage());
                    }
                }
            }
        } else {
            System.out.println("\n! No hay vehículos");
        }
    }//actualizarVehiculo

    private static void eliminarVehiculo(ArrayList<Vehiculos> vehiculos,BufferedReader buffer) throws Exception {
        if(vehiculos.size()>0) {
            try {
                vehiculos.remove(GestionAlquileres.validarNoAlquilado(buscarVehiculo(vehiculos,buffer)));
                System.out.println("\n+ Vehículo eliminado correctamente");
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción");
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
            }
        } else {
            throw new Exception("\n! No hay vehículos");
        }
    }//eliminarVehiculo

    private static void reserva(ArrayList<Reservas> reservas,ArrayList<Vehiculos> vehiculos,BufferedReader buffer) {
        Reservas reserva=null;
        int correctas=0;
        String ent="";
        Vehiculos vehiculo=null;
        LocalDate fecha=null;
        LocalTime hora=null;
        if(vehiculos.size()>0) {
            System.out.println("\nIntroduzca los datos de la reserva");
            reserva=new Reservas();
            while(correctas<3) {
                try {
                    if(correctas<1) {
                        System.out.print("\nDNI del cliente: ");
                        ent=buffer.readLine();
                        if(ent.equals("0")) {
                            System.out.println("\nSaliendo...");
                            break;
                        }
                        reserva.setDni(GestionAlquileres.validarUnicaReserva(GestionAlquileres.validarDni(ent)));
                        correctas++;
                    }
                    if(correctas<2) {
                        vehiculo=buscarVehiculo(vehiculos,buffer);
                        reserva.setVehiculo(GestionAlquileres.validarAlquilerVehiculo(vehiculo));
                        vehiculo.setAlquilado(true);
                        correctas++;
                    }
                    if(correctas<3) {
                        System.out.print("\nFecha de la reserva: ");
                        ent=buffer.readLine();
                        if(ent.equals("0")) {
                            System.out.println("\nSaliendo...");
                            break;
                        }
                        fecha=LocalDate.parse(ent,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        System.out.print("\nHora de la reserva: ");
                        ent=buffer.readLine();
                        if(ent.equals("0")) {
                            System.out.println("\nSaliendo...");
                            break;
                        }
                        hora=LocalTime.parse(ent);
                        reserva.setFecha(GestionAlquileres.validarFechaHora(LocalDateTime.of(fecha,hora)));
                        correctas++;
                    }
                    reservas.add(reserva);
                    System.out.println("\n+ El vehículo con matrícula "+vehiculo.getMatricula()+" se ha reservado correctamente");
                } catch(IOException exc) {
                    System.out.println("\n! Error al introducir la opción");
                } catch(NumberFormatException  exc) {
                    System.out.println("\n! Escribe la hora en formato 24 horas");
                } catch(DateTimeParseException exc) {
                    System.out.println("\n! El formato es incorrecto\n\sFormato de la fecha: dd/mm/aaaa\n\sFormato de la hora: hh:mm");
                } catch(Exception exc) {
                    if(exc.getMessage().equals("\n! El vehículo con matrícula  no ha sido encontrado")) {
                        System.out.println("\nSaliendo...");
                        break;
                    } else {
                        System.out.println(exc.getMessage());
                    }
                }
            }
        } else {
            System.out.println("\n! No hay vehículos");
        }
    }//reserva

    private static void devolucion(ArrayList<Reservas> reservas,ArrayList<Vehiculos> vehiculos,BufferedReader buffer) {
        String dniCliente="";
        boolean encontrado=false;
        if(reservas.size()>0) {
            try {
                System.out.print("\nEscribe el DNI del cliente que alquilo el vehículo: ");
                dniCliente=GestionAlquileres.validarDni(buffer.readLine());
                for(int i=0;i<reservas.size();i++) {
                    if(reservas.get(i).getDni().equalsIgnoreCase(dniCliente)) {
                        encontrado=true;
                        System.out.println("\nEl importe a pagar por la devolución del vehículo es de "+GestionAlquileres.importeDevolucion(reservas.get(i))+" euros");
                        reservas.get(i).getVehiculo().setAlquilado(false);
                        reservas.remove(reservas.get(i));
                    }
                }
                if(!encontrado) {
                    System.out.println("\n! No se encontró el DNI del cliente");
                }
            } catch(IOException exc) {
                System.out.println("\n! Error al introducir la opción");
            } catch(Exception exc) {
                System.out.println(exc.getMessage());
            }
        } else {
            System.out.println("\n! No hay reservas");
        }
    }//devolucion

}//class
