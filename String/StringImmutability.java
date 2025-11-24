
// strings are immutable
public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1;    // both point to same literal

        s1 = s1 + " Code"; // new object created

        System.out.println(s1);
        System.out.println(s2);
    }
}
