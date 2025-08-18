package java_hw_6_1.task3;

public class Main {

    public static void main(String[] args) {
        Media mediaMusic = new Music("Thunderstruck", 5, "AC/DC" );
        Media mediaVideo = new Video("House of the Rising Sun", 4,"1920x1080");

        mediaMusic.play();
        mediaVideo.play();
    }
}
