using UnityEditor;
using UnityEngine;
using UnityEngine.Animations;

public class NinjaController : MonoBehaviour {

    private Animator ninjaAnimator;
    private Rigidbody2D rb;
    public GameObject kunai, kunaiPosition;
    private float axis, speed = 6, jump = 8;
    private bool grounded = true;

    void Start() {

        ninjaAnimator = this.GetComponent<Animator>();
        rb = this.GetComponent<Rigidbody2D>();

    }

    void Update() {

        axis = Input.GetAxis("Horizontal");

        //ninjaAnimator.SetBool("IsRunning", (Input.GetKey(KeyCode.A) || Input.GetKey(KeyCode.D)));
        ninjaAnimator.SetFloat("IsRun", Mathf.Abs(axis));

        if (Input.GetKeyDown(KeyCode.Space) && grounded) {
            ninjaAnimator.SetTrigger("JumpTrigger");
            rb.velocity = new Vector2(rb.velocity.x, jump);
        }

        if (Input.GetKeyDown(KeyCode.Alpha2)) {
            ninjaAnimator.SetTrigger("AttackTrigger");
        }
        
        if (Input.GetKeyDown(KeyCode.Alpha3)) {
            ninjaAnimator.SetTrigger("ThrowTrigger");
        }

        Flip();

    }

    private void FixedUpdate() {
        rb.velocity = new Vector2(axis * speed, rb.velocity.y);
    }

    private void OnCollisionExit2D(Collision2D collision) {
        grounded = false;
    }

    private void OnCollisionStay2D(Collision2D collision) {
        grounded = true;
    }

    private void Flip() {
        this.transform.localScale = new Vector3((axis < 0) ? -0.64f : 0.64f, 0.64f, 1);
    }

    public void ThrowKunai() {
        Instantiate(kunai, kunaiPosition.transform.position, Quaternion.identity);
    }

}
