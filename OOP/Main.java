import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

import Airline.Airline;
import Airline.Custom;
import Airline.Person;

public class Main {
    public static void main(String[] args) {
        //TestAirline();
        TestDates();
    }
    
    public static void TestAirline() {
        var people = new Person[] {
            new Person("Cleopatra", "Egypt", "69 BC", 1),
            new Person("Alexander the Great", "Macedon", "356 BC", 2),
            new Person("Julius Caesar", "Rome", "100 BC", 3),
            new Person("Hannibal", "Carthage", "247 BC", 4),
            new Person("Confucius", "China", "551 BC", 5),
            new Person("Pericles", "Greece", "429 BC", 6),
            new Person("Spartacus", "Thrace", "111 BC", 7),
            new Person("Marcus Aurelius", "Rome", "121 AD", 8),
            new Person("Leonidas", "Greece", "540 BC", 8),
            new Person("Sun Tzu", "China", "544 BC", 10),
            new Person("Hammurabi", "Babylon", "1750 BC", 10)
    };

    var airline = new Airline(11);

    for (Person person : people) {
        if (Custom.verifyPassport(person)) {
            person.setPassport();
            airline.createReservation(person);
        } else {
            System.out.println(
                    "Sorry " + person.getName() + ". Your passport: "
                            + Arrays.toString(person.getPassport()) + " is not valid.\n");
        }
    }

    airline.printPassengers();
    }
    
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