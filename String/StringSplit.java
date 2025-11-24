
// splitting a string
public class StringSplit {
    public static void main(String[] args) {
        String s = "red,green,blue,yellow";
        String[] arr = s.split(",");

        for (String color : arr) {
            System.out.println(color);
        }
    }
}
