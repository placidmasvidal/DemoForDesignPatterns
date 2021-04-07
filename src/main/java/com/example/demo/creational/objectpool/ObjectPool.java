package com.example.demo.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;

//will pool anything whichc extends froom Poolable
public class ObjectPool<T extends Poolable>{
	
	private BlockingQueue<T> availablePool;
	
	public ObjectPool(Supplier<T> creator, int precache) {
		availablePool = new LinkedBlockingQueue<>();
		IntStream.range(0,  precache).forEach(i -> availablePool.offer(creator.get()));
	}
	
	public T get() {	//blocks the queue if is empty
		try {
			return availablePool.take();
		} catch(InterruptedException ie) {
			System.err.println("take() was interrupted");
		}
		return null;
	}
	
	public void release(T obj) {	//allows to return back an object to the queue
		obj.reset();
		try {
			availablePool.put(obj);
		} catch(InterruptedException ie) {
			System.err.println("put() was interrupted");
		}
	}
	
}
