package com.java8.notes.streams;

import java.util.Arrays;
import java.util.List;

public class TerminalAndIntermdiateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1, "XYX");
		Employee e2 = new Employee(2, "SDF");
		Employee e3 = new Employee(3, "QEW");

		List<Employee> emp = Arrays.asList(e1, e2, e3);

		List<Integer> i = Arrays.asList(1, 2, 3, 4, 5, 2);

		i.stream().filter(a -> a % 2 == 0).map(b -> b + b).filter(c -> c > 5).forEach(z -> System.out.println(z));
		System.out.println(i.stream().filter(a -> a % 2 == 0).map(b -> b + b).filter(c -> c > 5).count());

		emp.stream().filter(e -> e.getId() % 2 == 0).map(x -> x.getName())
				.forEach(s -> System.out.println("This:: " + s));

		emp.stream().filter(e -> e.getId() % 2 == 0).map(x -> {
			x.printName();
			return x.getName();
		}).forEach(w -> System.out.println(w));

		// Below will not print because Intermediate is Lazy Loaded.
		emp.stream().filter(e -> e.getId() % 2 == 0).map(x -> {
			x.printName();
			return x.getName();
		});

		// peek()
		System.out.println("peek");
		i.stream().filter(a -> a % 2 == 0).peek(System.out::println).map(b -> b + b).filter(c -> c > 5)
				.forEach(z -> System.out.println(z));

		// peek()
		System.out.println("peek");
		i.stream().filter(a -> a % 2 == 0).map(b -> b + b).peek(System.out::println).filter(c -> c > 5)
				.forEach(z -> System.out.println(z));

		// reduce

		System.out.println(i.stream().reduce((a, b) -> a + b).get());
	}

}
