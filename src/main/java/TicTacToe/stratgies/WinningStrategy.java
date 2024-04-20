package TicTacToe.stratgies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface WinningStrategy {
    boolean checkWinner(Move move, Board board);
    void handleUndo(Move move, Board board);
}
