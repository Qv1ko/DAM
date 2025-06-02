using UnityEngine;
using UnityEngine.SceneManagement;

public class SceneManage : MonoBehaviour {

    public void Jump(int numScene) {
        SceneManager.LoadScene(numScene);
    }

    public void Exit() {
        Application.Quit();
    }

}
