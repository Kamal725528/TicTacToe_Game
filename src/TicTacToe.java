public abstract class TicTacToe {

    public abstract void initializeBoard();
    public abstract void printBoard();

    public abstract boolean isBoardFull();

    public abstract boolean checkForWin();

   public abstract boolean checkRowsForWin();

    public abstract boolean checkColumnsForWin();

    public abstract boolean checkDiagonalsForWin();

    public abstract boolean checkRowCol(char c1, char c2, char c3);

    public abstract void changePlayer();

    public abstract boolean placeMark(int row, int col);

}
