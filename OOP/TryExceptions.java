import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryExceptions {
    public static void TestCheckedExceptionInside(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            Scanner sc = new Scanner(fis);
            System.out.println(sc.nextLine());
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TestCheckedExceptionOutside(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
