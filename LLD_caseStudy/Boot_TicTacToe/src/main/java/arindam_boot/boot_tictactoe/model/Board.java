package arindam_boot.boot_tictactoe.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class Board {
    private final int size;
    private List<List<Cell>> grid;

    public Board(int size){
        this.size = size;

        this.grid = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell(i, j));
            }
            grid.add(row);
        }
    }

}
