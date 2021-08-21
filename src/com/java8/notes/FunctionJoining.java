package com.java8.notes;

import java.util.function.Function;

public class FunctionJoining {
	
	public static void main(String str[]) {
		
		Function<Integer, Integer> d = i -> i*2;
		System.out.println(d.apply(4));
		
		Function<Integer, Integer> f = j -> j*j*j;
		System.out.println(f.apply(2));
		
		//Function Chaining
		int z = d.andThen(f).apply(2);
		int x = d.compose(f).apply(2);
		System.out.println("andThen:: " + "" + z + " compose:: " + x);
		
		//Function Chaining
		int zz = d.andThen(f).andThen(f).apply(2);
		int xx = d.compose(f).compose(d).apply(2);
		System.out.println("andThen:: " + "" + zz + " compose:: " + xx);
	}

}
