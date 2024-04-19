package TicTacToe.stratgies;

import TicTacToe.Models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){

        }else if(botDifficultyLevel.equals(BotDifficultyLevel.HARD)){

        }
        return null;
    }
}
