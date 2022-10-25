package packExam;

public class ejercicio3 {

    public static void main(String[] args) {
        
        int num=100,count=1,box;

        for(int i=1;i<=100;i++) {
            box=(int)(Math.random()*101);
            if(num>box) {
                num=box;
                count=1;
            } else if(num==box) {
                count++;
            }
        }
        System.out.println("El numero mas bajo es -> "+num);
        System.out.println("Aparecio "+count+" veces");
        
    } //fin main

} //fin class