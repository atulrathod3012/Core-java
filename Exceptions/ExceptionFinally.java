package Exceptions;
// finally block always runs
public class ExceptionFinally {
    public static void main(String[] args) {
        try {
            int a = 5 / 1;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Finally executed");
        }
    }
}
