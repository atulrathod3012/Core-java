package Contructors;
public class ConstructorsC {
    int a, b;

    ConstructorsC(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int product() {
        return a * b;
    }

    public static void main(String[] args) {
        ConstructorsC c = new ConstructorsC(3, 5);
        System.out.println(c.product());
    }
}
