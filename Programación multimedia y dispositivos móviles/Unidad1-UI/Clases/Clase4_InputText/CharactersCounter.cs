using TMPro;
using UnityEngine;

public class CharactersCounter : MonoBehaviour {

    public TMP_Text remainingCharacters;
    public const int MAXCHARACTERS = 128;

    private void Start() {
        remainingCharacters.text = MAXCHARACTERS.ToString() + "/128";
    }

    public void Counter(string inputText) {
        remainingCharacters.text = (MAXCHARACTERS - inputText.Length).ToString() + "/128";
    }

}
