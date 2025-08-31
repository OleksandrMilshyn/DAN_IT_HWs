package java_hw_9.task1;

public class Car {

    private String carBrand;

    private int speed;

    public Car(String carBrand, int speed) {
        this.carBrand = carBrand;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
