package paqueteClases2;

public enum Clase09_Categorias {

    CATA(21,false,0,"Categoria A"),CATB(10,false,5,"Categoria B"),CATC(0,true,0,"Categoria C"),CATD(0,false,0,"Categoria D");

    private int impuesto,dto;
    private boolean envFrio;
    private String desc;

    private Clase09_Categorias(int impuestos,boolean envFrio,int dto,String desc) {
        this.impuesto=impuestos;
        this.envFrio=envFrio;
        this.dto=dto;
        this.desc=desc;
    }//Clase09_Categorias

    public String getDesc() {
        return this.desc;
    }

    public String toString() {
        return this.desc+" ("+this.impuesto+"% de IVA y descuento de "+this.dto+"%). "+((this.envFrio)? "Con refrigeracion":"Sin refrigeracion");
    }

}//enum
