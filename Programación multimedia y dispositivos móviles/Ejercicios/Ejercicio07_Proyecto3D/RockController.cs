using UnityEngine;

public class RockController : MonoBehaviour {

    // Variables para ajustar en el editor
    [SerializeField] private float shotPower; // Potencia del lanzamiento
    [SerializeField] private float stopVelocity = .05f; // Velocidad mínima para considerar que el objeto está detenido

    [SerializeField] private LineRenderer lineRenderer; // Componente para dibujar una línea de objetivo

    // Variables privadas para el control del estado del objeto
    private bool isIdle; // Indica si el objeto está en reposo
    private bool isAiming; // Indica si el objeto está apuntando

    // Referencia al Rigidbody del objeto
    private Rigidbody rigidbody;

    private void Awake() {
        // Se obtiene la referencia al Rigidbody y se desactiva la línea de objetivo
        rigidbody = GetComponent<Rigidbody>();
        lineRenderer.enabled = false;

        // Se inicializan los estados
        isAiming = false;
        isIdle = true;
    }

    private void FixedUpdate() {
        // Si la velocidad del objeto es menor que la velocidad de detención, se detiene
        if(rigidbody.velocity.magnitude < stopVelocity) {
            Stop();
        }

        // Procesa el objetivo si está apuntando
        ProcessAim();
    }

    private void OnMouseDown() {
        // Cuando se hace clic en el objeto y está en reposo, se habilita el modo de apuntado
        if (isIdle) {
            isAiming = true;
        }
    }

    private void ProcessAim() {
        // Si no está apuntando o no está en reposo, no hace nada
        if(!isAiming || !isIdle) {
            return;
        }

        // Lanza un rayo desde la cámara hacia el punto de clic del mouse
        Vector3? worldPoint = CastMouseClickRay();

        // Si el rayo no golpea nada, no hace nada
        if (!worldPoint.HasValue) {
            return;
        }

        // Dibuja una línea de objetivo hacia el punto
        DrawLine(worldPoint.Value);

        // Si se suelta el botón del mouse, se lanza el objeto
        if (Input.GetMouseButtonUp(0)) {
            Shoot(worldPoint.Value);
        }
    }

    private void Shoot(Vector3 worldPoint) {
        // Desactiva el modo de apuntado y la línea de objetivo
        isAiming = false;
        lineRenderer.enabled = false;

        // Calcula la dirección y la fuerza del lanzamiento
        Vector3 horizontalWorldPoint = new Vector3(worldPoint.x, transform.position.y, worldPoint.z);
        Vector3 direction = (horizontalWorldPoint - transform.position).normalized;
        float strength = Vector3.Distance(transform.position, horizontalWorldPoint);

        // Aplica una fuerza al Rigidbody para lanzar el objeto
        rigidbody.AddForce(direction * strength * shotPower);
        isIdle = false; // Marca el objeto como no en reposo
    }

    private void DrawLine(Vector3 worldPoint) {
        // Dibuja una línea desde la posición actual del objeto hasta el punto de objetivo
        Vector3[] positions = {
            transform.position,
            worldPoint
        };
        lineRenderer.SetPositions(positions);
        lineRenderer.enabled = true;
    }

    private void Stop() {
        // Detiene el objeto estableciendo su velocidad y velocidad angular a cero
        rigidbody.velocity = Vector3.zero;
        rigidbody.angularVelocity = Vector3.zero;
        isIdle = true; // Marca el objeto como en reposo
    }

    private Vector3? CastMouseClickRay() {
        // Lanza un rayo desde la cámara hacia el punto de clic del mouse y devuelve el punto de impacto si lo hay
        Vector3 screenMousePosFar = new Vector3(
            Input.mousePosition.x,
            Input.mousePosition.y,
            Camera.main.farClipPlane);
        Vector3 screenMousePosNear = new Vector3(
            Input.mousePosition.x,
            Input.mousePosition.y,
            Camera.main.nearClipPlane);
        Vector3 worldMousePosFar = Camera.main.ScreenToWorldPoint(screenMousePosFar);
        Vector3 worldMousePosNear = Camera.main.ScreenToWorldPoint(screenMousePosNear);
        RaycastHit hit;
        if (Physics.Raycast(worldMousePosNear, worldMousePosFar - worldMousePosNear, out hit, float.PositiveInfinity)) {
            return hit.point; // Devuelve el punto de impacto si hay colisión
        } else {
            return null; // Devuelve nulo si no hay colisión
        }
    }
}
