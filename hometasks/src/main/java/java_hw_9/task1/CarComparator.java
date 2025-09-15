package java_hw_9.task1;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getSpeed() - o2.getSpeed();
    }
}
