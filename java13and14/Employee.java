package com.bharath.java13and14;

public record Employee(String name, int sal) {
	
	static int id;
	
	public static void myMethod() {
		System.out.println(id);
	}
	
	public void myInstanceMethod() {
		System.out.println(this.name());
		System.out.println(this.sal());
	}

	public Employee() {
		this.sal = 0;
		this.name = "";

	}

	public Employee(String empData) {
		this.sal = 0;
		this.name = "";
	}
}
