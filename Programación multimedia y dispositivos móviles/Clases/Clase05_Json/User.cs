[System.Serializable]

public class User {

    public int id;
    public string name, lastName, phoneNumber;

    public User(int id, string name, string lastName, string phoneNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

}
