package Lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLambda {
    public static void TryLambda() {
        //TryConsumer();
        //TryComparator();
        //TryBiConsumer();
        //TryStream();
        //TryTerminalOperations();
        TryStreamCreation();
    }

    public static void TryConsumer() {
        List<String> list = Arrays.asList("item1", "item2", "item3");
        //list.forEach((String item) -> { System.out.println(item); });
        list.forEach(item -> System.out.println(item)); //one line of code can be more simplified

        List<Payment> payments = Arrays.asList(
                new Payment(LocalDate.of(2020, 1, 1), 100.00),
                new Payment(LocalDate.of(2020, 2, 15), 200.00),
                new Payment(LocalDate.of(2020, 3, 30), 300.00),
                new Payment(LocalDate.of(2020, 4, 1), 50.00),
                new Payment(LocalDate.of(2020, 5, 15), 75.00),
                new Payment(LocalDate.of(2020, 6, 30), 100.00));

        payments.forEach(p -> {
            System.out.println("Date: " + p.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            System.out.println("Amount: " + p.getAmount());
            System.out.println("---");
        });
    }

    public static void TryComparator() {
        List<Double> prices = Arrays.asList(55.99, 33.99, 88.99, 11.49, 55.99, 111.99, 77.99);
        prices.sort((Double a, Double b) -> b.compareTo(a));

        System.out.println("\nPrices\n------");
        prices.forEach(p -> System.out.println(p));

        List<String> books = Arrays.asList(
                "To Kill a Mockingbird",
                "The Great Gatsby",
                "Pride and Prejudice",
                "The Catcher in the Rye",
                "The Alchemist",
                "One Hundred Years of Solitude",
                "Moby-Dick",
                "The Brothers Karamazov",
                "The Lord of the Rings",
                "The Picture of Dorian Gray");
        books.sort((String a, String b) -> a.compareTo(b));

        System.out.println("\nLibrary\n--------");
        books.forEach(b -> System.out.println(b));

    }

    public static void TryBiConsumer() {
        Map<String, Item> map = new HashMap<>();
        map.put("WIDG-001", new Item("Widget", 3.99));
        map.put("GADG-002", new Item("Gadget", 5.99));
        map.put("THNG-003", new Item("Thingamajig", 2.99));
        map.put("DBOO-004", new Item("Doo-dad", 4.99));
        map.put("WIDG-005", new Item("Super Widget", 6.99));
        map.put("GADG-006", new Item("Super Gadget", 8.99));
        map.put("THNG-007", new Item("Super Thingamajig", 15));
        map.put("DOFO-008", new Item("Super Doo-dad", 10));

        System.out.println("\nSKU \t\tPrice\tItem");
        map.forEach(
                (String sku, Item item) -> System.out.println(sku + "\t" + item.getPrice() + "\t" + item.getName()));
    }

    public static void TryStream() {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85.6),
                new Student("Bob", 73.2),
                new Student("Charlie", 64.1),
                new Student("Dave", 92.7),
                new Student("Eve", 77.4),
                new Student("Frank", 59.3),
                new Student("Gina", 91.4),
                new Student("Hannah", 76.8),
                new Student("Igor", 68.9),
                new Student("Jasmine", 82.5));

        students.stream()
                .filter(s -> s.getScore() > 80)
                .forEach(s -> System.out
                        .println("Congratulations " + s.getName() + " for achieving a score of " + s.getScore())); // terminal operation()

        List<Book> books = Arrays.asList(
                new Book("The Alchemist", "Fantasy", 1988, 15.42),
                new Book("The Giver", "Dystopian", 1993, 14.98),
                new Book("Jane Eyre", "Romance", 1847, 11.94),
                new Book("The Picture of Dorian Gray", "Gothic", 1890, 13.18),
                new Book("The Great Gatsby", "Tragedy", 1925, 14.60),
                new Book("To Kill a Mockingbird", "Coming of Age", 1960, 12.84),
                new Book("The Catcher in the Rye", "Realistic Fiction", 1951, 9.22),
                new Book("Pride and Prejudice", "Romance", 1813, 13.42),
                new Book("1984", "Dystopian", 1949, 11.68),
                new Book("Wuthering Heights", "Romance", 1847, 16.16),
                new Book("Moby Dick", "Adventure", 1851, 15.42),
                new Book("The Heart of Darkness", "Adventure", 1899, 13.80),
                new Book("The Old Man and the Sea", "Adventure", 1952, 11.90),
                new Book("The Time Machine", "Science Fiction", 1895, 12.96),
                new Book("The Picture of Dorian Gray", "Gothic", 1890, 13.94));

        System.out.println("\nThese books are on sale\n-----------------------");
        books.stream()
                .filter(b -> b.getGenre().equals("Romance"))
                .map(b -> new Book(b.getTitle(), b.getGenre(), b.getYear(), b.getPrice() / 2))
                .sorted((b1, b2) -> b1.getYear().compareTo(b2.getYear()))
                .forEach(b -> System.out
                        .println(b.getGenre() + "\t" + b.getYear() + "\t$" + b.getPrice() + "\t" + b.getTitle())); // terminal operation

    }

    public static void TryTerminalOperations() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        System.out.println("\n**************************************");
        names.stream().map(n -> "Hello, " + n + "!").forEach(n -> System.out.println(n));

        System.out.println("\n**************************************");
        List<String> usernames = Arrays.asList("sparklingunicorn", "galactic_goddess", "neon_ninja", "purplepixiedust");
        String username = usernames.stream()
                .filter(un -> un.equals("neon_ninja"))
                .findFirst()
                .orElse(null);

        System.out.println("Found you: " + username);

        System.out.println("\n**************************************");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        long numEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("There are " + numEven + " even numbers in this list");
    }

    public static void TryStreamCreation() {
        Path path = Paths.get("emails.txt");
        
        try {
            Files.lines(path)
                    .filter(l -> !l.startsWith("Spam"))
                    .forEach(l->System.out.println(l));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}