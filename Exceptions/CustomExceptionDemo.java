package Exceptions;
// simple custom exception
class InvalidNumberException extends Exception {
    InvalidNumberException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    static void check(int n) throws InvalidNumberException {
        if (n < 0) {
            throw new InvalidNumberException("Number should be positive");
        }
        System.out.println("Valid number");
    }

    public static void main(String[] args) {
        try {
            check(-5);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
