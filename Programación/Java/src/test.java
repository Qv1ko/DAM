import org.junit.Test;

import java.util.ArrayList;
import paqueteClases2.Clase09_Categorias;
import paqueteClases2.Clase09_Productos;

public class test {
    /**
     * @author Victor
     * @version 0.1
     */

     @Test
    public static void test(String[] args) {
        ArrayList<Clase09_Productos>miLista=new ArrayList<Clase09_Productos>();
        miLista.add(new Clase09_Productos("Portatil","MSI Gaming",Clase09_Categorias.CATA,1,2999.99));
        miLista.add(new Clase09_Productos("Sobremesa","ASUS Gaming",Clase09_Categorias.CATA,1,1999.99));
        miLista.add(new Clase09_Productos("Raton","Mars Gaming Pro",Clase09_Categorias.CATA,3,9.99));
        miLista.add(new Clase09_Productos("Teclado","Logitech",Clase09_Categorias.CATA,1,99.99));
        for(Clase09_Productos prod:miLista) {
            System.out.println(prod);
        }
        for(int i=0;i<miLista.size();i++) {
            System.out.println(miLista.get(i).getNombre()+"Total a pagar "+miLista.get(i).getTotal()+" euros");
        }
    }//main                                                                                                                                 

}//class