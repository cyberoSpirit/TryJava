package ThreadCreation;

public class CreateThread {

    public static void createThread() {
        count();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
