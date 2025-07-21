package java_hw_6.task3;

public class Music extends Media{

    public String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Music is playing " + artist + ": " + title +".");
    }
}
