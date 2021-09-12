package com.java8.notes.streams.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCodingQuestion {
	
	public static void main(String str[]) {
		
		List<Integer> list = Arrays.asList(10,10,20,30,30,40,40,40,50,60,70,70,89,89);
		Set<Integer> set = new HashSet<Integer>();
		
		//list.stream().filter(z-> !set.add(z)).forEach(c-> System.out.println(c));
		list.stream().filter(z-> !set.add(z)).collect(Collectors.toSet()).forEach(c-> System.out.println(c));
		
		
	}

}
