using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Unity.UI;
using TMPro;
using UnityEngine.UI;

public class SlideChanger : MonoBehaviour {

    public Image img;
    public TMP_Text title, desc;

    public List<Slides> slidesList = new List<Slides>();

    void Start() {

        //img.sprite = Resources.Load<Sprite>("Atari");
        //desc.text = "Atari";

        slidesList.Add(new Slides("Atari", "Atari", "Mi primera consola"));
        slidesList.Add(new Slides("Game Cube", "Cube", "Cubo morado"));

        title.text = slidesList[0].title;
        img.sprite = slidesList[0].img;
        desc.text = slidesList[0].desc;

    }

    void Update() {

    }

}
