public class Main {
    public static void main(String[] args) {
        GryffindorPoints();
        //PrintInitials();

        //javac <FileName.java>
        //java <FileName>
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
