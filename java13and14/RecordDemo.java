package com.bharath.java13and14;

public class RecordDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee employee = new Employee("John", 10000);
		System.out.println(employee);
		System.out.println(employee.name());
		System.out.println(employee.sal());
		System.out.println(employee.hashCode());
		Employee e2 = new Employee("Bob", 10000);
		System.out.println(e2.hashCode());

		Employee e3 = new Employee("John", 10000);
		System.out.println(e3.equals(employee));
		System.out.println(e3.hashCode());
		
		e.myInstanceMethod();

	}

}
