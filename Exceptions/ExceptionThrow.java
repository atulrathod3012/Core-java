package Exceptions;
// using throw to create exception
public class ExceptionThrow {
    static void checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Age must be 18 or above");
        }
        System.out.println("Allowed");
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}
