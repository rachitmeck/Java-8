package com.java8.notes;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierPredefinedFunctionalInterface {

	public static void main(String str[]) {
		
		SupplierPredefinedFunctionalInterface a = new SupplierPredefinedFunctionalInterface();
		a.fecthCurrentDate();
		System.out.println("Before Java 8:: " + a.fecthCurrentDate());
		
		//Java 8
		Supplier<Date> cd = () -> new Date();
		System.out.println("Java 8:: " + cd.get());
	}
	
	public Date fecthCurrentDate() {
		return new Date();
	}
	
}
