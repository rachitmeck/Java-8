package com.java8.notes;

public class OverwrideMyInterface implements InterfaceDemo {

	public void checkPolicy() {
		System.out.println("override");
	}

	public static void main(String str[]) {

		OverwrideMyInterface a = new OverwrideMyInterface();

		a.checkPolicy();
	}

}
