package com.java8.notes.streams;

import java.util.ArrayList;
import java.util.List;

public class CreateStreamJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);

		// Stream s = collectionOfObject.stream();
//		Stream s = a.stream().filter(z -> z % 20 == 0);
//		s.forEach(c -> System.out.println("aa" + c));

		// filter demo
		a.stream().filter(z -> z % 20 == 0).forEach(c -> System.out.println("filter exmaple:: " + c));

		// map demo
		a.stream().map(x -> x * 2).forEach(d -> System.out.println("map example:: " + d));
	}

}
