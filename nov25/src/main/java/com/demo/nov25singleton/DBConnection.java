package com.demo.nov25singleton;

public class DBConnection {
	private static DBConnection instance;

	private DBConnection() {
		System.out.println("Instance created");

	}

	static DBConnection getInstance() {
		if (instance == null) {
			instance = new DBConnection();
		}

		return instance;

	}

}
