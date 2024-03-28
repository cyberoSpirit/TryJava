package SmallExamples;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TryDates {

    public static void TestDates() {
        var scan = new Scanner(System.in);
        System.out.println("Please, give me your birthday in format YYYY-MM-DD:");
        String input = scan.nextLine();
        LocalDate birthday = LocalDate.parse(input);
        LocalDate todayDate = LocalDate.now();
        System.out.println("Congratulations, you are " + Period.between(birthday, todayDate).getYears() + " old");
        scan.close();
    }

}