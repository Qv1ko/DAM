using TMPro;
using UnityEngine;

public class MusicController : MonoBehaviour {

    public AudioClip[] songs;
    private AudioSource player;
    private int index = 0;
    private Animator speakerAnim;
    //[SerializeField]
    private TMP_Text title;

    void Start() {
        player = this.GetComponent<AudioSource>();
    }

    public void BackSong() {
        index = ((index > 0) ?  index : songs.Length) - 1;
        PlaySong();
    }

    public void PlaySong() {

        player.clip = songs[index];

        title.text = player.clip.name;

        if (player.isPlaying) {
            player.Pause();
            speakerAnim.enabled = false;
        } else {
            player.Play();
            speakerAnim.enabled = true;
        }

    }

    public void StopSong() {
        player.Stop();
        speakerAnim.enabled = false;
    }

    public void NextSong() {
        index = (index < songs.Length - 1) ? index + 1 : 0;
        PlaySong();
    }

}
