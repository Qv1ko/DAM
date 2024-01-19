using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class VidasController : MonoBehaviour {

    public float vida;

    void FixedUpdate() {
        if (vida <= 0) {
            Destroy(this.gameObject);
        }
    }

}
