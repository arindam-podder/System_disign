package arindam_boot.boot_tictactoe.strategies;

import arindam_boot.boot_tictactoe.model.Board;
import arindam_boot.boot_tictactoe.model.Move;

public interface BotPlayingStrategy {

    public Move makeMove(Board board);
}
