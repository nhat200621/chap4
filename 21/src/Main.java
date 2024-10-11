import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng ký tự của mảng: ");
        int size = scanner.nextInt();
        char[] charArray = new char[size];
        System.out.println("Nhập các ký tự cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Ký tự " + (i + 1) + ": ");
            charArray[i] = scanner.next().charAt(0);
        }
        String newString = new String(charArray);
        System.out.println("Chuỗi mới tạo ra từ mảng ký tự: " + newString);
    }
}
