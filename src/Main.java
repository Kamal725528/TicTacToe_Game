import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends TicTacToeGame {

    public static void main(String[] arg) {

        TicTacToeGame game = new TicTacToeGame();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe! Player 1 will be X and Player 2 will be O");
        System.out.println("To make a move, enter the row and column where you want to place your mark. For example, '0 1' will place your mark in the first row, second column.");

        while (game.checkForWin() == false && game.isBoardFull() == false) {
            System.out.println("Current board layout:");
            game.printBoard();

            int row = -1, col = -1;
            int move;
            do {
                try {
                    System.out.println("Player " + game.currentPlayerMark + ", enter your move: as 1 to 9 box");
                   move =scan.nextInt();
                    if(move<0 || move>9){
                        throw new InputMismatchException("invalid input");
                    }
                   switch(move){
                       case 1:
                           row=0;
                           col=0;
                           break;
                       case 2:
                           row=0;
                           col=1;
                           break;
                       case 3:
                           row=0;
                           col=2;
                           break;
                       case 4:
                           row=1;
                           col=0;
                           break;
                       case 5:
                           row=1;
                           col=1;
                           break;
                       case 6:
                           row=1;
                           col=2;
                           break;
                       case 7:
                           row=2;
                           col=0;
                           break;
                       case 8:
                           row=2;
                           col=1;
                           break;
                       case 9:
                           row=2;
                           col=2;
                           break;
                       default:
                           break;
                   }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter two integers separated by a space.");
                    scan.nextLine();
                    continue;
                }
            } while (!game.placeMark(row, col));

            if(!game.checkForWin()) {
                game.changePlayer();
            }
        }

        System.out.println("Current board layout:");
        game.printBoard();
        if (game.checkForWin() == true) {
            System.out.println("Congratulations! Player " + game.currentPlayerMark + " has won the game!");
        } else {
            System.out.println("The game has ended in a draw.");
        }
    }
}
