package verano;

public class Ejercicio1 {

    /*
     * El caracol sube 3 pies cada día y retrocede 1 pies cada noche. 
     * Cuántos días tardará el caracol en salir de un pozo con la profundidad dada?
     * El pozo medira un numero aleatorio entre 2 y 9 m
     * La altura del agua del pozo comenzara en 0 m
     * Si llueve subira la altura del agua 1 m, si hace nublado se mantendra y si hace soleado bajara 1 m
     * Si hay algun deslizamiento de tierra el caracol bajara 2 pies mas
     * Si el caracol esta bajo el agua se ahogara
     */
    
    public static void main(String[] args) {

        final double UP = 0.9;
        final double BACK = -0.3;
        final double PIT = Math.round(Math.random() * -8) + -2;
        String[] pit = new String[Math.abs((int)PIT)];
        double snail = PIT;
        double water = PIT;
        boolean isDrowned = false;
        int day = 0;

        while (snail < 0 && !isDrowned) {

            day++;
            water = water + weather((int)(Math.random() * 100));
            snail = snail + UP + BACK + landslide((int)(Math.random() * 10));

            if (snail < water || water >= 0) {
                isDrowned = true;
                break;
            } else if ((int)snail >= 0) {
                break;
            }

            System.out.println("\n\nDía " + day + ":\n");
            picture(pit, Math.abs((int)snail), Math.abs((int)water), isDrowned);

            try {
                Thread.sleep(2500);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }

        }

        System.out.println("\n\nDía " + day + ": " + ((isDrowned)? "El caracol se ha ahogado\n" : "El caracol salió del pozo\n"));
        picture(pit, Math.abs((int)snail), Math.abs((int)water), isDrowned);

    }

    private static int weather(int probability) {

        int result = 0;

        if (!(probability < 74 && probability > 24)) {
            result = (probability / 2 == 0)? -1 : 1;
        }

        return result;
    }

    private static double landslide(int probability) {

        double result = 0;

        if (probability < 2) {
            result = -0.6;
        }

        return result;

    }

    private static void picture(String[] pit, int snail, int water, boolean isDrowned) {

        for (int i = 0; i < pit.length; i++) {
            pit[i] = (snail - 1 != i && water - 1 != i)? "| |" : (snail - 1 == i)? (isDrowned)? "|x|": "|@|" : "|~|";
        }

        System.out.println((snail > 0 && water > 0)? "_ _" : (snail <= 0)? (water <= 0)? "_~_@": "_ _@" : "_~_");
        for (String p : pit) {
            System.out.println(p);
        }
        System.out.println(" \" ");

    }

}
