package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() ==  Calendar.SUNDAY) {
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH,2);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
