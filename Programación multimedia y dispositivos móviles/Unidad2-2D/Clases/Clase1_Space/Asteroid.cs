using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Asteroid : MonoBehaviour {

    private float speed = -8f;

    void Start() {
        this.GetComponent<Rigidbody2D>().velocity = new Vector2(0, speed);
    }

    private void OnBecameInvisible() {
        Destroy(this.gameObject);
    }

    private void OnTriggerEnter2D(Collider2D collision) {
        if (collision.tag.Equals("fighterBullet")) {
            Destroy(collision.gameObject);
            Destroy(this.gameObject);
        }
    }

}
