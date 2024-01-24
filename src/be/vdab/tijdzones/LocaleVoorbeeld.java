package be.vdab.tijdzones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleVoorbeeld {
    public static void main(String[] args) {

        Locale duitsland = Locale.GERMAN;
        LocalDate huidigeDatum = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", duitsland);
        System.out.println(formatter.format(huidigeDatum));
        System.out.println(huidigeDatum.format(formatter));

        Locale belgie = Locale.forLanguageTag("nl-BE");
        formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", belgie);
        System.out.println(huidigeDatum.format(formatter));
    }
}
