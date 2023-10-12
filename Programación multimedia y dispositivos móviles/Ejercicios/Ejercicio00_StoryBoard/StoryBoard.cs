using System.Collections.Generic;
using UnityEngine;
using TMPro;
using UnityEngine.UI;

public class StoryBoard : MonoBehaviour {

    public TMP_Text slideText;
    public Image slideImage;
    public TMP_Text slideAction;

    public List<Content> slides = new();

    private int lastSlide = 0, slideIndex = 0;
    private bool save = true;

    void Start() {

        slides.Add(new Content("Me levanto de la cama", "slide1", "[==========]", false));
        slides.Add(new Content("Enciendo la televisión", "slide2", "<- Coger comida | Tumbarme en el sofá ->", false));
        slides.Add(new Content("Voy a buscar algo de comer", "slide3", "[==========]", true));
        slides.Add(new Content("Me tumbo en el sofá", "slide4", "[==========]", false));
        slides.Add(new Content("Pongo DAZN en la televisión", "slide5", "[==========]", false));
        slides.Add(new Content("Comienza la carrera de Fórmula 1", "slide6", "<- Dormir | Continuar viendo la carrera ->", false));
        slides.Add(new Content("Me quedo dormido en el sofá", "slide7", "[==========]", true));
        slides.Add(new Content("En la carrera, la esudería de mi piloto favorito comete errores graves", "slide8", "[==========]", false));
        slides.Add(new Content("La carrera termina con el tedioso resultado de siempre", "slide9", "[==========]", false));
        slides.Add(new Content("14 de noviembre de 2010", "slide10", "Todo fue un sueño...", false));

        DisplaySlide(slideIndex);

    }
    void Update() {

        if (slides[slideIndex + 1].isFirstCodition) {
            //if (UnityEngine.Input.GetKeyDown(KeyCode.Backspace)) {
            //    slideIndex = lastSlide;
            //} else if (UnityEngine.Input.GetKeyDown(KeyCode.LeftArrow)) {
            //    slideIndex++;
            //} else if (UnityEngine.Input.GetKeyDown(KeyCode.RightArrow)) {
            //    slideIndex += 2;
            //}
            slideIndex = (UnityEngine.Input.GetKeyDown(KeyCode.LeftArrow)) ? slideIndex + 1 : (UnityEngine.Input.GetKeyDown(KeyCode.RightArrow)) ? slideIndex + 2 : UnityEngine.Input.GetKeyDown(KeyCode.Backspace) ? slideIndex = lastSlide : 0;
        } else if (!slides[slideIndex + 1].isFirstCodition) {
            slideIndex = (UnityEngine.Input.GetKeyDown(KeyCode.Space) && slides[slideIndex].isFirstCodition) ? slideIndex + 2 : (UnityEngine.Input.GetKeyDown(KeyCode.Space)) ? slideIndex + 1 : lastSlide;
            //if (UnityEngine.Input.GetKeyDown(KeyCode.Backspace)) {
            //    slideIndex = lastSlide;
            //} else if (UnityEngine.Input.GetKeyDown(KeyCode.Space)) {
            //    slideIndex++;
            //}
        }

        DisplaySlide(slideIndex);

    }

    void DisplaySlide(int slideIndex) {

        slideText.text = slides[slideIndex].primaryText;
        slideImage.sprite = slides[slideIndex].img;
        slideAction.text = slides[slideIndex].secondaryText;

        //if (slides[slideIndex + 1].isFirstCodition && save) {
        //    lastSlide = (slideIndex > 0) ? slideIndex - 1 : 0;
        //    save = false;
        //} else if (save) {
        //    lastSlide = (slideIndex > 0) ? (slides[slideIndex].isSecondCodition) ? slideIndex - 2 : slideIndex - 1 : 0;
        //} else {
        //    save = true;
        //}



    }

}
