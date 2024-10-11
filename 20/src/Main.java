import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chính: ");
        String mainStr = scanner.nextLine();
        System.out.print("Nhập chuỗi con: ");
        String subStr = scanner.nextLine();
        if (mainStr.contains(subStr)) {
            System.out.println("Chuỗi \"" + subStr + "\" tồn tại trong chuỗi \"" + mainStr + "\".");
        } else {
            System.out.println("Chuỗi \"" + subStr + "\" không tồn tại trong chuỗi \"" + mainStr + "\".");
        }
    }
}
