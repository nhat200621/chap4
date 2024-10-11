import java.util.Arrays;
public class Main {
    public static int[] multiplyArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 3};
        int[] arr2 = {2, 4, -5, -2};
        int[] result = multiplyArrays(arr1, arr2);
        System.out.println("Result of multiplying corresponding elements: " + Arrays.toString(result));
    }
}
