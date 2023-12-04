using UnityEngine;
using UnityEngine.SceneManagement;

public class PlayerController : MonoBehaviour {


    private int speed = 6;
    private int hearts = 3;

    private void Update() {

        this.transform.position += new Vector3(Time.deltaTime * speed, 0, 0);

        if (Input.GetKeyDown(KeyCode.Space)) {
            this.GetComponent<Rigidbody2D>().AddForce(Vector2.up * 500);
        }

    }

    private void OnTriggerEnter2D(Collider2D collision) {
        if (collision.tag.Equals("Wall") && hearts < 1) {
            SceneManager.LoadScene("LoseScene");
        } else if (collision.tag.Equals("Wall")) {
            this.transform.position = new Vector3(0, 0, 0);
            hearts--;
        } else if (collision.tag.Equals("Finish")) {
            SceneManager.LoadScene("WinScene");
        }
    }

}
