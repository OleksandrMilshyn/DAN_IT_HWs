package java_hw_6.task2;

public class Track extends Vehicle{

    public double loadCapacity;

    public Track(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move(){
        System.out.println("Vehicle " + name + " with load capacity " + loadCapacity + " is moving at a speed of " + speed + " km/h");
    }
}
