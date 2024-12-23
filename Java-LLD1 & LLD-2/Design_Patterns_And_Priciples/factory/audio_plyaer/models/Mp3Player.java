package Design_Patterns_And_Priciples.factory.audio_plyaer.models;

public class Mp3Player extends AudioPlayer{

    // constructor to initialize the volume and playback rate
    public Mp3Player(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 file");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3 file");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 file");
    }

    @Override
    public MediaFormat supportType() {
        return MediaFormat.MP3;
    }
}
