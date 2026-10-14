package academy.devdojo.maratonajava.javacore.formatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeFr = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeFr);
        double value = 10_000.2130;
        for (NumberFormat nf : nfa) {
            System.out.println(nf.getMaximumFractionDigits());
            System.out.println(nf.format(value));
        }
        String stringValue = "1_000.2130";
        try {
            nfa[0].parse(stringValue);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
