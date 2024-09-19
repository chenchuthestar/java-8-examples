package com.chenchu.datetimeApi;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateEx {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();

		System.out.println(date);
		System.out.println("getDayOfMonth:" + date.getDayOfMonth());
		System.out.println("getMonth:" + date.getMonth());

		System.out.println("getDayOfYear:" + date.getDayOfYear());
		System.out.println("getYear:" + date.getYear());

		System.out.println("getMonthValue:" + date.getMonthValue());

		System.out.println("getDayOfWeek:" + date.getDayOfWeek());

		System.out.println("isLeapYear:" + date.isLeapYear());
		System.out.println("lengthOfMonth:" + date.lengthOfMonth());
		System.out.println("lengthOfYear:" + date.lengthOfYear());

		LocalDate bday = LocalDate.of(1993, 06, 25);
		System.out.println(bday);
		System.out.println(bday.getDayOfWeek());
		Period between = Period.between(bday, date);
		System.out.println(between.getYears()+",years "+between.getMonths()+" months"+" "+between.getDays()+" days");

	}
}
