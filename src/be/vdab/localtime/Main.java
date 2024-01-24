package be.vdab.localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        LocalTime nu = LocalTime.now();
        System.out.println(nu);
        LocalTime middag = LocalTime.of(12,30);
        System.out.println(middag);
        System.out.println(nu.getHour());
        System.out.println(nu.getMinute());
        System.out.println(nu.getSecond());
        System.out.println(nu.getNano());*/

/*        LocalTime nu = LocalTime.now();
        LocalTime ietsLater = LocalTime.now();
        System.out.println(nu.equals(ietsLater));
        LocalTime straks = LocalTime.of(23,59);
        System.out.println(nu.compareTo(straks));
        System.out.println(nu.isBefore(straks));
        long minutenTussen = ChronoUnit.MINUTES.between(nu, straks);
        System.out.println(minutenTussen);*/

/*        LocalTime juistVoorMiddag = LocalTime.of(11, 59);
        LocalTime middag = juistVoorMiddag.plusMinutes(1);
        System.out.println(middag);*/

/*        LocalTime middag = LocalTime.of(12, 0);
        var formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(middag.format(formatter));
        formatter = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println(middag.format(formatter));*/

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H-m");
        Scanner scanner = new Scanner(System.in);
        System.out.println("tijd (uren-minuten)");
        String tijdAlsString = scanner.next();
        LocalTime tijd = LocalTime.parse(tijdAlsString, formatter);
        System.out.println(tijd);
    }
}
