package Polymorphism;
// method overloading example
class Calc {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

public class PolymorphismCompileTime {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(5, 3));
        System.out.println(c.add(2.5, 4.1));
    }
}
