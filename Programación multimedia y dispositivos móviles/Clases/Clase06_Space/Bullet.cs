using UnityEngine;

public class Bullet : MonoBehaviour {

    private float speed = 16f;

    void Start() {
        this.GetComponent<Rigidbody2D>().velocity = new Vector2(0, speed);
    }

    private void OnBecameInvisible() {
        Destroy(this.gameObject);
    }


}
