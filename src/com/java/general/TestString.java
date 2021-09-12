package com.java.general;

public class TestString {

	static String url = "http://ggolge.com";
	static String url2 = "/amlget";
	static String url3 = "12344";

	public static void main(String str[]) {

		String F = url + url2 + "?" + "requestId=" + url3;
		System.out.println(F);

		url3 = "12";
		String F2 = url + url2 + "?" + "requestId=" + url3;
		System.out.println(F2);

	}

}
