import java.util.Arrays;
public class Main {
    public static int[] createNewArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9};
        int[] newArray = createNewArray(arr);
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
