package ThreadInheritanse;

public class ThreadInheritanse {

    public static void tryThreadInheritanse() {
        // Creating the first athlete thread
        AthleteThread firstAthlete = new AthleteThread("Markus", Thread.MAX_PRIORITY, 84921);//the highest priority
        
        // Creating the second athlete thread
        AthleteThread secondAthlete = new AthleteThread("Hiroshi", Thread.MIN_PRIORITY, 43114);//the lowest priority

        System.out.println(firstAthlete.getName());
        System.out.println(secondAthlete.getName());
        // Starting the threads
        firstAthlete.start();
        secondAthlete.start();
    }
}