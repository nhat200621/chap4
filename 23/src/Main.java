import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chính: ");
        String mainStr = scanner.nextLine();
        System.out.print("Nhập chuỗi cần đếm số lần xuất hiện: ");
        String subStr = scanner.nextLine();
        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        System.out.println("Chuỗi \"" + subStr + "\" xuất hiện " + count + " lần trong chuỗi \"" + mainStr + "\".");
    }
}
