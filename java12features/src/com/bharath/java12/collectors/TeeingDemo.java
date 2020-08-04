package com.bharath.java12.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingDemo {

	public static void main(String[] args) {
		

		var day = 1;
		var result1 =  switch(day) {
		case 1,2,3:
			yield "Week Day";
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		
		};
		
		System.out.println(result1);
		
		

		Result result = Stream.of(5, 10, 8, 20, 7,15,18).collect(Collectors.teeing(Collectors.counting(),
				Collectors.filtering(n -> Integer.parseInt(n.toString()) > 10, Collectors.toList()), Result::new));
		System.out.println(result);
	}

}
