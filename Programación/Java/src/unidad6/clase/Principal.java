package unidad6.clase;

public class Principal {

    public static void main(String[] args) {
        Taxi elFary = new Taxi();
        Taxi farruquito = new Taxi("1234ABC", "Ford Fiesta", 50, 997);
        System.out.println(elFary);
        System.out.println(farruquito);
        Autobus tus = new Autobus();
        Autobus aub = new Autobus("7890BUR", "Urbino 8.9 LE", 300, 60);
        System.out.println(tus);
        System.out.println(aub);
    }

}
