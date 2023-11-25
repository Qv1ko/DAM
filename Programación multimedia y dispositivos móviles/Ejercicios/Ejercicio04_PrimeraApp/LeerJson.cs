using System.IO;
using UnityEngine;

public class LeerJson : MonoBehaviour {

    public static Usuarios LeerUsuarios(string ruta) {
        return JsonUtility.FromJson<Usuarios>(File.ReadAllText(Application.dataPath + ruta));
    }

    public static Vehiculos LeerVehiculos(string ruta) {
        return JsonUtility.FromJson<Vehiculos>(File.ReadAllText(Application.dataPath + ruta));
    }

}
