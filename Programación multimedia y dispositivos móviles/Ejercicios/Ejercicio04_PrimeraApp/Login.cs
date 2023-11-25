using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Login : MonoBehaviour {

    public TMP_InputField inputNombre, inputPass;
    public TMP_Text textoIntentos;

    private Usuarios listaUsuarios;

    private int intentos = 3;
    private bool sinAcceso = true;

    void Awake() {
        listaUsuarios = LeerJson.LeerUsuarios("/StreamingAssets/usuarios.json");
    }

    void Start() {
        textoIntentos.text = "Intentos disponibles: " + intentos;
    }

    public void BotonAcceso() {

        for (int i = 0; i < listaUsuarios.usuarios.Count; i++) {
            if (listaUsuarios.usuarios[i].nombre.Equals(inputNombre.text) && listaUsuarios.usuarios[i].password.Equals(Encriptar.EncriptarPassword(inputPass.text))) {
                sinAcceso = false;
                SceneManager.LoadScene("Main");
            }
        }

        if (sinAcceso) {

            intentos--;
            textoIntentos.text = "Intentos disponibles: " + intentos;

            if (intentos == 0) {
                SceneManager.LoadScene("ExcesoIntentos");
            }

        }

    }

    public void BotonCrearUsuario() {
        SceneManager.LoadScene("CrearUsuario");
    }

}
