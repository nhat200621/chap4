import java.util.Scanner;
public class Main {
    public static boolean startsWithWord(String str, String word) {
        return str.startsWith(word);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Enter the word to check: ");
        String word = scanner.nextLine();
        if (startsWithWord(str, word)) {
            System.out.println("The string starts with the specified word.");
        } else {
            System.out.println("The string does not start with the specified word.");
        }
        scanner.close();
    }
}
