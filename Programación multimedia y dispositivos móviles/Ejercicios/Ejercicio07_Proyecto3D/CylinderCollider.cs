using UnityEngine;

public class CylinderCollider : MonoBehaviour {

    public bool isTrigger = false;
    public PhysicMaterial material = null;
    public Vector3 center = Vector3.zero;
    public float radius = 0.5f;
    public float height = 2;
    [Min(3)]
    public int boxCount = 3;
    public Orientation orientation = Orientation.Y_axis;
    public enum Orientation { X_axis, Y_axis, Z_axis }

    private void Awake() {
        BuildCollider();
    }

    public void BuildCollider() {

        ClearCollider();

        float anglePerBox = 180f / boxCount;
        int repeats = 0;

        Quaternion orientationRot = Quaternion.Euler(0, 0, 0);
        if (orientation == Orientation.X_axis) {
            orientationRot = Quaternion.AngleAxis(90f, Vector3.forward);
        } else if (orientation == Orientation.Z_axis) {
            orientationRot = Quaternion.AngleAxis(90f, Vector3.left);
        }

        for (float angle = 0f; angle < 180f; angle += anglePerBox, repeats++) {

            GameObject box = new GameObject($"box{angle}");
            box.transform.position = transform.position + center;
            box.transform.parent = transform;
            box.transform.rotation = transform.rotation * orientationRot * Quaternion.AngleAxis(angle, Vector3.up);
            box.layer = gameObject.layer;

            BoxCollider col = box.AddComponent<BoxCollider>();
            col.material = material;
            col.isTrigger = isTrigger;

            float sinLeft = Mathf.Sin((angle - (anglePerBox / 2f)) * Mathf.Deg2Rad) * radius;
            float sinRight = Mathf.Sin((angle + (anglePerBox / 2f)) * Mathf.Deg2Rad) * radius;
            float cosLeft = Mathf.Cos((angle - (anglePerBox / 2f)) * Mathf.Deg2Rad) * radius;
            float cosRight = Mathf.Cos((angle + (anglePerBox / 2f)) * Mathf.Deg2Rad) * radius;

            Vector3 pointLeft = GetPointPosition(sinLeft, cosLeft);
            Vector3 pointRight = GetPointPosition(sinRight, cosRight);

            float boxThikness = Vector3.Distance(pointLeft, pointRight);
            float boxRadius = Mathf.Max(sinLeft, sinRight, cosLeft, cosRight) * radius * 2;

            Vector3 size = new Vector3(boxThikness, height, boxRadius);
            col.size = size;

            if (repeats > boxCount) {
                Debug.Log("Too many repeats");
                break;
            }

        }

    }

    private Vector3 GetPointPosition(float sinValue, float cosValue) {

        Vector3 point = Vector3.zero;

        switch (orientation) {

            case Orientation.X_axis:
                point = new Vector3(0, sinValue, cosValue);
                break;
            case Orientation.Z_axis:
                point = new Vector3(sinValue, cosValue, 0);
                break;
            default:
                point = new Vector3(sinValue, 0, cosValue);
                break;

        }

        return point;

    }

    public void ClearCollider() {

        foreach (Transform child in transform) {
            DestroyImmediate(child.gameObject);
        }

    }

    private void OnDrawGizmosSelected() {

        Gizmos.color = Color.magenta;
        float anglePerBox = 180f / boxCount;
        int repeats = 0;

        for (float a = 0f; a < 360f; a += anglePerBox, repeats++) {

            float sinLeft = Mathf.Sin((a - (anglePerBox / 2f)) * Mathf.Deg2Rad) * radius;
            float sinRight = Mathf.Sin((a + (anglePerBox / 2f)) * Mathf.Deg2Rad) * radius;
            float cosLeft = Mathf.Cos((a - (anglePerBox / 2f)) * Mathf.Deg2Rad) * radius;
            float cosRight = Mathf.Cos((a + (anglePerBox / 2f)) * Mathf.Deg2Rad) * radius;

            Vector3 pointLeft = GetPointPosition(sinLeft, cosLeft);
            Vector3 pointRight = GetPointPosition(sinRight, cosRight);

            DrawGizmosLines(pointLeft, pointRight);

            if (repeats > boxCount * 2f) {
                Debug.Log("Too many repeats");
                break;
            }

        }
    }

    private void DrawGizmosLines(Vector3 pointLeft, Vector3 pointRight) {

        Vector3 boxHeight = Vector3.up * height / 2f;

        Gizmos.DrawLine(transform.position + boxHeight + pointLeft + center, transform.position + boxHeight + pointRight + center);
        Gizmos.DrawLine(transform.position - boxHeight + pointLeft + center, transform.position - boxHeight + pointRight + center);
        Gizmos.DrawLine(transform.position + boxHeight + pointLeft + center, transform.position + boxHeight - pointRight + center);
        Gizmos.DrawLine(transform.position - boxHeight + pointLeft + center, transform.position - boxHeight - pointRight + center);
        Gizmos.DrawLine(transform.position + boxHeight + pointLeft + center, transform.position - boxHeight + pointLeft + center);

    }

}
