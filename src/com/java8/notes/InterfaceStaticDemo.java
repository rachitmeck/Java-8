package com.java8.notes;

public interface InterfaceStaticDemo {
	
	default void calculateSumAssured2() {}

	static void calculateSumAssured() {
		System.out.println("Calculated");
	}
	
	static String callRestService(String url) {
		System.out.println("Call Rest ");
		return "Success";
	}
}
