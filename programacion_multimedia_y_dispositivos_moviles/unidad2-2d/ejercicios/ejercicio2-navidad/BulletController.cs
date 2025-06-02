using UnityEngine;

public class BulletController : MonoBehaviour {

    internal float speed = 12f;

    void FixedUpdate() {
        GetComponent<Rigidbody2D>().velocity = new Vector2(speed, 0);
    }

    private void OnTriggerEnter2D(Collider2D collider) {
        Destroy(this.gameObject);
    }

}
