package arindam_boot.boot_tictactoe.strategies;

import arindam_boot.boot_tictactoe.enums.CellState;
import arindam_boot.boot_tictactoe.model.Board;
import arindam_boot.boot_tictactoe.model.Move;

import java.util.Random;

public class MediumBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMove(Board board) {
        System.out.println("making the move...");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }


        //for medium , random move
        boolean isMoveMade = false;
        while (!isMoveMade){
            int r = new Random().nextInt(board.getSize());
            int c = new Random().nextInt(board.getSize());
            if(board.getGrid().get(r).get(c).getState().equals(CellState.EMPTY)){
                return new Move(board.getGrid().get(r).get(c), null);
            }
        }
        return null;
    }
}
