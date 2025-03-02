package arindam_boot.boot_tictactoe.model;

import arindam_boot.boot_tictactoe.enums.BotDifficultyLevel;
import arindam_boot.boot_tictactoe.enums.PlayerType;
import arindam_boot.boot_tictactoe.factory.BotPlayingStrategyFactory;
import arindam_boot.boot_tictactoe.strategies.BotPlayingStrategy;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel = BotDifficultyLevel.EASY;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, Symbol symbol, BotDifficultyLevel difficultyLevel){
        super(name, PlayerType.BOT, symbol);
        this.botDifficultyLevel = difficultyLevel;
        this.botPlayingStrategy =
                BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(this.botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        return this.botPlayingStrategy.makeMove(board);
    }
}
