package ThreadJoining;

public class ThreadJoining {

    public static void tryThreadJoining() throws InterruptedException {

        PlayerThread[] threads = new PlayerThread[4];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new PlayerThread(i+1);
            threads[i].start();
        }

        // Wait for all player threads to finish
        for (PlayerThread playerThread : threads) {
            playerThread.join();
        }

        // Determine the player with the highest score
        int winningScore = 0;
        int winner = 0;
        for (int i = 0; i < threads.length; i++) {
            if (threads[i].getScore() > winningScore) {
                winningScore = threads[i].getScore();
                winner = i + 1;
            }
        }

        System.out.println("Player " + winner + " wins with a score of " + winningScore);

    }
}