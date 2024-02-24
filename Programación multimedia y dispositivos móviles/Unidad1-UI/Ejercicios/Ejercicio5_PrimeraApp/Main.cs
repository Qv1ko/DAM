using System;
using System.IO;
using System.Text.RegularExpressions;
using TMPro;
using UnityEngine;

public class Main : MonoBehaviour {

    public TMP_InputField inputModelo, inputMatricula, inputPrecio;
    public TMP_Text textoAviso;

    private Vehiculos listaVehiculos;

    private string rutaJson = "/StreamingAssets/vehiculos.json";
    private string patronMatricula = @"^\d{4}[A-Za-z]{3}$";
    private int index = 0;
    private bool nuevoVehiculo = true;

    void Awake() {
        listaVehiculos = LeerJson.LeerVehiculos("/StreamingAssets/vehiculos.json");
    }

    void Start() {
        MostrarVehiculo();
    }

    public void BotonPrimero() {

        LimpiarAviso();
        index = 0;
        MostrarVehiculo();

    }

    public void BotonAnterior() {

        LimpiarAviso();
        index--;
        MostrarVehiculo();

    }

    public void BotonSiguiente() {

        LimpiarAviso();
        index++;
        MostrarVehiculo();

    }

    public void BotonUltimo() {

        LimpiarAviso();
        index = listaVehiculos.vehiculos.Count - 1;
        MostrarVehiculo();

    }

    public void BotonGuardarVehiculo() {

        nuevoVehiculo = true;

        if (!Regex.IsMatch(inputMatricula.text, patronMatricula)) {
            textoAviso.text = "La matricula es invalida";
        } else if (inputModelo.text.Length < 4) {
            textoAviso.text = "El modelo tienen que tener como minimo 4 caracteres";
        } else if (Double.Parse(inputPrecio.text) < 0) {
            textoAviso.text = "El precio no puede negativo";
        } else {

            LimpiarAviso();

            for (int i = 0; i < listaVehiculos.vehiculos.Count; i++) {
                if (listaVehiculos.vehiculos[i].matricula.Equals(inputMatricula.text)) {
                    textoAviso.text = "La matricula ya esta registrada";
                    nuevoVehiculo = false;
                    break;
                }
            }

            if (nuevoVehiculo) {
                listaVehiculos.vehiculos.Add(new Vehiculo(inputModelo.text, inputMatricula.text, Double.Parse(inputPrecio.text)));
                File.WriteAllText(Application.dataPath + rutaJson, JsonUtility.ToJson(listaVehiculos, true));
                index = listaVehiculos.vehiculos.Count - 1;
                MostrarVehiculo();
            }

        }

    }

    private void LimpiarAviso() {
        textoAviso.text = "";
    }

    private void MostrarVehiculo() {

        index = (index < 0) ? 0 : (index > listaVehiculos.vehiculos.Count - 1)  ? listaVehiculos.vehiculos.Count - 1 : index;

        inputModelo.text = listaVehiculos.vehiculos[index].modelo;
        inputMatricula.text = listaVehiculos.vehiculos[index].matricula;
        inputPrecio.text = listaVehiculos.vehiculos[index].precio.ToString();

    }

}
