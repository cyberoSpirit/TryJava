import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Javagram();
        //StrangeNamedVariables();
        //NextLineExperiment();
        //Survey();
        //GryffindorPoints();
        //PrintInitials();

        //javac <FileName.java>
        //java <FileName>
    }

    public static void Javagram() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to JavaGram! Let's sign you up.");
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("Make a username");  
        // If you experience trouble picking up the username, please carefully read the instructions on Learn the Part.
        scan.nextLine();
        String username = scan.nextLine();
        
        System.out.println("What city do you live in?");
        String city = scan.nextLine();

        System.out.println("What country is that?");
        String country = scan.nextLine();
        
        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        scan.close();
    }
    
    public static void StrangeNamedVariables()
    {
        //Because Java is good localized
        double π = 3.14159;
        System.out.println(π);
        String 你好 = "你好世界";
        System.out.println(你好);
        int лв = 1;
        System.out.println(лв);
    }

    public static void NextLineExperiment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money do you spend on food?");
        double foodPrice = scanner.nextDouble();

        System.out.println("How many times a week do you buy food?");
        int foodAmount = scanner.nextInt();

        System.out.println("What is your name?");
        scanner.nextLine(); //To be wasted on empty space
        String name = scanner.nextLine();
        scanner.close();

        System.out.println("Thank you " + name + " for answering all questions");
        System.out.println("Weekly, you spend $" + (foodPrice * foodAmount) + " on food");
    }

    public static void Survey() { 
        int counter = 0;
        System.out.println("Welcome. Thank you for taking the survey");
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        ++counter;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;


        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;
        scanner.close();

        //RESPOND TO THE USER
        System.out.println("Thank you " + name + " for answering all " + counter + " questions");
        System.out.println("Weekly, you spend $" + (coffeePrice * coffeeAmount) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodPrice * foodAmount) + " on food");
    }

    public static void GryffindorPoints() {
        int maxValue = 2147483647;
        System.out.println(maxValue);

        int points = 0;

        System.out.println("Harry was caught wandering the halls. -50 points for Gryffindor");
        points -= 50;
        System.out.println("Harry was being cheeky in class. -3 points for Gryffindor");
        points -= 3;
        System.out.println("Hermione got full marks on Lockhart's quiz. 30 points for Gryffindor");
        points += 30;
        System.out.println("Ron won the underground chess game. 100 points for Gryffindor");
        points += 100;
        System.out.println("Harry defeated Quirrell. 60 points for Gryffindor");
        points += 60;        
        
        System.out.println("Gryffindor received :" + points + " points");
        
    }

    //Prints initials of cyberoSpirit
    public static void PrintInitials() {
        System.out.println(" CCC     SSS ");
        System.out.println("C   C   S   S");
        System.out.println("C        S   ");
        System.out.println("C         S  ");
        System.out.println("C          S ");
        System.out.println("C   C   S   S");
        System.out.println(" CCC     SSS ");
    }
}
