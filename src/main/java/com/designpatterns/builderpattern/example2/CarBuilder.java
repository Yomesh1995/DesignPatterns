package com.designpatterns.builderpattern.example2;

public interface CarBuilder {
	void setTires(String tier);
	void setEngine(String engine);
	void setPaintColour(String colour);
	Car getCar();
}
