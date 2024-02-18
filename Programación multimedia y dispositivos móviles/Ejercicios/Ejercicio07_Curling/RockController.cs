using Cinemachine;
using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class RockController : MonoBehaviour {

    [SerializeField] private LineRenderer lineRenderer;
    public GameObject rockPrefab;
    public int rocks = 8;

    private GameObject spawn;
    private CinemachineVirtualCamera camera;
    //private float shotPower = new System.Random().Next(90, 101);
    private float shotPower = 100f;
    private float broomPower = 0.009f;
    private float stopVelocity = 0.5f;
    private float stopPower = 0.997f;
    private bool isIdle;
    private bool isStoped;
    private bool isAiming;
    private bool shooted;
    private bool enabled;
    private bool destroy;
    private TMP_Text redRocks;
    private TMP_Text yellowRocks;
    private Rigidbody rb;

    private void Awake() {

        rb = GetComponent<Rigidbody>();

        spawn = GameObject.Find("Spawn");
        this.transform.position = new Vector3(spawn.transform.position.x, 0.41f, spawn.transform.position.z);
        camera = FindObjectOfType<CinemachineVirtualCamera>();
        camera.GetComponent<CameraController>().rock = this.transform;
        camera.GetComponent<CameraController>().inHouse = false;

        isIdle = true;
        isAiming = false;
        isStoped = false;
        shooted = false;
        lineRenderer.enabled = false;
        enabled = true;
        destroy = true;

        redRocks = GameObject.Find("Red Rocks Number").GetComponent<TMP_Text>();
        yellowRocks = GameObject.Find("Yellow Rocks Number").GetComponent<TMP_Text>();

        //if (rocks % 2 == 0) {
        //    redRocks.text = ((int)(rocks / 2) - 1).ToString();
        //} else {
        //    yellowRocks.text = ((int)(rocks / 2)).ToString();
        //}

    }

    void Update() {

        rb.velocity *= stopPower;
        
    }

    private void FixedUpdate() {

        if(rb.velocity.magnitude < stopVelocity) {
            Stop();
        }

        if (enabled) {

            ProcessAim();

            Controls();

            Spawn();

        }

    }

    private void Controls() {

        if (isAiming || isIdle && Vector3.Dot(rb.velocity, transform.forward) <= stopVelocity) {
            return;
        }

        if (Input.GetKeyDown(KeyCode.UpArrow)) {
            rb.velocity += transform.forward * broomPower;
        } else if (Input.GetKeyDown(KeyCode.LeftArrow)) {
            rb.velocity += -transform.right * broomPower;
        } else if (Input.GetKeyDown(KeyCode.RightArrow)) {
            rb.velocity += transform.right * broomPower;
        } else if (Input.GetKeyDown(KeyCode.DownArrow)) {
            Vector3 newForce = rb.velocity + (-transform.forward * broomPower);
            if ((Vector3.Dot(newForce.normalized, transform.forward) >= 0) && (Vector3.Dot(rb.velocity.normalized, transform.forward) > 0)) {
                rb.velocity = newForce;
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
        float strength = Mathf.Clamp(Vector3.Distance(transform.position, horizontalWorldPoint), 5f, 50f);

        rb.AddForce(direction * strength * shotPower);

        isIdle = false;
        shooted = true;

    }

    private void DrawLine(Vector3 worldPoint) {

        Vector3[] positions = {transform.position, worldPoint};
        lineRenderer.SetPositions(positions);

        lineRenderer.enabled = true;

    }

    private void Stop() {

        rb.velocity = Vector3.zero;
        rb.angularVelocity = Vector3.zero;

        if (shooted) {
            isStoped = true;
        }

    }

    //private void UpdatePoints() {

    //    GameObject[] rocksList = GameObject.FindGameObjectsWithTag("Rock");

    //    int redScore = 0;
    //    int yellowScore = 0;
    //    bool redClosest = true;

    //    foreach (var rock in rocksList) {

    //        float distanceToCenter = Vector3.Distance(rock.transform.position, Vector3.zero);

    //        if (distanceToCenter <= 30f) {

    //            string color = rock.GetComponent<RockController>().rockPrefab.name.Split(' ')[1] == "Red" ? "yellow" : "red";

    //            if (color == "red" && redClosest) {
    //                redScore++;
    //            } else if (color == "yellow" && !redClosest) {
    //                yellowScore++;
    //            }

    //            redClosest = !redClosest;

    //        }

    //    }

    //    redPoints.text = redScore.ToString();
    //    yellowPoints.text = yellowScore.ToString();

    //}


    private void Spawn() {
        
        if (isStoped) {

            enabled = false;

            if (destroy) {
                Destroy(this.gameObject);
            }

            if (rocks > 1) {

                GameObject newRock = Instantiate(rockPrefab, transform.position, Quaternion.identity);
                newRock.GetComponent<RockController>().rocks = rocks - 1;

            } else {
                SceneManager.LoadScene("End");
            }

        }

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

    private void OnTriggerExit(Collider collider) {
        if (collider.CompareTag("Spawn Line")) {
            destroy = false;
        } else if (collider.CompareTag("House Line")) {
            camera.GetComponent<CameraController>().inHouse = true;
        }
    }

}
