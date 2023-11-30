using UnityEngine;

public class PlayerController : MonoBehaviour {


    private int speed = 8;
    private float mov = 0.0f;

    private void Update() {

        mov = Input.GetAxis("Horizontal");

        this.transform.position += new Vector3(mov * Time.deltaTime * speed, 0, 0);

        if (Input.GetKeyDown(KeyCode.Space)) {
            this.GetComponent<Rigidbody2D>().AddForce(Vector2.up * 200);
        }

    }

}
