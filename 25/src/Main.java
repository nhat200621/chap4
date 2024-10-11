import java.util.Hashtable;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Hashtable<String, String> studentTable = new Hashtable<>();
        studentTable.put("K1001", "Nguyen Van A");
        studentTable.put("K1002", "Tran Thi B");
        studentTable.put("K1003", "Le Van C");
        System.out.println("Danh sách sinh viên:");
        studentTable.forEach((id, name) -> System.out.println("ID: " + id + ", Tên: " + name));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID sinh viên mới: ");
        String newId = scanner.nextLine();
        System.out.print("Nhập tên sinh viên mới: ");
        String newName = scanner.nextLine();
        studentTable.put(newId, newName);
        System.out.println("Danh sách sinh viên sau khi thêm:");
        studentTable.forEach((id, name) -> System.out.println("ID: " + id + ", Tên: " + name));
    }
}
