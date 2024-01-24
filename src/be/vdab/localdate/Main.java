package be.vdab.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        var vandaag = LocalDate.now();
        System.out.println(vandaag);
        var beginEuro = LocalDate.of(2002, 1, 1);
        System.out.println(beginEuro);
        var eindeBelgischeFrank = LocalDate.of(2001, Month.DECEMBER, 31);
        System.out.println(eindeBelgischeFrank);*/

/*        var eindeBelgischeFrank = LocalDate.of(2001, 12, 31);
        System.out.println(eindeBelgischeFrank.getDayOfMonth());
        System.out.println(eindeBelgischeFrank.getDayOfYear());
        System.out.println(eindeBelgischeFrank.getDayOfWeek());
        System.out.println(eindeBelgischeFrank.getMonthValue());
        System.out.println(eindeBelgischeFrank.getMonth());
        System.out.println(eindeBelgischeFrank.lengthOfMonth());
        System.out.println(eindeBelgischeFrank.getYear());
        System.out.println(eindeBelgischeFrank.isLeapYear());*/

/*        LocalDate vandaag = LocalDate.now();
        LocalDate heden = LocalDate.now();
        System.out.println(vandaag.equals(heden));
        LocalDate beginEuro = LocalDate.of(2002, Month.JANUARY, 1);
        System.out.println(beginEuro.compareTo(heden));
        System.out.println(heden.isAfter(beginEuro));
        var dagenTussen = ChronoUnit.DAYS.between(beginEuro, heden);
        System.out.println(dagenTussen);
        long jarenTussen = ChronoUnit.YEARS.between(beginEuro, heden);
        System.out.println(jarenTussen);

        var period = Period.between(beginEuro, vandaag);
        System.out.println("De euro is " + period.getYears() + " jaar, " + period.getMonths() + " maand en " + period.getDays() + "dagen geleden ingevoerd");*/

/*        LocalDate eindeBelgischeFrank = LocalDate.of(2001, 12, 31);
        LocalDate beginEuro = eindeBelgischeFrank.plusDays(1);
        System.out.println(beginEuro);
        System.out.println(beginEuro.plusMonths(1));
        System.out.println(beginEuro.minusDays(1));
        LocalDate vandaag = LocalDate.now();
        var adjuster = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        var volgendeWoensdag = vandaag.with(adjuster);
        System.out.println(volgendeWoensdag);*/

/*        LocalDate beginEuro = LocalDate.of(2002, 1,1);
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(beginEuro);
        System.out.println(beginEuro.format(formatter));

        formatter = DateTimeFormatter.ofPattern("E dd MMMM yyyy");
        System.out.println(beginEuro.format(formatter));*/

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("datum (dag/maand/jaar):");
        String datumAlsString = scanner.next();
        LocalDate datum = LocalDate.parse(datumAlsString, formatter);
        System.out.println(datum);
    }
}
