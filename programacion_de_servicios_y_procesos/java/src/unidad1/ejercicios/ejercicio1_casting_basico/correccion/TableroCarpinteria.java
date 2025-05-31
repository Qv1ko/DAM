package unidad1.ejercicios.ejercicio1_casting_basico.correccion;

public class TableroCarpinteria {
    
    private int largo, ancho;

    TableroCarpinteria(int largo, int ancho) throws Exception {
        setLargo(largo);
        setAncho(ancho);
    }

    private int getLargo() {
        return largo;
    }

    private void setLargo(int largo) throws Exception {
        this.largo = validar(largo);
    }

    private int getAncho() {
        return ancho;
    }

    private void setAncho(int ancho) throws Exception {
        this.ancho = validar(ancho);
    }

    private int validar(int metros) throws Exception {
        if (metros == 0) {
            throw new Exception();
        }
        return (metros > 0) ? metros : Math.abs(metros);
    }

    public int area() {
        return getLargo() * getAncho();
    }
    
}
