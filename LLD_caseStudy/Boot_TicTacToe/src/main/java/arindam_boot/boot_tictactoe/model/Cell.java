package arindam_boot.boot_tictactoe.model;

import arindam_boot.boot_tictactoe.enums.CellState;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cell {

    private int row;
    private int col;
    private Symbol symbol;
    private CellState state;


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.state = CellState.EMPTY;
    }

}
