using UnityEngine;

public class NinjaController : MonoBehaviour {

    private Animator ninjaAnimator;

    void Start() {
        ninjaAnimator = this.GetComponent<Animator>();
    }

    void Update() {
        ninjaAnimator.SetBool("IsRunning", (Input.GetKey(KeyCode.A) || Input.GetKey(KeyCode.D)) ? true : false);
        if (Input.GetKeyUp(KeyCode.Space)) {
            ninjaAnimator.SetTrigger("JumpTrigger");
        }
    }

}
