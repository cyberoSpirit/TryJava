package DaemonThreads;

public class DaemonThreads {
    public static void tryDaemonThreads() {
        Thread memoryMonitorThread = new Thread(new MemoryMonitorDaemon());
        memoryMonitorThread.setDaemon(true);
        memoryMonitorThread.start();

        Thread memoryIntensiveTaskThread = new Thread(new MemoryIntensiveTask());
        memoryIntensiveTaskThread.start();
    }
}