package unidad1.ejercicios.ejercicio12_tarea_final.version2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Controlador {

    private ArrayList<Nave> registro;
    private ArrayList<Nave> navesDespegar;
    private ArrayList<Nave> navesAterrizar;
    private ArrayList<Nave> navesHangar;

    public Controlador() {
        this.registro = new ArrayList<Nave>();
        this.navesDespegar = new ArrayList<Nave>();
        this.navesAterrizar = new ArrayList<Nave>();
        this.navesHangar = new ArrayList<Nave>();
    }

    public ArrayList<Nave> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Nave> registro) {
        this.registro = registro;
    }

    public ArrayList<Nave> getNavesDespegar() {
        return navesDespegar;
    }

    public void setNavesDespegar(ArrayList<Nave> navesDespegar) {
        this.navesDespegar = navesDespegar;
    }

    public ArrayList<Nave> getNavesAterrizar() {
        return navesAterrizar;
    }

    public void setNavesAterrizar(ArrayList<Nave> navesAterrizar) {
        this.navesAterrizar = navesAterrizar;
    }

    public ArrayList<Nave> getNavesHangar() {
        return navesHangar;
    }

    public void setNavesHangar(ArrayList<Nave> navesHangar) {
        this.navesHangar = navesHangar;
    }

    public void generadorNaves(int naves, int maxTripulantes, float maxCarga) {

        registro = new ArrayList<>();
        
        for (int i = 0; i < naves; i++) {
            registro.add((bool()) ? new NaveMilitar(codigoGen("M"), modeloGen(), tripulacionGen(maxTripulantes), null, bandoGen()) : new NaveTransporte(codigoGen("T"), modeloGen(), tripulacionGen(maxTripulantes), null, cargaGen(maxCarga)));
        }

    }

    public void cambioEstado() {
        for (Nave nave : registro) {
            if (nave.getEstado() == null && tripleBool()) {

                Accion nuevoEstado = estadoGen();
                nave.setEstado(nuevoEstado);

                switch (nuevoEstado) {
                    case DESPEGUE:
                        getNavesDespegar().add(nave);
                        break;
                    case ATERRIZAJE:
                        getNavesAterrizar().add(nave);
                        break;
                    default:
                        break;
                }

                break;

            }
        }
    }
    

    private void despegar(String codigo) {
        getNavesDespegar().remove(codigo);
    }

    private void aterrizar(String codigo) {
        getNavesAterrizar().remove(codigo);
    }

    private boolean bool() {
        return ((int) (Math.random() * 2) == 0) ? true : false;
    }

    private boolean tripleBool() {
        return bool() && bool() & bool();
    }

    private String codigoGen(String tipo) {

        Random rand = new Random();
        StringBuilder digitos = new StringBuilder();
        String codigo;

        for (int i = 0; i < 4; i++) {
            int digito = rand.nextInt(10);
            digitos.append(digito);
        }

        codigo = digitos.toString() + tipo;

        for (Nave nave : registro) {
            if (nave.getCodigo().equals(codigo)) {
                codigo = codigoGen(tipo);
                break;
            }
        }

        return codigo;

    }

    private Modelo modeloGen() {

        Random rand = new Random();
        Modelo[] modelos = Modelo.values();

        return modelos[rand.nextInt(modelos.length)];

    }

    private int tripulacionGen(int maxTripulantes) {
        return new Random().nextInt(maxTripulantes - 1) + 1;
    }

    private Accion estadoGen() {

        Random rand = new Random();
        Accion[] estados = Accion.values();

        return estados[rand.nextInt(estados.length)];

    }

    private Bando bandoGen() {

        Random rand = new Random();
        Bando[] bandos = Bando.values();

        return bandos[rand.nextInt(bandos.length)];

    }

    private float cargaGen(float maxCarga) {
        return Math.round(new Random().nextFloat(maxCarga) * 100.0) / 100.0f;
    }

}
