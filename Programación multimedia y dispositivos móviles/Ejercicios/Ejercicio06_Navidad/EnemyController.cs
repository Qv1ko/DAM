using UnityEngine;

public class EnemyController : MonoBehaviour {

    public float speed, hearts;
    private Rigidbody2D rb;
    private Transform playerCamera;
    private float activationDistance = 18f;

    void Start() {

        rb = GetComponent<Rigidbody2D>();
        playerCamera = GameObject.FindGameObjectWithTag("MainCamera").transform;

        this.transform.localScale = new Vector3((speed > 0) ? -1f : 1f, this.transform.localScale.y, this.transform.localScale.z);

    }

    void Update() {
        if (Mathf.Abs(this.transform.position.x - playerCamera.position.x) <= activationDistance) {
            rb.velocity = new Vector2(speed, rb.velocity.y);
        } else {
            rb.velocity = Vector2.zero;
        }
    }

    private void OnCollisionEnter2D(Collision2D collision) {
        if (collision.gameObject.CompareTag("EnemyLimit") || collision.gameObject.CompareTag("Enemy") || collision.gameObject.CompareTag("Player")) {
            speed *= -1f;
            this.transform.localScale = new Vector3(this.transform.localScale.x * -1f, this.transform.localScale.y, this.transform.localScale.z);
        }
    }

    private void OnTriggerEnter2D(Collider2D collider) {

        if (collider.CompareTag("Bullet")) {
            hearts--;
        }

        if (hearts < 0 || collider.CompareTag("Limits")) {
            Destroy(this.gameObject);
        }

    }

}
