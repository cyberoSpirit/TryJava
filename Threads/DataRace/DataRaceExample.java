package DataRace;

public class DataRaceExample {

    public static volatile boolean flag;

    public static void tryDataRace() throws InterruptedException {

        Thread writerThread = new Thread(() -> {
            flag = true;
            System.out.println("Flag set to true");
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Waiting for flag to become true - might never see the change
            }
            System.out.println("Flag is true");
        });

        readerThread.start();
        Thread.sleep(100); // Simulating some delay
        writerThread.start();

    }
}