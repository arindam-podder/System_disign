package arindam_boot.boot_tictactoe.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Symbol {

    public char sym;
    public String color;

    public Symbol(char symbol){
        this.sym = symbol;
    }

}
