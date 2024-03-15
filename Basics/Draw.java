import java.util.Scanner;

public class Draw {

    /**
     * Function name: selectPicture
     * 
     * Inside the function:
     * 1. Ask which picture user wants to have drawn.
     * 2. Draw a picture
     */
    public void drawPicture() {

        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.print("\nWhich animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly ");
        System.out.println("Write 2 for elephant  ");
        System.out.println("Write 3 for bear      ");
        System.out.println("Write 4 for snake     ");

        choice = scan.nextInt();

        draw(choice);
        scan.close();
    }

    /**
     * Function name: draw - draws an animal that the user chooses.
     * @param choice: (int)
     * 
     * Inside the function: 
     *  • Based on the choice, draw:
     *      1. butterfly
     *      2. elephant
     *      3. bear
     *      4. snake
     */
    public void draw(int choice) {
        switch (choice) {
            case 1:
                drawButterfly();
                break;
            case 2:
                drawElephant();
                break;
            case 3:
                drawBear();
                break;
            case 4:
                drawSnake();
                break;
            default:
                System.out.println("The value is out of range.");
                break;
        }
    }

    private void drawButterfly(){
       System.out.println("  .==-.                   .-==.     ");
       System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
       System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
       System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
       System.out.println("      `._... .q(_)p. ..._.'         ");
       System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
       System.out.println("        .\"\"' .'|=|`. `\"\".       ");
       System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
       System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
       System.out.println("      \\O `::/       \\::' O/       ");
       System.out.println("       \"\"--'         `--\"\"      ");
    } 
    
    private void drawElephant(){
       System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
       System.out.println("   _.-'         \\ __...----...__ /         '-._");
       System.out.println(" .'      .:::...,'              ',...:::.      '.");
       System.out.println("(     .'``'''::;                  ;::'''``'.     )");
       System.out.println(" \\             '-)              (-'             /");
       System.out.println("  \\             /                \\             /");
       System.out.println("   \\          .'.-.            .-.'.          /");
       System.out.println("    \\         | \\0|            |0/ |         /");
       System.out.println("    |          \\  |   .-==-.   |  /          |");
       System.out.println("     \\          `/`;          ;`\\`          /");
       System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
       System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
       System.out.println("               / /`;   .==.   ;`\\ \\");
       System.out.println("         .---./_/   \\  .==.  /   \\ \\");
       System.out.println("        / '.    `-.__)       |    `\"");
       System.out.println("       | =(`-.        '==.   ;");
       System.out.println("        \\  '. `-.           /");
       System.out.println("         \\_:_)   `\"--.....-'");
    }
    
    private void drawBear(){
        System.out.println("            ___   .--. ");
        System.out.println("      .--.-\"   \"-' .- |");
        System.out.println("     / .-,`          .'");
        System.out.println("     \\   `           \\");
        System.out.println("      '.            ! \\");
        System.out.println("        |     !  .--.  |");
        System.out.println("        \\        '--'  /.____");
        System.out.println("       /`-.     \\__,'.'      `\\");
        System.out.println("    __/   \\`-.____.-' `\\      /");
        System.out.println("    | `---`'-'._/-`     \\----'    _");
        System.out.println("    |,-'`  /             |    _.-' `\\");
        System.out.println("   .'     /              |--'`     / |");
        System.out.println("  /      /\\              `         | |");
        System.out.println("  |   .\\/  \\      .--. __          \\ |");
        System.out.println("   '-'      '._       /  `\\         /");
        System.out.println("               `\\    '     |------'`");
        System.out.println("                 \\  |      |");
        System.out.println("                  \\        /");
        System.out.println("                   '._  _.'");
        System.out.println("                      ``");
    }
    
    private void drawSnake(){
        System.out.println("         ,,'6''-,.");
        System.out.println("        <====,.;;--.");
        System.out.println("        _`---===. \"\"\"==__");
        System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
        System.out.println("     |( @@@  |===|  @@@  ||");
        System.out.println("      \\\\ @@   |===|  @@  //");
        System.out.println("        \\\\ @@ |===|@@@ //");
        System.out.println("         \\\\  |===|  //");
        System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
        System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
        System.out.println("             |==||                           `\\   \\");
        System.out.println("            |==| |                             )   |");
        System.out.println("           |==| |       _____         ______,--'   '");
        System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
        System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
        System.out.println("                \"\"\"\"		");
    }
}
