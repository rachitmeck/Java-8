package com.java8.notes;

public class MethodReferenceDemo {

	public static void main(String str[]) {

		//Lambda Expression and Functional Interface
		MyCustomFunctionalInterface f = () -> System.out.println("TEST");
		f.onlyOneAbstractMethod();
		f.manyDefault();
		f.manyDefault2();
		
		//Method Reference
		MyCustomFunctionalInterface fc = Demo::testImpl;
		fc.onlyOneAbstractMethod();
		fc.manyDefault();
		fc.manyDefault2();
	

	}

}
