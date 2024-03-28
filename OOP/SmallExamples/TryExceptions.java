package SmallExamples;
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

    public static void TestUncheckedExceptionOutside() {

        //**************ArrayIndexOutOfBounds**************//
        int[] grades = new int[] {96, 65, 56, 86};
        System.out.println(grades[3]); // to get an exception put 4

       //**************NullPointerException**************//
        String[] names = new String[7]; 
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        for (String name : names) {
            if (name != null) { //remove to get an exception
                System.out.println(name.toUpperCase());
            }
        }

        //**************InputMismatchException**************//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer");
        //scanner.nextInt(); //throws exception if user enter a word
        if (scanner.hasNextInt()) {
            scanner.nextInt();
        } else {
            scanner.next();
        }
        scanner.close();

    }
}
