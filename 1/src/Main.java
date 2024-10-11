public class Main {
    public static int findSmallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;
        System.out.println("Smallest number is: " + findSmallest(a, b, c));
    }
}
