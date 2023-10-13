using System.Collections.Generic;
using UnityEngine;
using TMPro;
using UnityEngine.UI;

public class StoryBoard : MonoBehaviour {

    public TMP_Text slideText;
    public Image slideImage;
    public TMP_Text slideAction;

    public List<Content> slides = new();

    private int slideIndex = 0;

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

        if (Input.GetKeyDown(KeyCode.Space)) {
            if (slideIndex < slides.Count && !slides[slideIndex + 1].isFirstCodition) {
                slideIndex += (slides[slideIndex].isFirstCodition) ? 2 : 1;
            }
        } else if (Input.GetKeyDown(KeyCode.LeftArrow)) {
            if (slideIndex < slides.Count && slides[slideIndex + 1].isFirstCodition) {
                slideIndex++;
            }
        } else if (Input.GetKeyDown(KeyCode.RightArrow)) {
            if (slideIndex < slides.Count && slides[slideIndex + 1].isFirstCodition) {
                slideIndex += 2;
            }
        } else if (Input.GetKeyDown(KeyCode.Backspace)) {
            if (slideIndex > 1) {
                slideIndex -= (slides[slideIndex - 1].isFirstCodition) ? 2 : (slides[slideIndex - 2].isFirstCodition) ? 3 : 1;
            } else if (slideIndex > 0) {
                slideIndex -= (slides[slideIndex - 1].isFirstCodition) ? 2 : 1;
            }
        }

        DisplaySlide(slideIndex);

    }

    void DisplaySlide(int slideIndex) {

        if (slideIndex >= 0 && slideIndex < slides.Count) {
            slideText.text = slides[slideIndex].primaryText;
            slideImage.sprite = slides[slideIndex].img;
            slideAction.text = slides[slideIndex].secondaryText;
        }

    }

}
