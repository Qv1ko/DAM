using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Slides {

    // Propiedades de la clase
    public string title, desc;
    public Sprite img;

    // Constructor para instancia
    public Slides(string title, string img, string desc) {
        this.title = title;
        this.img = Resources.Load<Sprite>(img);
        this.desc = desc;
    }

}
