using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AsteroidGenerator : MonoBehaviour {

    public GameObject asteroid;
    private Vector3 position;
    private int spawnRange = -9;

    void Start() {
        position = new Vector3(Random.Range(spawnRange, Mathf.Abs(spawnRange)), 11f, 0);
        Instantiate(asteroid, position, Quaternion.identity);
    }

    void Update() {
        
    }

}
