package com.java8.notes;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String str[]) {

		Predicate<String> cl = a -> a.length() >= 4;
		System.out.println(cl.test("check greator than 10"));

		Predicate<String> cl2 = b -> b.length() % 2 == 0;
		System.out.println(cl2.test("not long"));
		
		System.out.println(cl.and(cl2).test("my m ipsum dolor s"));
		
		System.out.println(cl.or(cl2).test("my string"));
		
		//opposite of test
		System.out.println(cl.negate().test("my string"));
	}

}