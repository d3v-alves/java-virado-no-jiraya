package academy.devdojo.maratonajava.javacore.formatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = new Locale("jp", "JP");
        Locale localeIT = new Locale("it", "IT");
        Locale localeFr = new Locale("fr", "FR");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[1] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double value = 10_000.2130;
        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(value));
        }
    }
}
