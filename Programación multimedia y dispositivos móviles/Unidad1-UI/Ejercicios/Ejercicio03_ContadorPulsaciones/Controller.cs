using TMPro;
using UnityEngine;

public class Controller : MonoBehaviour {

    public TMP_Text enterCounter, spaceCounter, totalCounter;

    private int enterNumber = 0, spaceNumber = 0;

    void Update() {
        
        if (Input.GetKeyDown(KeyCode.Return)) {
            enterNumber++;
            enterCounter.text = enterNumber.ToString();
            // enterCounter.text = (int.Parse(enterCounter.text) + 1).ToString();
        }

        if (Input.GetKeyDown(KeyCode.Space)) {
            spaceNumber++;
            spaceCounter.text = spaceNumber.ToString();
            // spaceCounter.text = (int.Parse(spaceCounter.text) + 1).ToString();
        }

    }

    public void TotalButton() {
        totalCounter.text = (enterNumber + spaceNumber).ToString();
    }

    public void ResetButton() {

        enterNumber = 0;
        spaceNumber = 0;

        enterCounter.text = enterNumber.ToString();
        spaceCounter.text = spaceNumber.ToString();
        totalCounter.text = (enterNumber + spaceNumber).ToString();
        
    }

}
