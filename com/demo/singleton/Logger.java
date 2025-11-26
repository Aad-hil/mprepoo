package com.demo.singleton;

public class Logger {
	private static Logger instance;

	private Logger() {
		System.out.println("Logger initialized...");
	}

	public static Logger getInstance() {
		if (instance == null) {
			return new Logger();

		}
		return instance;
	}

	public void log(String msg) {
		System.out.println("[LOG] " + msg);
	}
}
