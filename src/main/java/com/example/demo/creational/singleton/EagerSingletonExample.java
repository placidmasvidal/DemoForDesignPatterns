package com.example.demo.creational.singleton;

public class EagerSingletonExample {

	private EagerSingletonExample() {
		
	}
	
	private static final EagerSingletonExample INSTANCE = new EagerSingletonExample();
	
	public static EagerSingletonExample getInstance() {
		return INSTANCE;
	}
	
}
