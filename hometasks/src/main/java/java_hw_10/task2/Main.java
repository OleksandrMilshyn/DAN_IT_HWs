package java_hw_10.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime resultOfFormatter = calculateFutureDateTime(localDateTime, 5, 10);
        System.out.println(resultOfFormatter.format(formatter));
    }

    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours){
        dateTime = dateTime.plusDays(days).plusHours(hours);
        return dateTime;
    }
}
