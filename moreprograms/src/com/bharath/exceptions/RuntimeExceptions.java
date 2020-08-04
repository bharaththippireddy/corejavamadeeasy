package com.bharath.exceptions;

public class RuntimeExceptions {

	public static void main(String[] args) {
		try {
			int[] a = new int[10];
			System.out.println(a[5]);
			// System.out.println(a[20]);

			String s = null;
			// System.out.println(s.length());

			// methodOne();

			int i = Integer.parseInt("12");
			int x = Integer.parseInt("XYZ");

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
		}finally {
			System.out.println("");
		}
		System.out.println("Use a index with in the bounds");

	}

	public static void methodOne() {
		methodTwo();
	}

	public static void methodTwo() {
		methodOne();
	}

}
