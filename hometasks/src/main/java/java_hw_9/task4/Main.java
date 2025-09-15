package java_hw_9.task4;

public class Main {

    public static void main(String[] args) {
        Car car = new Car.Builder().
                setModel("BMW x5").
                setPrice(25000).
                setMaxSpeed(250).
                setCountOfWheels(4).
                build();
        System.out.println(car);
    }
}
