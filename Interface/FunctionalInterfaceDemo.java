package Interface;
@FunctionalInterface
interface Adder { int add(int a, int b); }


public class FunctionalInterfaceDemo {
public static void main(String[] args) {
Adder ad = (x,y) -> x + y;
System.out.println(ad.add(5,6));
}
}