package com.demo.nov24a;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfWeek());

		LocalDate mydate = LocalDate.of(2025, 6, 21);
		System.out.println(mydate);
		int num = 5;
		System.out.println(num + " days ahead date is " + today.plusDays(num));
		System.out.println(num + " days before date is " + today.minusDays(num));

		LocalDate date1 = LocalDate.of(1982, 1, 22);
		LocalDate date2 = LocalDate.of(2025, 11, 24);

		if (date1.isBefore(date2)) {
			System.out.println(date1 + " is before " + date2);
		} else if (date1.isAfter(date2)) {
			System.out.println(date1 + " is after " + date2);
		} else if (date1.isEqual(date2)) {
			System.out.println(date1 + " is equal to " + date2);
		}

		String dobStr = "22-01-1982";
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(dobStr, inputFormatter);
		java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String formattedDate = localDate.format(outputFormatter);
		System.out.println("String: " + dobStr);
		System.out.println("LocalDate: " + localDate);
		System.out.println("SQL Date: " + sqlDate);
		System.out.println("Formatted Date: " + formattedDate);

		today = LocalDate.now();
		LocalDate dob = LocalDate.of(2003, 8, 27);
		Period p = Period.between(dob, today);
		System.out.println(
				" My age is " + p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days ");

	}

}
