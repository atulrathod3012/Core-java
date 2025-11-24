package Inheritance;
class LivingBeing {
    void live() {
        System.out.println("Living being exists");
    }
}

class AnimalML extends LivingBeing {
    void move() {
        System.out.println("Animal moves");
    }
}

class DogML extends AnimalML {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Inheritance_Multilevel {
    public static void main(String[] args) {
        DogML d = new DogML();
        d.live();
        d.move();
        d.sound();
    }
}
