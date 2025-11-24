package com.demo.nov24a;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalTime {
	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		System.out.println(t);

		LocalTime t1 = LocalTime.of(9, 30);
		System.out.println("Specific Time (2 params): " + t1);

		LocalTime t2 = LocalTime.of(9, 30, 45);
		System.out.println("Specific Time (3 params): " + t2);

		LocalTime plusHours = t1.plusHours(2);
		System.out.println("After 2 hours: " + plusHours);

		LocalTime minusMinutes = t1.minusMinutes(15);
		System.out.println("15 minutes earlier: " + minusMinutes);

		int hour = t.getHour();
		int minute = t.getMinute();
		int second = t.getSecond();
		System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second);

		boolean isBefore = t1.isBefore(t);
		boolean isAfter = t1.isAfter(t);
		System.out.println("t1 before now? " + isBefore);
		System.out.println("t1 after now? " + isAfter);

		LocalTime parsed = LocalTime.parse("14:45:30");
		System.out.println("Parsed Time: " + parsed);

		LocalTime midnight = LocalTime.MIDNIGHT;
		LocalTime noon = LocalTime.NOON;
		LocalTime min = LocalTime.MIN;
		LocalTime max = LocalTime.MAX;

		System.out.println("Midnight: " + midnight);
		System.out.println("Noon: " + noon);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		;

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm a");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

		System.out.println("Formatted (24h): " + t.format(formatter1));
		System.out.println("Formatted (12h with AM/PM): " + t.format(formatter2));
		System.out.println("Formatted with milliseconds: " + t.format(formatter3));
	}

}
