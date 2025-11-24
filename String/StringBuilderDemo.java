// stringbuilder is faster but not synchronized
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Fast");

        sb.append(" Builder");
        sb.replace(0, 4, "Super");
        sb.delete(5, 12);

        System.out.println(sb);
    }
}
