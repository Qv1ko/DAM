using UnityEngine;

public class MoverObjeto : MonoBehaviour
{
    public float velocidadMovimiento = 5f;
    public float velocidadMaxima = 35f;

    private bool haComenzadoAMoverse = false;

    void Update()
    {
        // Movimiento hacia adelante y atrás
        float movimientoVertical = Input.GetAxis("Vertical") * velocidadMovimiento * Time.deltaTime;
        // Movimiento hacia la izquierda y derecha
        float movimientoHorizontal = Input.GetAxis("Horizontal") * velocidadMovimiento * Time.deltaTime;

        // Control de velocidad máxima
        if (Mathf.Abs(movimientoVertical) > velocidadMaxima)
        {
            movimientoVertical = Mathf.Sign(movimientoVertical) * velocidadMaxima;
        }

        if (Mathf.Abs(movimientoHorizontal) > velocidadMaxima)
        {
            movimientoHorizontal = Mathf.Sign(movimientoHorizontal) * velocidadMaxima;
        }

        // Movimiento del objeto en el espacio local
        transform.Translate(Vector3.forward * movimientoVertical);
        transform.Translate(Vector3.right * movimientoHorizontal);

        // Verificar si el objeto ha comenzado a moverse
        if (!haComenzadoAMoverse && (movimientoVertical != 0 || movimientoHorizontal != 0))
        {
            haComenzadoAMoverse = true;
        }

        // Detener el objeto cuando la velocidad llega a 0 y ha comenzado a moverse
        if (haComenzadoAMoverse && movimientoVertical == 0 && movimientoHorizontal == 0)
        {
            velocidadMovimiento = 0f;
        }
        else
        {
            velocidadMovimiento = 5f; // Restablecer la velocidad si se está moviendo
        }
    }
}
