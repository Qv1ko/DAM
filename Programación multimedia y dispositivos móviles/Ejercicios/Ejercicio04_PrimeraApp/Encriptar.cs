using System;
using System.Security.Cryptography;
using System.Text;
using UnityEngine;

public class Encriptar : MonoBehaviour {

    public static string EncriptarPassword(string password) {

        using (SHA256 sha256 = SHA256.Create()) {
            return BitConverter.ToString(sha256.ComputeHash(Encoding.UTF8.GetBytes(password))).Replace("-", "").ToLower();
        }

    }

}
