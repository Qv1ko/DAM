using UnityEngine;

public class Fighter : MonoBehaviour {

    private int speed = 8;
    private float hInput = 0.0f, vInput = 0.0f;

    void Update() {

        hInput = Input.GetAxis("Horizontal");
        vInput = Input.GetAxis("Vertical");

        //this.transform.position += new Vector3(hInput * Time.deltaTime * speed, 0, 0);
        //this.transform.position += new Vector3(0, vInput * Time.deltaTime * speed, 0);

        this.transform.position += new Vector3(hInput * Time.deltaTime * speed, vInput * Time.deltaTime * speed, 0);

        float newX = Mathf.Clamp(this.transform.position.x, -10, 10);
        float newY = Mathf.Clamp(this.transform.position.y, -10, 10);

        this.transform.position = new Vector3(newX, newY, 0);

    }

}
