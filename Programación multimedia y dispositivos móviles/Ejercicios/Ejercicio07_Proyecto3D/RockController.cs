using UnityEngine;

public class RockController : MonoBehaviour {

    private int turn = 0;
    private bool waitShoot = true, dartBoardCameraOn = false;
    private float velocidad = 64f;
    private Rigidbody rb;
    [SerializeField] private LineRenderer lineRenderer;

    void Start() {
        rb = GetComponent<Rigidbody>();
        //rb.velocity = transform.forward * velocidad;
    }

    private void Update() {

        Vector3? worldPoint = CastMouseClickRay();

        if (!worldPoint.HasValue) {
            return;
        }

        DrawLine(worldPoint.Value);

        //if (waitShoot) {

        //} else {
            
        //}
        
    }

    private void DrawLine(Vector3 worldPoint) {

        Vector3[] positions = {
            transform.position, worldPoint
        };

        lineRenderer.SetPositions(positions);
        lineRenderer.enabled = true;
         
    }

    private Vector3? CastMouseClickRay() {

        Vector3 screenMousePosFra = new Vector3(Input.mousePosition.x, Input.mousePosition.y, Camera.main.farClipPlane);
        Vector3 screenMousePosNear = new Vector3(Input.mousePosition.x, Input.mousePosition.y, Camera.main.farClipPlane);
        Vector3 worldMousePosFar = Camera.main.ScreenToWorldPoint(screenMousePosFra);
        Vector3 worldMousePosNear = Camera.main.ScreenToWorldPoint(screenMousePosNear);
        RaycastHit hit;

        if (Physics.Raycast(worldMousePosNear, worldMousePosFar - worldMousePosNear, out hit, float.PositiveInfinity)) {
            return hit.point;
        } else {
            return null;
        }

    }

}
