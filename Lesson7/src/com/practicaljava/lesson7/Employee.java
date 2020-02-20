package com.practicaljava.lesson7;

public class Employee extends Person {
    public Employee(String name) {
	super(name);
    }

    @Override
    public boolean increasePay(int persent) {
	System.out.println("Increasing salary by " + persent + "%. " + getName());
	return true;
    }
}
