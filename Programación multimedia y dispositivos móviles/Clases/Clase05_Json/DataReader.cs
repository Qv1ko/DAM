using System.IO;
using TMPro;
using UnityEngine;

public class DataReader : MonoBehaviour {

    private string file, data;
    private UsersList users;
    public TMP_InputField inputName, inputLastname, inputNumber;

    private void Awake() {
        
        // Data file path
        file = Application.dataPath + "/Data/list.json";

        // Read file
        data = File.ReadAllText(file);

        // Cargamos la información del fichero en el objeto user
        //user = JsonUtility.FromJson<User>(data);
        users = JsonUtility.FromJson<UsersList>(data);

    }

    private void Start() {

        //inputName.text = user.name;
        //inputLastname.text = user.lastName;
        //inputNumber.text = user.phoneNumber;
        //inputNumber.text = user.GetPhoneNumbers();

        inputName.text = users.users[0].name;
        inputLastname.text = users.users[0].lastName;
        inputNumber.text = users.users[0].phoneNumber;
        
    }

    public void Save() {

        // Volcamos la información de los inputs al objetivo
        //users.name = inputName.text;
        //users.lastName = inputLastname.text;
        //users.phoneNumber = inputNumber.text;

        // Convertir el objeto a JSON
        //data = JsonUtility.ToJson(user, true);

        // Escribimos en el fichero
        File.WriteAllText(file, data);

    }

}
