package com.chenchu.java8example;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int min = 1;
		int max = 10;
		Random r = new Random();
		int randomInRange = r.nextInt(max - min + 1) + min;
		System.out.println("Random Number in Range (1 to 100): " + randomInRange);
	}

}