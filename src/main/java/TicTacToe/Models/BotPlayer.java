package TicTacToe.Models;

import TicTacToe.stratgies.BotPlayingStrategy;
import TicTacToe.stratgies.BotPlayingStrategyFactory;

public class BotPlayer extends Player {

    private BotDifficultyLevel difficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public BotPlayer(int id, String name,Symbol playerSymbol, BotDifficultyLevel difficultyLevel) {
        super(id,name,PlayerType.BOT_PLAYER,playerSymbol);
        this.difficultyLevel = difficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(this.difficultyLevel);
    }
    public BotDifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    public Move makeMove(Board board){
        return botPlayingStrategy.makeMove(board);
    }
}
