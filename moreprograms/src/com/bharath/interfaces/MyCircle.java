package com.bharath.interfaces;

public class MyCircle implements Circle,CircleTwo{

	public static void main(String[] args) {

	}

	@Override
	public void calculateArea() {
		System.out.println(CircleTwo.pi);
	}


}
