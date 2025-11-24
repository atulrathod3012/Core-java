package String;
// basic string methods
public class StringMethods {
    public static void main(String[] args) {
        String s = "hello world";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("he"));
        System.out.println(s.endsWith("ld"));
        System.out.println(s.substring(0, 5));
    }
}
