package Design_Patterns_And_Priciples.factory.audio_plyaer;

import Design_Patterns_And_Priciples.factory.audio_plyaer.models.AudioPlayer;
import Design_Patterns_And_Priciples.factory.audio_plyaer.models.MediaFormat;
import Design_Patterns_And_Priciples.factory.audio_plyaer.models.Mp3Player;
import Design_Patterns_And_Priciples.factory.audio_plyaer.models.WAVPlayer;

public class AudioPlayerFactory {
    public static AudioPlayer getAudiPlayer(MediaFormat type, int volume, double playBackRate){
        switch (type){
            case MP3:
                return new Mp3Player(volume, playBackRate);
            case WAV:
                return new WAVPlayer(volume, playBackRate);
            default:
                return null;
        }
    }
}
