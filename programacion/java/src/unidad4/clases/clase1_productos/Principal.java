package unidad4.clases.clase1_productos;

public class Principal {
    
    public static void main(String[] args) {
        //Instanciar objetos
        // Clase06_Precio precioLibro;
        // Clase06_Precio precioPortatil=new Clase06_Precio(2000.5, "euros");

        // precioLibro=new Clase06_Precio();
        // precioLibro.cantidad=99.9;
        // System.out.println(precioLibro.cantidad);

        // precioLibro.setCantidad(22.2);
        // System.out.println(precioLibro.getCantidad());

        // precioPortatil.setCantidad(2500.35);
        // System.out.println(precioPortatil.cantidad);

        Precio precioPortatil=new Precio(33.4,"Zona euro");
        Precio precioLibro=new Precio();

        System.out.println(precioLibro.getCantidad()+" - "+precioLibro.getDivisa());
        System.out.println(precioPortatil.getCantidad()+" - "+precioPortatil.getDivisa());

        precioLibro.setCantidad(12.35);
        System.out.println(precioLibro.getCantidad()+" - "+precioLibro.getDivisa());
        // precioLibro.cantidad=23.89; //Se puede acceder al atributo cantidad si este es public
        // System.out.println(precioLibro.getCantidad()+" - "+precioLibro.getDivisa());
    }//main

}//class
