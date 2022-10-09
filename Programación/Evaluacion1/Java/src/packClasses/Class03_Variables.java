package pack;

public class Class03_Variables {
	
	/* public -> Para ser accesible por el exterior
	 * void main -> void (vacio) */
	public static void main(String[] args) {
		
		//declaracion de variables
		byte miVariable; //declaracion de variable byte -> [tipo de dato]+[identificador]
		short shoVariable; //declaracion de variable short
		//asignacion de valores
		miVariable = 7; //asignacion del valor a la variable
		shoVariable = 128;
		
		System.out.println("El valor de mi variable es " + miVariable);
		System.out.println("El valor de la variable de tipo short es " + shoVariable);
		
		//declaracion y asignacion
		int numeroInt = 1000; //declaracion de variable int
		
		System.out.println("La variable declarada y asignada en la misma linea vale " + numeroInt);
		
		//declaracion y asignacion de variables char y String
		char chaVariable = '$';
		char miOtroChar = ' ';
		String strVariable = "Mi cadena bonita";
		
		System.out.println("\nLa variable char vale -> " + chaVariable + ", el de la variable string -> " + strVariable);
		
		miOtroChar = chaVariable; //igualacion de variables

		System.out.println("Valor de la variable igualada de tipo char = " + miOtroChar);		
		
		//declaracion y asignacion de numeros enteros - Ejercicio1
		int num1 = 5;
		int num2 = 10;
		int resultadoSumaN1N2 = num1+num2;
		
		System.out.println("\nEl numero 1 es igual a " + num1);
		System.out.println("El numero 2 es igual a " + num2);
		System.out.println("El resultado de la suma es " + (num1+num2));
		System.out.println("El resultado de la suma = " + resultadoSumaN1N2);
		System.out.println("El resultado de la resta es " + (num1-num2));
		System.out.println("La division del numero 2 entre el numero 1 es igual a " + (num2/num1));
		
		//intercambio de valores
		int aux = num1;
		num1=num2;
		num2=aux;
		
		System.out.println("\nIntercambio de valores:\nnum1 -> " + num1);
		System.out.println("num2 -> " + num2);
				
	}//fin main
}//fin class
