package unidad5.ejercicios.ejercicio11_Amachon;

public class Validaciones {
	
	public static boolean validarUnidades(int unidades) {		
		return (unidades>=1)? true:false;
	}
	
	public static boolean validarString(String cadena) {
		boolean validacionOk;
		if(!cadena.isBlank()) {
			validacionOk=true;
		}else {
			validacionOk=false;
		}		
		return validacionOk;
	}
	
	public static boolean validarString(String cadena, int longitudMax) {
		boolean validacionOk;
		if(!cadena.isBlank()&&cadena.length()<=longitudMax) {
			validacionOk=true;
		}else {
			validacionOk=false;
		}		
		return validacionOk;
	}
	
	public static Categorias chkCategorias(String entCat) {
		Categorias cat=null;
		char letra=' ';
		if(entCat.length()==1) {
			letra=entCat.charAt(0);
		}
		if(entCat.equals(Categorias.CATA.getDesc().toUpperCase().replace("Í","I"))||letra == '1'||letra=='A') {
			cat=Categorias.CATA;
		}else if(entCat.equals(Categorias.CATB.getDesc().toUpperCase().replace("Í","I"))||letra=='2'||letra=='B'){
			cat=Categorias.CATB;
		}else if(entCat.equals(Categorias.CATC.getDesc().toUpperCase().replace("Í","I"))||letra=='3'||letra=='C') {
			cat=Categorias.CATC;
		}
		return cat;
	}
	
}
