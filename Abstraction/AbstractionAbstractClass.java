package Abstraction;
// abstraction using abstract class
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class AbstractionAbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
