public class Main {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int[] factorials = new int[10];
        for (int i = 1; i <= 10; i++) {
            factorials[i - 1] = factorial(i);
        }
        System.out.println("Factorials in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.println("Factorial of " + (i + 1) + " is: " + factorials[i]);
        }
    }
}
