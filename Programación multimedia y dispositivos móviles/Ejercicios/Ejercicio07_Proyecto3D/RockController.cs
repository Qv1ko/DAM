using System.Collections;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using UnityEngine;

public class RockController : MonoBehaviour {

    private int turn = 0;
    private bool waitShoot = true, dartBoardCameraOn = false;
    private float velocidad = 64f;
    private Rigidbody rb;

    void Start() {
        rb = GetComponent<Rigidbody>();
        rb.velocity = transform.forward * velocidad;
    }

    void Update() {

        if (waitShoot) {

        } else {
            
        }
        
    }

}
