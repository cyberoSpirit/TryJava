import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);

    public void play() {
        int status;

        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '_');
        }

        System.out.println("\nLet's play tic tac toe");
        printBoard(board);
        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {
                System.out.println("X turn");
                int[] position = askUser(board);
                board[position[0]][position[1]] = 'X';
            } else {
                System.out.println("O  turn");
                int[] position = askUser(board);
                board[position[0]][position[1]] = 'O';
            }
            printBoard(board);

            status = checkWin(board);
            if (status == 3) {
                System.out.println("X wins");
                break;
            } else if (status == -3) {
                System.out.println("O wins");
                break;
            }
        }
        scan.close();
    }


    /**
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */
    private void printBoard(char[][] board) {
        for (char[] line : board) {
            System.out.print("\n\n\t");
            for (char element : line) {
                System.out.print(element + " ");
            }
        }
        System.out.println("\n");
    }      

   /** Task 4 - Write a function that lets the user choose a spot
    * Function name – askUser
    * @param board (char[][] board)
    * @return spot (int[])
    * 
    * Inside the function
    *   1. Asks the user: - pick a row and column number: 
    *   2. Check if the spot is taken. If so, let the user choose again.
    *   3. Return the row and column in an int[] array.
    */
    private int[] askUser(char[][] board) {
        System.out.println("Please enter a spot coordinates: ");
        int i = scan.nextInt() - 1;
        int j = scan.nextInt() - 1;

        while (i > 2 || i < 0 || j > 2 || j < 0 || board[i][j] != '_') {
            if (i > 2 || i < 0 || j > 2 || j < 0) {
                System.out.println("\nCoordinates are out of range. \nPlease enter new coordinates: ");
            } else if (board[i][j] != '_') {
                System.out.println("\nA spot is already taken. \nPlease enter new coordinates: ");
            }

            i = scan.nextInt() - 1;
            j = scan.nextInt() - 1;
        }
        
        return new int[] { i, j };
    }

    /**
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    private int checkWin(char[][] board) {
        int count1, count2;

        for (int i = 0; i < board.length; i++) {
            count1 = 0;
            count2 = 0;

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    ++count1;
                }
                if (board[i][j] == 'O') {
                    --count1;
                }
                if (board[j][i] == 'X') {
                    ++count2;
                }
                if (board[j][i] == 'O') {
                    --count2;
                }
            }

            if (Math.abs(count1) == 3) {
                return count1;
            } else if (Math.abs(count2) == 3) {
                return count2;
            }
        }

        count1 = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                ++count1;
            }
            if (board[i][i] == 'O') {
                --count1;
            }

            if (Math.abs(count1) == 3) {
                return count1;
            }
        }
        return 0;
    }
}
