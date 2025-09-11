package java_hw_10.task5;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime end = LocalDateTime.of(2023, 10, 28, 16, 45);
        System.out.println(calculateDifference(start, end));
    }

    public static String calculateDifference(LocalDateTime start, LocalDateTime end){
        Duration duration = Duration.between(start,end);

        long totalOfMinutes = duration.toMinutes();
        long days = totalOfMinutes / (24*60);
        long hours = (totalOfMinutes % (24 * 60)) / 60;;
        long minutes = totalOfMinutes % 60;
        return "Різниця: " + days +" дні, " + hours + " години, " + minutes + " хвилин";
    }
}
