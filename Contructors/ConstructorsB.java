package Contructors;
public class ConstructorsB {
    String name;

    ConstructorsB(String n) {
        name = n;
    }

    public static void main(String[] args) {
        ConstructorsB c = new ConstructorsB("Demo");
        System.out.println(c.name);
    }
}
