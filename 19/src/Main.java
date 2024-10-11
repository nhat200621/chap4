import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập vị trí bắt đầu: ");
        int start = scanner.nextInt();
        System.out.print("Nhập vị trí kết thúc: ");
        int end = scanner.nextInt();
        String substring = str.substring(start, end);
        System.out.println("Chuỗi con từ vị trí " + start + " đến " + end + ": " + substring);
    }
}
