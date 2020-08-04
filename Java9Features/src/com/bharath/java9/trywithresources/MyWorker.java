package com.bharath.java9.trywithresources;

public class MyWorker implements AutoCloseable {
	
	MyWorker(){
		System.out.println("Creating the resource");
	}
	
	public void doSomething() {
		System.out.println("Doing Something");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing the resource");

	}

}
