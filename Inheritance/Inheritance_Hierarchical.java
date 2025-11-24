package Inheritance;
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels");
    }
}

class Bike extends Vehicle {
    void balance() {
        System.out.println("Bike maintains balance");
    }
}

public class Inheritance_Hierarchical {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        c.wheels();

        b.start();
        b.balance();
    }
}
