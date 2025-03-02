package arindam_boot.boot_tictactoe.strategies;

import arindam_boot.boot_tictactoe.enums.CellState;
import arindam_boot.boot_tictactoe.model.Board;
import arindam_boot.boot_tictactoe.model.Cell;
import arindam_boot.boot_tictactoe.model.Move;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board) {
        System.out.println("making the move...");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //for easy , go through all the cell , make a move to the 1st cell that is empty
        for(int r=0; r< board.getSize(); r++){
            for(int c=0; c< board.getSize(); c++){
                if(board.getGrid().get(r).get(c).getState().equals(CellState.EMPTY)){
                    return new Move(new Cell(r,c), null);
                }
            }
        }

        return null;
    }
}
