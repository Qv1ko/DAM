using UnityEngine;
using UnityEngine.SceneManagement;

public class Salir : MonoBehaviour {

    public void SalirApp() {
        Application.Quit();
    }

    public void Volver() {
        SceneManager.LoadScene("Login");
    }

}
