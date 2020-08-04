package com.bharath.flowcontrol;

public class Switch {

	public static void main(String[] args) {
		String choice = "Check Balance";

		switch (choice) {
		case "Check Balance":
			System.out.println("Check Balance");
			break;
		case "Change Pin":
			System.out.println("Change Pin");
			break;
		case "Withdraw Cash":
			System.out.println("Withdraw Cash");
			break;
		case "Deposit Check":
			System.out.println("Deposit Check");
			break;
		default:
			System.out.println("Time Out");
		}

	}

}
