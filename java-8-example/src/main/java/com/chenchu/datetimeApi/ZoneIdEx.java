package com.chenchu.datetimeApi;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdEx {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();

		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		availableZoneIds.stream().forEach(System.out::println);

	}

}
