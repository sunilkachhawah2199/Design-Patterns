package Design_Patterns_And_Priciples.factory.audio_plyaer.models;

public class WAVPlayer extends AudioPlayer{

    public WAVPlayer(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        System.out.println("Playing WAV file");
    }

    @Override
    public void stop() {
        System.out.println("Stopping WAV file");
    }

    @Override
    public void pause() {
        System.out.println("Pausing WAV file");
    }

    @Override
    public MediaFormat supportType() {
        return MediaFormat.WAV;
    }
}
