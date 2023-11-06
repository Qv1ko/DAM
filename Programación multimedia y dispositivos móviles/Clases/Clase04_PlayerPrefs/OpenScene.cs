using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;

public class MainText : MonoBehaviour {

    public TMP_Text welcomeText;

    void Start() {
        welcomeText.text = "Bienvenido " + PlayerPrefs.GetString("user");
    }

}
