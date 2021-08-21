package com.java8.notes;

import java.util.function.Function;

public class FunctionPredefinedFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Before Java 8
		FunctionPredefinedFunctionalInterface f = new FunctionPredefinedFunctionalInterface();
		int b = f.sInt(5);
		System.out.println("Before Java 8:: " +b);

		// Java 8
		Function<Integer, Integer> a = z -> z * z;
		System.out.println("After Java 8:: " + a.apply(5));

	}

	public int sInt(Integer i) {
		int sa = i * i;
		return sa;
	}

}
