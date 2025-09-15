package java_hw_10.task2;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2023, 10, 25, 14, 30);

        LocalDateTime resultOfAddMinus = calculateFutureDateTime(localDateTime, 3, 5);
        System.out.println(resultOfAddMinus);
    }

    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours){
        return dateTime.plusDays(days).plusHours(hours);
        }
}
