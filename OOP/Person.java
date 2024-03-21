import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;
    }

    public void print() {
        System.out.println(name);
        System.out.println(nationality);
        System.out.println(dateOfBirth);
        System.out.println(Arrays.toString(passport));
        System.out.println(seatNumber);
    }
}
