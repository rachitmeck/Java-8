package com.java8.notes;

import java.util.function.Predicate;

public class PredicatePredefinedFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "My Name";
		String str2 = "My";

		// After J8
		Predicate<String> p = s -> s.length() >= 5;
		System.out.println("Greator than 5:: " + p.test(str));
		boolean val = p.test(str);
		System.out.println(val);
		System.out.println("Greator than 5:: " + p.test(str2));

		// Before J8
		PredicatePredefinedFunctionalInterface a = new PredicatePredefinedFunctionalInterface();
		a.testStringLength(str);
		a.testStringLength(str2);

	}

	public boolean testStringLength(String s) {
		if (s.length() >= 5) {
			System.out.println("T");
			return true;
		} else {
			System.out.println("F");
			return false;
		}
	}

}
