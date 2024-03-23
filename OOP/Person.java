import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    //Initialization constructor
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    //Copy constructor
    public Person(Person person) {
        this.name = person.name;
        this.nationality = person.nationality;
        this.dateOfBirth = person.dateOfBirth;
        this.passport = Arrays.copyOf(person.passport, person.passport.length);
        this.seatNumber = person.seatNumber;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public void setNationality(String nationality) {
        if (!nationality.isEmpty()) {
            this.nationality = nationality;
        }
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (!(dateOfBirth.length() < 6)) {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public void setPassport() {
        this.passport = new String[]{name, nationality, dateOfBirth};
    }

    public void setSeatNumber(int seatNumber) {
        if (seatNumber > 0) {
            this.seatNumber = seatNumber;
        }
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int chooseSeat(int maxNumber) {
        seatNumber = (int) (Math.random() * maxNumber + 1);
        return seatNumber;
    }
    
    public String toString() {
        return "Name: " + name + "\n" + "Nationality: " + 
            nationality + "\n" + "Date of Birth: " + 
            dateOfBirth + "\n" + "Seat Number: " +
            seatNumber + "\n" + "Passport: " + 
            Arrays.toString(passport) + "\n";
    }
}
