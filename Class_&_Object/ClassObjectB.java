public class ClassObjectB {
    int x, y;

    int sum() {
        return x + y;
    }

    public static void main(String[] args) {
        ClassObjectB p = new ClassObjectB();
        p.x = 4;
        p.y = 6;
        System.out.println("Sum: " + p.sum());
    }
}
