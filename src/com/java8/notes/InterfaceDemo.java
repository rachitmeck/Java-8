package com.java8.notes;

public interface InterfaceDemo {

	default void checkPolicy() {

		System.out.println("Checked");

	}

//	default int hashCode() {
//		return 10 * 30;
//	}

}
