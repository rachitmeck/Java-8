package com.java8.notes.streams.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to java8 streams and java8 streams welcome home";
		List<String> s = Arrays.asList(str.split(" "));
		
		//s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Long> map = s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}

}
