package Abstraction;
// abstraction using interface
interface Player {
    void play();
}

class AudioPlayer implements Player {
    public void play() {
        System.out.println("Audio playing");
    }
}

public class AbstractionInterface {
    public static void main(String[] args) {
        Player p = new AudioPlayer();
        p.play();
    }
}
