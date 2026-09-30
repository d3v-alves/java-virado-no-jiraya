package academy.devdojo.maratonajava.javacore.dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        //
        Locale localeItaly = new Locale("it", "IT");
        Locale localeFrance = new Locale("fr", "FR");
        Locale localeIndia = new Locale("ind", "IN");
        Locale localeJapan = new Locale("ja", "JP");

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);

        System.out.println("Italia " +dateFormat.format(calendar.getTime()));
        System.out.println("França " +dateFormat2.format(calendar.getTime()));
        System.out.println("India " +dateFormat3.format(calendar.getTime()));
        System.out.println("Japan " +dateFormat4.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeFrance.getDisplayCountry(localeItaly));
        System.out.println(localeIndia.getDisplayCountry(localeJapan));
    }
}
