package Basics;
public class OperatorsDemo {
public static void main(String[] args) {
int x = 10, y = 3;
System.out.println("x + y = " + (x + y));
System.out.println("x - y = " + (x - y));
System.out.println("x * y = " + (x * y));
System.out.println("x / y = " + (x / y));
System.out.println("x % y = " + (x % y));


x += 5; // assignment
System.out.println("x after +=5: " + x);


boolean res = (x > y) && (y > 0); // logical
System.out.println("res = " + res);
}
}