package RaceConditions;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionExample {
    // public static int count = 0;
    public static AtomicInteger count = new AtomicInteger(0);

    public static void increment() {
        //count++; // Non-atomic increment can cause race condition
        count.incrementAndGet(); // Atomic increment, executed as a single step
    }

    public static int getCount() {
        //return count;
        return count.get();
    }

    public static void tryRaceConditions() throws InterruptedException {

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count : " + getCount());
    }
}
