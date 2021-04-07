package com.example.demo.creational.singleton;

public class LazySingletonExample {
	
	private LazySingletonExample() {

	}

	private static volatile LazySingletonExample INSTANCE;

	public static LazySingletonExample getInstance() {
		if (INSTANCE == null) {
			synchronized (LazySingletonExample.class) {
				if (INSTANCE == null) {
					INSTANCE = new LazySingletonExample();
				}
			}
		}
		return INSTANCE;
	}
}
