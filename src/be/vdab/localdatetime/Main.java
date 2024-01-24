package be.vdab.localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime nu = LocalDateTime.now();
        System.out.println(nu);
        System.out.println(nu.getDayOfMonth());
        System.out.println(nu.getYear());
        System.out.println(nu.getHour());

        LocalDateTime beginEuro = LocalDateTime.of(2002, 1, 1, 0,0);
        System.out.println(beginEuro);
        System.out.println(nu.isAfter(beginEuro));
        System.out.println(nu.plusDays(1));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(nu.format(formatter));
    }
}
