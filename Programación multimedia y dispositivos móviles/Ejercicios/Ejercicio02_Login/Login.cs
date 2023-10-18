using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Login : MonoBehaviour {

    public const string USER = "admin", PASSWORD = "admin";
    public bool correctUser = false, correctPass = false;

    public void SaveUser(string user) {
        correctUser = user.Equals(USER);
    }

    public void SavePass(string pass) {
        correctPass = pass.Equals(PASSWORD);
    }

    public void AccessCheck() {
        if (correctUser && correctPass) {
            SceneManager.LoadScene(1);
        }
    }

}
