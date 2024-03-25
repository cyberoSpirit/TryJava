import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
}