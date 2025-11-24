package Contructors;
public class ConstructorsD {
    double value;

    ConstructorsD() {
        this(1.0);
    }

    ConstructorsD(double v) {
        value = v;
    }

    public static void main(String[] args) {
        ConstructorsD d = new ConstructorsD();
        System.out.println(d.value);
    }
}
