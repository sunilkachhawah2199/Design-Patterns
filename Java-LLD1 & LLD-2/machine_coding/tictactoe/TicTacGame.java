package machine_coding.tictactoe;

import machine_coding.tictactoe.controllers.GameController;
import machine_coding.tictactoe.exceptions.BotCountExceedExcetpion;
import machine_coding.tictactoe.models.*;

import java.util.*;

// this class will be used to play the game
// will be used as a client
// this class will communicate with the  controller
// don't put any logic in this file because assume this work will be done by the front end
public class TicTacGame {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        // ------------------- creating players list -------------------
        System.out.println("How many Human players are playing the game?");
        Scanner sc=new Scanner(System.in);
        int human=sc.nextInt();

        List<Player> players=new ArrayList<>();
        // symbol of 2 user can same so we need to take care of that
        Set<Character> symbols=new HashSet<>();

        // taking input for Human players
        for(int i=0;i<human;i++){
            System.out.println("Enter the name of the player");
            String name=sc.next();

            System.out.println("Enter the symbol of the player");
            String symbol=sc.next();

            // checking symbol validity
            if(symbol.length()!=1 || symbols.contains(symbol.charAt(0))){
                // I can throw error also and start complete process again
                System.out.println("Invalid symbol");
                i--;
                continue;
            }

            Symbol s=new Symbol();
            s.setS(symbol.charAt(0));
            symbols.add(symbol.charAt(0));
            players.add(new HumanPlayer(name, s));
        }

        // for now we are taking more than 1 bot later we will restrict it to 1

        // take bot count
        System.out.println("How many bots are playing the game?");
        int bot=sc.nextInt();

        // taking bot lavel
        // all bot have same level so we are taking outside the loop




        // WE will decide bot symbol automatically from this string which is not used by any player

        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*+*";
        int j=0;
        for(int i=0;i<bot;i++){
            System.out.println("Enter the bot level");
            String diffLevel=sc.next();
            diffLevel=diffLevel.toUpperCase();
            BotLevel botLevel;
            char first=diffLevel.charAt(0);
            switch (first){
                case 'E':
                    botLevel=BotLevel.EASY;
                    break;
                case 'M':
                    botLevel=BotLevel.MEDIUM;
                    break;
                case 'H':
                    botLevel=BotLevel.DIFFICULT;
                    break;
                default:
                    botLevel=BotLevel.EASY;
                    break;
            }

            Random random=new Random();
            int idx=random.nextInt(s.length());
            while(symbols.contains(s.charAt(idx))){
                idx=random.nextInt(s.length());
            }

            Symbol symbol=new Symbol();
            symbol.setS(s.charAt(j));
            symbols.add(s.charAt(j));



            players.add(new BotPlayer("Bot"+(i+1), symbol, botLevel));
        }
        System.out.println("Enter # of undos a player can do");
        int numOfUndos = sc.nextInt();

        // ------------------------ now next step is create game object ------------------------
        // now we have created player list
        // now we will create game object
        // we can create game object here, but we will create using controller
        /*
        we will do this work in controller
        try{
            Game game = Game.getGameBuilder()
                    .setPlayer(players)
                    .build();
        }
        catch (BotCountExceedExcetpion e){
            System.out.println(e.getMessage());
            return;
        }
        catch (Exception e){
            System.out.println("Some error occurred");
            return;
        }

         */

        // we handled error in controller
        Game game;
        try{
            game=gameController.createGame(players, numOfUndos);
            System.out.println("Game started");
        }catch(Exception e){
            System.out.println("Error while creating the game: " + e.getMessage());
            return;
        }


        /*
        after game started we have to print board now user will make a move
        when user make move add that move to the game
        then check for win or draw
        if win then end the game
        else print updated board and ask next player to make a move
        // --------------------------
        1. game start
        while (game status is in Progress)
        2. print board
        3. make move
        4. add move to game
        5. check for win or draw
        6. if win then end the game
        7. else print updated board (will repeat from step 2)
         */

        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){

            gameController.makeMove(game);
            gameController.undo(game);

        }
        GameStatus gameStatus=gameController.getGameStatus(game);
        if(gameStatus.equals(GameStatus.WON)){
            System.out.println("Game has been won");
        }
        if(gameStatus.equals(GameStatus.DRAW)){

            System.out.println("Game has been drawn");
        }

    }
}

// bot can play in multple way so we will use strategy design pattern