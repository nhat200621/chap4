public class Main {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Number of words: " + countWords(str));
    }
}