package com.example.demo.creational.objectpool;

import javafx.geometry.Point2D;

//represents our abstract reusable
public interface Image extends Poolable{

	void draw();
	
	Point2D getLocation();
	
	void setLocation(Point2D location);
	
}
