package unidad5.ejercicios.ejercicio12_amachon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor
 * @version 2.3
 */

public class CestaAmachon {
	
	public static void main(String[] arg) {
		ArrayList<Productos> lista=new ArrayList<Productos>();
		readCsv(lista);
		Scanner ent=new Scanner(System.in);
		int opcion=0;
		do {			
			System.out.println("1) Listar productos \n"+"2) Añadir producto \n"+"3) Modificar producto \n"+"4) Eliminar producto \n"+"0) Salir ");
			try {
				opcion=Integer.parseInt(ent.nextLine());
				switch(opcion) {
					case 1 -> listar(lista);					
					case 2 -> addProducto(lista,ent);					
					case 3 -> modificar(lista);					
					case 4 -> eliminar(lista);					
					case 0 -> writeCsv(lista);
					default -> System.out.println("\n! Opción no válida\n");
				
				}
			}catch(NumberFormatException | IOException ex) {
				System.out.println("\n! Dato no numérico\n");
				opcion=99;
			}
		}while(opcion!=0);
		System.out.println("Ádios");
		ent.close();
	}

	public static void listar(ArrayList<Productos> lista) {
		System.out.println("Cesta con "+lista.size()+" producto/s");
		for(Productos p:lista) {
			System.out.println(p);
		}		
	}
	
	public static void addProducto(ArrayList<Productos> lista,Scanner ent) {
		String nombre="",desc="",entTeclado="";
		float cant=0.0f;
		double precio=0.0;
		Categorias cat=null;
		boolean sinErrores=true, salir=false;
				
		//Control del nombre
		do {
			sinErrores=true;
			System.out.print("Introduce el nombre del producto(introduzca salir para parar): ");
			nombre=ent.nextLine().trim();
			if(nombre.equalsIgnoreCase("salir")){
				System.out.println("Ádios");
				sinErrores=false;
				salir=true;
			}else if(!Validaciones.validarString(nombre,25)) {
				System.out.println("\n! Nombre no puede ser vacío o mas de 25 letras\n");
				sinErrores=false;
			}
		}while(!sinErrores&&!salir);
		
		if(!salir) {
			//Control descripción
			do {
				sinErrores=true;
				System.out.print("Introduzca una descripción(introduzca salir para parar): ");
				desc=ent.nextLine();
				
				if(desc.equalsIgnoreCase("salir")) {
					sinErrores=false;
					salir=true;
				}else if(!Validaciones.validarString(desc,50)) {
					System.out.println("\n! Descripción no puede ser vacío o mas de 50 letras\n");
					sinErrores=false;
				}
				
			}while(!sinErrores && !salir);
		}
		
		//Control de la categoría del producto
		if(!salir) {
			do {
				for(int i=0 ; i < Categorias.values().length ; i++) {
					System.out.println((i +1 )+"º) "+Categorias.values()[i]);
				}
				System.out.print("Introduce la categoría del producto o (introduzca salir para parar): ");
				entTeclado=ent.nextLine().toUpperCase();
				if(Validaciones.chkCategorias(entTeclado)!=null) {
					cat=Validaciones.chkCategorias(entTeclado);
					sinErrores=true;
				}else if(entTeclado.equals("salir")) {
					salir=true;
					sinErrores=false;
				}else{
					System.out.println("\n! Categoría incorrecta\n");
					sinErrores=false;
				}
			
			}while(!sinErrores&&!salir);
		}
		
		//Control de las unidades
		if(!salir) {
			do {
				System.out.print("Cuántas unidades desea?(introduzca salir para parar): ");
				try {
					entTeclado=ent.nextLine().replace(',','.');
					cant=Float.parseFloat(entTeclado);
					if(cant>0) {
						sinErrores=true;
					}else {
						System.out.println("\n! La cantidad ha de ser mayor que cero\n");
						sinErrores=false;
					}					
				}catch(NumberFormatException ex) {
					if(entTeclado.equalsIgnoreCase("salir")) {
						salir=true;
					}else {
						System.out.println("\n! Dato no númerico en las unidades\n");	
						sinErrores=false;
					}					
				}
			}while(!sinErrores&&!salir);			
		}

		//Control del importe
		if(!salir) {
			do {
				try {
					System.out.print("Introduzca el importe del producto o salir para parar: ");
					entTeclado=ent.nextLine().replace(',','.');					
					precio=Double.parseDouble(entTeclado);
					if(precio>0) {
						sinErrores=true;
					}else {
						System.out.println("\n! El importe ha de ser mayor que 0\n");
						sinErrores=false;
					}
				}catch(NumberFormatException ex) {
					if(entTeclado.equalsIgnoreCase("salir")) {
						salir=true;
					}else {
						System.out.println("\n !Dato no númerico en el precio\n");	
						sinErrores=false;
					}
				}
			}while(!sinErrores && !salir);
		}

		if(sinErrores) {
			lista.add(new Productos(nombre,desc,cat,cant,precio));
		}
	}
	
	public static void modificar(ArrayList<Productos> lista) {
		
		
	}
	
	public static void eliminar(ArrayList<Productos> lista) {
		
		
	}

	private static void readCsv(ArrayList<Productos> lista) {
		FileReader fr=null;
        BufferedReader br=null;
        int linea=1;
        try {
            fr=new FileReader(new File("Programación\\Java\\src\\unidad5\\ejercicios\\ejercicio12_Amachon\\productos.csv"));
            br=new BufferedReader(fr);
            while(br.ready()) {
                linea++;
                try {
                    lista.add(new Productos(br.readLine()));
                } catch(NumberFormatException exc) {
                    System.out.println("\n! Los valores de la linea "+linea+" del fichero son incorrectos\n");
                } catch(Exception exc) {
                    System.out.println("\n! Error en la linea: "+linea+"\n");
                }
            }
            System.out.println("\n+ "+lista.size()+" productos importados\n");
            br.close();
        } catch(FileNotFoundException exc) {
            System.out.println("\n! El archivo no se ha encontrado\n");
        } catch(IOException exc) {
            System.out.println("\n! Error en la entrada o salida\n");
        }
	}

	private static void writeCsv(ArrayList<Productos> lista) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Programación\\Java\\src\\unidad5\\ejercicios\\ejercicio12_Amachon\\productos.csv"));
        for(Productos producto:lista) {
            bw.write(producto.toCsv());
            bw.newLine();
        }
        bw.close();
    }

}
