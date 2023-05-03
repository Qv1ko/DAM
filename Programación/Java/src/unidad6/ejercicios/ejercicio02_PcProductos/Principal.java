package unidad6.ejercicios.ejercicio02_PcProductos;

public class Principal {
    
    public static void main(String[] args) {
        Sobremesa nzxt = new Sobremesa("Pepino Gaming", 23335.95f, "Windows 11", "ATX");
        Portatil msi = new Portatil("MSI Force One", 1200.00f, "Sin SO", 13.5f);
        Hogar lavadora = new Hogar("Siemens", 550.55f, true);
        Hogar lavavajillas = new Hogar("Balay", 200f, false);

        Productos[] lista = new Productos[4];

        lista[0] = nzxt;
        lista[1] = msi;
        lista[2] = lavadora;
        lista[3] = lavavajillas;

        for( Productos p:lista) {
            System.out.println(p.verFicha());
        }
    }

}
