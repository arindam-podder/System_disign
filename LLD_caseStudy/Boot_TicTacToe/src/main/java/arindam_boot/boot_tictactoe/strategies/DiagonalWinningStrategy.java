package arindam_boot.boot_tictactoe.strategies;

import arindam_boot.boot_tictactoe.model.Board;
import arindam_boot.boot_tictactoe.model.Player;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Player player, Board board) {
        //3*3 .. check top-left to bottom-right diagonal
        int symbolCount =0;
        for(int diagonal = 0; diagonal< board.getSize(); diagonal++){
            if(board.getGrid().get(diagonal).get(diagonal).getSymbol() != null &&
                    board.getGrid().get(diagonal).get(diagonal).getSymbol().equals(player.getSymbol())) {
                symbolCount += 1;
            }
        }
        if(symbolCount == board.getSize()){
            return true;
        }

        //check top-right to bottom-left diagonal
        symbolCount = 0;
        int diaCol = 2;
        int diaRow = 0;
        for(int i=1; i<= board.getSize(); i++){
            if(board.getGrid().get(diaRow).get(diaCol).getSymbol() != null &&
                    board.getGrid().get(diaRow).get(diaCol).getSymbol().equals(player.getSymbol())) {
                symbolCount += 1;
            }
            diaCol--;
            diaRow++;
        }
        if(symbolCount == board.getSize()){
            return true;
        }

        return false;
    }
}
