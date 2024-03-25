package Airline;
public class Airline {
    private int seatsCount = 11;
    private int reserved = 0;
    private Person[] passengers;

    public Airline(int seats) {
        this.seatsCount = seats;
        this.passengers = new Person[seatsCount];
    }

    public Person getPerson(int index) {
        if (index >= 0 && index < this.seatsCount)
        {
            return this.passengers[index] != null ? 
                new Person(this.passengers[index]) :
                null;
        } else {
            throw new IndexOutOfBoundsException("Seat is out of available range.");
        }
    }

    public void createReservation(Person passenger) {
        int index = passenger.getSeatNumber() - 1;

        if (this.reserved == this.seatsCount) {
            System.out.println("Flight is sold out.");
            return;
        }

        while (this.passengers[index] != null) {
            System.out.println(
                    "\n" + passenger.getName() + ", seat: "
                            + passenger.getSeatNumber()
                            + " is already taken. Please choose another seat.\n");
            index = passenger.chooseSeat(seatsCount) - 1;
        }

        this.passengers[index] = new Person(passenger);
        System.out.println(
                "Thank you " + passenger.getName()
                        + " for flying with Java airlines. Your seat number is "
                        + passenger.getSeatNumber() + ".\n");
        ++this.reserved;
    }
    
    public Person[] getPassengers() {
        var passengers = new Person[this.reserved];
        int i = 0;
        for (Person passenger : passengers) {
            if (passenger != null) {
                this.passengers[i] = new Person(passenger);
                ++i;
            }
        }
        return this.passengers;
    }

    public void printPassengers() {
        for (Person passenger : this.passengers) {
            if (passenger != null) {
                System.out.println(passenger.toString());
            }
        }
    }
}
