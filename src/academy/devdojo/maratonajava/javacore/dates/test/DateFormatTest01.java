package academy.devdojo.maratonajava.javacore.dates.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getTimeInstance();
        df[3] = DateFormat.getDateTimeInstance();
        df[4] = DateFormat.getDateInstance();

    }
}
