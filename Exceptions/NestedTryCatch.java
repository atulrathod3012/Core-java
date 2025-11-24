package Exceptions;
// nested try catch example
public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch");
            }
            String s = null;
            s.length();
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
