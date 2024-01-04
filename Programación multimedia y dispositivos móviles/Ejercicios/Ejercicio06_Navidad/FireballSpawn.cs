using UnityEngine;

public class FireballSpawn : MonoBehaviour {

    public GameObject obj;
    public Transform spawn;
    public int spawnTime;
    private Rigidbody2D rb;

    void Start() {
        InvokeRepeating("Spawn", 0f, spawnTime);
    }

    private void Spawn() {
        GameObject fireball = Instantiate(obj, spawn.position, Quaternion.identity);
        rb = fireball.GetComponent<Rigidbody2D>();
        rb.velocity = new Vector2(0f, fireball.GetComponent<FireballController>().speed);
    }

}
