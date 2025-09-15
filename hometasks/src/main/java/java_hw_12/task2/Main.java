package java_hw_12.task2;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Vehicle carReal = new Vehicle("Lada", 140,1500,4);
        Vehicle carNull = null;

        Vehicle result1 = Optional.ofNullable(carReal).orElse(new Vehicle("Mercedes", 200, 5000, 4));
        System.out.println(result1);

        Vehicle result2 = Optional.ofNullable(carReal).orElseGet(() ->
            new Vehicle("KIA", 180,4000,4));
        System.out.println(result2);

        Vehicle result3 = Optional.ofNullable(carReal).orElseThrow(() -> new RuntimeException("The object is null"));
        System.out.println(result3);

        Optional.ofNullable(carReal).ifPresent(x -> System.out.println("Everything is fine"));
        Optional.ofNullable(carReal).ifPresentOrElse(
                x -> System.out.println("Everything is fine"),
                () -> System.out.println("Everything is nothing"));

        System.out.println("-----------");

        Vehicle result1withNull = Optional.ofNullable(carNull).orElse(new Vehicle("Mercedes", 200, 5000, 4));
        System.out.println(result1withNull);

        Vehicle result2withNull = Optional.ofNullable(carNull).orElseGet(() ->
                new Vehicle("KIA", 180,4000,4));
        System.out.println(result2withNull);

        try {
            Vehicle result3withNull = Optional.ofNullable(carNull).orElseThrow(()
                    -> new RuntimeException("The object is null"));
            System.out.println(result3withNull);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("---");

        Optional.ofNullable(carNull).ifPresent(x -> System.out.println("Everything is fine"));

        System.out.println("---");

        Optional.ofNullable(carNull).ifPresentOrElse(
                x -> System.out.println("Everything is fine"),
                () -> System.out.println("Everything is nothing"));
    }
}
