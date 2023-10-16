using UnityEngine;

public class Content {

    public string primaryText, secondaryText;
    public Sprite img;
    public bool isFirstCodition;

    public Content(string stText, string imageTitle, string ndText, bool isFirstCodition) {

        this.primaryText = stText;
        this.img = Resources.Load<Sprite>(imageTitle);
        this.secondaryText = ndText;
        this.isFirstCodition = isFirstCodition;

    }

}
