package java_hw_6_1.task2;

public class Car extends Vehicle{

    public int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle " + name + " is moving at " + speed + " km/h with " + passengerCapacity + " number of people");
    }
}
