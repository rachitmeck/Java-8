package com.java8.notes;

public class InterfaceStaticImplDemo implements InterfaceStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Is the static method available to implementing classes by default?
		InterfaceStaticImplDemo a = new InterfaceStaticImplDemo();
		a.calculateSumAssured2();
		
		//Why Static Methods were introduced in Java 8?
		InterfaceStaticDemo.calculateSumAssured();
		InterfaceStaticDemo.callRestService("www.google.com");

	}

}
