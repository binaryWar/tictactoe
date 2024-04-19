package TicTacToe.stratgies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Player;

public interface WinningStrategy {
    void winningStrategy(Player player, Board board);
}
