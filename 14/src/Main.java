import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements for Array1:");
        int size1 = scanner.nextInt();
        String[] array1 = new String[size1];
        System.out.println("Enter the elements of Array1:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.next();
        }
        System.out.println("Enter the number of elements for Array2:");
        int size2 = scanner.nextInt();
        String[] array2 = new String[size2];
        System.out.println("Enter the elements of Array2:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.next();
        }
        ArrayList<String> common = new ArrayList<>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s1.equals(s2)) {
                    common.add(s1);
                }
            }
        }
        System.out.println("Common elements: " + common);
    }
}
