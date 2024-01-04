using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class PlayerController : MonoBehaviour {

    public GameObject bullet, bulletPosition;
    public TMP_Text livesText, coinsText;
    private Animator playerAnimator;
    private Rigidbody2D rb;
    private int lives = 3, coins = 0, tp = 1;
    private float axis, speed = 5, jump = 9f;
    private bool grounded = true;

    void Start() {
        playerAnimator = this.GetComponent<Animator>();
        rb = this.GetComponent<Rigidbody2D>();
    }

    void Update() {

        axis = Input.GetAxis("Horizontal");

        playerAnimator.SetFloat("run", Mathf.Abs(axis));

        if (Input.GetKeyDown(KeyCode.Space) && grounded) {
            playerAnimator.SetTrigger("jump");
            rb.velocity = new Vector2(rb.velocity.x, jump);
        }

        if (Input.GetKeyDown(KeyCode.Alpha2)) {
            playerAnimator.SetTrigger("shoot");
        }

        if (lives < 1) {
            playerAnimator.SetBool("died", true);
            rb.bodyType = RigidbodyType2D.Static;
        }

        Flip();

        livesText.text = "x" + lives;
        coinsText.text = "x" + ((coins.ToString().Length > 1) ? coins : "0" + coins);

    }

    private void FixedUpdate() {
        rb.velocity = new Vector2(axis * speed, rb.velocity.y);
    }

    private void OnCollisionStay2D(Collision2D collision) {
        grounded = true;
        playerAnimator.SetBool("grounded", true);
    }

    private void OnCollisionExit2D(Collision2D collision) {
        grounded = false;
        playerAnimator.SetBool("grounded", false);
    }

    private void OnTriggerEnter2D(Collider2D collision) {

        if ((collision.CompareTag("Enemy") || collision.CompareTag("Fire")) && lives > 0) {
            playerAnimator.SetTrigger("hit");
            lives--;
        }

        if (collision.CompareTag("Coin")) {
            coins++;
        }

        if (collision.CompareTag("Teleport")) {

            this.transform.position = GameObject.FindWithTag("Tp" + tp).transform.position;
            tp += (tp < 2) ? 1 : 0;

            rb.velocity = new Vector2(0, 0);

        }

        if (collision.CompareTag("Limits")) {
            playerAnimator.SetBool("died", true);
            rb.bodyType = RigidbodyType2D.Static;
        }

        if (collision.CompareTag("Finish")) {
            SceneManager.LoadScene("Finish");
        }

    }

    private void Flip() {
        if (axis < 0) {
            this.transform.localScale = new Vector3(-1f, 1f, 1);
        } else if (axis > 0) {
            this.transform.localScale = new Vector3(1f, 1f, 1);
        }
    }

    public void Shoot() {

        Vector3 playerDirection = this.transform.localScale.x > 0 ? Vector3.right : Vector3.left;
        GameObject newBullet = Instantiate(bullet, bulletPosition.transform.position, Quaternion.identity);

        newBullet.GetComponent<BulletController>().speed *= (playerDirection.x > 0) ? 1f : -1f;

    }

    public void Died() {
        SceneManager.LoadScene("Die");
    }

}
