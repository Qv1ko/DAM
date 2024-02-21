package unidad1.ejercicios.ejercicio12_TareaFinal.version1;

public class Flow {

	public static void main(String[] args) {
		
		FrontData front = new FrontData();
		Controler controler = new Controler();

		Nave nave = new NaveMilitar(4456,"Republic Judiciary CR90 Corvette",400, true, 4556);
		
		controler.setFrontData(front);
		controler.setNave(nave);
		front.setControler(controler);
		nave.setControler(controler);

	}

}
