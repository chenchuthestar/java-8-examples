package com.chenchu.datetimeApi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
	public static void main(String[] args) {
		LocalDate bday = LocalDate.of(1993, 06, 25);
		System.out.println(bday);
		System.out.println(bday.getDayOfWeek());
		Period between = Period.between(bday, LocalDate.now());
		System.out.println(
				between.getYears() + ",years " + between.getMonths() + " months" + " " + between.getDays() + " days");
	}
}
