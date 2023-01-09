package paqueteClases2;

public class Clase06_Principal {
    
    public static void main(String[] args) {
        //Instanciar objetos
        Clase06_Precio precioLibro;
        Clase06_Precio precioPortatil=new Clase06_Precio();

        precioLibro=new Clase06_Precio();
        precioLibro.euros=99.9;
        System.out.println(precioLibro.euros);

        precioLibro.get(22.2);
        System.out.println(precioLibro.set());

        precioPortatil.get(2500.35);
        System.out.println(precioPortatil.euros);
    }//main

}//class
