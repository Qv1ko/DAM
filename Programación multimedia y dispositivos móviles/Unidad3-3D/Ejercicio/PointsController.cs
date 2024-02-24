using TMPro;
using UnityEngine;

public class PointController : MonoBehaviour {

    private TMP_Text redPoints;
    private TMP_Text yellowPoints;

    void Start () {
        redPoints = GameObject.Find("Red Points").GetComponent<TMP_Text>();
        yellowPoints = GameObject.Find("Yellow Points").GetComponent<TMP_Text>();
    }

    void FixedUpdate() {

        GameObject[] rocksList = GameObject.FindGameObjectsWithTag("Rock");

        int redScore = 0;
        int yellowScore = 0;
        bool redClosest = true;

        foreach (var rock in rocksList) {

            float distanceToCenter = Vector3.Distance(rock.transform.position, Vector3.zero);

            if (distanceToCenter <= 20f) {

                string color = rock.GetComponent<RockController>().rockPrefab.name.Split(' ')[1] == "Red" ? "yellow" : "red";

                if (color == "red" && redClosest) {
                    redScore++;
                } else if (color == "yellow" && !redClosest) {
                    yellowScore++;
                }

                redClosest = !redClosest;

            }

        }

        redPoints.text = redScore.ToString();
        yellowPoints.text = yellowScore.ToString();

        PlayerPrefs.SetString("rt", redPoints.text);
        PlayerPrefs.SetString("yt", yellowPoints.text);

    }
}
