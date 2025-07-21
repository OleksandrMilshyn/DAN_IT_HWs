package java_hw_6.task2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Mercedes Sprinter", 100, 8);
        car.move();
        car.stop();
        Track track = new Track("MAN", 90, 20.5);
        track.move();
        track.stop();

    }
}
