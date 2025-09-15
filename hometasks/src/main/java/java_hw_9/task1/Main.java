package java_hw_9.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200);
        Car car2 = new Car("KIA", 180);
        Car car3 = new Car("Lada", 170);
        Car car4 = new Car("Mercedes", 220);
        Car car5 = new Car("Volvo", 190);

        CarComparator carComparator = new CarComparator();

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars.sort(carComparator);

        System.out.println(cars);
    }
}
