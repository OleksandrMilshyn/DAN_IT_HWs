package java_hw_9.task2;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 =  Vehicle.getInstance();
        Vehicle vehicle2 = Vehicle.getInstance();
        Vehicle vehicle3 = Vehicle.getInstance();
        Vehicle vehicle4 = Vehicle.getInstance();
        Vehicle vehicle5 = Vehicle.getInstance();

        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
        System.out.println(vehicle4);
        System.out.println(vehicle5);
    }
}
