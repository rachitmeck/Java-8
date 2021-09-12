package com.java8.notes.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers.stream().forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));

		String st = "D:\\Workplace\\Java-8\\Java-8\\src\\com\\java8\\notes\\streams\\ParallelStream.txt";
		File f = new File(st);
		Stream<String> t = Files.lines(f.toPath());
		t.parallel().forEach(System.out::println);
		t.close();

		File fileName = new File(st);
		List<String> text = Files.readAllLines(fileName.toPath());
		System.out.println("  ");
		System.out.println("parallelStream");
		text.parallelStream().sorted()
				.forEach(z -> System.out.println(z + " Thread Name::" + Thread.currentThread().getName()));

		List<Integer> plistOfNumbers = Arrays.asList(1, 2, 3, 4);
		plistOfNumbers.parallelStream()
				.forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));

	}

}
