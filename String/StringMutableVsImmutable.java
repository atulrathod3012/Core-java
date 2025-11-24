package String;
// string vs stringbuilder modification
public class StringMutableVsImmutable {
    public static void main(String[] args) {
        String s = "Hi";
        s.concat(" There"); // does not update original

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" There"); // updates same object

        System.out.println("String: " + s);
        System.out.println("StringBuilder: " + sb);
    }
}
