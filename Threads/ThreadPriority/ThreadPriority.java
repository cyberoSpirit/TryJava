package ThreadPriority;

public class ThreadPriority {
    public static void tryThreadPriority() {
        Thread t1 = new Thread(() -> count(), "Thread-1");
        Thread t2 = new Thread(() -> count(), "Thread-2");
        Thread t3 = new Thread(() -> count(), "Thread-3");        
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " count: " + i);
            //If it is not the thread number one, skip processing in favour of other threads. 
            //Thread 1 will receive the most CPU time but other threads will also have some.
            if (!Thread.currentThread().getName().equals("Thread-1")) {
                Thread.yield();
            }
    
        }
    }
}