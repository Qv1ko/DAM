package unidad1.clases;

class Clase05_Desreferencia {

    public static void main(String[] args) {
        
        Object obj = new Object();
        String text = obj.toString();

        System.out.println("Dirección en memoria -> " + text);

    }

}
