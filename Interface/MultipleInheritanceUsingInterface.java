package Interface;
interface A { void a(); }
interface B { void b(); }


class Multi implements A, B {
public void a() { System.out.println("a"); }
public void b() { System.out.println("b"); }
}


public class MultipleInheritanceUsingInterface {
public static void main(String[] args) {
Multi m = new Multi();
m.a(); m.b();
}
}