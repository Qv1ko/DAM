using UnityEngine;

public class Fighter : MonoBehaviour {

    private int speed = 8;
    private float hInput = 0.0f, vInput = 0.0f;
    private float padding = -8.7f;
    public GameObject bullet, leftGun, rightGun;

    void Update() {

        hInput = Input.GetAxis("Horizontal");
        vInput = Input.GetAxis("Vertical");

        //this.transform.position += new Vector3(hInput * Time.deltaTime * speed, 0, 0);
        //this.transform.position += new Vector3(0, vInput * Time.deltaTime * speed, 0);

        this.transform.position += new Vector3(hInput * Time.deltaTime * speed, vInput * Time.deltaTime * speed, 0);

        float newX = Mathf.Clamp(this.transform.position.x, padding, Mathf.Abs(padding));
        float newY = Mathf.Clamp(this.transform.position.y, padding, Mathf.Abs(padding));

        this.transform.position = new Vector3(newX, newY, 0);

        if (Input.GetKeyDown(KeyCode.Space)) {
            InvokeRepeating("Fire", 0, 0.2f);
        } else if(Input.GetKeyUp(KeyCode.Space)) {
            CancelInvoke("Fire");
        }

    }

    private void Fire() {

        //Instantiate(bullet, this.transform.position, Quaternion.identity);
        Instantiate(bullet, leftGun.transform.position, Quaternion.identity);
        Instantiate(bullet, rightGun.transform.position, Quaternion.identity);

    }

}
