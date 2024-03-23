public class Airline {
    private int seatsCount = 11;
    private int reserved = 0;
    private Person[] passengers;

    public Airline() {
        passengers = new Person[11];
    }

    public Person getPerson(int index) {
        if (index >= 0 && index < seatsCount)
        {
            return passengers[index];
        } else {
            throw new IndexOutOfBoundsException("Seat is out of available range.");
        }
    }

    public void createReservation(Person passenger) {
        int index = passenger.getSeatNumber() - 1;

        if (reserved == seatsCount) {
            System.out.println("Flight is sold out.");
            return;
        }

        while (passengers[index] != null) {
            System.out.println(
                    "\n" + passenger.getName() + ", seat: "
                            + passenger.getSeatNumber()
                            + " is already taken. Please choose another seat.\n");
            index = passenger.chooseSeat(seatsCount) - 1;
        }

        passengers[index] = new Person(passenger);
        System.out.println(
                "Thank you " + passenger.getName()
                        + " for flying with Java airlines. Your seat number is "
                        + passenger.getSeatNumber() + ".\n");
        ++reserved;
    }
    
    public Person[] getPassengers() {
        var passengers = new Person[reserved];
        int i = 0;
        for (Person passenger : passengers) {
            if (passenger != null) {
                passengers[i] = new Person(passenger);
                ++i;
            }
        }
        return passengers;
    }

    public void printPassengers() {
        for (Person passenger : passengers) {
            if (passenger != null) {
                System.out.println(passenger.toString());
            }
        }
    }
}
