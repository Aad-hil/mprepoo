package com.demo.nov24a;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Current DateTime: " + dt);

        LocalDateTime dt1 = LocalDateTime.of(1982, 1, 22, 9, 30);
        System.out.println("Specific DateTime (Y,M,D,H,M): " + dt1);

        LocalDateTime dt2 = LocalDateTime.of(1982, 1, 22, 9, 30, 45);
        System.out.println("Specific DateTime (Y,M,D,H,M,S): " + dt2);

        LocalDateTime plusDays = dt1.plusDays(10);
        System.out.println("After 10 days: " + plusDays);

        LocalDateTime minusHours = dt1.minusHours(5);
        System.out.println("5 hours earlier: " + minusHours);

        int year = dt.getYear();
        int month = dt.getMonthValue();
        int day = dt.getDayOfMonth();
        int hour = dt.getHour();
        int minute = dt.getMinute();
        int second = dt.getSecond();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day +
                           ", Hour: " + hour + ", Minute: " + minute + ", Second: " + second);

        boolean isBefore = dt1.isBefore(dt);
        boolean isAfter = dt1.isAfter(dt);
        System.out.println("dt1 before now? " + isBefore);
        System.out.println("dt1 after now? " + isAfter);

    
        LocalDateTime parsed = LocalDateTime.parse("2025-11-24T15:45:00");
        System.out.println("Parsed DateTime: " + parsed);

        LocalDateTime midnight = LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);
        LocalDateTime noon = LocalDateTime.of(LocalDate.now(), LocalTime.NOON);
        LocalDateTime min = LocalDateTime.MIN;
        LocalDateTime max = LocalDateTime.MAX;

        System.out.println("Midnight: " + midnight);
        System.out.println("Noon: " + noon);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

        System.out.println("Formatted (24h): " + dt.format(formatter1));
        System.out.println("Formatted (12h with AM/PM): " + parsed.format(formatter2));
        System.out.println("Formatted with milliseconds: " + dt.format(formatter3));
    }
}
