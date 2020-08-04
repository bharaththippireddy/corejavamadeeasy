package com.bharath.java12.stringapi;

public class StringFeatures {

	public static void main(String[] args) {

		String s = "  All the power is with in you.you can do anything and everything!!";
		System.out.println(s);
		System.out.println("After Indentation: " + s.indent(5));
		System.out.println("Negative Indentation:" + s.indent(-4));

		String s1 = "10";
		Integer result = s1.transform(Integer::parseInt);
		System.out.println(result);

	}

}
