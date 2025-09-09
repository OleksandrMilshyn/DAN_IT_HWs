package java_hw_12.task2;

public class Vehicle {

    private String name;
    private int speed;
    private int price;
    private int countOfWheels;

    public Vehicle(String name, int speed, int price, int countOfWheels) {
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.countOfWheels = countOfWheels;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}
