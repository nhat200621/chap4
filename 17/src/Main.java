import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập chuỗi thứ hai: ");
        String str2 = scanner.nextLine();
        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("\"" + str1 + "\" nhỏ hơn \"" + str2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" lớn hơn \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" bằng \"" + str2 + "\"");
        }
    }
}
