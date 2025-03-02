package arindam_boot.boot_tictactoe.factory;

import arindam_boot.boot_tictactoe.enums.BotDifficultyLevel;
import arindam_boot.boot_tictactoe.strategies.BotPlayingStrategy;
import arindam_boot.boot_tictactoe.strategies.EasyBotPlayingStrategy;
import arindam_boot.boot_tictactoe.strategies.HardBotPlayingStrategy;
import arindam_boot.boot_tictactoe.strategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(BotDifficultyLevel difficultyLevel){
        if(difficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        } else if (difficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        } else if (difficultyLevel.equals(BotDifficultyLevel.HARD)) {
            return new HardBotPlayingStrategy();
        }

        return null;
    }

}
