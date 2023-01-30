## Ejercicio 1:
El siguiente método que lee una serie de números hasta que se introduce un cero y muestra la media de los números positivos introducidos y la media de los números negativos. Construye el grafo de flujo para este programa y calcula su complejidad ciclomática. Además, indica un conjunto de caminos independientes.
```c
begin
    int num=0,cont_pos=0,cont_neg=0,suma_pos=0,suma_neg=0;
    float media_pos=0,media_neg=0;
    System.out.print("Introduce número: ");
    num=Entrada.entero();

    while(num!=0)

        if(num>0)
            cont_pos++;
            suma_pos+=num;

        else
            cont_neg++;
            suma_neg+=num;
        endif;

        System.out.print("Introduce número: ");
        num=Entrada.entero();
    endwhile;

    if(cont_pos!=0)
        media_pos=(float)suma_pos/cont_pos;
        System.out.println("Media de los positivos: "+media_pos);
    endif;

    if(cont_neg!=0)
        media_neg=(float)suma_neg/cont_neg;
        System.out.println("Media de los negativos: "+media_neg);
    endif;
end;
```

## Ejercicio 2:
El siguiente programa escrito en Java pide un número entero por teclado e indica si es un número perfecto, es decir, si es igual a la suma de sus divisores propios. Un divisor propio es un entero positivo distinto del número en sí mismo y que divide al número de forma exacta, es decir, sin resto. Construye el grafo de flujo para este programa y calcula su complejidad ciclomática. Además, indica un conjunto de caminos independientes.
```java
public static void main(String[] args) {
    int num,divisor,sumadivisores;
    divisor=1;
    sumadivisores=0;
    Scanner entrada=new Scanner(System.in);
    System.out.print ("Introduzca un número mayor que 0: ");
    num=entrada.nextInt();

    while(divisor<=num/2) {

        if(num%divisor==0)
            sumadivisores=sumadivisores+divisor;
            divisor++;
    }

    if(num==sumadivisores)
        System.out.println ("El número "+num+" es un número perfecto");
    
    else
        System.out.println ("El número "+num+" no es un número perfecto");
}
```

## Ejercicio 3:

```java
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Escribe una palabra");
    String palabra=sc.nextLine();
    System.out.println("Tu palabra es: "+palabra);
    boolean error=false;

    do {
        sc.nextLine();
        error=false;
        System.out.println("Escribe un número entero menor de 10:");
        int num=sc.nextInt();

        if(num>=10) {
            error=true;
        }
        
    } while(error);
    System.out.println("Tu número: "+num);
}
```