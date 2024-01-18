using TMPro;
using UnityEngine;

public class PlayerController : MonoBehaviour {

    public TMP_Text textoVidas, textoPuntos;
    public GameObject vida1, vida2, vida3;
    private Animator playerAnimator;
    private Rigidbody2D rb;
    private int vidas = 3, puntos = 0;
    private float axis, velocidad = 6, salto = 10;

    void Start() {

        playerAnimator = this.GetComponent<Animator>();
        rb = this.GetComponent<Rigidbody2D>();

        textoVidas.text = "x" + vidas;
        textoPuntos.text = "x" + puntos;

    }

    void Update() {

        axis = Input.GetAxis("Horizontal");

        playerAnimator.SetFloat("VelVertical", Mathf.Abs(axis));

        if (Input.GetKeyDown(KeyCode.Space)) {
            rb.velocity = new Vector2(rb.velocity.x, salto);
        }

        if (Input.GetKeyDown(KeyCode.W)) {
            playerAnimator.SetTrigger("Ataque");
        }

        Flip();

        textoVidas.text = "x" + vidas;
        textoPuntos.text = "x" + puntos;

    }

    private void FixedUpdate() {
        rb.velocity = new Vector2(axis * velocidad, rb.velocity.y);
    }

    private void OnCollisionStay2D(Collision2D collision) {
        playerAnimator.SetBool("EnSuelo", true);
    }

    private void OnCollisionExit2D(Collision2D collision) {
        playerAnimator.SetBool("EnSuelo", false);
    }

    private void OnCollisionEnter2D(Collision2D collision) {
        if (collision.gameObject.CompareTag("collider")) {
            if (vidas >= 3) {
                vida1.GetComponent<VidasController>().vida--;
                vida2.GetComponent<VidasController>().vida--;
                vida3.GetComponent<VidasController>().vida--;
            } else if (vidas == 2) {
                vida1.GetComponent<VidasController>().vida--;
                vida2.GetComponent<VidasController>().vida--;
            } else if (vidas == 1) {
                vida1.GetComponent<VidasController>().vida--;
            }
            vidas--;
        }
    }

    private void OnTriggerEnter2D(Collider2D collision)    {

        if (collision.CompareTag("trigger")) {
            puntos++;
        }

    }

    private void Flip() {
        if (axis < 0) {
            this.transform.localScale = new Vector3(-10f, 10f, 1);
        } else if (axis > 0) {
            this.transform.localScale = new Vector3(10f, 10f, 1);
        }
    }

}
