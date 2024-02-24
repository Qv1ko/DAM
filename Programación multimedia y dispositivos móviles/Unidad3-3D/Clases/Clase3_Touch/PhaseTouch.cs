using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;

public class PhaseTouch : MonoBehaviour {

    public TMP_Text phaseTouch;
    private Touch press;
    private float pressTime;
    private float displayTime = 0.5f;

    void Update() {
        
        if (Input.touchCount > 0) {

            press = Input.GetTouch(0);

            if (press.phase == TouchPhase.Ended) {
                phaseTouch.text = press.phase.ToString();
                pressTime = Time.time;
            } else if (Time.time - pressTime > displayTime) {
                phaseTouch.text = press.phase.ToString();
                pressTime = Time.time;
            }

        } else if (Time.time > displayTime) {
            phaseTouch.text = "";
        }

    }

}
