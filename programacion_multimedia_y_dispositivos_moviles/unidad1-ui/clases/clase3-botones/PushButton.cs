using UnityEngine;
using TMPro;

public class NewBehaviourScript : MonoBehaviour {

    public TMP_Text numberText;

    private int counter = 0;

    void Start() {
        numberText.text = counter.ToString();
    }

    public void Increment() {
        counter++;
        numberText.text = counter.ToString();
    }

}
