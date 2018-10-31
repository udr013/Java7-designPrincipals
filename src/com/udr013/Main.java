package com.udr013;

public class Main {

	public static void main(String[] args) {
		// private access !!
		// Singleton singleton = new Singleton();
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
	}
}
