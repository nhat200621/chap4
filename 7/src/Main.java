public class Main {
    public static boolean checkFirstLastEqual(int[] arr) {
        return arr.length >= 2 && arr[0] == arr[arr.length - 1];
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 5};
        if (checkFirstLastEqual(arr)) {
            System.out.println("The first and last elements are the same.");
        } else {
            System.out.println("The first and last elements are not the same.");
        }
    }
}
