package Interface;
interface Greeting {
default void hello() { System.out.println("Hello from default method"); }
}


public class DefaultMethodDemo implements Greeting {
public static void main(String[] args) {
new DefaultMethodDemo().hello();
}
}