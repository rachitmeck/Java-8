package com.java8.notes.streams.questions;

import java.util.Arrays;
import java.util.List;

public class SkipandLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

		// limit()
		list.stream().limit(3).forEach(z -> System.out.println(z));

		// skip()
		list.stream().skip(3).forEach(x -> System.out.println(x));
	}

}
