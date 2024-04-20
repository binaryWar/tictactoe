package TicTacToe.stratgies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
