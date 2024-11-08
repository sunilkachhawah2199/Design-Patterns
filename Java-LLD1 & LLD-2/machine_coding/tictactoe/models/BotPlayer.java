package machine_coding.tictactoe.models;

import machine_coding.tictactoe.utilities.Pair;

import java.util.Scanner;

public class BotPlayer extends Player{
    private BotLevel botLevel;


    // constructor for chaining
    public BotPlayer(String name, Symbol s, BotLevel botLevel){
        super(name, s);
        this.botLevel = botLevel;
    }

    @Override
    public Pair makeMove(Board board) {
        return null;
    }
}
