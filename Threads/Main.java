import ThreadCreation.CreateThread;
import ThreadInheritanse.ThreadInheritanse;
import ThreadInteraption.ThreadInteraption;
import ThreadJoining.ThreadJoining;
import ThreadPriority.ThreadPriority;
import ThreadPriority.ThreadSleepEffect;

public class Main {

    public static void main(String[] args) {
        //CreateThread.createThread();
        //ThreadPriority.tryThreadPriority();
        //ThreadSleepEffect.tryThreadSleepEffect();
        //ThreadInheritanse.tryThreadInheritanse();
        
        try {
            //ThreadJoining.tryThreadJoining();
            ThreadInteraption.testThreadInteraption();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        
    }
}