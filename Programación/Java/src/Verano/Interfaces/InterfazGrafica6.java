package verano.interfaces;

import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterfazGrafica6 {
    
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String font = "";
        boolean exist = false;

        System.out.print("Fuente: ");
        try {
            font = br.readLine();
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String name : fontNames) {
            
            if (font.equalsIgnoreCase(name)) {
                exist = true;
            }

        }

        if (exist) {
            System.out.println("Fuente instalada");
        } else {
            System.out.println("No esta instalada la fuente");
        }

    }

}
