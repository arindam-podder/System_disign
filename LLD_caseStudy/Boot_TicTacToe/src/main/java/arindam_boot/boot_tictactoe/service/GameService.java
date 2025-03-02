package arindam_boot.boot_tictactoe.service;

import arindam_boot.boot_tictactoe.enums.CellState;
import arindam_boot.boot_tictactoe.enums.GameState;
import arindam_boot.boot_tictactoe.model.*;
import arindam_boot.boot_tictactoe.strategies.WinningStrategy;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class GameService {

    private Scanner scanner = new Scanner(System.in);

    public Game constractTicTacToeGame(int boardSize, List<Player> playerList,
                                       List<WinningStrategy> winningStrategyList){
        //take care point : player count , player should have different symbol, there should be one bot

        return Game.getBuilder()
                .setBoardSize(boardSize)
                .setPlayerList(playerList)
                .setWinningStrategy(winningStrategyList)
                .build();

    }

    public void displayBoard(Game game){
        Board board = game.getBoard();
        for(int r=0; r< board.getSize(); r++){
            for(int c=0; c< board.getSize(); c++){
                Cell cell = board.getGrid().get(r).get(c);
                if(cell.getState() == CellState.EMPTY){
                    System.out.print("| "+ "-" +" |");
                } else if (cell.getState() == CellState.FILLED) {
                    System.out.print("| "+ cell.getSymbol().getSym() +" |");
                }
            }
            System.out.println();
        }
    }

    public boolean validateMove(Move move, Game game){          //implement in player level not here
        Cell selectedCell = move.getCell();
        int row = selectedCell.getRow();
        int col = selectedCell.getCol();
        //check cell row,col not getter than the board size and board cell is emty
        if(row<0 || row>= game.getBoard().getSize() || col<0 || col>=game.getBoard().getSize()){
            return false;
        }
        if( !game.getBoard().getGrid().get(row).get(col).getState().equals(CellState.EMPTY)){
            return false;
        }

        return true;
    }

    public void makeMove(Game game){
//        int currentPlayerIndex = game.getNextPlayerIndex() % game.getPlayerList().size();
        Player playerMakingMove = game.getPlayerList().get(game.getNextPlayerIndex());
        System.out.println("It is "+ playerMakingMove.getName() +"'s Turn." );

        Move moveByPlayer = playerMakingMove.makeMove(game.getBoard());
        //validate the move ...
        if(!this.validateMove(moveByPlayer, game)){
            System.out.println(" !!! Invalid move! Please try again. !!!");
            return;
        }

        //after move update the cell of board
        int row = moveByPlayer.getCell().getRow();
        int col = moveByPlayer.getCell().getCol();
        Cell cellToChange = game.getBoard().getGrid().get(row).get(col);
        cellToChange.setState(CellState.FILLED);
        cellToChange.setSymbol(playerMakingMove.getSymbol());

        //here u can store the moves data each time in list (future)


        this.checkWinner(playerMakingMove, game);
        this.checkDraw(game);

        game.setNextPlayerIndex( (game.getNextPlayerIndex()+1)%game.getPlayerList().size()  );
    }

    public void undo(Game game){

    }

    public void checkWinner(Player player, Game game){
        List<WinningStrategy> winningStrategyList = game.getWinningStrategyList();
        for(WinningStrategy winningStrategy : winningStrategyList){
            if(winningStrategy.checkWinner(player, game.getBoard()) ){
                game.setWinner(player);
                game.setGameState(GameState.SUCCESS);
            }
        }

    }

    public void checkDraw(Game game){
        Board board = game.getBoard();
        int filledCell = 0;
        for(int i=0; i<board.getSize(); i++){
            for(int j=0; j<board.getSize(); j++){
                if(board.getGrid().get(i).get(j).getState().equals(CellState.FILLED)){
                  filledCell += 1;
                }
            }
        }
        if(filledCell == board.getSize() * board.getSize()){
            game.setGameState(GameState.DRAW);
        }

    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }


}










