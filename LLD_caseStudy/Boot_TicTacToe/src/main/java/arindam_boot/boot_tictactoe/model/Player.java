package arindam_boot.boot_tictactoe.model;

import arindam_boot.boot_tictactoe.enums.CellState;
import arindam_boot.boot_tictactoe.enums.PlayerType;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Player {

    private Scanner scanner = new Scanner(System.in);

//    private int id;
    private String name;
    private PlayerType playerType;
    private Symbol symbol;

    public Player(String name,PlayerType playerType, Symbol symbol){
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public Move makeMove(Board board) {     //passing board here , valixate move here
        System.out.println("enter which cell u wnat to move.");
        System.out.println("enter the row(Zero index base) : ");
        int row = scanner.nextInt();
        System.out.println("enter the col(Zero index base) : ");
        int col = scanner.nextInt();

        return new Move(new Cell(row, col), this);
    }
}
