package arindam_boot.boot_tictactoe;

import arindam_boot.boot_tictactoe.enums.BotDifficultyLevel;
import arindam_boot.boot_tictactoe.enums.GameState;
import arindam_boot.boot_tictactoe.enums.PlayerType;
import arindam_boot.boot_tictactoe.model.Bot;
import arindam_boot.boot_tictactoe.model.Game;
import arindam_boot.boot_tictactoe.model.Player;
import arindam_boot.boot_tictactoe.model.Symbol;
import arindam_boot.boot_tictactoe.service.GameService;
import arindam_boot.boot_tictactoe.strategies.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BootTicTacToeApplication {

    public static void main(String[] args) {

        SpringApplication.run(BootTicTacToeApplication.class, args);

        runTheGame();


    }

    public static void runTheGame(){
        GameService gameService = new GameService();

        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("Arindam", PlayerType.HUMAN, new Symbol('A')));
//        playerList.add(new Player("Shubham", PlayerType.HUMAN, new Symbol('S')));
        playerList.add(new Bot("Ultra Bot", new Symbol('B'), BotDifficultyLevel.MEDIUM));

        List<WinningStrategy> winningStrategyList = new ArrayList<>();
        winningStrategyList.add(new RowWinningStrategy());
        winningStrategyList.add(new ColumnWinningStrategy());
        winningStrategyList.add(new DiagonalWinningStrategy());

        Game game = gameService.constractTicTacToeGame(3, playerList, winningStrategyList);

        while (gameService.checkState(game).equals(GameState.IN_PROGRESS)) {
            gameService.displayBoard(game);
            gameService.makeMove(game);
        }

        System.out.println("### Game is Over ###");
        if(gameService.checkState(game).equals(GameState.DRAW)){
            System.out.println("*** The Game ends in a DRAW! ***");
        } else if (gameService.checkState(game).equals(GameState.SUCCESS)) {
            System.out.println("***** The Winner is : "+ gameService.getWinner(game).getName() +"  *****" );
        }
        gameService.displayBoard(game);
    }

}
