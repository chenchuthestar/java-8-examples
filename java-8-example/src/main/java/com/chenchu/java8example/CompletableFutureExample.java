package com.chenchu.java8example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> cf = new CompletableFuture<>();
		cf.get();
		cf.complete("manually completing");
	}
}
