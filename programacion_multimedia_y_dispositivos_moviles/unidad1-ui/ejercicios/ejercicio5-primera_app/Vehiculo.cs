[System.Serializable]

public class Vehiculo {

    public string modelo, matricula;
    public double precio;

    public Vehiculo(string modelo, string matricula, double precio) {

        this.modelo = modelo;
        this.matricula = matricula;
        this.precio = precio;

    }

}
