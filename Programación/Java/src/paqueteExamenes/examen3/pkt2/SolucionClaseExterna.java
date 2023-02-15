package paqueteExamenes.examen3.pkt2;

public class SolucionClaseExterna {
    
    public static String validarDni(String dni) {
        String numero="",letrasDni="TRWAGMYFPDXBNJZSQVHLCKE";;
        char letra=' ';
        if(dni.length()==9) {
            numero=dni.substring(0,dni.length()-1);
            letra=dni.charAt(dni.length()-1);
            for(int i=0;i<numero.length();i++) {
                if(!Character.isDigit(numero.charAt(i))) {
                    dni="DNI incorrecto";
                    break;
                }
            }
            if(!dni.equalsIgnoreCase("DNI incorrecto")) {
                if(letra!=letrasDni.charAt(Integer.parseInt(numero)%23)) {
                    dni="DNI incorrecto";
                }
            }
        } else {
            dni="DNI incorrecto";
        }
        return dni;
    }//validarDni

    public static String getCargo() {
        String[] cargos={"CEO","Jefe","Analista","Limpiador"};
        return cargos[(int)(Math.random()*cargos.length)];
    }//getCargo

}//class