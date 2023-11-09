using System.IO;
using TMPro;
using UnityEngine;

public class DataReader : MonoBehaviour {

    private string file, data;
    public TMP_Text name, lastName, phoneNumber;

    private void Awake() {
        
        // Data file path
        file = Application.dataPath + "/Data/data.json";

        // Read file
        data = File.ReadAllText(file);

        User user = JsonUtility.FromJson<User>(data);

        name.text = user.name;
        lastName.text = user.lastName;
        phoneNumber.text = user.phoneNumber;

    }

}
