package TicTacToe.Models;

public class HumanPlayer extends Player{
    public HumanPlayer(int id, String name,Symbol playerSymbol) {
        super(id,name,PlayerType.HUMAN_PLAYER,playerSymbol);
    }
}
