package com.java8.notes;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> c = i -> System.out.println("test" + i*i) ;
		c.accept(5);

		
		Consumer<Integer> ac = i -> System.out.println("test" + i*2) ;
		ac.accept(5);
		
		
		c.andThen(ac).accept(5);
		
		//Compile time error
		//c.compose(ac).accept(2);
	}

}
