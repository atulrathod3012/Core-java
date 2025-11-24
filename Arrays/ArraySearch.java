package Arrays;
// simple linear search
public class ArraySearch {
    public static void main(String[] args) {
        int[] a = {4, 8, 2, 10};
        int key = 8;

        boolean found = false;

        for (int n : a) {
            if (n == key) {
                found = true;
                break;
            }
        }

        System.out.println("Found: " + found);
    }
}
