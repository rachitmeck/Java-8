package com.java8.notes.streams.questions;

import java.util.stream.IntStream;

public class RefractorisPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(7));

	}

	public static boolean isPrime(int number) {
		// boolean isDiv = false;

		/*
		 * for (int i = 2; i < number; i++) { if (number % i == 0) { isDiv = true;
		 * break; } }
		 */
		return number > 1 && IntStream.range(2, number).noneMatch(a -> number % a == 0);

	}

}
