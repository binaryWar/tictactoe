package TicTacToe.stratgies;

import TicTacToe.Models.*;

public class DiagonalWinningStragies implements WinningStrategy{
    @Override
    public boolean checkWinner(Move move, Board board) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getPlayerSymbol();
        if(row - col == 0){
            int count = 0;
            for(int i = 0,j=0; i < board.getSize(); i++,j++){
                Cell cell = board.getGrid().get(i).get(j);
                if(cell.getCellState().equals(CellState.FILLED) && cell.getPlayer().getPlayerSymbol().equals(symbol)){
                    count++;
                }
            }
            if(count == board.getSize()){return true;}
        }else if(row+col == board.getSize()-1){
            int count = 0;
            for(int i = 0,j=board.getSize()-1; i < board.getSize(); i++,j--){
                Cell cell = board.getGrid().get(i).get(j);
                if(cell.getCellState().equals(CellState.FILLED) && cell.getPlayer().getPlayerSymbol().equals(symbol)){
                    count++;
                }

            }
            if(count == board.getSize()){return true;}
        }
        return false;
    }

    @Override
    public void handleUndo(Move Move, Board board) {

    }
}
