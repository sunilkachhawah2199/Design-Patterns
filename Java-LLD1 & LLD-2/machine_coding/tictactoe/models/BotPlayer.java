package machine_coding.tictactoe.models;

import machine_coding.tictactoe.factories.BotPlayingStrategyFactory;
import machine_coding.tictactoe.strategies.bot_playing.BotPlayingStrategy;
import machine_coding.tictactoe.strategies.bot_playing.EasyBotPlaying;
import machine_coding.tictactoe.strategies.bot_playing.MediumBotPlaying;
import machine_coding.tictactoe.strategies.bot_playing.ProPlalyingStrategy;
import machine_coding.tictactoe.utilities.Pair;

import java.util.Scanner;

public class BotPlayer extends Player{
    private BotLevel botLevel;
    //bot can have 3 strategy to play so we will use strategy design patter
    BotPlayingStrategy botPlayingStrategy;


    // will call bot playing strategy


    // constructor for chaining
    public BotPlayer(String name, Symbol s, BotLevel botLevel){
        super(name, s);
        this.botLevel = botLevel;
        botPlayingStrategy= BotPlayingStrategyFactory.botPlayingStrategy(this.botLevel);

        /*
        instead of by doing this we can use factory design pattern
        we will give bot-level enum and it will return bot playing strategy

        if(botLevel== BotLevel.EASY){
            botPlayingStrategy=new EasyBotPlaying();
        }
        else if(botLevel== BotLevel.MEDIUM){
            botPlayingStrategy=new MediumBotPlaying();
        }
        else{
            botPlayingStrategy=new ProPlalyingStrategy();
        }
         */
    }

    @Override
    public Pair makeMove(Board board) {
        return botPlayingStrategy.makeMove(board);
    }
}
