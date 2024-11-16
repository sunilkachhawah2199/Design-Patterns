package machine_coding.tictactoe.controllers;

import Design_Patterns_And_Priciples.factory.Platform;
import machine_coding.tictactoe.exceptions.BotCountExceedExcetpion;
import machine_coding.tictactoe.models.Board;
import machine_coding.tictactoe.models.Game;
import machine_coding.tictactoe.models.GameStatus;
import machine_coding.tictactoe.models.Player;

import java.util.List;


public class GameController {

    // start the game
    /*
    for starting the game we need to create Game object because it will prepare the board and players
    and then we can start the game
     */

    public Game createGame(List<Player> players, int undoLimitPerPlayer) throws BotCountExceedExcetpion {


            Game game = Game.getGameBuilder()
                    .setPlayer(players)
                    .setUndolimit(undoLimitPerPlayer)
                    .build();
            System.out.println("Game started real");
            return game;

    }

    // get game status
    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    // front end will print board so will give board object or for now we can print from here
    public void printBoard(Game game){
        game.printBoard();
    }

    // make a move logic
    public void makeMove(Game game){
        game.makeMove();

    }

    public void undo(Game game){
        game.undo();
    }


}
