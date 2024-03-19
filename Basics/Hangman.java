import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    private String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    private String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n" };
    
    private Scanner scan = new Scanner(System.in);
    private char[] word;
    private char[] userWord;
    private String usedLetters;
    private int guessedLettersCount;
    private int hangPosition;

    public Hangman() {
        word = selectWord();
        userWord = new char[word.length];
        Arrays.fill(userWord, '_');
        guessedLettersCount = 0;
        hangPosition = 0;
        usedLetters = "";
    }

    public void play() {
        if (userWantToPlay()) {
            System.out.println("Great let's start!");
            printWord(userWord);
            
            char letter;
            int guessed;
            do {
                letter = getUserSymbol();
                usedLetters += letter + " ";
                guessed = lettersGuessed(letter);
                
                if (guessed == 0) {
                    ++hangPosition;
                    System.out.println(gallows[hangPosition]);
                } else {
                    guessedLettersCount += guessed;
                }    
                
                printWord(userWord);
                System.out.println("You have already tried: " + usedLetters);
            } while (guessedLettersCount != word.length
                && hangPosition + 1 != gallows.length);
            
            printResult(guessedLettersCount == word.length);
        } else {
            System.out.println("Ok, maybe next time.");
        }
    }
    
    private void printResult(boolean userWon) {
        if (userWon) {
            System.out.println("Congratuations! You have won!");
        } else {
            System.out.println("You've lost. Maybe next time :)");
        }
    }

    private int lettersGuessed(char letter) {
        int guessedLetters = 0;

        for (int i = 0; i < userWord.length; i++) {
            if (word[i] == letter) {
                userWord[i] = letter;
                ++guessedLetters;
            }
        }
        return guessedLetters;
    }
    
    private char getUserSymbol() {
        System.out.println("Please, enter your letter:");
        String input = scan.nextLine().toLowerCase();

        while (input.length() != 1
                || input.charAt(0) < 'a'
                || input.charAt(0) > 'z') {
            System.out.println("It's not an english letter.\nPlease, enter your letter:");
            input = scan.nextLine().toLowerCase();
        }

        return input.charAt(0);
    }

    private char[] selectWord() {
        int wordNumber = (int) (Math.random() * words.length);
        return words[wordNumber].toCharArray();
    }

    private void printWord(char[] word) {
        for (char c : word) {
            System.out.print(" " + c);
        }
        System.out.println();
    }
    
    private boolean userWantToPlay() {
        System.out.println("Let's play Hangman.");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String decision = scan.nextLine().toLowerCase();
        while (!decision.equals("yes") && !decision.equals("no")) {
            System.out.println("Wront input. Please, write 'yes' if you are or 'no' in othe case.");
            decision = scan.nextLine().toLowerCase();
        } 

        return decision.equals("yes");
    }
}




