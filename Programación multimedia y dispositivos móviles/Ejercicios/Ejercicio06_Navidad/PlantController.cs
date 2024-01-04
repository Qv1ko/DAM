using System.Collections;
using UnityEngine;

public class PlantController : MonoBehaviour {

    public float waitTime;
    private Vector3 startPosition;
    private float height = 1.6f;

    private void Start() {
        startPosition = this.transform.position;
        StartCoroutine(Movement());
    }

    private IEnumerator Movement() {
        while (true) {
            yield return UpMove();
            yield return new WaitForSeconds(waitTime);
            yield return DownMove();
            yield return new WaitForSeconds(waitTime);
        }
    }

    private IEnumerator UpMove() {

        float tiempoInicio = Time.time, time = 0f;
        Vector3 destiny = startPosition + new Vector3(0f, height, 0f);

        while (Time.time - tiempoInicio <= waitTime) {
            time = (Time.time - tiempoInicio) / waitTime;
            this.transform.position = Vector3.Lerp(startPosition, destiny, time);
            yield return null;
        }

        this.transform.position = destiny;

    }

    private IEnumerator DownMove() {

        float tiempoInicio = Time.time, time = 0f;
        Vector3 destiny = startPosition;

        while (Time.time - tiempoInicio <= waitTime) {
            time = (Time.time - tiempoInicio) / waitTime;
            this.transform.position = Vector3.Lerp(startPosition + new Vector3(0f, height, 0f), destiny, time);
            yield return null;
        }

        this.transform.position = destiny;

    }

    private void OnTriggerEnter2D(Collider2D collider) {
        if (collider.CompareTag("Bullet")) {
            Destroy(this.gameObject);
        }
    }

}
