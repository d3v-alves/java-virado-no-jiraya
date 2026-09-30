package academy.devdojo.maratonajava.javacore.dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        //
        Locale localeItaly = new Locale("it", "IT");
        Locale localeFrance = new Locale("fr", "FR");

        Calendar calendar = Calendar.getInstance(localeItaly);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG, localeItaly);
        System.out.println("Italia " +dateFormat.format(calendar.getTime()));
        System.out.println("França " +dateFormat2.format(calendar.getTime()));
    }
}
