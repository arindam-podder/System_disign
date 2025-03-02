package arindam_boot.boot_tictactoe.model;

import arindam_boot.boot_tictactoe.enums.GameState;
import arindam_boot.boot_tictactoe.strategies.WinningStrategy;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class Game {

    private Board board;
    private List<Player> playerList;

    private List<Move> moves;

    private int nextPlayerIndex;

    private Player winner;

    private GameState gameState;

    private List<WinningStrategy> winningStrategyList;

    private Game(int boardSize, List<Player> playerList, List<WinningStrategy> winningStrategyList){
        this.board = new Board(boardSize);
        this.playerList = playerList;
        this.winningStrategyList = winningStrategyList;
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
    }

    public static Builder getBuilder(){
        return new Builder();
    }


    //create builder 
    public static class Builder{
        private int boardSize;
        private List<Player> playerList;
        private List<WinningStrategy> winningStrategyList;

        public Builder setBoardSize(int size){
            this.boardSize = size;
            return this;
        }
        public Builder setPlayerList(List<Player> playerList){
            this.playerList = playerList;
            return this;
        }
        public Builder setWinningStrategy(List<WinningStrategy> winningStrategyList){
            this.winningStrategyList = winningStrategyList;
            return this;
        }

        //validation logic can be present here

        public Game build(){
            //if validation there , call validations then return the obj

            return new Game(this.boardSize, this.playerList, this.winningStrategyList);
        }

    }


}

