package Inheritance;
interface Engine {
    void engineOn();
}

interface MusicSystem {
    void playMusic();
}

class BaseVehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class SmartCar extends BaseVehicle implements Engine, MusicSystem {
    public void engineOn() {
        System.out.println("Engine ON");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class Inheritance_Hybrid {
    public static void main(String[] args) {
        SmartCar sc = new SmartCar();
        sc.start();
        sc.engineOn();
        sc.playMusic();
    }
}
