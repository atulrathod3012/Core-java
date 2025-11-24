public class ClassAndObject {
    String name;
    int age;

    void show() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        ClassAndObject p = new ClassAndObject();
        p.name = "Atul";
        p.age = 22;
        p.show();
    }
}
