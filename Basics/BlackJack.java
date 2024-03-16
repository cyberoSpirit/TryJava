import java.util.Scanner;

public class BlackJack {

    private Scanner scan = new Scanner(System.in);

    public void play() {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int card;
        int total = 0;

        for (int i = 0; i < 2; i++) {
            card = getRandomCard();
            total += card;
            System.out.println(cardString(card));
        }

        System.out.println("Your total is: " + total);
        bustCheck(total, false);
        
        int dealerCard = getRandomCard();
        int dealerTotal = dealerCard;
        dealerCard = getRandomCard();
        dealerTotal += dealerCard;
        System.out.println("The dealer shows \n" + cardString(dealerCard) + "\nand has a card facing down \n" + cardString(0));
        System.out.println("\nThe dealer's total is hidden");

        boolean userHit = hitOrStay().equals("hit");
        while (userHit) {
            card = getRandomCard();
            total += card;
            System.out.println("\nYou get a \n" + cardString(card));
            System.out.println("Your new total is " + total);
            bustCheck(total, false);
            userHit = hitOrStay().equals("hit");
        }

        System.out.println("\nDealer's turn");
        System.out.println("The dealer's cards are \n" +
                cardString(dealerTotal - dealerCard) +
                "\n and a \n" + cardString(dealerCard));
        System.out.println("Dealer's total is " + dealerTotal);
        bustCheck(dealerTotal, true);
        
        while (dealerTotal < 17) {
            dealerCard = getRandomCard();
            dealerTotal += dealerCard;
            System.out.println("\nDealer gets a \n" + cardString(dealerCard));
            System.out.println("Dealer's total is " + dealerTotal);
            bustCheck(dealerTotal, true);
        }

        if (total > dealerTotal) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Dealer wins!");
        }

        scan.close();

    }

    /** 
     * Function name – getRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Returns a random number between 1 and 13.
     */
    private int getRandomCard() {
        return (int) (Math.random() * 13) + 1;
    }

    /**
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    private String cardString(int cardNumber) {
        switch ((int)cardNumber) {
            case 1:   
            return "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                    
            case 3:
            return"   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";

            case 4:
            return "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";

            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
            return  
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            

            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default: 
                return 
                    "   _____\n"+
                    "  |     |\n"+ 
                    "  |  J  |\n"+
                    "  | JJJ |\n"+
                    "  |  J  |\n"+
                    "  |_____|\n";
        }
    }
    
    /**
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    private String hitOrStay() {
        String userAnswer;
        do {
            System.out.println("Do you wanna hit or stay?");
            userAnswer = scan.nextLine();
        } while (!userAnswer.equals("hit") && !userAnswer.equals("stay"));
        return userAnswer;
    }

    private void bustCheck(int total, boolean isDealer) {
        if (total > 21) {
            System.out.println("Bust! " + (isDealer ? "Dealer" : "Palyer") + " loses");
            System.exit(0);
        }
    }
}

