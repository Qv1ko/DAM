using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class CreateUser : MonoBehaviour {

    public TMP_InputField inputName, inputPass;

    public void SaveUser() {
        if (inputName.text.Length > 0 && inputPass.text.Length > 0 && !PlayerPrefs.HasKey(inputName.text)) {
            PlayerPrefs.SetString(inputName.text, inputPass.text);
            GoBack();
        }
    }

    public void GoBack() {
        SceneManager.LoadScene("Login");
    }

}
