using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Login : MonoBehaviour {

    public TMP_InputField userInput, passInput;
    public TMP_Text attemptsText;
    private int attempts = 3;

    void Start() {
        attemptsText.text = "Intentos disponibles: " + attempts;
    }

    public void AccessCheck() {

        if (PlayerPrefs.GetString(userInput.text).Equals(passInput.text)) {
            PlayerPrefs.SetString("user", name);
            SceneManager.LoadScene("Main");
        } else {
            attempts--;
            attemptsText.text = "Intentos disponibles: " + attempts;
        }

        if (attempts == 0) {
            Application.Quit();
        }

    }

    public void CreateUser() {
        SceneManager.LoadScene("CreateUser");
    }

}
