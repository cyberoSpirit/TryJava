import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

import Airline.Airline;
import Airline.Custom;
import Airline.Person;
import Store.Movie;
import Store.Store;

public class Main {
    public static void main(String[] args) {
        //TestAirline();
        
        //TestDates();

        //TryList.tryArrayList();
        //TryList.tryLinkedList();
        //TryList.testALAndLL();
        //TestStore();

        var fileName = "greetings.txt";
        TryExceptions.TestCheckedExceptionInside(fileName);

        try {
            TryExceptions.TestCheckedExceptionOutside(fileName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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

    public static void TestStore() {
        var store = new Store(new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("12 Angry Men", "DVD", 8.9),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Good, the Bad and the Ugly", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        });

        
        System.out.println("********************************MOVIE STORE*******************************");
        Scanner scanner = new Scanner(System.in);

        String status = "continue";
        while (status.equals("continue")) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");
            int choice = scanner.nextInt();
            Movie movie = store.getMovie(choice);
            System.out.print("Set a new rating for " + movie.getName() + ": ");
            double rating = scanner.nextDouble();
            movie.setRating(rating);
            store.setMovie(choice, movie);
            System.out.println(store);
            System.out.print("To edit another rating, type: 'continue': ");
            status = scanner.next();
        }
        scanner.close();

    }
}