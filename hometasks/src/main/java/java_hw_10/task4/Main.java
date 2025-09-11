package java_hw_10.task4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 10, 25, 14, 30);
        String formated = formatDateTime(localDateTime,"dd-MM-yyyy HH:mm");

        System.out.println(formated);
    }

    public static String formatDateTime(LocalDateTime dateTime, String pattern){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }
}
