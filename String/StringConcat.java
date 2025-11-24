package String;
// string concatenation
public class StringConcat {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        String c = a + " " + b;
        String d = a.concat(" ").concat(b);

        System.out.println(c);
        System.out.println(d);
    }
}

