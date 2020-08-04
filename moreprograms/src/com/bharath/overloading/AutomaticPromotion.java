package com.bharath.overloading;

public class AutomaticPromotion {

	public void print(int i) {
		System.out.println("Integer Version: " + i);
	}

	public void print(float f) {
		System.out.println("Float Version: " + f);
	}
	
	public void print(String s) {
		System.out.println("String Version");
	}
	
	public void print(Object s) {
		System.out.println("Object Version");
	}

	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(123);
		ap.print(10.5f);
		ap.print("Hello");
		ap.print(null);
	}

}
