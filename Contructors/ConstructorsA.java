package Contructors;
public class ConstructorsA {
    String name;

    ConstructorsA() {
        name = "NoName";
    }

    public static void main(String[] args) {
        ConstructorsA c = new ConstructorsA();
        System.out.println(c.name);
    }
}
