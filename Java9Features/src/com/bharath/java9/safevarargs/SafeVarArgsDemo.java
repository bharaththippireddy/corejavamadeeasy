package com.bharath.java9.safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("abc", "xyz");
		List<String> l2 = Arrays.asList("nyc", "lon");
		
		SafeVarArgsDemo sva = new SafeVarArgsDemo();
		sva.myMethod(l1,l2);
	}

	@SafeVarargs
	private void myMethod(List<String>... l) {// List<String>[]

		String name = (String) l[0].get(0);
		System.out.println(name);
	}

}
