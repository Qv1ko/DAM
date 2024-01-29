using UnityEngine;
using UnityEngine.EventSystems;

public class ArrastrarSoltar : MonoBehaviour, IPointerDownHandler, IBeginDragHandler, IEndDragHandler, IDragHandler, IDropHandler {

    CanvasGroup cg;

    void IDropHandler.OnDrop(PointerEventData eventData) {
        Debug.Log("OnDrop");
    }

    void IBeginDragHandler.OnBeginDrag(PointerEventData eventData) {
        Debug.Log("OnBeginDrag");
        cg.blocksRaycasts = false;
        cg.alpha = 0.5f;
    }

    void IDragHandler.OnDrag(PointerEventData eventData) {
        Debug.Log("OnDrag");
        this.transform.position = eventData.position;
    }

    void IEndDragHandler.OnEndDrag(PointerEventData eventData) {
        Debug.Log("OnEndDrag");
        cg.blocksRaycasts = true;
        cg.alpha = 1;
    }

    void IPointerDownHandler.OnPointerDown(PointerEventData eventData) {
        Debug.Log("OnPointerDown");
    }

    void Start() {
        cg = this.GetComponent<CanvasGroup>();
    }

    void Update() {
        
    }

}
