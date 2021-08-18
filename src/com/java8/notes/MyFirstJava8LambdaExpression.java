package com.java8.notes;

import java.util.function.BiConsumer;

public class MyFirstJava8LambdaExpression {

	// Before Java 8
	public void add(int a, int b) {
		System.out.println("Before Java 8:: " + (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Java 8");

		// Before Java 8
		MyFirstJava8LambdaExpression my = new MyFirstJava8LambdaExpression();
		my.add(10, 20);

		// In just 2 Line Of Code using lambda expression - Java 8
		BiConsumer<Integer, Integer> bc = (a, b) -> System.out.println("New Java 8:: " + (a + b));
		bc.accept(10, 20);

	}

}
