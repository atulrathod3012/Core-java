package Methods;
public class MethodTypesDemo {
public static void main(String[] args) {
MethodTypesDemo m = new MethodTypesDemo();
m.instanceMethod();
staticMethod();
int sum = add(2, 3);
System.out.println("sum = " + sum);
}


public void instanceMethod() {
System.out.println("Instance method called");
}


public static void staticMethod() {
System.out.println("Static method called");
}


public static int add(int a, int b) {
return a + b;
}
}