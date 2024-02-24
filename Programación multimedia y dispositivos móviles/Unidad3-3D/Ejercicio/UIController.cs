using TMPro;
using UnityEngine;

public class UIController : MonoBehaviour
{

    public TMP_Text redPoints;
    public TMP_Text yellowPoints;

    void Start() {
        redPoints.text = "Red Team " + PlayerPrefs.GetString("rt");
        yellowPoints.text = PlayerPrefs.GetString("yt") + " Yellow Team";
    }

    public void Exit() {
        Application.Quit();
    }

}
