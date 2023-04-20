package paqueteEjercicios3.ejercicio11_Amachon;

public class Productos {

	//Lista de atributos
	private int id;
	private String nombre;
	private String desc;
	private Categorias cate;
	private float cant;
	private double precio;

	//Atributo estático 
	private static int autoId=0;

	//Constructores
	public Productos() {
		this.id = ++autoId;
		this.nombre = "Sin definir";
		this.desc = "";
		this.cate = Categorias.CATA;
		this.cant = 0.0f;
		this.precio = 0.0;		
	}

	public Productos(String nombre, String desc,Categorias cate, float cant, double precio) {
		this.id = ++autoId;
		this.nombre = nombre;
		this.desc = desc;
		this.cate = cate;
		this.cant = cant;
		this.precio = precio;
	}

	public Productos(Productos p) {
		this.id = ++autoId;
		this.nombre = p.getNombre();
		this.desc = p.getDesc();
		this.cate = p.getCate();
		this.cant = p.getCant();
		this.precio = p.getPrecio();
	}

	public Productos(String linea) throws NumberFormatException, NullPointerException, Exception {
		this.id=Integer.parseInt(linea.split(";")[0]);
		this.nombre=linea.split(";")[1];
		this.desc=linea.split(";")[2];
		this.cate=Validaciones.chkCategoriasCsv(linea.split(";")[3]);
		this.cant=Float.parseFloat(linea.split(";")[4]);
		this.precio=Double.parseDouble(linea.split(";")[5]);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Categorias getCate() {
		return cate;
	}

	public void setCate(Categorias cate) {
		this.cate = cate;
	}

	public float getCant() {
		return cant;
	}

	public void setCant(float cant) {
		this.cant = cant;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {	
		System.out.println(this.cant+" "+this.precio+" "+this.cate.getDTO()+" "+this.cate.getImpuesto());
		return this.cant*this.precio*this.cate.getDTO()*this.cate.getImpuesto();
	}

	public String toString() {
		return "Producto: "+getId()+", "+getNombre()+", "+getDesc()+", "+getCate()+", "+getCant()+", "+getPrecio()+"\n Total del producto: "+getTotal();
	}

	public String toCsv() {
        return getId()+";"+getNombre()+";"+getDesc()+";"+getCate().name()+";"+getCant()+";"+getPrecio();
    }

}
