package java_hw_10.task3;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.of(2023,10,28,10,0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2023,10,30,10,0);

        System.out.println(isWeekend(localDateTime1) + "(" + localDateTime1.getDayOfWeek() + ")");
        System.out.println(isWeekend(localDateTime2)+ "(" + localDateTime2.getDayOfWeek() + ")");
    }

    public static boolean isWeekend(LocalDateTime dateTime){
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}
