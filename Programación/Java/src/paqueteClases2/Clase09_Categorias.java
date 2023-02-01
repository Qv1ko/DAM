package paqueteClases2;

public enum Clase09_Categorias {

    CATA(21,false,0),CATB(10,false,5),CATC(0,true,0),CATD(0,false,0);

    private int impuesto,dto;
    private boolean envase;

    private Clase09_Categorias(int impuestos,boolean envase,int dto) {
        this.impuesto=impuestos;
        this.envase=envase;
        this.dto=dto;
    }//Clase09_Categorias

}//enum
