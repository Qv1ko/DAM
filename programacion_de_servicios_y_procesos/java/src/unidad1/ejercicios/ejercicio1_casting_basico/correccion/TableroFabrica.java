package unidad1.ejercicios.ejercicio1_casting_basico.correccion;

public class TableroFabrica {
    
    private double largo, ancho;

    TableroFabrica(double largo, double ancho) throws Exception { 
        setLargo(largo);
        setAncho(ancho);
    }

    private double getLargo() {
        return largo;
    }

    private void setLargo(double largo) throws Exception{
        this.largo = validar(largo);
    }

    private double getAncho() {
        return ancho;
    }

    private void setAncho(double ancho) throws Exception {
        this.ancho = validar(ancho);
    }

    private double validar(double metros) throws Exception {
        if (metros == 0) {
            throw new Exception();
        }
        return (metros > 0) ? metros : Math.abs(metros);
    }

    public double area() {
        return getLargo() * getAncho();
    }

}
