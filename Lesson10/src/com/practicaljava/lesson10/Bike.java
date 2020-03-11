package com.practicaljava.lesson10;

public class Bike {
    private String type;
    private int size; // bike size is one dimension

    public Bike(String type, int size) {
	this.type = type;
	this.size = size;
    }

    public String getBikeType() {
	return this.type;
    }

    public int getBikeSize() {
	return this.size;
    }
}
