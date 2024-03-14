import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Boolean and Conditions
        //Bank();
        //Calendar();
        //BooleanComparisons();
        //JavaMart();
        //Championship();

        //Basics. Types and Variables.
        //StrangeNamedVariables();
        //NextLineExperiment();
        //Javagram();
        //Survey();
        //GryffindorPoints();
        //PrintInitials();

        //javac <FileName.java>
        //java <FileName>
    }

    //Boolean and Conditions
    public static void Bank() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        boolean wantMortage = scan.nextLine().equalsIgnoreCase("yes");

        if (wantMortage) {
            System.out.println("\nGreat! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();

            System.out.println("\nHow many years have you worked for?");
            byte experience = scan.nextByte();

            System.out.println("What is your name?");
            String name = scan.nextLine();

            if (savings >= 10_000 && debt < 5_000 && experience > 2) {
                System.out.println("Congratulations " + name + " You have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }          
        } else {
            System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }

    public static void Calendar() {
        System.out.println("Which day do you ask about?");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        System.out.println("Hmm, let me check my calendar.");
        
        switch (day) {
            case "Monday":
                System.out.println("Can't.");
                break;
            case "Tuesday":
                System.out.println("Busy.");
                break;
            case "Wednesday":
                System.out.println("Let's do it!");
                break;
            case "Thurthday":
                System.out.println("Yeah!");
                break;
            case "Friday":
            System.out.println("Perhaps.");
                break;
            case "Saturday":
                System.out.println("Sure!");
                break;
            case "Sunday":
                System.out.println("Certainly.");
            break;
        default:
                System.out.println("Do you feel good?");
                break;
        }       
        
        sc.close();
    }

    public static void BooleanComparisons() {
        
        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("Java: " + (biologyGrade > chemistryGrade) + "\n");
        
        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        System.out.println("Java: " + (sales > costs) + "\n");

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        System.out.println("Java: " + (temperature < targetTemperature) + "\n");

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        System.out.println("Java: " + (currentSpeed < speedLimit) + "\n");

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        System.out.println("Java: " + (age >= retirementAge) + "\n");

        double salary = 50000.0;
        double maxSalary = 60000.0;
        System.out.println("Me: Hi Java, is my salary less than or equal to the maximum salary?");
        System.out.println("Java: " + (salary <= maxSalary) + "\n");

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        System.out.println("Java: " + (myGrade == bestGrade) + "\n");
        
        int phoneNumber = 5551234;
        int contactNumber = 5551234;
        System.out.println("Me: Hi Java, is this the correct phone number for my contact?");
        System.out.println("Java: " + (phoneNumber == contactNumber) + "\n");
        
        char letter1 = 'a';
        char letter2 = 'b';
        System.out.println("Me: Hi Java, are these two letters different?");
        System.out.println("Java: " + (letter1 != letter2) + "\n");
        
        long distance1 = 1000L;
        long distance2 = 500L;
        System.out.println("Me: Hi Java, are these two distances not equal?");
        System.out.println("Java: " + (distance1 != distance2) + "\n");

        // "==" and "!=" operators do not work korrectly with Strings
        String word = "hello";
        String secondWord = "hello";

        System.out.println("Me: Are the two words the same?");
        System.out.println("Java: " + word.equals(secondWord) + "\n");


        String thirdWord = "hello";
        String fourthWord = "goodbye";

        System.out.println("Me: Are the two words different");
        System.out.println("Java: " + !thirdWord.equals(fourthWord) + "\n");
    }

    public static void JavaMart() {
        double wallet = 100;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if (wallet >= toyCar){
            System.out.println("Sure!");
            wallet -= toyCar;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left.");
        }
        
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if (wallet >= nike){
            System.out.println("Sure!");
            wallet -= nike;
        } else {
            System.out.println("Sorry, I only have " + wallet + " left.");
        }
    }

    public static void Championship() {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 100;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("Gryffindor won!");
        } else if (margin >= 0) {
            System.out.println("Gryffindor are second.");
        } else if (margin >= -100) {
            System.out.println("Gryffindor are third.");
        } else if (margin < -100) {
            System.out.println("Gryffindor are fourth.");
        }
    }

    //Basics
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

    //Kind of Survey
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
