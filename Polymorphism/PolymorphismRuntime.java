package Polymorphism;
// method overriding example
class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show()");
    }
}

public class PolymorphismRuntime {
    public static void main(String[] args) {
        Parent p = new Child(); // runtime binding
        p.show();
    }
}
