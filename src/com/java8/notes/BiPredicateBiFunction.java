package com.java8.notes;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiPredicate<Integer, Integer> cs = (a, b) -> a + b >= 5;
		System.out.println("bipredicate:: " + cs.test(2, 2));

		BiFunction<Integer, Integer, Integer> ms = (a, b) -> a * b;
		System.out.println("bifunction:: " + ms.apply(5, 12));

		BiConsumer<Integer, Integer> as = (a, b) -> System.out.println("biconsumer:: " + a * b);
		as.accept(2, 2);
	}

}
