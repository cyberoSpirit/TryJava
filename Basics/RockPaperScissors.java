import java.util.Scanner;

public class RockPaperScissors {
    public static void play() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        boolean userReady = scan.nextLine().toLowerCase().equals("yes");

        if (userReady) {
            /*
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).        
            */
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String user = scan.nextLine();
            String computer = computerChoice();
            String result = result(user, computer);
            printResult(user, computer, result);
        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    private static String computerChoice() {
        int random = (int) (Math.random() * 3);

        switch (random) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                throw new Error("There is no such option.");
        }
    }

    /**
     * Function name: result - It returns the result of the game.
     *  @param userChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       User: "rock"      Computer: "scissors"
     *       User: "paper"     Computer: "rock"
     *       User: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      User: "scissors"
     *       Computer: "paper"     User: "rock"
     *       Computer: "scissors"  User: "paper"
     *
     *   3. result is "It's a tie" if: User's choice equals computer choice.
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */
    public static String result(String usersChoice, String computerChoice) {
        if((usersChoice.equals("rock") && computerChoice.equals("scissors")) ||
        (usersChoice.equals("paper") && computerChoice.equals("rock")) ||
                (usersChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "You win!";
        }
        if((usersChoice.equals("scissors") && computerChoice.equals("rock")) ||
        (usersChoice.equals("rock") && computerChoice.equals("paper")) ||
                (usersChoice.equals("paper") && computerChoice.equals("scissors"))) {
            return "You lose";
        }
        if (usersChoice.equals(computerChoice)) {
            return "It's a tie";
        }
        return "INVALID CHOICE";
      }
 
    /**
     * Name: printResult - It prints everything (user choice, computer choice, result)
     * @param userChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <user choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */
    private static void printResult(String userChoise, String computerChoice, String result) {
        System.out.println("You chose:          " + userChoise);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }

}
