package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(1990, Month.JANUARY, 1);
        LocalTime time = LocalTime.of(1,1,1,1);
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
    }
}
