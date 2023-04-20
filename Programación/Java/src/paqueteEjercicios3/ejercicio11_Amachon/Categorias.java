package paqueteEjercicios3.ejercicio11_Amachon;

public enum Categorias {
	
	CATA(21,false,0,"Categoría A"),CATB(10,false,5,"Categoría B"),CATC(0,true,0, "Categoría C");
	
	private int impuesto;
	private boolean envFrio;
	private int dto;
	private String desc;
	
	private Categorias(int impuesto, boolean envFrio, int dto, String desc){
		this.impuesto = impuesto;
		this.envFrio = envFrio;
		this.dto = dto;
		this.desc = desc;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public float getDTO() {
		return (float)(100-this.dto)/100 ; 
	}
	
	public float getImpuesto() {
		return (float)(100 + this.impuesto)/100;
	}
	
	public String toString() {		
		return this.desc+":\n\tCon el "+this.impuesto+" % de IVA y "+this.dto+" % de descuento \n\t"+((this.envFrio)?"Necesita refrigeración":"No necesita refrigeración");
	}

}
