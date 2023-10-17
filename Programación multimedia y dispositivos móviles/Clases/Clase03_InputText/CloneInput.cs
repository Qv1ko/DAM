using UnityEngine;
using TMPro;

public class CloneInput : MonoBehaviour {

    public TMP_Text content;

    public void InputContent(string userInput) {
        content.text = userInput;
    }

}
