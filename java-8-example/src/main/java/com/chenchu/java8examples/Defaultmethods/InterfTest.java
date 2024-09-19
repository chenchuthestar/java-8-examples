package com.chenchu.java8examples.Defaultmethods;

public interface InterfTest {

	default void m1() {
		System.out.println("m1 method");
	}

	public static void m2() {
		System.out.println("m1 method");
	}

}

class Test implements InterfTest {
	public static void main(String[] args) {
		InterfTest.m2();
	}

	public void testm() {
		InterfTest.super.m1();
	}
}
