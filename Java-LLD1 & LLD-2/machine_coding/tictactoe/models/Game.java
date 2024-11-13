package machine_coding.tictactoe.models;

import machine_coding.tictactoe.exceptions.BotCountExceedExcetpion;
import machine_coding.tictactoe.strategies.check_for_win.OrderOneStrategy;
import machine_coding.tictactoe.strategies.check_for_win.PlayerWonStratgey;
import machine_coding.tictactoe.utilities.Pair;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameStatus gameStatus;
//    private int numOfPlayers; // we can get this from players.size()
//    private int numOfBots; // max 1 or 0 allowed
    private int currentPlayerIdx; // index of current player
    private List<Move> moves;

    private PlayerWonStratgey winningStrategy;

    // I can create big constructor with all the fields, but I am going to use builder pattern
    // we use builder design pattern when we have too many fields to set in the constructor
    // and we don't want to create multiple constructors

    // constructor with GameBuilder object as parameter
    // this is a private constructor

    private Game(Board board, List<Player> players, GameStatus gameStatus, int currentPlayerIdx, List<Move> moves, PlayerWonStratgey playerWonStratgey) {
        this.board = board;
        this.players = players;
        this.gameStatus = gameStatus;
        this.currentPlayerIdx = currentPlayerIdx;
        this.moves = moves;
        this.winningStrategy=playerWonStratgey;
    }

    // getter for getting game status
    public GameStatus getGameStatus() {
        // returning game status
        return this.gameStatus;
    }


    // getBuilder method in Game class which return GameBuilder object
    public static GameBuilder getGameBuilder(){

        return new GameBuilder();
    }

    // method to print board
    public Board getBoard(Game game){
        return board;
    }

    public void printBoard(){
        this.board.printBoard();
    }


    // make move operation
    public void makeMove(){
        Player player=this.players.get(currentPlayerIdx);
        Pair rowCol=player.makeMove(this.board); // we will get position to make a move

        // before making move check cell is usable or not --> it should be unoccupied

        while(!this.board.checkIfCellIsUnoccupied(rowCol)){
            if(player instanceof HumanPlayer){
                System.out.println("Please make a different move");
            }
            rowCol=player.makeMove(this.board);
        }
        // if cell is useable then update board and add player to cell
        this.board.setPlayer(rowCol, player);

        // now we have to capture the move
        Cell cell=this.board.getCell(rowCol);
        Move move=new Move(player, cell);
        this.moves.add(move);


        if(winningStrategy.checkforWin(this.board, cell)){
            this.gameStatus=GameStatus.WON;
            System.out.println("game is ended");
            System.out.println(" "+player.getName()+" won the match");
            return;
        }

        // condition for drawn--> when all cells occupied
        else if(checkForDrawn()){
            System.out.println(" game draw");
            this.gameStatus=GameStatus.DRAW;
            return;
        }

        // if we reach here then next player can make move
        currentPlayerIdx=(currentPlayerIdx+1)%(this.board.getSize()-1);
    }



    // check for drawn
    public boolean checkForDrawn(){
        int n= this.board.getSize();
        int total=n*n;
        return this.moves.size()==total;
    }



    // this is a builder class
    public static class GameBuilder{
         private Board board;
         private List<Player> players;
         /*
         private GameStatus gameStatus; // initially it will be IN_PROGRESS
         private int currentPlayerIdx; // will be 0 initially
          */
//         private List<Move> moves; // will be empty initially

         // we return GameBuilder object from all the setter methods for chaining
         public GameBuilder setPlayer(List<Player> players){

             this.players = players;
             int n=players.size();

             // by player size we can create board of n+1 size
             this.board=new Board(n+1);
             return this;
         }

         // build method will return Game object
        // thi builder can throw exception also
        // Ex. 2 player and both are bot then we can throw exception
         public Game build() throws BotCountExceedExcetpion{

             System.out.println("game build");

             return new Game(this.board, this.players, GameStatus.IN_PROGRESS, 0, new ArrayList<>(), new OrderOneStrategy(board.getSize()));
         }
    }
}
