import Airline.AirlineProcessor;
import SmallExamples.TryDates;
import SmallExamples.TryExceptions;
import SmallExamples.TryList;
import Store.StoreProcessor;

public class Main {
    public static void main(String[] args) {
        AirlineProcessor.TestAirline();

        TryDates.TestDates();
        TryList.tryArrayList();
        TryList.tryLinkedList();
        TryList.testALAndLL();

        var storeProc = new StoreProcessor();
        storeProc.TestStore();

        var fileName = "greetings.txt";
        TryExceptions.TestCheckedExceptionInside(fileName);

        try {
            TryExceptions.TestCheckedExceptionOutside(fileName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        TryExceptions.TestUncheckedExceptionOutside();
    }
}