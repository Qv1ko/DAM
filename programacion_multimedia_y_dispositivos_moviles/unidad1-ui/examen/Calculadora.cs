using System;
using TMPro;
using UnityEngine;
using UnityEngine.UIElements;

public class Calculadora : MonoBehaviour {

    public TMP_InputField inputOperador1, inputOperador2;
    public TMP_Text resultado;

    private int operador1, operador2;

    public void InputOperador1() {
        operador1 = int.Parse(inputOperador1.text);
    }

    public void InputOperador2() {
        operador2 = int.Parse(inputOperador2.text);
    }

    public void Suma() {
        resultado.text = (TieneContenido()) ? (operador1 + operador2).ToString() : "Los operadores tienen que tener valor";
    }

    public void Resta() {
        resultado.text = (TieneContenido()) ? (operador1 - operador2).ToString() : "Los operadores tienen que tener valor";
    }

    public void Multiplicacion() {
        resultado.text = (TieneContenido()) ? (operador1 * operador2).ToString() : "Los operadores tienen que tener valor";
    }

    public void Division() {
        resultado.text = (TieneContenido()) ? "Los operadores tienen que tener valor" : (operador1 == 0 && operador2 == 0) ? "Los valores no pueden ser 0" : (((double)operador1) / ((double)operador2)).ToString();
    }

    private bool TieneContenido() {
        return operador1 != null && operador2 != null;
    }

}
