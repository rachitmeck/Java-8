package com.java8.notes.streams.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RefractorSqrtPrime {

	public static void main(String str[]) {

		List<Double> d = new ArrayList<Double>(10);
		int index = 1;
		while (d.size() < 10) {
			if (isPrime(index)) {
				d.add(Math.sqrt(index));
			}
			index++;
		}
		System.out.println(d);

		// Using Java 8
		List<Double> d2 = Stream.iterate(1, i -> i + 1).filter(RefractorSqrtPrime::isPrime)
				.peek(s -> System.out.println(s)).map(Math::sqrt).limit(10).collect(Collectors.toList());

		System.out.println("Java8:: " + d2);
	}

	public static boolean isPrime(int number) {

		return number > 1 && IntStream.range(2, number).noneMatch(a -> number % a == 0);

	}

}
