package unidad1.ejercicios.ejercicio7_repaso;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        int num1=(int)(Math.random()*101),num2=(int)(Math.random()*101);
        
        if((num1-num2)>=2) {
            System.out.print("Numero/s par/es entre "+num2+" y "+num1+" -> ");

            if((num2%2)==0) {
                while(num2<=num1) {
                    System.out.print(num2+" ");
                    num2+=2;
                }
            } else {
                num2++;

                while(num2<=num1) {
                    System.out.print(num2+" ");
                    num2+=2;
                }
            }
        } else if((num2-num1)>=2) {
            System.out.print("Numero/s par/es entre "+num1+" y "+num2+" -> ");

            if((num1%2)==0) {
                while(num1<=num2) {
                    System.out.print(num1+" ");
                    num1+=2;
                }
            } else {
                num1++;
                while(num1<=num2) {
                    System.out.print(num1+" ");
                    num1+=2;
                }
            }
        } else {
            System.out.print("No hay numeros pares entre los numeros "+num1+" y "+num2);
        }

        int ran1=(int)(Math.random()*101),ran2=(int)(Math.random()*101);
        int menor=Math.min(ran1, ran2), mayor=Math.max(ran1, ran2);

        System.out.print("\nLos numero/s par/es entre "+menor+" y "+mayor+" -> ");
        for(int i=menor;i<=mayor;i++) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }

    }//fin main

}//fin class
