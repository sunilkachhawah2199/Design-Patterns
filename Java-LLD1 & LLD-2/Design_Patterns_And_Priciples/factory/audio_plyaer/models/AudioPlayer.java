package Design_Patterns_And_Priciples.factory.audio_plyaer.models;

public abstract class AudioPlayer {
    private int volume;
    private double playBackRate;

    public AudioPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    public abstract void play();
    public abstract void stop();
    public abstract void pause();
    public abstract MediaFormat supportType();


    @Override
    public String toString() {
        return "AudioPlayer{" +
                "volume=" + volume +
                ", playBackRate=" + playBackRate +
                '}';
    }
}
