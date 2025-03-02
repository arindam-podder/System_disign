package arindam_boot.boot_tictactoe.strategies;

import arindam_boot.boot_tictactoe.model.Board;
import arindam_boot.boot_tictactoe.model.Player;

public interface WinningStrategy {

    boolean checkWinner(Player player, Board board);

}
