package be.vdab.tijdzones;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Tijdzone {
    public static void main(String[] args) {

        ZoneId brussel = ZoneId.of("Europe/Brussels");
        System.out.println(brussel);
        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
        System.out.println(losAngeles);
        ZoneId standaard = ZoneId.systemDefault();
        System.out.println(standaard);

        ZonedDateTime datumEnTijdBrussel = ZonedDateTime.now(brussel);
        System.out.println(datumEnTijdBrussel);
        ZonedDateTime datumEnTijdLosAngeles = ZonedDateTime.now(losAngeles);
        System.out.println(datumEnTijdLosAngeles);

        ZoneOffset tijdzone = ZoneOffset.ofHours(3);
        System.out.println(tijdzone);
        ZonedDateTime datumEnTijdVanDrieUur = ZonedDateTime.now(tijdzone);
        System.out.println(datumEnTijdVanDrieUur);

    }
}
