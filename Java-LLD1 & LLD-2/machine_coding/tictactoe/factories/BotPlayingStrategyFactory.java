package machine_coding.tictactoe.factories;

import machine_coding.tictactoe.models.BotLevel;
import machine_coding.tictactoe.strategies.bot_playing.BotPlayingStrategy;
import machine_coding.tictactoe.strategies.bot_playing.EasyBotPlaying;
import machine_coding.tictactoe.strategies.bot_playing.MediumBotPlaying;
import machine_coding.tictactoe.strategies.bot_playing.ProPlalyingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy botPlayingStrategy(BotLevel botLevel){
        // when we are dealing with ENUM then we should use switch cases

        switch (botLevel){
            case EASY:
                return new EasyBotPlaying();
            case MEDIUM:
                return new MediumBotPlaying();
            case DIFFICULT:
                return new ProPlalyingStrategy();
            default:
                return new EasyBotPlaying();
        }
        /*
        if(botLevel== BotLevel.EASY){
            return new EasyBotPlaying();
        }
        else if(botLevel== BotLevel.MEDIUM){
            return new MediumBotPlaying();
        }
        else{
            return new ProPlalyingStrategy();
        }
         */
    }
}
