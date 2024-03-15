import java.util.Scanner;

public class BooleansAndConditions {
    public void bank() {
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

    public void calendar() {
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

    public void booleanComparisons() {
        
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

    public void javaMart() {
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

    public void championship() {

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

}
