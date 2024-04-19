package TicTacToe.Models;

public class BotPlayer extends Player {
    private BotDifficultyLevel difficultyLevel;

    public BotDifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
