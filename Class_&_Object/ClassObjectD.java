public class ClassObjectD {
    boolean active;

    void toggle() {
        active = !active;
    }

    public static void main(String[] args) {
        ClassObjectD o = new ClassObjectD();
        o.active = false;
        o.toggle();
        System.out.println("Active: " + o.active);
    }
}
