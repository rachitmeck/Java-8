package com.java8.notes;

@FunctionalInterface
public interface MyCustomFunctionalInterface {

	void onlyOneAbstractMethod();

	default void manyDefault() {
		System.out.println("My First Custom Functional Interface");
	}

	default void manyDefault2() {
		System.out.println("My First Custom Functional Interface");
	}

	static String manyStatic() {
		System.out.println("My First Custom Functional Interface");
		return null;
	}
	
	static String manyStatic2() {
		System.out.println("My First Custom Functional Interface");
		return null;
	}

}
