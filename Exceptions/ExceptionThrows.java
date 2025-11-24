package Exceptions;
// throws keyword example
public class ExceptionThrows {

    static void test() throws InterruptedException {
        Thread.sleep(500);
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
