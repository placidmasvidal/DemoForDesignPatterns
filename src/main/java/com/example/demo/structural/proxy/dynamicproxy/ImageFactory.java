package com.example.demo.structural.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

import com.example.demo.structural.proxy.staticproxy.Image;



//Factory to get image objects. 
public class ImageFactory {
	//We'll provide proxy to caller instead of real object
	
	public static Image getImage(String name) {
		return (Image)Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class},
				new ImageInvocationHandler(name)); 
	}
}