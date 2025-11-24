package Arrays;
// copying arrays
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = Arrays.copyOf(a, a.length);

        b[0] = 100; // only b changes

        System.out.println("Original: " + Arrays.toString(a));
        System.out.println("Copy: " + Arrays.toString(b));
    }
}

