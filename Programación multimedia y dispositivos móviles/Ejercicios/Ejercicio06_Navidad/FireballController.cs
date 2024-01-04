using UnityEngine;

public class FireballController : MonoBehaviour {

    public float speed;
    private Animator fireballAnimator;
    private Rigidbody2D rb;
    private bool falling = false;

    void Start() {

        fireballAnimator = this.GetComponent<Animator>();
        rb = GetComponent<Rigidbody2D>();

        rb.velocity = new Vector2(0f, speed);

    }

    void Update() {
        if (rb.velocity.y < 0 && !falling) {
            falling = true;
            this.transform.localScale = new Vector3(this.transform.localScale.x, -1f, this.transform.localScale.z);
        }
    }

    private void OnTriggerEnter2D(Collider2D collider) {

        if (collider.gameObject.CompareTag("Player")) {
            fireballAnimator.SetTrigger("explosion");
        }

        if (collider.CompareTag("Limits") && falling) {
            Destroy(this.gameObject);
        }

    }

    public void Explosion() {
        Destroy(this.gameObject);
    }

}
