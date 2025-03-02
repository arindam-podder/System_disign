package arindam_boot.boot_tictactoe.strategies;

import arindam_boot.boot_tictactoe.model.Board;
import arindam_boot.boot_tictactoe.model.Player;

public class ColumnWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Player player, Board board) {
        for(int c=0; c< board.getSize(); c++){
            int symbolCount = 0;
            for(int r=0; r< board.getSize(); r++){
                if(board.getGrid().get(r).get(c).getSymbol() != null &&
                        board.getGrid().get(r).get(c).getSymbol().equals(player.getSymbol())){
                    symbolCount += 1;
                }
            }
            if(symbolCount == board.getSize()){
                return true;
            }
        }
        return false;
    }
}
