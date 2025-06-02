using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Login : MonoBehaviour {

    // Atributos o propiedades
    public TMP_InputField userInput, passInput;
    public TMP_Text attemptsText;
    private const string USER = "admin", PASS = "admin";
    private int attempts = 3;

    void Start() {
        attemptsText.text = "Intentos disponibles: " + attempts;
    }

    public void AccessCheck() {

        Debug.Log("Usuario: " + userInput.text + "Contraseña: " + passInput.text);

        if (userInput.text.Equals(USER) && passInput.text.Equals(PASS)) {
            SceneManager.LoadScene("Main");
        } else {
            attempts--;
            attemptsText.text = "Intentos disponibles: " + attempts;
        }

        if (attempts == 0) {
            Application.Quit();
        }

    }

}
