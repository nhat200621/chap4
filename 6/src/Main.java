import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 1, 9, 2};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array sorted in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
