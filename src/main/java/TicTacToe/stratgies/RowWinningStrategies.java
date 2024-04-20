package TicTacToe.stratgies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;
import TicTacToe.Models.Player;
import TicTacToe.Models.Symbol;

import java.util.HashMap;

public class RowWinningStrategies implements WinningStrategy{
    HashMap<Integer,HashMap<Symbol,Integer>> counts = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        // 0 -> {'X' ->1} , {'O'->2}
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getPlayerSymbol();
        if(!counts.containsKey(row)){
            counts.put(row, new HashMap<>());
        }
        HashMap<Symbol,Integer> countRow = counts.get(row);
        if(!countRow.containsKey(symbol)){
            countRow.put(symbol, 0);
        }
        countRow.put(symbol, countRow.get(symbol) + 1);
        return countRow.get(symbol) == board.getSize();
    }

    @Override
    public void handleUndo(Move move, Board board) {
        int row = move.getCell().getRow();
        HashMap<Symbol,Integer> currentRow = counts.get(row);
        currentRow.put(move.getPlayer().getPlayerSymbol(), currentRow.get(move.getPlayer().getPlayerSymbol()) - 1);
    }
}
