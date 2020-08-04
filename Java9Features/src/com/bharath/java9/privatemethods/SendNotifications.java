package com.bharath.java9.privatemethods;

public interface SendNotifications {

	static void sendNotifications() {
		establishConnection();
		System.out.println("Sending Multiple Notifications");
	}

	default void sendNotification() {
		establishConnection();
		System.out.println("Sending Notification");
	}

	private static void establishConnection() {
		System.out.println("Establishing a connection");
	}

}
