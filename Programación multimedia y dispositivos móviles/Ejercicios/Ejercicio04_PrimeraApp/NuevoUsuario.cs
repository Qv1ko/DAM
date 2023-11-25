using System.IO;
using System.Text.RegularExpressions;
using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class NuevoUsuario : MonoBehaviour {

    public TMP_InputField inputNombre, inputPass;
    public TMP_Text textoAviso;

    private Usuarios listaUsuarios;

    private string rutaJson = "/StreamingAssets/usuarios.json";
    private string patronNombre = "^[a-zA-Z0-9]+$";
    private bool usuarioNuevo = true;

    private void Awake() {
        listaUsuarios = LeerJson.LeerUsuarios(rutaJson);
    }

    public void BotonCrearUsuario() {

        usuarioNuevo = true;

        if (!Regex.IsMatch(inputNombre.text, patronNombre)) {
            textoAviso.text = "El nombre solo puede tener letras y números";
        } else if (inputNombre.text.Length < 4 || inputPass.text.Length < 4) {
            textoAviso.text = "El nombre y la contraseña tienen que tener como minimo 4 caracteres";
        } else {

            textoAviso.text = "";

            for (int i = 0; i < listaUsuarios.usuarios.Count; i ++) {
                if (listaUsuarios.usuarios[i].nombre.Equals(inputNombre.text)) {
                    textoAviso.text = "El usuario ya existe";
                    usuarioNuevo = false;
                    break;
                }
            }

            if (usuarioNuevo) {
                listaUsuarios.usuarios.Add(new Usuario(inputNombre.text, Encriptar.EncriptarPassword(inputPass.text)));
                File.WriteAllText(Application.dataPath + rutaJson, JsonUtility.ToJson(listaUsuarios, true));
                SceneManager.LoadScene("Login");
            }

        }

    }

}
