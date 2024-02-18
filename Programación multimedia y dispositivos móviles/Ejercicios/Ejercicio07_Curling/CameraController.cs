using UnityEngine;

public class CameraController : MonoBehaviour {

    private Transform house;
    internal Transform rock;
    internal bool inHouse;

    private void Awake() {
        house = GameObject.Find("House").transform;
    }

    private void FixedUpdate() {
        if (inHouse) {
            transform.position = house.transform.position + new Vector3(0, 40, -1);
            transform.rotation = Quaternion.Euler(90, 0, 0);
        } else {
            transform.position = rock.transform.position + new Vector3(0, 10, -20);
            transform.rotation = Quaternion.Euler(25, 0, 0);
        }
    }

}
