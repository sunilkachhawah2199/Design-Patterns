package machine_coding.tictactoe.models;

import machine_coding.tictactoe.utilities.Pair;

// we can't use interface here as we need to have a name and symbol for each player
// in interface we can't have fields
// object creation of abstract class is not allowed
public abstract class Player {
    private String name;
    private Symbol symbol;

    // constructor for chaining
    public Player(String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    // make move will be same for bot and human both ??? wrong
    // when human make move then user will enter postion
    // when bot make move then it will random move my bot and client will not give any input for move
    // so we will make abstract method
    // -----------------method to move ----------------------------
    public abstract Pair makeMove(Board board);

}
