import java.util.Arrays;
public class Main {
    public static int[] swapFirstLast(int[] arr) {
        if (arr.length >= 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9};
        int[] newArr = swapFirstLast(arr);
        System.out.println("Array after swapping first and last elements:");
        System.out.println(Arrays.toString(newArr));
    }
}
