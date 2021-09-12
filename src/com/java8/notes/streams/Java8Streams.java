package com.java8.notes.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

	public static void main(String str[]) {

		// Before Java 8
		List<Float> pf = new ArrayList<Float>();
		List<Products> ls = new ArrayList<Products>();
		ls.add(new Products(1, "iPhone11", "64 GB 24MP", 5000));
		ls.add(new Products(1, "iPhone12", "64 GB 24MP", 3000));
		ls.add(new Products(1, "iPhone13", "64 GB 24MP", 2000));
		ls.add(new Products(1, "iPhone15", "64 GB 24MP", 9000));

		for (Products p : ls) {
			if (p.price <= 5000) {
				pf.add(p.price);
			}
		}
		System.out.println("Filter in Before Java 8:: " + pf);

		// After Java 8
		List<Float> streamway = ls.stream().filter(pa -> pa.price <= 5000).map(pa -> pa.price)
				.collect(Collectors.toList());
		System.out.println("Filter my List into new List:: " + streamway);
		streamway.stream().forEach(x -> System.out.println(x));

		// collect
		List<Float> streamway2 = ls.stream().filter(pa -> pa.price <= 5000).map(pa -> pa.price)
				.collect(Collectors.toList());
		System.out.println("Collect");
		System.out.println("Filter my List into new List:: " + streamway2);

		// count
		System.out.println("Count");
		System.out.println(streamway.stream().count());

		// sorted
		System.out.println("Sorted");
		streamway.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("ASC" + streamway.stream().sorted((a, b) -> a.compareTo(b)));

		// minmax
		System.out.println("MinMax");
		System.out.println(streamway.stream().min((i, j) -> i.compareTo(j)));
		System.out.println(streamway.stream().max((i, j) -> i.compareTo(j)));

		// forEach

		streamway.stream().forEach(x -> System.out.println("forEach::" + x));

		// toArray
		Object[] o = streamway.toArray();
		for (Object c : o) {
			System.out.println(c);
		}

		// of() ANY GROUP OF VALUE
		Stream.of(1, 11, 222, 22333, 32323).forEach(z -> System.out.println(z));

		String[] name = { "LA01", "LA02", "LA03", "LA" };
		Stream.of(name).filter(x -> x.length() == 2)
				.forEach(x -> System.out.println(x + "" + Thread.currentThread().getName()));

		List<Integer> listOfNumbers = Arrays.asList(222, 232, 43, 543);
		listOfNumbers.stream().forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));

	}

}
