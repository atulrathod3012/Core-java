
// stringbuffer is synchronized (thread safe)
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Rocks");
        sb.insert(0, "Hey ");
        sb.reverse();

        System.out.println(sb);
    }
}
