package java_hw_6.task3;

public class Video extends Media{

    public String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Video " + title + " is playing in " + resolution + ".");

    }
}
