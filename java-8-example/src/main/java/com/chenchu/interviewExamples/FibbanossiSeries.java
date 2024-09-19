package com.chenchu.interviewExamples;

public class FibbanossiSeries {
	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34
		int n = 10;
		System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));

	}

	public static void fibbanassiEx() {

		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
