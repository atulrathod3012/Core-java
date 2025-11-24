public class ClassObjectC {
    double value;

    void multiply(double factor) {
        value *= factor;
    }

    public static void main(String[] args) {
        ClassObjectC n = new ClassObjectC();
        n.value = 5.5;
        n.multiply(2);
        System.out.println("Value: " + n.value);
    }
}
