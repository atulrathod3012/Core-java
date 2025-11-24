package Arrays;
// reverse array manually
public class ArrayReverse {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] rev = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            rev[i] = a[a.length - 1 - i];
        }

        for (int r : rev) {
            System.out.println(r);
        }
    }
}

