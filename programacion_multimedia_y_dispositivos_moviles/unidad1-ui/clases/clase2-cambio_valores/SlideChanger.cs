using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using TMPro;
using UnityEngine.UI;
using System.Linq;

public class SlideChanger : MonoBehaviour {

    // Objetos graficos
    public Image img;
    public TMP_Text title, desc;

    public List<Slides> slidesList = new List<Slides>();

    private int index = 0;

    void Start() {

        //img.sprite = Resources.Load<Sprite>("Atari");
        //desc.text = "Atari";

        slidesList.Add(new Slides("Atari", "Atari", "Mi primera consola"));
        slidesList.Add(new Slides("Game Cube", "Cube", "Cubo morado"));
        slidesList.Add(new Slides("NES", "NES", "Mario a tope..."));
        slidesList.Add(new Slides("PlayStation 1", "PS1", "La de horas que..."));

        title.text = slidesList[index].title;
        img.sprite = slidesList[index].img;
        desc.text = slidesList[index].desc;

    }

    void Update() {

        if (Input.GetKeyDown(KeyCode.RightArrow)) {
            index = (index < slidesList.Count - 1) ? index + 1 : 0;
        } else if (Input.GetKeyDown(KeyCode.LeftArrow)) {
            index = (index > 0) ? index - 1 : slidesList.Count - 1;
        }

        title.text = slidesList[index].title;
        img.sprite = slidesList[index].img;
        desc.text = slidesList[index].desc;

    }

}
