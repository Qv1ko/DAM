package examenes.examen3.pkt2;

public class ClaseExterna {
    
    public static void validarDni(String dni) {
        char letraDni=dni.charAt(dni.length()-1),letraResultado=' ';
        String nif="";
        boolean validacionError=false;
        for(int i=0;i<dni.length()-1;i++) {
            if(Character.isDigit(dni.charAt(i))) {
                nif+=Character.getNumericValue(dni.charAt(i));    
            }
        }
        if(nif.length()==8) {
            switch(Integer.parseInt(nif)%23) {
                case 0 -> letraResultado='T';
                case 1 -> letraResultado='R';
                case 2 -> letraResultado='W';
                case 3 -> letraResultado='A';
                case 4 -> letraResultado='G';
                case 5 -> letraResultado='M';
                case 6 -> letraResultado='Y';
                case 7 -> letraResultado='F';
                case 8 -> letraResultado='P';
                case 9 -> letraResultado='D';
                case 10 -> letraResultado='X';
                case 11 -> letraResultado='B';
                case 12 -> letraResultado='N';
                case 13 -> letraResultado='J';
                case 14 -> letraResultado='Z';
                case 15 -> letraResultado='S';
                case 16 -> letraResultado='Q';
                case 17 -> letraResultado='V';
                case 18 -> letraResultado='H';
                case 19 -> letraResultado='L';
                case 20 -> letraResultado='C';
                case 21 -> letraResultado='K';
                case 22 -> letraResultado='E';
            }
            if(letraDni!=letraResultado) {
                validacionError=true;
            }
        } else {
            validacionError=true;
        }
        if(validacionError) {
            System.out.println("DNI incorrecto");
        }
        // System.out.println((validacionError)? "DNI incorrecto":"");
    }//validarDni

    public static String cargoRandom() {
        String[] cargos=new String[]{"Ceo","Encargad@","Operari@","Secretari@"};
        return cargos[(int)(Math.random()*4)];
    }//cargoRandom

}//class
