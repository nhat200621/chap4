import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi thứ hai: ");
        String str2 = scanner.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Hai chuỗi có cùng nội dung.");
        } else {
            System.out.println("Hai chuỗi có nội dung khác nhau.");
        }
    }
}
