package ThreadCreation;

public class CreateThread {
    public static class ChildThreadTask implements Runnable {

        @Override
        public void run() {
            count();
        }

    }

    public static void createThread() {
        //System.out.println(Thread.currentThread().getName() + " thread");

        // Thread childThread = new Thread(new ChildThreadTask());
        Thread childThread = new Thread(()->count(), "child"); //here "child" is the thread name
        childThread.start();
        count();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
