import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C++", "PHP"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);
    }
}
