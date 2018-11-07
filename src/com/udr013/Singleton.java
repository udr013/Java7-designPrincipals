package com.udr013;

// this one isn't concurrent!!
class Singleton {

	// we create a static variable to store and access the same instance
	private static Singleton instance = null;

	// first we create a private constructor to prevent any other class to create an object of this class
	private Singleton() {
		System.out.println("private constructor!");
	}

	// we create a public static method method to access the only instance of the Singleton class
	// static otherwise as non-static it can't be referanced from static context like psmv
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

class SingletonImproved {
	// fixing concurrent creation: eager initialization, always initialized even when we don't use it.
	private static SingletonImproved instance = new SingletonImproved();

	private SingletonImproved() {
		System.out.println("private constructor!");
	}

	public static SingletonImproved getInstance() {
		return instance;
	}
}

class SingletonMoreImproved {

	// fixing concurrent creation: lazy initialization
	private static SingletonMoreImproved instance;

	private SingletonMoreImproved() {
		System.out.println("private constructor!");
	}

	// use synchronized method
	synchronized public static SingletonMoreImproved getInstance() {
		if (instance == null) {
			instance = new SingletonMoreImproved();
		}
		return instance;
	}
}

class SingletonSomeMoreImproved {

	// fixing concurrent creation: lazy initialization
	private static SingletonSomeMoreImproved instance;

	private SingletonSomeMoreImproved() {
		System.out.println("private constructor!");
	}

	// don't synchronize completely
	public static SingletonSomeMoreImproved getInstance() {
		if (instance == null) {
			// synchronized code block
			synchronized (SingletonSomeMoreImproved.class) { // get lock on singleton.class
				if (instance == null) {
					instance = new SingletonSomeMoreImproved();
				}
			}
		}
		return instance;
	}
}
