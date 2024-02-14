using System;
using UnityEngine;

public class RockController : MonoBehaviour {


	[SerializeField] private LineRenderer lineRenderer;

    //private float shotPower = new System.Random().Next(90, 101);
    private float shotPower = 100f;
    private float broomPower = 0.009f;
    private float stopVelocity = 0.5f;
    private float stopPower = 0.997f;
    private bool isIdle;
    private bool isAiming;

    private Rigidbody rb;
    public String vel = "";

    private void Awake() {

        rb = GetComponent<Rigidbody>();

        isAiming = false;
        lineRenderer.enabled = false;

    }

    private void Update() {

        rb.velocity *= stopPower;
        vel = rb.velocity.ToString();

    }

    private void FixedUpdate() {

        if(rb.velocity.magnitude < stopVelocity) {
            Stop();
        }

        ProcessAim();

        Controls();

    }

    private void Controls() {
        if (!isAiming || !isIdle && Vector3.Dot(rb.velocity, transform.forward) > stopVelocity) {
            if (Input.GetKeyDown(KeyCode.UpArrow)) {
                rb.velocity += transform.forward * broomPower;
            } else if (Input.GetKeyDown(KeyCode.LeftArrow)) {
                rb.velocity += -transform.right * broomPower;
            } else if (Input.GetKeyDown(KeyCode.RightArrow)) {
                rb.velocity += transform.right * broomPower;
            } else if (Input.GetKeyDown(KeyCode.DownArrow)) {
                rb.velocity += -transform.forward * 5f;
            }
        }
    }

    private void OnMouseDown() {
        if (isIdle) {
            isAiming = true;
        }
    }

    private void ProcessAim() {

        if(!isAiming || !isIdle) {
            return;
        }

        Vector3? worldPoint = CastMouseClickRay();

        if (!worldPoint.HasValue) {
            return;
        }

        DrawLine(worldPoint.Value);

        if (Input.GetMouseButtonUp(0)) {
            Shoot(worldPoint.Value);
        }

    }

    private void Shoot(Vector3 worldPoint) {

        isAiming = false;
        lineRenderer.enabled = false;

        Vector3 horizontalWorldPoint = new Vector3(worldPoint.x, transform.position.y,  worldPoint.z);
        Vector3 direction = (horizontalWorldPoint - transform.position).normalized;
        float strength = Mathf.Clamp(Vector3.Distance(transform.position, horizontalWorldPoint), 5f, 60f);

        rb.AddForce(direction * strength * shotPower);

        isIdle = false;

    }

    private void DrawLine(Vector3 worldPoint) {

        Vector3[] positions = {transform.position, worldPoint};
        lineRenderer.SetPositions(positions);

        lineRenderer.enabled = true;

    }

    private void Stop() {

        rb.velocity = Vector3.zero;
        rb.angularVelocity = Vector3.zero;

        isIdle = true;

    }

    private Vector3? CastMouseClickRay() {

        Vector3 screenMousePosFar = new Vector3(Input.mousePosition.x, Input.mousePosition.y, Camera.main.farClipPlane);
        Vector3 screenMousePosNear = new Vector3(Input.mousePosition.x, Input.mousePosition.y, Camera.main.nearClipPlane);
        Vector3 worldMousePosFar = Camera.main.ScreenToWorldPoint(screenMousePosFar);
        Vector3 worldMousePosNear = Camera.main.ScreenToWorldPoint(screenMousePosNear);
        RaycastHit hit;

        if (Physics.Raycast(worldMousePosNear, worldMousePosFar - worldMousePosNear, out hit, float.PositiveInfinity)) {
            return hit.point;
        } else {
            return null;
        }

    }

}
